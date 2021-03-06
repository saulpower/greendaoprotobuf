package com.saulpower.GreenWireTest.database;

import de.greenrobot.dao.DaoEnum;
import java.util.HashMap;
import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

public enum Gender implements DaoEnum {
    FEMALE(0),
    MALE(1);

    private static final Map<Long, Gender> intToTypeMap = new HashMap<Long, Gender>();

    static {
        for (Gender type : Gender.values()) {
            intToTypeMap.put(type.value, type);
        }
    }

    public static Gender fromInt(long i) {
        Gender type = intToTypeMap.get(Long.valueOf(i));
        return type;
    }

    private final long value;

    private Gender(long value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }
}