package com.saulpower.GreenWireTest.database;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;

import com.saulpower.GreenWireTest.database.OUType;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table OUTYPE.
*/
public class OUTypeDao extends AbstractDao<OUType, Long> {

    public static final String TABLENAME = "OUTYPE";

    /**
     * Properties of entity OUType.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property IsCenter = new Property(0, Boolean.class, "isCenter", false, "IS_CENTER");
        public final static Property ExternalID = new Property(1, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property IsDeleted = new Property(2, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property Guid = new Property(4, String.class, "guid", false, "GUID");
        public final static Property Version = new Property(5, Integer.class, "version", false, "VERSION");
        public final static Property TagString = new Property(6, String.class, "tagString", false, "TAG_STRING");
        public final static Property Id = new Property(7, Long.class, "id", true, "_id");
        public final static Property DateCreated = new Property(8, Long.class, "dateCreated", false, "DATE_CREATED");
        public final static Property TenantID = new Property(9, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(10, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property DateLastModified = new Property(11, Long.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
    };

    private DaoSession daoSession;


    public OUTypeDao(DaoConfig config) {
        super(config);
    }
    
    public OUTypeDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'OUTYPE' (" + //
                "'IS_CENTER' INTEGER," + // 0: isCenter
                "'EXTERNAL_ID' TEXT," + // 1: externalID
                "'IS_DELETED' INTEGER," + // 2: isDeleted
                "'NAME' TEXT," + // 3: name
                "'GUID' TEXT," + // 4: guid
                "'VERSION' INTEGER," + // 5: version
                "'TAG_STRING' TEXT," + // 6: tagString
                "'_id' INTEGER PRIMARY KEY ," + // 7: id
                "'DATE_CREATED' INTEGER," + // 8: dateCreated
                "'TENANT_ID' INTEGER," + // 9: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 10: saveResultSaveResultId
                "'DATE_LAST_MODIFIED' INTEGER);"); // 11: dateLastModified
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'OUTYPE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, OUType entity) {
        stmt.clearBindings();
 
        Boolean isCenter = entity.getIsCenter();
        if (isCenter != null) {
            stmt.bindLong(1, isCenter ? 1l: 0l);
        }
 
        String externalID = entity.getExternalID();
        if (externalID != null) {
            stmt.bindString(2, externalID);
        }
 
        Boolean isDeleted = entity.getIsDeleted();
        if (isDeleted != null) {
            stmt.bindLong(3, isDeleted ? 1l: 0l);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String guid = entity.getGuid();
        if (guid != null) {
            stmt.bindString(5, guid);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(6, version);
        }
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(7, tagString);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(8, id);
        }
 
        Long dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindLong(9, dateCreated);
        }
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(10, tenantID);
        }
        stmt.bindLong(11, entity.getSaveResultSaveResultId());
 
        Long dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindLong(12, dateLastModified);
        }
    }

    @Override
    protected void attachEntity(OUType entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7);
    }    

    /** @inheritdoc */
    @Override
    public OUType readEntity(Cursor cursor, int offset) {
        OUType entity = new OUType( //
            cursor.isNull(offset + 0) ? null : cursor.getShort(offset + 0) != 0, // isCenter
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // externalID
            cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0, // isDeleted
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // guid
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // version
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // tagString
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7), // id
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8), // dateCreated
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // tenantID
            cursor.getLong(offset + 10), // saveResultSaveResultId
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11) // dateLastModified
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, OUType entity, int offset) {
        entity.setIsCenter(cursor.isNull(offset + 0) ? null : cursor.getShort(offset + 0) != 0);
        entity.setExternalID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setIsDeleted(cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0);
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setGuid(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setVersion(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setTagString(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setId(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
        entity.setDateCreated(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
        entity.setTenantID(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 10));
        entity.setDateLastModified(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(OUType entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(OUType entity) {
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
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM OUTYPE T");
            builder.append(" LEFT JOIN SAVE_RESULT T0 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T0.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected OUType loadCurrentDeep(Cursor cursor, boolean lock) {
        OUType entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        SaveResult saveResult = loadCurrentOther(daoSession.getSaveResultDao(), cursor, offset);
         if(saveResult != null) {
            entity.setSaveResult(saveResult);
        }

        return entity;    
    }

    public OUType loadDeep(Long key) {
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
    public List<OUType> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<OUType> list = new ArrayList<OUType>(count);
        
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
    
    protected List<OUType> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<OUType> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}