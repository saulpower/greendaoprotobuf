import com.squareup.protoparser.*;
import de.greenrobot.daogenerator.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by saulhoward on 3/7/14.
 */
public class GreenCompiler {

    private static final String PROTO_PATH_FLAG = "--proto_path=";
    private static final String JAVA_OUT_FLAG = "--java_out=";
    private static final String FILES_FLAG = "--files=";
    private static final String VERSION_FLAG = "--version=";

    private final String protoPath;
    private final List<String> sourceFileNames;
    private final IO io;
    private final String outputDirectory;

    private Map<String, Entity> entities = new HashMap<String, Entity>();
    private Schema schema;
    private int version = 1;

    public static void main(String... args) throws Exception {

        String protoPath = null;
        String javaOut = null;
        List<String> sourceFileNames = new ArrayList<String>();

        int version = 1;

        int index = 0;
        while (index < args.length) {
            if (args[index].startsWith(PROTO_PATH_FLAG)) {
                protoPath = args[index].substring(PROTO_PATH_FLAG.length());
            } else if (args[index].startsWith(JAVA_OUT_FLAG)) {
                javaOut = args[index].substring(JAVA_OUT_FLAG.length());
            } else if (args[index].startsWith(FILES_FLAG)) {
                File files = new File(args[index].substring(FILES_FLAG.length()));
                String[] fileNames = new Scanner(files, "UTF-8").useDelimiter("\\A").next().split("\n");
                sourceFileNames.addAll(Arrays.asList(fileNames));
            } else if (args[index].startsWith(VERSION_FLAG)) {
                version = Integer.parseInt(args[index].substring(VERSION_FLAG.length()));
            } else {
                sourceFileNames.add(args[index]);
            }
            index++;
        }

        if (javaOut == null) {
            System.err.println("Must specify " + JAVA_OUT_FLAG + " flag");
            System.exit(1);
        }
        if (protoPath == null) {
            protoPath = System.getProperty("user.dir");
            System.err.println(PROTO_PATH_FLAG + " flag not specified, using current dir " + protoPath);
        }

        GreenCompiler greenCompiler = new GreenCompiler(protoPath, sourceFileNames, javaOut, version);
        greenCompiler.compile();
    }

    public GreenCompiler(String protoPath, List<String> sourceFileNames,
                        String outputDirectory, int version) {
        this(protoPath, sourceFileNames, outputDirectory,
                new IO.FileIO(), version);
    }

    GreenCompiler(String protoPath, List<String> sourceFileNames,
                 String outputDirectory, IO io, int version) {
        this.protoPath = protoPath;
        this.sourceFileNames = sourceFileNames;
        this.outputDirectory = outputDirectory;
        this.io = io;
        this.version = version;
    }

    public void compile() throws Exception {

        Map<String, ProtoFile> parsedFiles = new LinkedHashMap<String, ProtoFile>();

        String packageName = null;

        // Gather all proto files
        for (String sourceFilename : sourceFileNames) {
            String sourcePath = protoPath + File.separator + sourceFilename;
            ProtoFile protoFile = io.parse(sourcePath);
            parsedFiles.put(sourcePath, protoFile);

            if (packageName == null) initializeSchema(version, protoFile.getJavaPackage());

            // Add all entities to our schema
            loadEntities(protoFile);
        }

        // Compile each proto file
        for (Map.Entry<String, ProtoFile> entry : parsedFiles.entrySet()) {
            String sourceFileName = entry.getKey();
            ProtoFile protoFile = entry.getValue();
            System.out.println("Compiling proto source file " + sourceFileName);
            compileOne(protoFile);
        }

        DaoGenerator daoGenerator = new DaoGenerator();
        daoGenerator.generateAll(schema, outputDirectory);
    }

    private void initializeSchema(int version, String packageName) {
        schema = new Schema(version, packageName);
    }

