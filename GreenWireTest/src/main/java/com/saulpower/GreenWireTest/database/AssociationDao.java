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

import com.saulpower.GreenWireTest.database.Association;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ASSOCIATION.
*/
public class AssociationDao extends AbstractDao<Association, Long> {

    public static final String TABLENAME = "ASSOCIATION";

    /**
     * Properties of entity Association.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property ExternalID = new Property(0, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Guid = new Property(2, String.class, "guid", false, "GUID");
        public final static Property TagString = new Property(3, String.class, "tagString", false, "TAG_STRING");
        public final static Property RoleID = new Property(4, String.class, "roleID", false, "ROLE_ID");
        public final static Property RoleRoleBaseId = new Property(5, long.class, "roleRoleBaseId", false, "ROLE_ROLE_BASE_ID");
        public final static Property AssociationsGuardianId = new Property(6, long.class, "associationsGuardianId", false, "ASSOCIATIONS_GUARDIAN_ID");
        public final static Property TenantID = new Property(7, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(8, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property DateLastModified = new Property(9, String.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property AssociationsOUId = new Property(10, long.class, "associationsOUId", false, "ASSOCIATIONS_OUID");
        public final static Property AssociationsStudentId = new Property(11, long.class, "associationsStudentId", false, "ASSOCIATIONS_STUDENT_ID");
        public final static Property AssociationsOUBaseId = new Property(12, long.class, "associationsOUBaseId", false, "ASSOCIATIONS_OUBASE_ID");
        public final static Property UserAuthorizedPersonId = new Property(13, long.class, "userAuthorizedPersonId", false, "USER_AUTHORIZED_PERSON_ID");
        public final static Property SyncBaseId = new Property(14, Long.class, "syncBaseId", false, "SYNC_BASE_ID");
        public final static Property AssociationsPersonId = new Property(15, long.class, "associationsPersonId", false, "ASSOCIATIONS_PERSON_ID");
        public final static Property IsDeleted = new Property(16, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Version = new Property(17, Integer.class, "version", false, "VERSION");
        public final static Property AssociationsCenterId = new Property(18, long.class, "associationsCenterId", false, "ASSOCIATIONS_CENTER_ID");
        public final static Property AssociationsAuthorizedPersonId = new Property(19, long.class, "associationsAuthorizedPersonId", false, "ASSOCIATIONS_AUTHORIZED_PERSON_ID");
        public final static Property Id = new Property(20, Long.class, "id", true, "_id");
        public final static Property DateCreated = new Property(21, String.class, "dateCreated", false, "DATE_CREATED");
        public final static Property OUOUBaseId = new Property(22, long.class, "oUOUBaseId", false, "O_UOUBASE_ID");
        public final static Property IsActive = new Property(23, Boolean.class, "isActive", false, "IS_ACTIVE");
    };

    private DaoSession daoSession;

    private Query<Association> center_AssociationsQuery;

    private Query<Association> person_AssociationsQuery;

    private Query<Association> student_AssociationsQuery;

    private Query<Association> oU_AssociationsQuery;

    private Query<Association> oUBase_AssociationsQuery;

    private Query<Association> authorizedPerson_AssociationsQuery;

    private Query<Association> guardian_AssociationsQuery;

    public AssociationDao(DaoConfig config) {
        super(config);
    }
    
    public AssociationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ASSOCIATION' (" + //
                "'EXTERNAL_ID' TEXT," + // 0: externalID
                "'NAME' TEXT," + // 1: name
                "'GUID' TEXT," + // 2: guid
                "'TAG_STRING' TEXT," + // 3: tagString
                "'ROLE_ID' TEXT," + // 4: roleID
                "'ROLE_ROLE_BASE_ID' INTEGER NOT NULL ," + // 5: roleRoleBaseId
                "'ASSOCIATIONS_GUARDIAN_ID' INTEGER NOT NULL ," + // 6: associationsGuardianId
                "'TENANT_ID' INTEGER," + // 7: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 8: saveResultSaveResultId
                "'DATE_LAST_MODIFIED' TEXT," + // 9: dateLastModified
                "'ASSOCIATIONS_OUID' INTEGER NOT NULL ," + // 10: associationsOUId
                "'ASSOCIATIONS_STUDENT_ID' INTEGER NOT NULL ," + // 11: associationsStudentId
                "'ASSOCIATIONS_OUBASE_ID' INTEGER NOT NULL ," + // 12: associationsOUBaseId
                "'USER_AUTHORIZED_PERSON_ID' INTEGER NOT NULL ," + // 13: userAuthorizedPersonId
                "'SYNC_BASE_ID' INTEGER REFERENCES 'SYNC_BASE'('SYNC_BASE_ID') ," + // 14: syncBaseId
                "'ASSOCIATIONS_PERSON_ID' INTEGER NOT NULL ," + // 15: associationsPersonId
                "'IS_DELETED' INTEGER," + // 16: isDeleted
                "'VERSION' INTEGER," + // 17: version
                "'ASSOCIATIONS_CENTER_ID' INTEGER NOT NULL ," + // 18: associationsCenterId
                "'ASSOCIATIONS_AUTHORIZED_PERSON_ID' INTEGER NOT NULL ," + // 19: associationsAuthorizedPersonId
                "'_id' INTEGER PRIMARY KEY ," + // 20: id
                "'DATE_CREATED' TEXT," + // 21: dateCreated
                "'O_UOUBASE_ID' INTEGER NOT NULL ," + // 22: oUOUBaseId
                "'IS_ACTIVE' INTEGER);"); // 23: isActive
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ASSOCIATION'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Association entity) {
        stmt.clearBindings();
 
        String externalID = entity.getExternalID();
        if (externalID != null) {
            stmt.bindString(1, externalID);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String guid = entity.getGuid();
        if (guid != null) {
            stmt.bindString(3, guid);
        }
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(4, tagString);
        }
 
        String roleID = entity.getRoleID();
        if (roleID != null) {
            stmt.bindString(5, roleID);
        }
        stmt.bindLong(6, entity.getRoleRoleBaseId());
        stmt.bindLong(7, entity.getAssociationsGuardianId());
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(8, tenantID);
        }
        stmt.bindLong(9, entity.getSaveResultSaveResultId());
 
        String dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindString(10, dateLastModified);
        }
        stmt.bindLong(11, entity.getAssociationsOUId());
        stmt.bindLong(12, entity.getAssociationsStudentId());
        stmt.bindLong(13, entity.getAssociationsOUBaseId());
        stmt.bindLong(14, entity.getUserAuthorizedPersonId());
 
        Long syncBaseId = entity.getSyncBaseId();
        if (syncBaseId != null) {
            stmt.bindLong(15, syncBaseId);
        }
        stmt.bindLong(16, entity.getAssociationsPersonId());
 
        Boolean isDeleted = entity.getIsDeleted();
        if (isDeleted != null) {
            stmt.bindLong(17, isDeleted ? 1l: 0l);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(18, version);
        }
        stmt.bindLong(19, entity.getAssociationsCenterId());
        stmt.bindLong(20, entity.getAssociationsAuthorizedPersonId());
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(21, id);
        }
 
        String dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindString(22, dateCreated);
        }
        stmt.bindLong(23, entity.getOUOUBaseId());
 
        Boolean isActive = entity.getIsActive();
        if (isActive != null) {
            stmt.bindLong(24, isActive ? 1l: 0l);
        }
    }

    @Override
    protected void attachEntity(Association entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 20) ? null : cursor.getLong(offset + 20);
    }    

    /** @inheritdoc */
    @Override
    public Association readEntity(Cursor cursor, int offset) {
        Association entity = new Association( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // externalID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // guid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // tagString
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // roleID
            cursor.getLong(offset + 5), // roleRoleBaseId
            cursor.getLong(offset + 6), // associationsGuardianId
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7), // tenantID
            cursor.getLong(offset + 8), // saveResultSaveResultId
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // dateLastModified
            cursor.getLong(offset + 10), // associationsOUId
            cursor.getLong(offset + 11), // associationsStudentId
            cursor.getLong(offset + 12), // associationsOUBaseId
            cursor.getLong(offset + 13), // userAuthorizedPersonId
            cursor.isNull(offset + 14) ? null : cursor.getLong(offset + 14), // syncBaseId
            cursor.getLong(offset + 15), // associationsPersonId
            cursor.isNull(offset + 16) ? null : cursor.getShort(offset + 16) != 0, // isDeleted
            cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17), // version
            cursor.getLong(offset + 18), // associationsCenterId
            cursor.getLong(offset + 19), // associationsAuthorizedPersonId
            cursor.isNull(offset + 20) ? null : cursor.getLong(offset + 20), // id
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // dateCreated
            cursor.getLong(offset + 22), // oUOUBaseId
            cursor.isNull(offset + 23) ? null : cursor.getShort(offset + 23) != 0 // isActive
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Association entity, int offset) {
        entity.setExternalID(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setGuid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTagString(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setRoleID(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setRoleRoleBaseId(cursor.getLong(offset + 5));
        entity.setAssociationsGuardianId(cursor.getLong(offset + 6));
        entity.setTenantID(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 8));
        entity.setDateLastModified(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setAssociationsOUId(cursor.getLong(offset + 10));
        entity.setAssociationsStudentId(cursor.getLong(offset + 11));
        entity.setAssociationsOUBaseId(cursor.getLong(offset + 12));
        entity.setUserAuthorizedPersonId(cursor.getLong(offset + 13));
        entity.setSyncBaseId(cursor.isNull(offset + 14) ? null : cursor.getLong(offset + 14));
        entity.setAssociationsPersonId(cursor.getLong(offset + 15));
        entity.setIsDeleted(cursor.isNull(offset + 16) ? null : cursor.getShort(offset + 16) != 0);
        entity.setVersion(cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17));
        entity.setAssociationsCenterId(cursor.getLong(offset + 18));
        entity.setAssociationsAuthorizedPersonId(cursor.getLong(offset + 19));
        entity.setId(cursor.isNull(offset + 20) ? null : cursor.getLong(offset + 20));
        entity.setDateCreated(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setOUOUBaseId(cursor.getLong(offset + 22));
        entity.setIsActive(cursor.isNull(offset + 23) ? null : cursor.getShort(offset + 23) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Association entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Association entity) {
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
    
    /** Internal query to resolve the "associations" to-many relationship of Center. */
    public List<Association> _queryCenter_Associations(long associationsCenterId) {
        synchronized (this) {
            if (center_AssociationsQuery == null) {
                QueryBuilder<Association> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.AssociationsCenterId.eq(null));
                center_AssociationsQuery = queryBuilder.build();
            }
        }
        Query<Association> query = center_AssociationsQuery.forCurrentThread();
        query.setParameter(0, associationsCenterId);
        return query.list();
    }

    /** Internal query to resolve the "associations" to-many relationship of Person. */
    public List<Association> _queryPerson_Associations(long associationsPersonId) {
        synchronized (this) {
            if (person_AssociationsQuery == null) {
                QueryBuilder<Association> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.AssociationsPersonId.eq(null));
                person_AssociationsQuery = queryBuilder.build();
            }
        }
        Query<Association> query = person_AssociationsQuery.forCurrentThread();
        query.setParameter(0, associationsPersonId);
        return query.list();
    }

    /** Internal query to resolve the "associations" to-many relationship of Student. */
    public List<Association> _queryStudent_Associations(long associationsStudentId) {
        synchronized (this) {
            if (student_AssociationsQuery == null) {
                QueryBuilder<Association> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.AssociationsStudentId.eq(null));
                student_AssociationsQuery = queryBuilder.build();
            }
        }
        Query<Association> query = student_AssociationsQuery.forCurrentThread();
        query.setParameter(0, associationsStudentId);
        return query.list();
    }

    /** Internal query to resolve the "associations" to-many relationship of OU. */
    public List<Association> _queryOU_Associations(long associationsOUId) {
        synchronized (this) {
            if (oU_AssociationsQuery == null) {
                QueryBuilder<Association> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.AssociationsOUId.eq(null));
                oU_AssociationsQuery = queryBuilder.build();
            }
        }
        Query<Association> query = oU_AssociationsQuery.forCurrentThread();
        query.setParameter(0, associationsOUId);
        return query.list();
    }

    /** Internal query to resolve the "associations" to-many relationship of OUBase. */
    public List<Association> _queryOUBase_Associations(long associationsOUBaseId) {
        synchronized (this) {
            if (oUBase_AssociationsQuery == null) {
                QueryBuilder<Association> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.AssociationsOUBaseId.eq(null));
                oUBase_AssociationsQuery = queryBuilder.build();
            }
        }
        Query<Association> query = oUBase_AssociationsQuery.forCurrentThread();
        query.setParameter(0, associationsOUBaseId);
        return query.list();
    }

    /** Internal query to resolve the "associations" to-many relationship of AuthorizedPerson. */
    public List<Association> _queryAuthorizedPerson_Associations(long associationsAuthorizedPersonId) {
        synchronized (this) {
            if (authorizedPerson_AssociationsQuery == null) {
                QueryBuilder<Association> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.AssociationsAuthorizedPersonId.eq(null));
                authorizedPerson_AssociationsQuery = queryBuilder.build();
            }
        }
        Query<Association> query = authorizedPerson_AssociationsQuery.forCurrentThread();
        query.setParameter(0, associationsAuthorizedPersonId);
        return query.list();
    }

    /** Internal query to resolve the "associations" to-many relationship of Guardian. */
    public List<Association> _queryGuardian_Associations(long associationsGuardianId) {
        synchronized (this) {
            if (guardian_AssociationsQuery == null) {
                QueryBuilder<Association> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.AssociationsGuardianId.eq(null));
                guardian_AssociationsQuery = queryBuilder.build();
            }
        }
        Query<Association> query = guardian_AssociationsQuery.forCurrentThread();
        query.setParameter(0, associationsGuardianId);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getOUBaseDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getAuthorizedPersonDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T2", daoSession.getRoleBaseDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T3", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM ASSOCIATION T");
            builder.append(" LEFT JOIN OUBASE T0 ON T.'O_UOUBASE_ID'=T0.'_id'");
            builder.append(" LEFT JOIN AUTHORIZED_PERSON T1 ON T.'USER_AUTHORIZED_PERSON_ID'=T1.'_id'");
            builder.append(" LEFT JOIN ROLE_BASE T2 ON T.'ROLE_ROLE_BASE_ID'=T2.'_id'");
            builder.append(" LEFT JOIN SAVE_RESULT T3 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T3.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Association loadCurrentDeep(Cursor cursor, boolean lock) {
        Association entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        OUBase oU = loadCurrentOther(daoSession.getOUBaseDao(), cursor, offset);
         if(oU != null) {
            entity.setOU(oU);
        }
        offset += daoSession.getOUBaseDao().getAllColumns().length;

        AuthorizedPerson user = loadCurrentOther(daoSession.getAuthorizedPersonDao(), cursor, offset);
         if(user != null) {
            entity.setUser(user);
        }
        offset += daoSession.getAuthorizedPersonDao().getAllColumns().length;

        RoleBase role = loadCurrentOther(daoSession.getRoleBaseDao(), cursor, offset);
         if(role != null) {
            entity.setRole(role);
        }
        offset += daoSession.getRoleBaseDao().getAllColumns().length;

        SaveResult saveResult = loadCurrentOther(daoSession.getSaveResultDao(), cursor, offset);
         if(saveResult != null) {
            entity.setSaveResult(saveResult);
        }

        return entity;    
    }

    public Association loadDeep(Long key) {
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
    public List<Association> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Association> list = new ArrayList<Association>(count);
        
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
    
    protected List<Association> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Association> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
    @Override
    protected void onPreInsertEntity(Association entity) {
        entity.insertBase(daoSession.getSyncBaseDao());
        entity.setSyncBaseId(entity.getSyncBaseId());
    }

    @Override
    protected void onPreLoadEntity(Association entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreRefreshEntity(Association entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreUpdateEntity(Association entity) {
        entity.updateBase(daoSession.getSyncBaseDao());
    }

    @Override
    protected void onPreDeleteEntity(Association entity) {
        entity.deleteBase(daoSession.getSyncBaseDao());
    }

    static {
        GreenSync.registerListTypeToken("Association", new TypeToken<List<Association>>(){}.getType());
        GreenSync.registerTypeToken("Association", Association.class);
    }

}
