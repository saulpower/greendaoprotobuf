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

import com.saulpower.GreenWireTest.database.PersonalRelationship;
import com.saulpower.GreenWireTest.database.PersonalRelationship.RelationshipType;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table PERSONAL_RELATIONSHIP.
*/
public class PersonalRelationshipDao extends AbstractDao<PersonalRelationship, Long> {

    public static final String TABLENAME = "PERSONAL_RELATIONSHIP";

    /**
     * Properties of entity PersonalRelationship.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Guid = new Property(0, String.class, "guid", false, "GUID");
        public final static Property ExternalID = new Property(1, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property ToPersonID = new Property(2, String.class, "toPersonID", false, "TO_PERSON_ID");
        public final static Property FromPersonPersonId = new Property(3, long.class, "fromPersonPersonId", false, "FROM_PERSON_PERSON_ID");
        public final static Property DateLastModified = new Property(4, String.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property PeopleFamilyId = new Property(5, long.class, "peopleFamilyId", false, "PEOPLE_FAMILY_ID");
        public final static Property IsPickupOK = new Property(6, Boolean.class, "isPickupOK", false, "IS_PICKUP_OK");
        public final static Property SyncBaseId = new Property(7, Long.class, "syncBaseId", false, "SYNC_BASE_ID");
        public final static Property IsDeleted = new Property(8, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Version = new Property(9, Integer.class, "version", false, "VERSION");
        public final static Property ShowInPickupList = new Property(10, Boolean.class, "showInPickupList", false, "SHOW_IN_PICKUP_LIST");
        public final static Property IsLegalGuardian = new Property(11, Boolean.class, "isLegalGuardian", false, "IS_LEGAL_GUARDIAN");
        public final static Property Id = new Property(12, Long.class, "id", true, "_id");
        public final static Property RelationshipsPersonId = new Property(13, long.class, "relationshipsPersonId", false, "RELATIONSHIPS_PERSON_ID");
        public final static Property DateCreated = new Property(14, String.class, "dateCreated", false, "DATE_CREATED");
        public final static Property ToPersonPersonId = new Property(15, long.class, "toPersonPersonId", false, "TO_PERSON_PERSON_ID");
        public final static Property Name = new Property(16, String.class, "name", false, "NAME");
        public final static Property FromPersonID = new Property(17, String.class, "fromPersonID", false, "FROM_PERSON_ID");
        public final static Property TagString = new Property(18, String.class, "tagString", false, "TAG_STRING");
        public final static Property IsEmergencyContact = new Property(19, Boolean.class, "isEmergencyContact", false, "IS_EMERGENCY_CONTACT");
        public final static Property TenantID = new Property(20, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(21, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property RelationshipsStudentId = new Property(22, long.class, "relationshipsStudentId", false, "RELATIONSHIPS_STUDENT_ID");
        public final static Property IsBillingPerson = new Property(23, Boolean.class, "isBillingPerson", false, "IS_BILLING_PERSON");
        public final static Property RelationshipType = new Property(24, RelationshipType.class, "relationshipType", false, "RELATIONSHIP_TYPE");
        public final static Property RelationshipsGuardianId = new Property(25, long.class, "relationshipsGuardianId", false, "RELATIONSHIPS_GUARDIAN_ID");
    };

    private DaoSession daoSession;

    private Query<PersonalRelationship> person_RelationshipsQuery;

    private Query<PersonalRelationship> student_RelationshipsQuery;

    private Query<PersonalRelationship> family_PeopleQuery;

    private Query<PersonalRelationship> guardian_RelationshipsQuery;

    public PersonalRelationshipDao(DaoConfig config) {
        super(config);
    }
    
    public PersonalRelationshipDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'PERSONAL_RELATIONSHIP' (" + //
                "'GUID' TEXT," + // 0: guid
                "'EXTERNAL_ID' TEXT," + // 1: externalID
                "'TO_PERSON_ID' TEXT," + // 2: toPersonID
                "'FROM_PERSON_PERSON_ID' INTEGER NOT NULL ," + // 3: fromPersonPersonId
                "'DATE_LAST_MODIFIED' TEXT," + // 4: dateLastModified
                "'PEOPLE_FAMILY_ID' INTEGER NOT NULL ," + // 5: peopleFamilyId
                "'IS_PICKUP_OK' INTEGER," + // 6: isPickupOK
                "'SYNC_BASE_ID' INTEGER REFERENCES 'SYNC_BASE'('SYNC_BASE_ID') ," + // 7: syncBaseId
                "'IS_DELETED' INTEGER," + // 8: isDeleted
                "'VERSION' INTEGER," + // 9: version
                "'SHOW_IN_PICKUP_LIST' INTEGER," + // 10: showInPickupList
                "'IS_LEGAL_GUARDIAN' INTEGER," + // 11: isLegalGuardian
                "'_id' INTEGER PRIMARY KEY ," + // 12: id
                "'RELATIONSHIPS_PERSON_ID' INTEGER NOT NULL ," + // 13: relationshipsPersonId
                "'DATE_CREATED' TEXT," + // 14: dateCreated
                "'TO_PERSON_PERSON_ID' INTEGER NOT NULL ," + // 15: toPersonPersonId
                "'NAME' TEXT," + // 16: name
                "'FROM_PERSON_ID' TEXT," + // 17: fromPersonID
                "'TAG_STRING' TEXT," + // 18: tagString
                "'IS_EMERGENCY_CONTACT' INTEGER," + // 19: isEmergencyContact
                "'TENANT_ID' INTEGER," + // 20: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 21: saveResultSaveResultId
                "'RELATIONSHIPS_STUDENT_ID' INTEGER NOT NULL ," + // 22: relationshipsStudentId
                "'IS_BILLING_PERSON' INTEGER," + // 23: isBillingPerson
                "'RELATIONSHIP_TYPE' INTEGER," + // 24: relationshipType
                "'RELATIONSHIPS_GUARDIAN_ID' INTEGER NOT NULL );"); // 25: relationshipsGuardianId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'PERSONAL_RELATIONSHIP'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, PersonalRelationship entity) {
        stmt.clearBindings();
 
        String guid = entity.getGuid();
        if (guid != null) {
            stmt.bindString(1, guid);
        }
 
        String externalID = entity.getExternalID();
        if (externalID != null) {
            stmt.bindString(2, externalID);
        }
 
        String toPersonID = entity.getToPersonID();
        if (toPersonID != null) {
            stmt.bindString(3, toPersonID);
        }
        stmt.bindLong(4, entity.getFromPersonPersonId());
 
        String dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindString(5, dateLastModified);
        }
        stmt.bindLong(6, entity.getPeopleFamilyId());
 
        Boolean isPickupOK = entity.getIsPickupOK();
        if (isPickupOK != null) {
            stmt.bindLong(7, isPickupOK ? 1l: 0l);
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
 
        Boolean showInPickupList = entity.getShowInPickupList();
        if (showInPickupList != null) {
            stmt.bindLong(11, showInPickupList ? 1l: 0l);
        }
 
        Boolean isLegalGuardian = entity.getIsLegalGuardian();
        if (isLegalGuardian != null) {
            stmt.bindLong(12, isLegalGuardian ? 1l: 0l);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(13, id);
        }
        stmt.bindLong(14, entity.getRelationshipsPersonId());
 
        String dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindString(15, dateCreated);
        }
        stmt.bindLong(16, entity.getToPersonPersonId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(17, name);
        }
 
        String fromPersonID = entity.getFromPersonID();
        if (fromPersonID != null) {
            stmt.bindString(18, fromPersonID);
        }
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(19, tagString);
        }
 
        Boolean isEmergencyContact = entity.getIsEmergencyContact();
        if (isEmergencyContact != null) {
            stmt.bindLong(20, isEmergencyContact ? 1l: 0l);
        }
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(21, tenantID);
        }
        stmt.bindLong(22, entity.getSaveResultSaveResultId());
        stmt.bindLong(23, entity.getRelationshipsStudentId());
 
        Boolean isBillingPerson = entity.getIsBillingPerson();
        if (isBillingPerson != null) {
            stmt.bindLong(24, isBillingPerson ? 1l: 0l);
        }
 
        RelationshipType relationshipType = entity.getRelationshipType();
        if (relationshipType != null) {
            stmt.bindLong(25, relationshipType.getValue());
        }
        stmt.bindLong(26, entity.getRelationshipsGuardianId());
    }

    @Override
    protected void attachEntity(PersonalRelationship entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12);
    }    

    /** @inheritdoc */
    @Override
    public PersonalRelationship readEntity(Cursor cursor, int offset) {
        PersonalRelationship entity = new PersonalRelationship( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // guid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // externalID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // toPersonID
            cursor.getLong(offset + 3), // fromPersonPersonId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // dateLastModified
            cursor.getLong(offset + 5), // peopleFamilyId
            cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0, // isPickupOK
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7), // syncBaseId
            cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0, // isDeleted
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // version
            cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0, // showInPickupList
            cursor.isNull(offset + 11) ? null : cursor.getShort(offset + 11) != 0, // isLegalGuardian
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12), // id
            cursor.getLong(offset + 13), // relationshipsPersonId
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // dateCreated
            cursor.getLong(offset + 15), // toPersonPersonId
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // name
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // fromPersonID
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // tagString
            cursor.isNull(offset + 19) ? null : cursor.getShort(offset + 19) != 0, // isEmergencyContact
            cursor.isNull(offset + 20) ? null : cursor.getLong(offset + 20), // tenantID
            cursor.getLong(offset + 21), // saveResultSaveResultId
            cursor.getLong(offset + 22), // relationshipsStudentId
            cursor.isNull(offset + 23) ? null : cursor.getShort(offset + 23) != 0, // isBillingPerson
            cursor.isNull(offset + 24) ? null : RelationshipType.fromInt(cursor.getLong(offset + 24)), // relationshipType
            cursor.getLong(offset + 25) // relationshipsGuardianId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, PersonalRelationship entity, int offset) {
        entity.setGuid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setExternalID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setToPersonID(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setFromPersonPersonId(cursor.getLong(offset + 3));
        entity.setDateLastModified(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPeopleFamilyId(cursor.getLong(offset + 5));
        entity.setIsPickupOK(cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0);
        entity.setSyncBaseId(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
        entity.setIsDeleted(cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0);
        entity.setVersion(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setShowInPickupList(cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0);
        entity.setIsLegalGuardian(cursor.isNull(offset + 11) ? null : cursor.getShort(offset + 11) != 0);
        entity.setId(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
        entity.setRelationshipsPersonId(cursor.getLong(offset + 13));
        entity.setDateCreated(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setToPersonPersonId(cursor.getLong(offset + 15));
        entity.setName(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setFromPersonID(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setTagString(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setIsEmergencyContact(cursor.isNull(offset + 19) ? null : cursor.getShort(offset + 19) != 0);
        entity.setTenantID(cursor.isNull(offset + 20) ? null : cursor.getLong(offset + 20));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 21));
        entity.setRelationshipsStudentId(cursor.getLong(offset + 22));
        entity.setIsBillingPerson(cursor.isNull(offset + 23) ? null : cursor.getShort(offset + 23) != 0);
        entity.setRelationshipType(cursor.isNull(offset + 24) ? null : RelationshipType.fromInt(cursor.getLong(offset + 24)));
        entity.setRelationshipsGuardianId(cursor.getLong(offset + 25));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(PersonalRelationship entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(PersonalRelationship entity) {
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
    
    /** Internal query to resolve the "relationships" to-many relationship of Person. */
    public List<PersonalRelationship> _queryPerson_Relationships(long relationshipsPersonId) {
        synchronized (this) {
            if (person_RelationshipsQuery == null) {
                QueryBuilder<PersonalRelationship> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.RelationshipsPersonId.eq(null));
                person_RelationshipsQuery = queryBuilder.build();
            }
        }
        Query<PersonalRelationship> query = person_RelationshipsQuery.forCurrentThread();
        query.setParameter(0, relationshipsPersonId);
        return query.list();
    }

    /** Internal query to resolve the "relationships" to-many relationship of Student. */
    public List<PersonalRelationship> _queryStudent_Relationships(long relationshipsStudentId) {
        synchronized (this) {
            if (student_RelationshipsQuery == null) {
                QueryBuilder<PersonalRelationship> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.RelationshipsStudentId.eq(null));
                student_RelationshipsQuery = queryBuilder.build();
            }
        }
        Query<PersonalRelationship> query = student_RelationshipsQuery.forCurrentThread();
        query.setParameter(0, relationshipsStudentId);
        return query.list();
    }

    /** Internal query to resolve the "people" to-many relationship of Family. */
    public List<PersonalRelationship> _queryFamily_People(long peopleFamilyId) {
        synchronized (this) {
            if (family_PeopleQuery == null) {
                QueryBuilder<PersonalRelationship> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.PeopleFamilyId.eq(null));
                family_PeopleQuery = queryBuilder.build();
            }
        }
        Query<PersonalRelationship> query = family_PeopleQuery.forCurrentThread();
        query.setParameter(0, peopleFamilyId);
        return query.list();
    }

    /** Internal query to resolve the "relationships" to-many relationship of Guardian. */
    public List<PersonalRelationship> _queryGuardian_Relationships(long relationshipsGuardianId) {
        synchronized (this) {
            if (guardian_RelationshipsQuery == null) {
                QueryBuilder<PersonalRelationship> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.RelationshipsGuardianId.eq(null));
                guardian_RelationshipsQuery = queryBuilder.build();
            }
        }
        Query<PersonalRelationship> query = guardian_RelationshipsQuery.forCurrentThread();
        query.setParameter(0, relationshipsGuardianId);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getPersonDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getPersonDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T2", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM PERSONAL_RELATIONSHIP T");
            builder.append(" LEFT JOIN PERSON T0 ON T.'FROM_PERSON_PERSON_ID'=T0.'_id'");
            builder.append(" LEFT JOIN PERSON T1 ON T.'TO_PERSON_PERSON_ID'=T1.'_id'");
            builder.append(" LEFT JOIN SAVE_RESULT T2 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T2.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected PersonalRelationship loadCurrentDeep(Cursor cursor, boolean lock) {
        PersonalRelationship entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Person fromPerson = loadCurrentOther(daoSession.getPersonDao(), cursor, offset);
         if(fromPerson != null) {
            entity.setFromPerson(fromPerson);
        }
        offset += daoSession.getPersonDao().getAllColumns().length;

        Person toPerson = loadCurrentOther(daoSession.getPersonDao(), cursor, offset);
         if(toPerson != null) {
            entity.setToPerson(toPerson);
        }
        offset += daoSession.getPersonDao().getAllColumns().length;

        SaveResult saveResult = loadCurrentOther(daoSession.getSaveResultDao(), cursor, offset);
         if(saveResult != null) {
            entity.setSaveResult(saveResult);
        }

        return entity;    
    }

    public PersonalRelationship loadDeep(Long key) {
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
    public List<PersonalRelationship> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<PersonalRelationship> list = new ArrayList<PersonalRelationship>(count);
        
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
    
    protected List<PersonalRelationship> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<PersonalRelationship> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
    @Override
    protected void onPreInsertEntity(PersonalRelationship entity) {
        entity.insertBase(daoSession.getSyncBaseDao());
        entity.setSyncBaseId(entity.getSyncBaseId());
    }

    @Override
    protected void onPreLoadEntity(PersonalRelationship entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreRefreshEntity(PersonalRelationship entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreUpdateEntity(PersonalRelationship entity) {
        entity.updateBase(daoSession.getSyncBaseDao());
    }

    @Override
    protected void onPreDeleteEntity(PersonalRelationship entity) {
        entity.deleteBase(daoSession.getSyncBaseDao());
    }

    static {
        GreenSync.registerListTypeToken("PersonalRelationship", new TypeToken<List<PersonalRelationship>>(){}.getType());
        GreenSync.registerTypeToken("PersonalRelationship", PersonalRelationship.class);
    }

}
