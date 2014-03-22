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

import com.saulpower.GreenWireTest.database.Immunization;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table IMMUNIZATION.
*/
public class ImmunizationDao extends AbstractDao<Immunization, Long> {

    public static final String TABLENAME = "IMMUNIZATION";

    /**
     * Properties of entity Immunization.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property PersonPersonId = new Property(0, long.class, "personPersonId", false, "PERSON_PERSON_ID");
        public final static Property DefinitionID = new Property(1, String.class, "definitionID", false, "DEFINITION_ID");
        public final static Property ExternalID = new Property(2, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property Guid = new Property(3, String.class, "guid", false, "GUID");
        public final static Property Name = new Property(4, String.class, "name", false, "NAME");
        public final static Property TagString = new Property(5, String.class, "tagString", false, "TAG_STRING");
        public final static Property TenantID = new Property(6, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(7, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property ImmunizationsStudentId = new Property(8, long.class, "immunizationsStudentId", false, "IMMUNIZATIONS_STUDENT_ID");
        public final static Property DateLastModified = new Property(9, Long.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property DefinitionImmunizationDefinitionId = new Property(10, long.class, "definitionImmunizationDefinitionId", false, "DEFINITION_IMMUNIZATION_DEFINITION_ID");
        public final static Property IsDeleted = new Property(11, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Version = new Property(12, Integer.class, "version", false, "VERSION");
        public final static Property Id = new Property(13, Long.class, "id", true, "_id");
        public final static Property ImmunizationsPersonId = new Property(14, long.class, "immunizationsPersonId", false, "IMMUNIZATIONS_PERSON_ID");
        public final static Property DateCreated = new Property(15, Long.class, "dateCreated", false, "DATE_CREATED");
        public final static Property ImmunizationsImmunizationDefinitionId = new Property(16, long.class, "immunizationsImmunizationDefinitionId", false, "IMMUNIZATIONS_IMMUNIZATION_DEFINITION_ID");
    };

    private DaoSession daoSession;

    private Query<Immunization> student_ImmunizationsQuery;
    private Query<Immunization> person_ImmunizationsQuery;
    private Query<Immunization> immunizationDefinition_ImmunizationsQuery;

    public ImmunizationDao(DaoConfig config) {
        super(config);
    }
    
    public ImmunizationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'IMMUNIZATION' (" + //
                "'PERSON_PERSON_ID' INTEGER NOT NULL ," + // 0: personPersonId
                "'DEFINITION_ID' TEXT," + // 1: definitionID
                "'EXTERNAL_ID' TEXT," + // 2: externalID
                "'GUID' TEXT," + // 3: guid
                "'NAME' TEXT," + // 4: name
                "'TAG_STRING' TEXT," + // 5: tagString
                "'TENANT_ID' INTEGER," + // 6: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 7: saveResultSaveResultId
                "'IMMUNIZATIONS_STUDENT_ID' INTEGER NOT NULL ," + // 8: immunizationsStudentId
                "'DATE_LAST_MODIFIED' INTEGER," + // 9: dateLastModified
                "'DEFINITION_IMMUNIZATION_DEFINITION_ID' INTEGER NOT NULL ," + // 10: definitionImmunizationDefinitionId
                "'IS_DELETED' INTEGER," + // 11: isDeleted
                "'VERSION' INTEGER," + // 12: version
                "'_id' INTEGER PRIMARY KEY ," + // 13: id
                "'IMMUNIZATIONS_PERSON_ID' INTEGER NOT NULL ," + // 14: immunizationsPersonId
                "'DATE_CREATED' INTEGER," + // 15: dateCreated
                "'IMMUNIZATIONS_IMMUNIZATION_DEFINITION_ID' INTEGER NOT NULL );"); // 16: immunizationsImmunizationDefinitionId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'IMMUNIZATION'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Immunization entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getPersonPersonId());
 
        String definitionID = entity.getDefinitionID();
        if (definitionID != null) {
            stmt.bindString(2, definitionID);
        }
 
        String externalID = entity.getExternalID();
        if (externalID != null) {
            stmt.bindString(3, externalID);
        }
 
        String guid = entity.getGuid();
        if (guid != null) {
            stmt.bindString(4, guid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(6, tagString);
        }
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(7, tenantID);
        }
        stmt.bindLong(8, entity.getSaveResultSaveResultId());
        stmt.bindLong(9, entity.getImmunizationsStudentId());
 
        Long dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindLong(10, dateLastModified);
        }
        stmt.bindLong(11, entity.getDefinitionImmunizationDefinitionId());
 
        Boolean isDeleted = entity.getIsDeleted();
        if (isDeleted != null) {
            stmt.bindLong(12, isDeleted ? 1l: 0l);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(13, version);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(14, id);
        }
        stmt.bindLong(15, entity.getImmunizationsPersonId());
 
        Long dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindLong(16, dateCreated);
        }
        stmt.bindLong(17, entity.getImmunizationsImmunizationDefinitionId());
    }

    @Override
    protected void attachEntity(Immunization entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 13) ? null : cursor.getLong(offset + 13);
    }    

    /** @inheritdoc */
    @Override
    public Immunization readEntity(Cursor cursor, int offset) {
        Immunization entity = new Immunization( //
            cursor.getLong(offset + 0), // personPersonId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // definitionID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // externalID
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // guid
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // name
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // tagString
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6), // tenantID
            cursor.getLong(offset + 7), // saveResultSaveResultId
            cursor.getLong(offset + 8), // immunizationsStudentId
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // dateLastModified
            cursor.getLong(offset + 10), // definitionImmunizationDefinitionId
            cursor.isNull(offset + 11) ? null : cursor.getShort(offset + 11) != 0, // isDeleted
            cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12), // version
            cursor.isNull(offset + 13) ? null : cursor.getLong(offset + 13), // id
            cursor.getLong(offset + 14), // immunizationsPersonId
            cursor.isNull(offset + 15) ? null : cursor.getLong(offset + 15), // dateCreated
            cursor.getLong(offset + 16) // immunizationsImmunizationDefinitionId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Immunization entity, int offset) {
        entity.setPersonPersonId(cursor.getLong(offset + 0));
        entity.setDefinitionID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setExternalID(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setGuid(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTagString(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTenantID(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 7));
        entity.setImmunizationsStudentId(cursor.getLong(offset + 8));
        entity.setDateLastModified(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setDefinitionImmunizationDefinitionId(cursor.getLong(offset + 10));
        entity.setIsDeleted(cursor.isNull(offset + 11) ? null : cursor.getShort(offset + 11) != 0);
        entity.setVersion(cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12));
        entity.setId(cursor.isNull(offset + 13) ? null : cursor.getLong(offset + 13));
        entity.setImmunizationsPersonId(cursor.getLong(offset + 14));
        entity.setDateCreated(cursor.isNull(offset + 15) ? null : cursor.getLong(offset + 15));
        entity.setImmunizationsImmunizationDefinitionId(cursor.getLong(offset + 16));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Immunization entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Immunization entity) {
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
    
    /** Internal query to resolve the "immunizations" to-many relationship of Student. */
    public List<Immunization> _queryStudent_Immunizations(long immunizationsStudentId) {
        synchronized (this) {
            if (student_ImmunizationsQuery == null) {
                QueryBuilder<Immunization> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.ImmunizationsStudentId.eq(null));
                student_ImmunizationsQuery = queryBuilder.build();
            }
        }
        Query<Immunization> query = student_ImmunizationsQuery.forCurrentThread();
        query.setParameter(0, immunizationsStudentId);
        return query.list();
    }

    /** Internal query to resolve the "immunizations" to-many relationship of Person. */
    public List<Immunization> _queryPerson_Immunizations(long immunizationsPersonId) {
        synchronized (this) {
            if (person_ImmunizationsQuery == null) {
                QueryBuilder<Immunization> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.ImmunizationsPersonId.eq(null));
                person_ImmunizationsQuery = queryBuilder.build();
            }
        }
        Query<Immunization> query = person_ImmunizationsQuery.forCurrentThread();
        query.setParameter(0, immunizationsPersonId);
        return query.list();
    }

