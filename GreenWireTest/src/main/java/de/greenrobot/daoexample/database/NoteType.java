package de.greenrobot.daoexample.database;

import de.greenrobot.dao.DaoEnum;

import java.util.HashMap;
import java.util.Map;

public enum NoteType implements DaoEnum {
    ULTIMATE(1),
    FRISBEE(2),
    ROCKS(3);

    private static final Map<Long, NoteType> intToTypeMap = new HashMap<Long, NoteType>();

    static {
        for (NoteType type : NoteType.values()) {
            intToTypeMap.put(type.value, type);
        }
    }

    public static NoteType fromInt(long i) {
        NoteType type = intToTypeMap.get(Long.valueOf(i));
        return type;
    }

    private final long value;

    private NoteType(long value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Long.toString(getValue());
    }
}