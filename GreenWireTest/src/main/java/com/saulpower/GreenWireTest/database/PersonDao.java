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

import com.saulpower.GreenWireTest.database.Person;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table PERSON.
*/
public class PersonDao extends AbstractDao<Person, Long> {

    public static final String TABLENAME = "PERSON";

    /**
     * Properties of entity Person.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property BlackListStudentId = new Property(0, long.class, "blackListStudentId", false, "BLACK_LIST_STUDENT_ID");
        public final static Property SocialSecurity = new Property(1, String.class, "socialSecurity", false, "SOCIAL_SECURITY");
        public final static Property Prefix = new Property(2, String.class, "prefix", false, "PREFIX");
        public final static Property SocialSecurityRaw = new Property(3, String.class, "socialSecurityRaw", false, "SOCIAL_SECURITY_RAW");
        public final static Property ExternalID = new Property(4, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property Guid = new Property(5, String.class, "guid", false, "GUID");
        public final static Property Height = new Property(6, String.class, "height", false, "HEIGHT");
        public final static Property PreferredName = new Property(7, String.class, "preferredName", false, "PREFERRED_NAME");
        public final static Property DateLastModified = new Property(8, Long.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property CurrentDeviceDeviceId = new Property(9, long.class, "currentDeviceDeviceId", false, "CURRENT_DEVICE_DEVICE_ID");
        public final static Property MiddleName = new Property(10, String.class, "middleName", false, "MIDDLE_NAME");
        public final static Property FirstName = new Property(11, String.class, "firstName", false, "FIRST_NAME");
        public final static Property IsDeleted = new Property(12, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Version = new Property(13, Integer.class, "version", false, "VERSION");
        public final static Property WorkHours = new Property(14, String.class, "workHours", false, "WORK_HOURS");
        public final static Property Weight = new Property(15, String.class, "weight", false, "WEIGHT");
        public final static Property EmailAddresses = new Property(16, String.class, "emailAddresses", false, "EMAIL_ADDRESSES");
        public final static Property DistinguishingMarks = new Property(17, String.class, "distinguishingMarks", false, "DISTINGUISHING_MARKS");
        public final static Property Id = new Property(18, Long.class, "id", true, "_id");
        public final static Property DateCreated = new Property(19, Long.class, "dateCreated", false, "DATE_CREATED");
        public final static Property DateOfLastPhysical = new Property(20, Long.class, "dateOfLastPhysical", false, "DATE_OF_LAST_PHYSICAL");
        public final static Property SocialSecurityEntrypted = new Property(21, String.class, "socialSecurityEntrypted", false, "SOCIAL_SECURITY_ENTRYPTED");
        public final static Property Name = new Property(22, String.class, "name", false, "NAME");
        public final static Property BirthDate = new Property(23, Long.class, "birthDate", false, "BIRTH_DATE");
        public final static Property PeopleJournalEntryId = new Property(24, long.class, "peopleJournalEntryId", false, "PEOPLE_JOURNAL_ENTRY_ID");
        public final static Property Suffix = new Property(25, String.class, "suffix", false, "SUFFIX");
        public final static Property Employer = new Property(26, String.class, "employer", false, "EMPLOYER");
        public final static Property EmailAddressString = new Property(27, String.class, "emailAddressString", false, "EMAIL_ADDRESS_STRING");
        public final static Property TagString = new Property(28, String.class, "tagString", false, "TAG_STRING");
        public final static Property TenantID = new Property(29, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(30, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property HairColor = new Property(31, String.class, "hairColor", false, "HAIR_COLOR");
        public final static Property Languages = new Property(32, String.class, "languages", false, "LANGUAGES");
        public final static Property InterestsString = new Property(33, String.class, "interestsString", false, "INTERESTS_STRING");
        public final static Property IsEnabled = new Property(34, Boolean.class, "isEnabled", false, "IS_ENABLED");
        public final static Property LastName = new Property(35, String.class, "lastName", false, "LAST_NAME");
    };

    private DaoSession daoSession;

    private Query<Person> student_BlackListQuery;
    private Query<Person> journalEntry_PeopleQuery;

    public PersonDao(DaoConfig config) {
        super(config);
    }
    
    public PersonDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'PERSON' (" + //
                "'BLACK_LIST_STUDENT_ID' INTEGER NOT NULL ," + // 0: blackListStudentId
                "'SOCIAL_SECURITY' TEXT," + // 1: socialSecurity
                "'PREFIX' TEXT," + // 2: prefix
                "'SOCIAL_SECURITY_RAW' TEXT," + // 3: socialSecurityRaw
                "'EXTERNAL_ID' TEXT," + // 4: externalID
                "'GUID' TEXT," + // 5: guid
                "'HEIGHT' TEXT," + // 6: height
                "'PREFERRED_NAME' TEXT," + // 7: preferredName
                "'DATE_LAST_MODIFIED' INTEGER," + // 8: dateLastModified
                "'CURRENT_DEVICE_DEVICE_ID' INTEGER NOT NULL ," + // 9: currentDeviceDeviceId
                "'MIDDLE_NAME' TEXT," + // 10: middleName
                "'FIRST_NAME' TEXT," + // 11: firstName
                "'IS_DELETED' INTEGER," + // 12: isDeleted
                "'VERSION' INTEGER," + // 13: version
                "'WORK_HOURS' TEXT," + // 14: workHours
                "'WEIGHT' TEXT," + // 15: weight
                "'EMAIL_ADDRESSES' TEXT," + // 16: emailAddresses
                "'DISTINGUISHING_MARKS' TEXT," + // 17: distinguishingMarks
                "'_id' INTEGER PRIMARY KEY ," + // 18: id
                "'DATE_CREATED' INTEGER," + // 19: dateCreated
                "'DATE_OF_LAST_PHYSICAL' INTEGER," + // 20: dateOfLastPhysical
                "'SOCIAL_SECURITY_ENTRYPTED' TEXT," + // 21: socialSecurityEntrypted
                "'NAME' TEXT," + // 22: name
                "'BIRTH_DATE' INTEGER," + // 23: birthDate
                "'PEOPLE_JOURNAL_ENTRY_ID' INTEGER NOT NULL ," + // 24: peopleJournalEntryId
                "'SUFFIX' TEXT," + // 25: suffix
                "'EMPLOYER' TEXT," + // 26: employer
                "'EMAIL_ADDRESS_STRING' TEXT," + // 27: emailAddressString
                "'TAG_STRING' TEXT," + // 28: tagString
                "'TENANT_ID' INTEGER," + // 29: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 30: saveResultSaveResultId
                "'HAIR_COLOR' TEXT," + // 31: hairColor
                "'LANGUAGES' TEXT," + // 32: languages
                "'INTERESTS_STRING' TEXT," + // 33: interestsString
                "'IS_ENABLED' INTEGER," + // 34: isEnabled
                "'LAST_NAME' TEXT);"); // 35: lastName
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'PERSON'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Person entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getBlackListStudentId());
 
        String socialSecurity = entity.getSocialSecurity();
        if (socialSecurity != null) {
            stmt.bindString(2, socialSecurity);
        }
 
        String prefix = entity.getPrefix();
        if (prefix != null) {
            stmt.bindString(3, prefix);
        }
 
        String socialSecurityRaw = entity.getSocialSecurityRaw();
        if (socialSecurityRaw != null) {
            stmt.bindString(4, socialSecurityRaw);
        }
 
        String externalID = entity.getExternalID();
        if (externalID != null) {
            stmt.bindString(5, externalID);
        }
 
        String guid = entity.getGuid();
        if (guid != null) {
            stmt.bindString(6, guid);
        }
 
        String height = entity.getHeight();
        if (height != null) {
            stmt.bindString(7, height);
        }
 
        String preferredName = entity.getPreferredName();
        if (preferredName != null) {
            stmt.bindString(8, preferredName);
        }
 
        Long dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindLong(9, dateLastModified);
        }
        stmt.bindLong(10, entity.getCurrentDeviceDeviceId());
 
        String middleName = entity.getMiddleName();
        if (middleName != null) {
            stmt.bindString(11, middleName);
        }
 
        String firstName = entity.getFirstName();
        if (firstName != null) {
            stmt.bindString(12, firstName);
        }
 
        Boolean isDeleted = entity.getIsDeleted();
        if (isDeleted != null) {
            stmt.bindLong(13, isDeleted ? 1l: 0l);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(14, version);
        }
 
        String workHours = entity.getWorkHours();
        if (workHours != null) {
            stmt.bindString(15, workHours);
        }
 
        String weight = entity.getWeight();
        if (weight != null) {
            stmt.bindString(16, weight);
        }
 
        String emailAddresses = entity.getEmailAddresses();
        if (emailAddresses != null) {
            stmt.bindString(17, emailAddresses);
        }
 
        String distinguishingMarks = entity.getDistinguishingMarks();
        if (distinguishingMarks != null) {
            stmt.bindString(18, distinguishingMarks);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(19, id);
        }
 
        Long dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindLong(20, dateCreated);
        }
 
        Long dateOfLastPhysical = entity.getDateOfLastPhysical();
        if (dateOfLastPhysical != null) {
            stmt.bindLong(21, dateOfLastPhysical);
        }
 
        String socialSecurityEntrypted = entity.getSocialSecurityEntrypted();
        if (socialSecurityEntrypted != null) {
            stmt.bindString(22, socialSecurityEntrypted);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(23, name);
        }
 
        Long birthDate = entity.getBirthDate();
        if (birthDate != null) {
            stmt.bindLong(24, birthDate);
        }
        stmt.bindLong(25, entity.getPeopleJournalEntryId());
 
        String suffix = entity.getSuffix();
        if (suffix != null) {
            stmt.bindString(26, suffix);
        }
 
        String employer = entity.getEmployer();
        if (employer != null) {
            stmt.bindString(27, employer);
        }
 
        String emailAddressString = entity.getEmailAddressString();
        if (emailAddressString != null) {
            stmt.bindString(28, emailAddressString);
        }
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(29, tagString);
        }
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(30, tenantID);
        }
        stmt.bindLong(31, entity.getSaveResultSaveResultId());
 
        String hairColor = entity.getHairColor();
        if (hairColor != null) {
            stmt.bindString(32, hairColor);
        }
 
        String languages = entity.getLanguages();
        if (languages != null) {
            stmt.bindString(33, languages);
        }
 
        String interestsString = entity.getInterestsString();
        if (interestsString != null) {
            stmt.bindString(34, interestsString);
        }
 
        Boolean isEnabled = entity.getIsEnabled();
        if (isEnabled != null) {
            stmt.bindLong(35, isEnabled ? 1l: 0l);
        }
 
        String lastName = entity.getLastName();
        if (lastName != null) {
            stmt.bindString(36, lastName);
        }
    }

    @Override
    protected void attachEntity(Person entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 18) ? null : cursor.getLong(offset + 18);
    }    

    /** @inheritdoc */
    @Override
    public Person readEntity(Cursor cursor, int offset) {
        Person entity = new Person( //
            cursor.getLong(offset + 0), // blackListStudentId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // socialSecurity
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // prefix
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // socialSecurityRaw
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // externalID
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // guid
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // height
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // preferredName
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8), // dateLastModified
            cursor.getLong(offset + 9), // currentDeviceDeviceId
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // middleName
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // firstName
            cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0, // isDeleted
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13), // version
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // workHours
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // weight
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // emailAddresses
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // distinguishingMarks
            cursor.isNull(offset + 18) ? null : cursor.getLong(offset + 18), // id
            cursor.isNull(offset + 19) ? null : cursor.getLong(offset + 19), // dateCreated
            cursor.isNull(offset + 20) ? null : cursor.getLong(offset + 20), // dateOfLastPhysical
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // socialSecurityEntrypted
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // name
            cursor.isNull(offset + 23) ? null : cursor.getLong(offset + 23), // birthDate
            cursor.getLong(offset + 24), // peopleJournalEntryId
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // suffix
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // employer
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // emailAddressString
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // tagString
            cursor.isNull(offset + 29) ? null : cursor.getLong(offset + 29), // tenantID
            cursor.getLong(offset + 30), // saveResultSaveResultId
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // hairColor
            cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32), // languages
            cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33), // interestsString
            cursor.isNull(offset + 34) ? null : cursor.getShort(offset + 34) != 0, // isEnabled
            cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35) // lastName
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Person entity, int offset) {
        entity.setBlackListStudentId(cursor.getLong(offset + 0));
        entity.setSocialSecurity(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPrefix(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSocialSecurityRaw(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setExternalID(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setGuid(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setHeight(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPreferredName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setDateLastModified(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
        entity.setCurrentDeviceDeviceId(cursor.getLong(offset + 9));
        entity.setMiddleName(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setFirstName(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setIsDeleted(cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0);
        entity.setVersion(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
        entity.setWorkHours(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setWeight(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setEmailAddresses(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setDistinguishingMarks(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setId(cursor.isNull(offset + 18) ? null : cursor.getLong(offset + 18));
        entity.setDateCreated(cursor.isNull(offset + 19) ? null : cursor.getLong(offset + 19));
        entity.setDateOfLastPhysical(cursor.isNull(offset + 20) ? null : cursor.getLong(offset + 20));
        entity.setSocialSecurityEntrypted(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setName(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setBirthDate(cursor.isNull(offset + 23) ? null : cursor.getLong(offset + 23));
        entity.setPeopleJournalEntryId(cursor.getLong(offset + 24));
        entity.setSuffix(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setEmployer(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setEmailAddressString(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setTagString(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setTenantID(cursor.isNull(offset + 29) ? null : cursor.getLong(offset + 29));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 30));
        entity.setHairColor(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setLanguages(cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32));
        entity.setInterestsString(cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33));
        entity.setIsEnabled(cursor.isNull(offset + 34) ? null : cursor.getShort(offset + 34) != 0);
        entity.setLastName(cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Person entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Person entity) {
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
    
    /** Internal query to resolve the "blackList" to-many relationship of Student. */
    public List<Person> _queryStudent_BlackList(long blackListStudentId) {
        synchronized (this) {
            if (student_BlackListQuery == null) {
                QueryBuilder<Person> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.BlackListStudentId.eq(null));
                student_BlackListQuery = queryBuilder.build();
            }
        }
        Query<Person> query = student_BlackListQuery.forCurrentThread();
        query.setParameter(0, blackListStudentId);
        return query.list();
    }

    /** Internal query to resolve the "people" to-many relationship of JournalEntry. */
    public List<Person> _queryJournalEntry_People(long peopleJournalEntryId) {
        synchronized (this) {
            if (journalEntry_PeopleQuery == null) {
                QueryBuilder<Person> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.PeopleJournalEntryId.eq(null));
                journalEntry_PeopleQuery = queryBuilder.build();
            }
        }
        Query<Person> query = journalEntry_PeopleQuery.forCurrentThread();
        query.setParameter(0, peopleJournalEntryId);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getDeviceDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM PERSON T");
            builder.append(" LEFT JOIN DEVICE T0 ON T.'CURRENT_DEVICE_DEVICE_ID'=T0.'_id'");
            builder.append(" LEFT JOIN SAVE_RESULT T1 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T1.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Person loadCurrentDeep(Cursor cursor, boolean lock) {
        Person entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Device currentDevice = loadCurrentOther(daoSession.getDeviceDao(), cursor, offset);
         if(currentDevice != null) {
            entity.setCurrentDevice(currentDevice);
        }
        offset += daoSession.getDeviceDao().getAllColumns().length;

        SaveResult saveResult = loadCurrentOther(daoSession.getSaveResultDao(), cursor, offset);
         if(saveResult != null) {
            entity.setSaveResult(saveResult);
        }

        return entity;    
    }

    public Person loadDeep(Long key) {
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
    public List<Person> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Person> list = new ArrayList<Person>(count);
        
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
    
    protected List<Person> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Person> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}