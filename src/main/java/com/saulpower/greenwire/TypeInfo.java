package com.saulpower.greenwire;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Utilities for type analysis.
 */
public final class TypeInfo {

    public static final String BOOLEAN = "Boolean";
    public static final String BYTE_STRING = "ByteString";
    public static final String DOUBLE = "Double";
    public static final String FLOAT = "Float";
    public static final String INTEGER = "Integer";
    public static final String LONG = "Long";
    public static final String STRING = "String";

    private static final Map<String, String> JAVA_TYPES = new LinkedHashMap<String, String>();

    static {
        JAVA_TYPES.put("bool", BOOLEAN);
        JAVA_TYPES.put("bytes", BYTE_STRING);
        JAVA_TYPES.put("double", DOUBLE);
        JAVA_TYPES.put("float", FLOAT);
        JAVA_TYPES.put("fixed32", INTEGER);
        JAVA_TYPES.put("fixed64", LONG);
        JAVA_TYPES.put("int32", INTEGER);
        JAVA_TYPES.put("int64", LONG);
        JAVA_TYPES.put("sfixed32", INTEGER);
        JAVA_TYPES.put("sfixed64", LONG);
        JAVA_TYPES.put("sint32", INTEGER);
        JAVA_TYPES.put("sint64", LONG);
        JAVA_TYPES.put("string", STRING);
        JAVA_TYPES.put("uint32", INTEGER);
        JAVA_TYPES.put("uint64", LONG);
    }

    private TypeInfo() {
    }

    /**
     * Returns true if the given type name is one of the standard .proto
     * scalar types, e.g., {@code int32}, {@code string}, etc.
     */
    public static boolean isScalar(String type) {
        return JAVA_TYPES.containsKey(type);
    }

    /**
     * Returns the Java type associated with a standard .proto
     * scalar type, e.g., {@code int32}, {@code string}, etc.,
     * or null if the name is not that of a scalar type.
     */
    public static String scalarType(String type) {
        return JAVA_TYPES.get(type);
    }
}