    /** Internal query to resolve the "immunizations" to-many relationship of ImmunizationDefinition. */
    public List<Immunization> _queryImmunizationDefinition_Immunizations(long immunizationsImmunizationDefinitionId) {
        synchronized (this) {
            if (immunizationDefinition_ImmunizationsQuery == null) {
                QueryBuilder<Immunization> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.ImmunizationsImmunizationDefinitionId.eq(null));
                immunizationDefinition_ImmunizationsQuery = queryBuilder.build();
            }
        }
        Query<Immunization> query = immunizationDefinition_ImmunizationsQuery.forCurrentThread();
        query.setParameter(0, immunizationsImmunizationDefinitionId);
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
            SqlUtils.appendColumns(builder, "T1", daoSession.getPersonDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T2", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM IMMUNIZATION T");
            builder.append(" LEFT JOIN IMMUNIZATION_DEFINITION T0 ON T.'DEFINITION_IMMUNIZATION_DEFINITION_ID'=T0.'_id'");
            builder.append(" LEFT JOIN PERSON T1 ON T.'PERSON_PERSON_ID'=T1.'_id'");
            builder.append(" LEFT JOIN SAVE_RESULT T2 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T2.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Immunization loadCurrentDeep(Cursor cursor, boolean lock) {
        Immunization entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        ImmunizationDefinition definition = loadCurrentOther(daoSession.getImmunizationDefinitionDao(), cursor, offset);
         if(definition != null) {
            entity.setDefinition(definition);
        }
        offset += daoSession.getImmunizationDefinitionDao().getAllColumns().length;

        Person person = loadCurrentOther(daoSession.getPersonDao(), cursor, offset);
         if(person != null) {
            entity.setPerson(person);
        }
        offset += daoSession.getPersonDao().getAllColumns().length;

        SaveResult saveResult = loadCurrentOther(daoSession.getSaveResultDao(), cursor, offset);
         if(saveResult != null) {
            entity.setSaveResult(saveResult);
        }

        return entity;    
    }

    public Immunization loadDeep(Long key) {
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
    public List<Immunization> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Immunization> list = new ArrayList<Immunization>(count);
        
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
    
    protected List<Immunization> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Immunization> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
