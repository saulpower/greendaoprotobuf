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
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;

import com.saulpower.GreenWireTest.database.EmploymentRole;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table EMPLOYMENT_ROLE.
*/
public class EmploymentRoleDao extends AbstractDao<EmploymentRole, Long> {

    public static final String TABLENAME = "EMPLOYMENT_ROLE";

    /**
     * Properties of entity EmploymentRole.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property EmploymentRolesOUId = new Property(0, long.class, "employmentRolesOUId", false, "EMPLOYMENT_ROLES_OUID");
        public final static Property Guid = new Property(1, String.class, "guid", false, "GUID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property ExternalID = new Property(3, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property TagString = new Property(4, String.class, "tagString", false, "TAG_STRING");
        public final static Property TenantID = new Property(5, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(6, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property DateLastModified = new Property(7, Long.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property IsDeleted = new Property(8, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Version = new Property(9, Integer.class, "version", false, "VERSION");
        public final static Property Id = new Property(10, Long.class, "id", true, "_id");
        public final static Property OUOUId = new Property(11, long.class, "oUOUId", false, "O_UOUID");
        public final static Property DateCreated = new Property(12, Long.class, "dateCreated", false, "DATE_CREATED");
        public final static Property IsActive = new Property(13, Boolean.class, "isActive", false, "IS_ACTIVE");
    };

    private DaoSession daoSession;

    private Query<EmploymentRole> oU_EmploymentRolesQuery;

    public EmploymentRoleDao(DaoConfig config) {
        super(config);
    }
    
    public EmploymentRoleDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'EMPLOYMENT_ROLE' (" + //
                "'EMPLOYMENT_ROLES_OUID' INTEGER NOT NULL ," + // 0: employmentRolesOUId
                "'GUID' TEXT," + // 1: guid
                "'NAME' TEXT," + // 2: name
                "'EXTERNAL_ID' TEXT," + // 3: externalID
                "'TAG_STRING' TEXT," + // 4: tagString
                "'TENANT_ID' INTEGER," + // 5: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 6: saveResultSaveResultId
                "'DATE_LAST_MODIFIED' INTEGER," + // 7: dateLastModified
                "'IS_DELETED' INTEGER," + // 8: isDeleted
                "'VERSION' INTEGER," + // 9: version
                "'_id' INTEGER PRIMARY KEY ," + // 10: id
                "'O_UOUID' INTEGER NOT NULL ," + // 11: oUOUId
                "'DATE_CREATED' INTEGER," + // 12: dateCreated
                "'IS_ACTIVE' INTEGER);"); // 13: isActive
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'EMPLOYMENT_ROLE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, EmploymentRole entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getEmploymentRolesOUId());
 
        String guid = entity.getGuid();
        if (guid != null) {
            stmt.bindString(2, guid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String externalID = entity.getExternalID();
        if (externalID != null) {
            stmt.bindString(4, externalID);
        }
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(5, tagString);
        }
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(6, tenantID);
        }
        stmt.bindLong(7, entity.getSaveResultSaveResultId());
 
        Long dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindLong(8, dateLastModified);
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
        stmt.bindLong(12, entity.getOUOUId());
 
        Long dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindLong(13, dateCreated);
        }
 
        Boolean isActive = entity.getIsActive();
        if (isActive != null) {
            stmt.bindLong(14, isActive ? 1l: 0l);
        }
    }

    @Override
    protected void attachEntity(EmploymentRole entity) {
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
    public EmploymentRole readEntity(Cursor cursor, int offset) {
        EmploymentRole entity = new EmploymentRole( //
            cursor.getLong(offset + 0), // employmentRolesOUId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // guid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // externalID
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // tagString
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // tenantID
            cursor.getLong(offset + 6), // saveResultSaveResultId
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7), // dateLastModified
            cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0, // isDeleted
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // version
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10), // id
            cursor.getLong(offset + 11), // oUOUId
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12), // dateCreated
            cursor.isNull(offset + 13) ? null : cursor.getShort(offset + 13) != 0 // isActive
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, EmploymentRole entity, int offset) {
        entity.setEmploymentRolesOUId(cursor.getLong(offset + 0));
        entity.setGuid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setExternalID(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTagString(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTenantID(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 6));
        entity.setDateLastModified(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
        entity.setIsDeleted(cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0);
        entity.setVersion(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setId(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
        entity.setOUOUId(cursor.getLong(offset + 11));
        entity.setDateCreated(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
        entity.setIsActive(cursor.isNull(offset + 13) ? null : cursor.getShort(offset + 13) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(EmploymentRole entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(EmploymentRole entity) {
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
    
    /** Internal query to resolve the "employmentRoles" to-many relationship of OU. */
    public List<EmploymentRole> _queryOU_EmploymentRoles(long employmentRolesOUId) {
        synchronized (this) {
            if (oU_EmploymentRolesQuery == null) {
                QueryBuilder<EmploymentRole> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.EmploymentRolesOUId.eq(null));
                oU_EmploymentRolesQuery = queryBuilder.build();
            }
        }
        Query<EmploymentRole> query = oU_EmploymentRolesQuery.forCurrentThread();
        query.setParameter(0, employmentRolesOUId);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getOUDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM EMPLOYMENT_ROLE T");
            builder.append(" LEFT JOIN OU T0 ON T.'O_UOUID'=T0.'_id'");
            builder.append(" LEFT JOIN SAVE_RESULT T1 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T1.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected EmploymentRole loadCurrentDeep(Cursor cursor, boolean lock) {
        EmploymentRole entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        OU oU = loadCurrentOther(daoSession.getOUDao(), cursor, offset);
         if(oU != null) {
            entity.setOU(oU);
        }
        offset += daoSession.getOUDao().getAllColumns().length;

        SaveResult saveResult = loadCurrentOther(daoSession.getSaveResultDao(), cursor, offset);
         if(saveResult != null) {
            entity.setSaveResult(saveResult);
        }

        return entity;    
    }

    public EmploymentRole loadDeep(Long key) {
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
    public List<EmploymentRole> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<EmploymentRole> list = new ArrayList<EmploymentRole>(count);
        
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
    
    protected List<EmploymentRole> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<EmploymentRole> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
