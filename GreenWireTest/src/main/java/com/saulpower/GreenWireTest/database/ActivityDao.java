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

import com.saulpower.GreenWireTest.database.Activity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ACTIVITY.
*/
public class ActivityDao extends AbstractDao<Activity, Long> {

    public static final String TABLENAME = "ACTIVITY";

    /**
     * Properties of entity Activity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Guid = new Property(0, String.class, "guid", false, "GUID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property ExternalID = new Property(2, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property TagString = new Property(3, String.class, "tagString", false, "TAG_STRING");
        public final static Property TenantID = new Property(4, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(5, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property DateLastModified = new Property(6, String.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property SyncBaseId = new Property(7, Long.class, "syncBaseId", false, "SYNC_BASE_ID");
        public final static Property IsDeleted = new Property(8, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Version = new Property(9, Integer.class, "version", false, "VERSION");
        public final static Property Id = new Property(10, Long.class, "id", true, "_id");
        public final static Property ActivitiesStudentId = new Property(11, long.class, "activitiesStudentId", false, "ACTIVITIES_STUDENT_ID");
        public final static Property DateCreated = new Property(12, String.class, "dateCreated", false, "DATE_CREATED");
    };

    private DaoSession daoSession;

    private Query<Activity> student_ActivitiesQuery;

    public ActivityDao(DaoConfig config) {
        super(config);
    }
    
    public ActivityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ACTIVITY' (" + //
                "'GUID' TEXT," + // 0: guid
                "'NAME' TEXT," + // 1: name
                "'EXTERNAL_ID' TEXT," + // 2: externalID
                "'TAG_STRING' TEXT," + // 3: tagString
                "'TENANT_ID' INTEGER," + // 4: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 5: saveResultSaveResultId
                "'DATE_LAST_MODIFIED' TEXT," + // 6: dateLastModified
                "'SYNC_BASE_ID' INTEGER REFERENCES 'SYNC_BASE'('SYNC_BASE_ID') ," + // 7: syncBaseId
                "'IS_DELETED' INTEGER," + // 8: isDeleted
                "'VERSION' INTEGER," + // 9: version
                "'_id' INTEGER PRIMARY KEY ," + // 10: id
                "'ACTIVITIES_STUDENT_ID' INTEGER NOT NULL ," + // 11: activitiesStudentId
                "'DATE_CREATED' TEXT);"); // 12: dateCreated
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ACTIVITY'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Activity entity) {
        stmt.clearBindings();
 
        String guid = entity.getGuid();
        if (guid != null) {
            stmt.bindString(1, guid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String externalID = entity.getExternalID();
        if (externalID != null) {
            stmt.bindString(3, externalID);
        }
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(4, tagString);
        }
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(5, tenantID);
        }
        stmt.bindLong(6, entity.getSaveResultSaveResultId());
 
        String dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindString(7, dateLastModified);
        }
 
        Long syncBaseId = entity.getSyncBaseId();
        if (syncBaseId != null) {
            stmt.bindLong(8, syncBaseId);
        }
 
        Boolean isDeleted = entity.getIsDeleted();
        if (isDeleted != null) {
            stmt.bindLong(9, isDeleted ? 1l: 0l);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(10, version);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(11, id);
        }
        stmt.bindLong(12, entity.getActivitiesStudentId());
 
        String dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindString(13, dateCreated);
        }
    }

    @Override
    protected void attachEntity(Activity entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10);
    }    

    /** @inheritdoc */
    @Override
    public Activity readEntity(Cursor cursor, int offset) {
        Activity entity = new Activity( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // guid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // externalID
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // tagString
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // tenantID
            cursor.getLong(offset + 5), // saveResultSaveResultId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // dateLastModified
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7), // syncBaseId
            cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0, // isDeleted
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // version
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10), // id
            cursor.getLong(offset + 11), // activitiesStudentId
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12) // dateCreated
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Activity entity, int offset) {
        entity.setGuid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setExternalID(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTagString(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTenantID(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 5));
        entity.setDateLastModified(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSyncBaseId(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
        entity.setIsDeleted(cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0);
        entity.setVersion(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setId(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
        entity.setActivitiesStudentId(cursor.getLong(offset + 11));
        entity.setDateCreated(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Activity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Activity entity) {
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
    
    /** Internal query to resolve the "activities" to-many relationship of Student. */
    public List<Activity> _queryStudent_Activities(long activitiesStudentId) {
        synchronized (this) {
            if (student_ActivitiesQuery == null) {
                QueryBuilder<Activity> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.ActivitiesStudentId.eq(null));
                student_ActivitiesQuery = queryBuilder.build();
            }
        }
        Query<Activity> query = student_ActivitiesQuery.forCurrentThread();
        query.setParameter(0, activitiesStudentId);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM ACTIVITY T");
            builder.append(" LEFT JOIN SAVE_RESULT T0 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T0.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Activity loadCurrentDeep(Cursor cursor, boolean lock) {
        Activity entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        SaveResult saveResult = loadCurrentOther(daoSession.getSaveResultDao(), cursor, offset);
         if(saveResult != null) {
            entity.setSaveResult(saveResult);
        }

        return entity;    
    }

    public Activity loadDeep(Long key) {
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
    public List<Activity> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Activity> list = new ArrayList<Activity>(count);
        
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
    
    protected List<Activity> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Activity> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
    @Override
    protected void onPreInsertEntity(Activity entity) {
        entity.insertBase(daoSession.getSyncBaseDao());
        entity.setSyncBaseId(entity.getSyncBaseId());
    }

    @Override
    protected void onPreLoadEntity(Activity entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreRefreshEntity(Activity entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreUpdateEntity(Activity entity) {
        entity.updateBase(daoSession.getSyncBaseDao());
    }

    @Override
    protected void onPreDeleteEntity(Activity entity) {
        entity.deleteBase(daoSession.getSyncBaseDao());
    }

    static {
        GreenSync.registerListTypeToken("Activity", new TypeToken<List<Activity>>(){}.getType());
        GreenSync.registerTypeToken("Activity", Activity.class);
    }

}
