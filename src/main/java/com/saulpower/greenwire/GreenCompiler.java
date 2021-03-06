package com.saulpower.greenwire;

import com.squareup.protoparser.EnumType;
import com.squareup.protoparser.MessageType;
import com.squareup.protoparser.ProtoFile;
import com.squareup.protoparser.Type;
import de.greenrobot.daogenerator.*;

import java.io.File;
import java.io.FileNotFoundException;
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

    Map<String, ProtoFile> parsedFiles = new LinkedHashMap<String, ProtoFile>();
    private Map<String, Entity> entities = new HashMap<String, Entity>();
    private Map<String, EntityEnum> enums = new HashMap<String, EntityEnum>();
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

        String packageName = null;

        // Gather all proto files
        for (String sourceFilename : sourceFileNames) {
            String sourcePath = sourceFilename;
            ProtoFile protoFile = io.parse(sourcePath);
            parsedFiles.put(protoFile.getFileName(), protoFile);

            // Initialize GreenDao schema based on first protofile's package
            if (packageName == null) initializeSchema(version, protoFile.getJavaPackage());

            // Preload all entities to our schema to facilitate
            // relationship creation
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

        if (packageName == null) {
            throw new IllegalArgumentException("No package name specified");
        }

        schema = new Schema(version, packageName);
        schema.enableGreenSync();
    }

    private void compileOne(ProtoFile protoFile) {
        addType(protoFile.getTypes());
    }

    private void addType(List<Type> types) {

        for (Type type : types) {

            addType(type.getNestedTypes());

            String name = type.getName();
            Entity entity = entities.get(name);

            if (type instanceof MessageType) {
                addProperties((MessageType) type, entity);
            }
        }
    }

    private void addProperties(MessageType type, Entity entity) {

        for (MessageType.Field field : type.getFields()) {

            String fieldType = field.getType();

            if (fieldType.contains(".")) {
                String[] fq = fieldType.split("\\.");
                fieldType = fq[fq.length - 1];
            }

            if (TypeInfo.isScalar(fieldType)) {
                addField(entity, field);
            } else if (enums.containsKey(fieldType)) {
                addEnumProperty(entity, field);
            } else {
                addRelationship(entity, field);
            }
        }
    }

    private void addField(Entity entity, MessageType.Field field) {

        if (field.getName().equalsIgnoreCase("id")) return;

        String scalarType = TypeInfo.scalarType(field.getType());

        Property.PropertyBuilder builder;

        if (scalarType.equals(TypeInfo.INTEGER)) {
            builder = entity.addIntProperty(firstToLowercase(field.getName()));
        } else if (scalarType.equals(TypeInfo.LONG)) {
            builder = entity.addLongProperty(firstToLowercase(field.getName()));
        } else if (scalarType.equals(TypeInfo.BOOLEAN)) {
            builder = entity.addBooleanProperty(firstToLowercase(field.getName()));
        } else if (scalarType.equals(TypeInfo.DOUBLE)) {
            builder = entity.addDoubleProperty(firstToLowercase(field.getName()));
        } else if (scalarType.equals(TypeInfo.FLOAT)) {
            builder = entity.addFloatProperty(firstToLowercase(field.getName()));
        } else if (scalarType.equals(TypeInfo.BYTE_STRING)) {
            builder = entity.addByteArrayProperty(firstToLowercase(field.getName()));
        } else if (scalarType.equals(TypeInfo.STRING)) {
            builder = entity.addStringProperty(firstToLowercase(field.getName()));
        } else {
            throw new GreenCompilerException("No field type for " + scalarType);
        }

        if (field.getLabel() == MessageType.Label.REPEATED) {
            builder.asList();
        }
    }

    private void addEnumProperty(Entity entity, MessageType.Field field) {

        String name = field.getType();

        if (name.contains(".")) {
            String[] fq = name.split("\\.");
            name = fq[fq.length - 1];
        }

        entity.addEnumProperty(enums.get(name), firstToLowercase(field.getName()));
    }

    private void addRelationship(Entity entity, MessageType.Field field) {

        if (entity == null) {
            throw new NullPointerException("Cannot create a relationship with a null entity entity");
        }

        String entityType = field.getType();
        Entity foreignEntity = entities.get(entityType);

        if (foreignEntity == null) {
            throw new NullPointerException("Cannot create a relationship with a null foreign " +
                                           "entity for " + entity.getClassName() + " and " +
                                           field.toString());
        }

        if (FieldInfo.isRepeated(field)) {

            Property entityId = foreignEntity.addLongProperty(firstToLowercase(field.getName()) + entity.getClassName() + "Id").markTransient().notNull().getProperty();
            entity.addToMany(foreignEntity, entityId, firstToLowercase(field.getName()));

        } else {

            Property foreignEntityId = entity.addLongProperty(firstToLowercase(field.getName()) + foreignEntity.getClassName() + "Id").markTransient().notNull().getProperty();
            entity.addToOne(foreignEntity, foreignEntityId, firstToLowercase(field.getName()));
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
                loadedDependencies.add(dependency);
                String dep = protoPath + File.separator + dependency;
                ProtoFile dependencyFile;
                try {
                    dependencyFile = io.parse(dep);
                    if (!parsedFiles.containsKey(dep)) parsedFiles.put(dep, dependencyFile);
                } catch (FileNotFoundException ex) {
                    System.out.println("Missing: " + dependency);
                    continue;
                }
                loadEntitiesHelper(dependencyFile, loadedDependencies);
            }
        }

        addEntities(protoFile.getTypes(), null);
    }

    private void addEntities(List<Type> types, Entity parent) {

        for (Type type : types) {

            final String name = type.getName();

            if (!entities.containsKey(name) && !enums.containsKey(name)) {
                Entity entity = null;
                if (type instanceof EnumType) {
                    if (parent == null)
                        parent = schema.addEnumEntity(name);
                    EntityEnum entityEnum = addEnum((EnumType) type, parent);
                    enums.put(name, entityEnum);
                } else {
                    entity = schema.addEntity(name);
                    entity.addIdProperty();
                    entity.setImplementParcelable(true);
                    entities.put(name, entity);
                }

                addEntities(type.getNestedTypes(), entity);
            }
        }
    }

    private EntityEnum addEnum(EnumType type, Entity entity) {

        ArrayList<EntityEnum.Value> enumValues = new ArrayList<EntityEnum.Value>();

        List<EnumType.Value> values = type.getValues();
        for (int i = 0, count = values.size(); i < count; i++) {
            EnumType.Value value = values.get(i);
            enumValues.add(new EntityEnum.Value(value.getName(), value.getTag()));
        }

        EntityEnum entityEnum;

        if (entity != null && entity instanceof EnumEntity) {
            EnumEntity enumEntity = (EnumEntity) entity;
            enumEntity.setValues(enumValues);
            entityEnum = enumEntity.getEntityEnum();
        } else {
            entityEnum = entity.addEnum(type.getName(), enumValues);
            enums.put(type.getName(), entityEnum);
        }

        return entityEnum;
    }

    private String firstToLowercase(String s) {
        return s.substring(0, 1).toLowerCase() + s.substring(1);
    }
}
