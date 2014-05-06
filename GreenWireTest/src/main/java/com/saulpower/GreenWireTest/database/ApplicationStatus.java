package com.saulpower.GreenWireTest.database;

import de.greenrobot.dao.DaoEnum;
import java.util.HashMap;
import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

public enum ApplicationStatus implements DaoEnum {
    PENDING(0),
    APPROVED(1),
    REJECTED(2),
    WAITLIST(3);

    private static final Map<Long, ApplicationStatus> intToTypeMap = new HashMap<Long, ApplicationStatus>();

    static {
        for (ApplicationStatus type : ApplicationStatus.values()) {
            intToTypeMap.put(type.value, type);
        }
    }

    public static ApplicationStatus fromInt(long i) {
        ApplicationStatus type = intToTypeMap.get(Long.valueOf(i));
        return type;
    }

    private final long value;

    private ApplicationStatus(long value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }
}