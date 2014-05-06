package com.saulpower.GreenWireTest.database;

import java.util.List;
import de.greenrobot.dao.sync.GreenSync;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;

import com.saulpower.GreenWireTest.database.ImmunizationSchedule;
import com.saulpower.GreenWireTest.database.ImmunizationSchedule.ImmunicationReferencePoint;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table IMMUNIZATION_SCHEDULE.
*/
public class ImmunizationScheduleDao extends AbstractDao<ImmunizationSchedule, Long> {

    public static final String TABLENAME = "IMMUNIZATION_SCHEDULE";

    /**
     * Properties of entity ImmunizationSchedule.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property ExternalID = new Property(0, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property Guid = new Property(1, String.class, "guid", false, "GUID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property TagString = new Property(3, String.class, "tagString", false, "TAG_STRING");
        public final static Property SchedulesImmunizationDefinitionId = new Property(4, long.class, "schedulesImmunizationDefinitionId", false, "SCHEDULES_IMMUNIZATION_DEFINITION_ID");
        public final static Property TenantID = new Property(5, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(6, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property ImmunizationID = new Property(7, String.class, "immunizationID", false, "IMMUNIZATION_ID");
        public final static Property Months = new Property(8, Integer.class, "months", false, "MONTHS");
        public final static Property ReferencePoint = new Property(9, ImmunicationReferencePoint.class, "referencePoint", false, "REFERENCE_POINT");
        public final static Property DateLastModified = new Property(10, String.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property DefinitionImmunizationDefinitionId = new Property(11, long.class, "definitionImmunizationDefinitionId", false, "DEFINITION_IMMUNIZATION_DEFINITION_ID");
        public final static Property SyncBaseId = new Property(12, Long.class, "syncBaseId", false, "SYNC_BASE_ID");
        public final static Property IsDeleted = new Property(13, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Version = new Property(14, Integer.class, "version", false, "VERSION");
        public final static Property Id = new Property(15, Long.class, "id", true, "_id");
        public final static Property DateCreated = new Property(16, String.class, "dateCreated", false, "DATE_CREATED");
    };

    private DaoSession daoSession;

    private Query<ImmunizationSchedule> immunizationDefinition_SchedulesQuery;

    public ImmunizationScheduleDao(DaoConfig config) {
        super(config);
    }
    
    public ImmunizationScheduleDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'IMMUNIZATION_SCHEDULE' (" + //
                "'EXTERNAL_ID' TEXT," + // 0: externalID
                "'GUID' TEXT," + // 1: guid
                "'NAME' TEXT," + // 2: name
                "'TAG_STRING' TEXT," + // 3: tagString
                "'SCHEDULES_IMMUNIZATION_DEFINITION_ID' INTEGER NOT NULL ," + // 4: schedulesImmunizationDefinitionId
                "'TENANT_ID' INTEGER," + // 5: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 6: saveResultSaveResultId
                "'IMMUNIZATION_ID' TEXT," + // 7: immunizationID
                "'MONTHS' INTEGER," + // 8: months
                "'REFERENCE_POINT' INTEGER," + // 9: referencePoint
                "'DATE_LAST_MODIFIED' TEXT," + // 10: dateLastModified
                "'DEFINITION_IMMUNIZATION_DEFINITION_ID' INTEGER NOT NULL ," + // 11: definitionImmunizationDefinitionId
                "'SYNC_BASE_ID' INTEGER REFERENCES 'SYNC_BASE'('SYNC_BASE_ID') ," + // 12: syncBaseId
                "'IS_DELETED' INTEGER," + // 13: isDeleted
                "'VERSION' INTEGER," + // 14: version
                "'_id' INTEGER PRIMARY KEY ," + // 15: id
                "'DATE_CREATED' TEXT);"); // 16: dateCreated
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'IMMUNIZATION_SCHEDULE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ImmunizationSchedule entity) {
        stmt.clearBindings();
 
        String externalID = entity.getExternalID();
        if (externalID != null) {
            stmt.bindString(1, externalID);
        }
 
        String guid = entity.getGuid();
        if (guid != null) {
            stmt.bindString(2, guid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(4, tagString);
        }
        stmt.bindLong(5, entity.getSchedulesImmunizationDefinitionId());
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(6, tenantID);
        }
        stmt.bindLong(7, entity.getSaveResultSaveResultId());
 
        String immunizationID = entity.getImmunizationID();
        if (immunizationID != null) {
            stmt.bindString(8, immunizationID);
        }
 
        Integer months = entity.getMonths();
        if (months != null) {
            stmt.bindLong(9, months);
        }
 
        ImmunicationReferencePoint referencePoint = entity.getReferencePoint();
        if (referencePoint != null) {
            stmt.bindLong(10, referencePoint.getValue());
        }
 
        String dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindString(11, dateLastModified);
        }
        stmt.bindLong(12, entity.getDefinitionImmunizationDefinitionId());
 
        Long syncBaseId = entity.getSyncBaseId();
        if (syncBaseId != null) {
            stmt.bindLong(13, syncBaseId);
        }
 
        Boolean isDeleted = entity.getIsDeleted();
        if (isDeleted != null) {
            stmt.bindLong(14, isDeleted ? 1l: 0l);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(15, version);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(16, id);
        }
 
        String dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindString(17, dateCreated);
        }
    }

    @Override
    protected void attachEntity(ImmunizationSchedule entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 15) ? null : cursor.getLong(offset + 15);
    }    

    /** @inheritdoc */
    @Override
    public ImmunizationSchedule readEntity(Cursor cursor, int offset) {
        ImmunizationSchedule entity = new ImmunizationSchedule( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // externalID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // guid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // tagString
            cursor.getLong(offset + 4), // schedulesImmunizationDefinitionId
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // tenantID
            cursor.getLong(offset + 6), // saveResultSaveResultId
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // immunizationID
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // months
            cursor.isNull(offset + 9) ? null : ImmunicationReferencePoint.fromInt(cursor.getLong(offset + 9)), // referencePoint
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // dateLastModified
            cursor.getLong(offset + 11), // definitionImmunizationDefinitionId
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12), // syncBaseId
            cursor.isNull(offset + 13) ? null : cursor.getShort(offset + 13) != 0, // isDeleted
            cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14), // version
            cursor.isNull(offset + 15) ? null : cursor.getLong(offset + 15), // id
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16) // dateCreated
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ImmunizationSchedule entity, int offset) {
        entity.setExternalID(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setGuid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTagString(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSchedulesImmunizationDefinitionId(cursor.getLong(offset + 4));
        entity.setTenantID(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 6));
        entity.setImmunizationID(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setMonths(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setReferencePoint(cursor.isNull(offset + 9) ? null : ImmunicationReferencePoint.fromInt(cursor.getLong(offset + 9)));
        entity.setDateLastModified(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setDefinitionImmunizationDefinitionId(cursor.getLong(offset + 11));
        entity.setSyncBaseId(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
        entity.setIsDeleted(cursor.isNull(offset + 13) ? null : cursor.getShort(offset + 13) != 0);
        entity.setVersion(cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14));
        entity.setId(cursor.isNull(offset + 15) ? null : cursor.getLong(offset + 15));
        entity.setDateCreated(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ImmunizationSchedule entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ImmunizationSchedule entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "schedules" to-many relationship of ImmunizationDefinition. */
    public List<ImmunizationSchedule> _queryImmunizationDefinition_Schedules(long schedulesImmunizationDefinitionId) {
        synchronized (this) {
            if (immunizationDefinition_SchedulesQuery == null) {
                QueryBuilder<ImmunizationSchedule> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.SchedulesImmunizationDefinitionId.eq(null));
                immunizationDefinition_SchedulesQuery = queryBuilder.build();
            }
        }
        Query<ImmunizationSchedule> query = immunizationDefinition_SchedulesQuery.forCurrentThread();
        query.setParameter(0, schedulesImmunizationDefinitionId);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getImmunizationDefinitionDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM IMMUNIZATION_SCHEDULE T");
            builder.append(" LEFT JOIN IMMUNIZATION_DEFINITION T0 ON T.'DEFINITION_IMMUNIZATION_DEFINITION_ID'=T0.'_id'");
            builder.append(" LEFT JOIN SAVE_RESULT T1 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T1.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected ImmunizationSchedule loadCurrentDeep(Cursor cursor, boolean lock) {
        ImmunizationSchedule entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        ImmunizationDefinition definition = loadCurrentOther(daoSession.getImmunizationDefinitionDao(), cursor, offset);
         if(definition != null) {
            entity.setDefinition(definition);
        }
        offset += daoSession.getImmunizationDefinitionDao().getAllColumns().length;

        SaveResult saveResult = loadCurrentOther(daoSession.getSaveResultDao(), cursor, offset);
         if(saveResult != null) {
            entity.setSaveResult(saveResult);
        }

        return entity;    
    }

    public ImmunizationSchedule loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<ImmunizationSchedule> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<ImmunizationSchedule> list = new ArrayList<ImmunizationSchedule>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<ImmunizationSchedule> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<ImmunizationSchedule> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
    @Override
    protected void onPreInsertEntity(ImmunizationSchedule entity) {
        entity.insertBase(daoSession.getSyncBaseDao());
        entity.setSyncBaseId(entity.getSyncBaseId());
    }

    @Override
    protected void onPreLoadEntity(ImmunizationSchedule entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreRefreshEntity(ImmunizationSchedule entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreUpdateEntity(ImmunizationSchedule entity) {
        entity.updateBase(daoSession.getSyncBaseDao());
    }

    @Override
    protected void onPreDeleteEntity(ImmunizationSchedule entity) {
        entity.deleteBase(daoSession.getSyncBaseDao());
    }

    static {
        GreenSync.registerListTypeToken("ImmunizationSchedule", new TypeToken<List<ImmunizationSchedule>>(){}.getType());
        GreenSync.registerTypeToken("ImmunizationSchedule", ImmunizationSchedule.class);
    }

}