    private void compileOne(ProtoFile protoFile) {

        for (Type type : protoFile.getTypes()) {

            String name = type.getName();
            Entity entity = entities.get(name);

            if (type instanceof MessageType) {

                addProperties((MessageType) type, entity);

            } else if (type instanceof EnumType) {

                addEnum(entity, (EnumType) type);
            }
        }
    }

    private void addProperties(MessageType type, Entity entity) {

        for (MessageType.Field field : type.getFields()) {

            String fieldType = field.getType();
            if (TypeInfo.isScalar(fieldType)) {
                addField(entity, field);
            } else {
                addRelationship(entity, field);
            }
        }
    }

    private void addField(Entity entity, MessageType.Field field) {

        if (field.getName().equals("id")) return;

        String scalarType = TypeInfo.scalarType(field.getType());

        if (scalarType.equals(TypeInfo.INTEGER)) {
            entity.addIntProperty(field.getName());
        } else if (scalarType.equals(TypeInfo.LONG)) {
            entity.addLongProperty(field.getName());
        } else if (scalarType.equals(TypeInfo.BOOLEAN)) {
            entity.addBooleanProperty(field.getName());
        } else if (scalarType.equals(TypeInfo.DOUBLE)) {
            entity.addDoubleProperty(field.getName());
        } else if (scalarType.equals(TypeInfo.FLOAT)) {
            entity.addFloatProperty(field.getName());
        } else if (scalarType.equals(TypeInfo.BYTE_STRING)) {
            entity.addByteArrayProperty(field.getName());
        } else if (scalarType.equals(TypeInfo.STRING)) {
            entity.addStringProperty(field.getName());
        } else {
            throw new GreenCompilerException("No field type for " + scalarType);
        }
    }

    private void addEnum(Entity entity, EnumType type) {

        entity.addIntProperty(type.getName());
//        List<EnumType.Value> values = type.getValues();
//        for (int i = 0, count = values.size(); i < count; i++) {
//            EnumType.Value value = values.get(i);
//            entity.addIntProperty(value.getName());
//            value.getName() + "(" + value.getTag() + ")", (i == count - 1));
//        }
    }

    private void addRelationship(Entity entity, MessageType.Field field) {

        String entityType = field.getType();
        Entity foreignEntity = entities.get(entityType);

        if (FieldInfo.isRepeated(field)) {

            Property foreignEntityId = foreignEntity.addLongProperty(firstToLowercase(entity.getClassName()) + "Id").notNull().getProperty();
            entity.addToMany(foreignEntity, foreignEntityId, field.getName());

        } else {

            Property foreignEntityId = foreignEntity.addLongProperty(firstToLowercase(entity.getClassName()) + "Id").getProperty();
            entity.addToOne(foreignEntity, foreignEntityId, field.getName());
        }
    }

    private void loadEntities(ProtoFile protoFile) throws IOException {
        // Make one pass through the input files. Add all types as entities to our schema
        loadEntitiesHelper(protoFile, new LinkedHashSet<String>());
    }

    // Call with pass == LOAD_TYPES, then pass == LOAD_FIELDS
    private void loadEntitiesHelper(ProtoFile protoFile, Set<String> loadedDependencies) throws IOException {
        // Load symbols from imports
        for (String dependency : protoFile.getDependencies()) {
            if (!loadedDependencies.contains(dependency)) {
                String dep = protoPath + File.separator + dependency;
                ProtoFile dependencyFile = io.parse(dep);
                loadEntitiesHelper(dependencyFile, loadedDependencies);
                loadedDependencies.add(dependency);
            }
        }

        addEntities(protoFile.getTypes());
    }

    private void addEntities(List<Type> types) {
        for (Type type : types) {
            final String name = type.getName();

            if (!schema.getEntities().contains(name)) {
                Entity entity = schema.addEntity(name);
                entity.addIdProperty();
                entities.put(name, entity);
            }

            addEntities(type.getNestedTypes());
        }
    }

    private String firstToLowercase(String s) {
        return s.substring(0, 1).toLowerCase() + s.substring(1);
    }
}
