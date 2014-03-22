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

import com.saulpower.GreenWireTest.database.Department;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table DEPARTMENT.
*/
public class DepartmentDao extends AbstractDao<Department, Long> {

    public static final String TABLENAME = "DEPARTMENT";

    /**
     * Properties of entity Department.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Guid = new Property(0, String.class, "guid", false, "GUID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property ExternalID = new Property(2, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property TagString = new Property(3, String.class, "tagString", false, "TAG_STRING");
        public final static Property TenantID = new Property(4, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(5, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property DateLastModified = new Property(6, Long.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property IsDeleted = new Property(7, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Version = new Property(8, Integer.class, "version", false, "VERSION");
        public final static Property DepartmentsEmployeeFileId = new Property(9, long.class, "departmentsEmployeeFileId", false, "DEPARTMENTS_EMPLOYEE_FILE_ID");
        public final static Property Id = new Property(10, Long.class, "id", true, "_id");
        public final static Property OUOUId = new Property(11, long.class, "oUOUId", false, "O_UOUID");
        public final static Property DateCreated = new Property(12, Long.class, "dateCreated", false, "DATE_CREATED");
        public final static Property DepartmentsOUId = new Property(13, long.class, "departmentsOUId", false, "DEPARTMENTS_OUID");
        public final static Property IsActive = new Property(14, Boolean.class, "isActive", false, "IS_ACTIVE");
    };

    private DaoSession daoSession;

    private Query<Department> oU_DepartmentsQuery;
    private Query<Department> employeeFile_DepartmentsQuery;

    public DepartmentDao(DaoConfig config) {
        super(config);
    }
    
    public DepartmentDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'DEPARTMENT' (" + //
                "'GUID' TEXT," + // 0: guid
                "'NAME' TEXT," + // 1: name
                "'EXTERNAL_ID' TEXT," + // 2: externalID
                "'TAG_STRING' TEXT," + // 3: tagString
                "'TENANT_ID' INTEGER," + // 4: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 5: saveResultSaveResultId
                "'DATE_LAST_MODIFIED' INTEGER," + // 6: dateLastModified
                "'IS_DELETED' INTEGER," + // 7: isDeleted
                "'VERSION' INTEGER," + // 8: version
                "'DEPARTMENTS_EMPLOYEE_FILE_ID' INTEGER NOT NULL ," + // 9: departmentsEmployeeFileId
                "'_id' INTEGER PRIMARY KEY ," + // 10: id
                "'O_UOUID' INTEGER NOT NULL ," + // 11: oUOUId
                "'DATE_CREATED' INTEGER," + // 12: dateCreated
                "'DEPARTMENTS_OUID' INTEGER NOT NULL ," + // 13: departmentsOUId
                "'IS_ACTIVE' INTEGER);"); // 14: isActive
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'DEPARTMENT'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Department entity) {
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
 
        Long dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindLong(7, dateLastModified);
        }
 
        Boolean isDeleted = entity.getIsDeleted();
        if (isDeleted != null) {
            stmt.bindLong(8, isDeleted ? 1l: 0l);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(9, version);
        }
        stmt.bindLong(10, entity.getDepartmentsEmployeeFileId());
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(11, id);
        }
        stmt.bindLong(12, entity.getOUOUId());
 
        Long dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindLong(13, dateCreated);
        }
        stmt.bindLong(14, entity.getDepartmentsOUId());
 
        Boolean isActive = entity.getIsActive();
        if (isActive != null) {
            stmt.bindLong(15, isActive ? 1l: 0l);
        }
    }

    @Override
    protected void attachEntity(Department entity) {
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
    public Department readEntity(Cursor cursor, int offset) {
        Department entity = new Department( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // guid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // externalID
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // tagString
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // tenantID
            cursor.getLong(offset + 5), // saveResultSaveResultId
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6), // dateLastModified
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0, // isDeleted
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // version
            cursor.getLong(offset + 9), // departmentsEmployeeFileId
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10), // id
            cursor.getLong(offset + 11), // oUOUId
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12), // dateCreated
            cursor.getLong(offset + 13), // departmentsOUId
            cursor.isNull(offset + 14) ? null : cursor.getShort(offset + 14) != 0 // isActive
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Department entity, int offset) {
        entity.setGuid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setExternalID(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTagString(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTenantID(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 5));
        entity.setDateLastModified(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
        entity.setIsDeleted(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
        entity.setVersion(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setDepartmentsEmployeeFileId(cursor.getLong(offset + 9));
        entity.setId(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
        entity.setOUOUId(cursor.getLong(offset + 11));
        entity.setDateCreated(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
        entity.setDepartmentsOUId(cursor.getLong(offset + 13));
        entity.setIsActive(cursor.isNull(offset + 14) ? null : cursor.getShort(offset + 14) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Department entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Department entity) {
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
    
    /** Internal query to resolve the "departments" to-many relationship of OU. */
    public List<Department> _queryOU_Departments(long departmentsOUId) {
        synchronized (this) {
            if (oU_DepartmentsQuery == null) {
                QueryBuilder<Department> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.DepartmentsOUId.eq(null));
                oU_DepartmentsQuery = queryBuilder.build();
            }
        }
        Query<Department> query = oU_DepartmentsQuery.forCurrentThread();
        query.setParameter(0, departmentsOUId);
        return query.list();
    }

    /** Internal query to resolve the "departments" to-many relationship of EmployeeFile. */
    public List<Department> _queryEmployeeFile_Departments(long departmentsEmployeeFileId) {
        synchronized (this) {
            if (employeeFile_DepartmentsQuery == null) {
                QueryBuilder<Department> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.DepartmentsEmployeeFileId.eq(null));
                employeeFile_DepartmentsQuery = queryBuilder.build();
            }
        }
        Query<Department> query = employeeFile_DepartmentsQuery.forCurrentThread();
        query.setParameter(0, departmentsEmployeeFileId);
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
            builder.append(" FROM DEPARTMENT T");
            builder.append(" LEFT JOIN OU T0 ON T.'O_UOUID'=T0.'_id'");
            builder.append(" LEFT JOIN SAVE_RESULT T1 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T1.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Department loadCurrentDeep(Cursor cursor, boolean lock) {
        Department entity = loadCurrent(cursor, 0, lock);
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

    public Department loadDeep(Long key) {
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
    public List<Department> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Department> list = new ArrayList<Department>(count);
        
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
    
    protected List<Department> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Department> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
