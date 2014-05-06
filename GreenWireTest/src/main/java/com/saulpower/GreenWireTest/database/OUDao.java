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

import com.saulpower.GreenWireTest.database.OU;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table OU.
*/
public class OUDao extends AbstractDao<OU, Long> {

    public static final String TABLENAME = "OU";

    /**
     * Properties of entity OU.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property ExternalID = new Property(0, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property Guid = new Property(1, String.class, "guid", false, "GUID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property ParentOUBaseId = new Property(3, long.class, "parentOUBaseId", false, "PARENT_OUBASE_ID");
        public final static Property TagString = new Property(4, String.class, "tagString", false, "TAG_STRING");
        public final static Property StateTaxID = new Property(5, String.class, "stateTaxID", false, "STATE_TAX_ID");
        public final static Property TenantID = new Property(6, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(7, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property DateLastModified = new Property(8, String.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property Number = new Property(9, String.class, "number", false, "NUMBER");
        public final static Property OUTypeOUTypeId = new Property(10, long.class, "oUTypeOUTypeId", false, "O_UTYPE_OUTYPE_ID");
        public final static Property SyncBaseId = new Property(11, Long.class, "syncBaseId", false, "SYNC_BASE_ID");
        public final static Property IsDeleted = new Property(12, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property FederalTaxID = new Property(13, String.class, "federalTaxID", false, "FEDERAL_TAX_ID");
        public final static Property Version = new Property(14, Integer.class, "version", false, "VERSION");
        public final static Property Id = new Property(15, Long.class, "id", true, "_id");
        public final static Property ParentID = new Property(16, String.class, "parentID", false, "PARENT_ID");
        public final static Property DateCreated = new Property(17, String.class, "dateCreated", false, "DATE_CREATED");
        public final static Property IsActive = new Property(18, Boolean.class, "isActive", false, "IS_ACTIVE");
    };

    private DaoSession daoSession;

    public OUDao(DaoConfig config) {
        super(config);
    }
    
    public OUDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'OU' (" + //
                "'EXTERNAL_ID' TEXT," + // 0: externalID
                "'GUID' TEXT," + // 1: guid
                "'NAME' TEXT," + // 2: name
                "'PARENT_OUBASE_ID' INTEGER NOT NULL ," + // 3: parentOUBaseId
                "'TAG_STRING' TEXT," + // 4: tagString
                "'STATE_TAX_ID' TEXT," + // 5: stateTaxID
                "'TENANT_ID' INTEGER," + // 6: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 7: saveResultSaveResultId
                "'DATE_LAST_MODIFIED' TEXT," + // 8: dateLastModified
                "'NUMBER' TEXT," + // 9: number
                "'O_UTYPE_OUTYPE_ID' INTEGER NOT NULL ," + // 10: oUTypeOUTypeId
                "'SYNC_BASE_ID' INTEGER REFERENCES 'SYNC_BASE'('SYNC_BASE_ID') ," + // 11: syncBaseId
                "'IS_DELETED' INTEGER," + // 12: isDeleted
                "'FEDERAL_TAX_ID' TEXT," + // 13: federalTaxID
                "'VERSION' INTEGER," + // 14: version
                "'_id' INTEGER PRIMARY KEY ," + // 15: id
                "'PARENT_ID' TEXT," + // 16: parentID
                "'DATE_CREATED' TEXT," + // 17: dateCreated
                "'IS_ACTIVE' INTEGER);"); // 18: isActive
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'OU'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, OU entity) {
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
        stmt.bindLong(4, entity.getParentOUBaseId());
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(5, tagString);
        }
 
        String stateTaxID = entity.getStateTaxID();
        if (stateTaxID != null) {
            stmt.bindString(6, stateTaxID);
        }
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(7, tenantID);
        }
        stmt.bindLong(8, entity.getSaveResultSaveResultId());
 
        String dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindString(9, dateLastModified);
        }
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(10, number);
        }
        stmt.bindLong(11, entity.getOUTypeOUTypeId());
 
        Long syncBaseId = entity.getSyncBaseId();
        if (syncBaseId != null) {
            stmt.bindLong(12, syncBaseId);
        }
 
        Boolean isDeleted = entity.getIsDeleted();
        if (isDeleted != null) {
            stmt.bindLong(13, isDeleted ? 1l: 0l);
        }
 
        String federalTaxID = entity.getFederalTaxID();
        if (federalTaxID != null) {
            stmt.bindString(14, federalTaxID);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(15, version);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(16, id);
        }
 
        String parentID = entity.getParentID();
        if (parentID != null) {
            stmt.bindString(17, parentID);
        }
 
        String dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindString(18, dateCreated);
        }
 
        Boolean isActive = entity.getIsActive();
        if (isActive != null) {
            stmt.bindLong(19, isActive ? 1l: 0l);
        }
    }

    @Override
    protected void attachEntity(OU entity) {
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
    public OU readEntity(Cursor cursor, int offset) {
        OU entity = new OU( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // externalID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // guid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.getLong(offset + 3), // parentOUBaseId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // tagString
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // stateTaxID
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6), // tenantID
            cursor.getLong(offset + 7), // saveResultSaveResultId
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // dateLastModified
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // number
            cursor.getLong(offset + 10), // oUTypeOUTypeId
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11), // syncBaseId
            cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0, // isDeleted
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // federalTaxID
            cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14), // version
            cursor.isNull(offset + 15) ? null : cursor.getLong(offset + 15), // id
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // parentID
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // dateCreated
            cursor.isNull(offset + 18) ? null : cursor.getShort(offset + 18) != 0 // isActive
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, OU entity, int offset) {
        entity.setExternalID(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setGuid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setParentOUBaseId(cursor.getLong(offset + 3));
        entity.setTagString(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setStateTaxID(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTenantID(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 7));
        entity.setDateLastModified(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setNumber(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setOUTypeOUTypeId(cursor.getLong(offset + 10));
        entity.setSyncBaseId(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
        entity.setIsDeleted(cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0);
        entity.setFederalTaxID(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setVersion(cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14));
        entity.setId(cursor.isNull(offset + 15) ? null : cursor.getLong(offset + 15));
        entity.setParentID(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setDateCreated(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setIsActive(cursor.isNull(offset + 18) ? null : cursor.getShort(offset + 18) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(OU entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(OU entity) {
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
            SqlUtils.appendColumns(builder, "T0", daoSession.getOUTypeDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getOUBaseDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T2", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM OU T");
            builder.append(" LEFT JOIN OUTYPE T0 ON T.'O_UTYPE_OUTYPE_ID'=T0.'_id'");
            builder.append(" LEFT JOIN OUBASE T1 ON T.'PARENT_OUBASE_ID'=T1.'_id'");
            builder.append(" LEFT JOIN SAVE_RESULT T2 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T2.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected OU loadCurrentDeep(Cursor cursor, boolean lock) {
        OU entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        OUType oUType = loadCurrentOther(daoSession.getOUTypeDao(), cursor, offset);
         if(oUType != null) {
            entity.setOUType(oUType);
        }
        offset += daoSession.getOUTypeDao().getAllColumns().length;

        OUBase parent = loadCurrentOther(daoSession.getOUBaseDao(), cursor, offset);
         if(parent != null) {
            entity.setParent(parent);
        }
        offset += daoSession.getOUBaseDao().getAllColumns().length;

        SaveResult saveResult = loadCurrentOther(daoSession.getSaveResultDao(), cursor, offset);
         if(saveResult != null) {
            entity.setSaveResult(saveResult);
        }

        return entity;    
    }

    public OU loadDeep(Long key) {
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
    public List<OU> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<OU> list = new ArrayList<OU>(count);
        
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
    
    protected List<OU> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<OU> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
    @Override
    protected void onPreInsertEntity(OU entity) {
        entity.insertBase(daoSession.getSyncBaseDao());
        entity.setSyncBaseId(entity.getSyncBaseId());
    }

    @Override
    protected void onPreLoadEntity(OU entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreRefreshEntity(OU entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreUpdateEntity(OU entity) {
        entity.updateBase(daoSession.getSyncBaseDao());
    }

    @Override
    protected void onPreDeleteEntity(OU entity) {
        entity.deleteBase(daoSession.getSyncBaseDao());
    }

    static {
        GreenSync.registerListTypeToken("OU", new TypeToken<List<OU>>(){}.getType());
        GreenSync.registerTypeToken("OU", OU.class);
    }

}
