package com.saulpower.GreenWireTest.database;

import de.greenrobot.dao.DaoEnum;
import java.util.HashMap;
import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

public enum EnrollmentStatus implements DaoEnum {
    OPEN(0),
    CLOSED(1),
    LIMITED(2);

    private static final Map<Long, EnrollmentStatus> intToTypeMap = new HashMap<Long, EnrollmentStatus>();

    static {
        for (EnrollmentStatus type : EnrollmentStatus.values()) {
            intToTypeMap.put(type.value, type);
        }
    }

    public static EnrollmentStatus fromInt(long i) {
        EnrollmentStatus type = intToTypeMap.get(Long.valueOf(i));
        return type;
    }

    private final long value;

    private EnrollmentStatus(long value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }
}