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

import com.saulpower.GreenWireTest.database.Guardian;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table GUARDIAN.
*/
public class GuardianDao extends AbstractDao<Guardian, Long> {

    public static final String TABLENAME = "GUARDIAN";

    /**
     * Properties of entity Guardian.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property SocialSecurity = new Property(0, String.class, "socialSecurity", false, "SOCIAL_SECURITY");
        public final static Property Prefix = new Property(1, String.class, "prefix", false, "PREFIX");
        public final static Property SocialSecurityRaw = new Property(2, String.class, "socialSecurityRaw", false, "SOCIAL_SECURITY_RAW");
        public final static Property ExternalID = new Property(3, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property Guid = new Property(4, String.class, "guid", false, "GUID");
        public final static Property Height = new Property(5, String.class, "height", false, "HEIGHT");
        public final static Property PreferredName = new Property(6, String.class, "preferredName", false, "PREFERRED_NAME");
        public final static Property DateLastModified = new Property(7, String.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property CurrentDeviceDeviceId = new Property(8, long.class, "currentDeviceDeviceId", false, "CURRENT_DEVICE_DEVICE_ID");
        public final static Property MiddleName = new Property(9, String.class, "middleName", false, "MIDDLE_NAME");
        public final static Property FirstName = new Property(10, String.class, "firstName", false, "FIRST_NAME");
        public final static Property SyncBaseId = new Property(11, Long.class, "syncBaseId", false, "SYNC_BASE_ID");
        public final static Property IsDeleted = new Property(12, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Version = new Property(13, Integer.class, "version", false, "VERSION");
        public final static Property WorkHours = new Property(14, String.class, "workHours", false, "WORK_HOURS");
        public final static Property EmailAddresses = new Property(15, String.class, "emailAddresses", false, "EMAIL_ADDRESSES");
        public final static Property Weight = new Property(16, String.class, "weight", false, "WEIGHT");
        public final static Property DistinguishingMarks = new Property(17, String.class, "distinguishingMarks", false, "DISTINGUISHING_MARKS");
        public final static Property GuardiansCenterId = new Property(18, long.class, "guardiansCenterId", false, "GUARDIANS_CENTER_ID");
        public final static Property Id = new Property(19, Long.class, "id", true, "_id");
        public final static Property DateCreated = new Property(20, String.class, "dateCreated", false, "DATE_CREATED");
        public final static Property DateOfLastPhysical = new Property(21, String.class, "dateOfLastPhysical", false, "DATE_OF_LAST_PHYSICAL");
        public final static Property SocialSecurityEntrypted = new Property(22, String.class, "socialSecurityEntrypted", false, "SOCIAL_SECURITY_ENTRYPTED");
        public final static Property IsParent = new Property(23, Boolean.class, "isParent", false, "IS_PARENT");
        public final static Property Name = new Property(24, String.class, "name", false, "NAME");
        public final static Property BirthDate = new Property(25, String.class, "birthDate", false, "BIRTH_DATE");
        public final static Property Suffix = new Property(26, String.class, "suffix", false, "SUFFIX");
        public final static Property EmailAddressString = new Property(27, String.class, "emailAddressString", false, "EMAIL_ADDRESS_STRING");
        public final static Property Employer = new Property(28, String.class, "employer", false, "EMPLOYER");
        public final static Property TagString = new Property(29, String.class, "tagString", false, "TAG_STRING");
        public final static Property TenantID = new Property(30, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(31, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property HairColor = new Property(32, String.class, "hairColor", false, "HAIR_COLOR");
        public final static Property Languages = new Property(33, String.class, "languages", false, "LANGUAGES");
        public final static Property InterestsString = new Property(34, String.class, "interestsString", false, "INTERESTS_STRING");
        public final static Property IsEnabled = new Property(35, Boolean.class, "isEnabled", false, "IS_ENABLED");
        public final static Property LastName = new Property(36, String.class, "lastName", false, "LAST_NAME");
    };

    private DaoSession daoSession;

    private Query<Guardian> center_GuardiansQuery;

    public GuardianDao(DaoConfig config) {
        super(config);
    }
    
    public GuardianDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'GUARDIAN' (" + //
                "'SOCIAL_SECURITY' TEXT," + // 0: socialSecurity
                "'PREFIX' TEXT," + // 1: prefix
                "'SOCIAL_SECURITY_RAW' TEXT," + // 2: socialSecurityRaw
                "'EXTERNAL_ID' TEXT," + // 3: externalID
                "'GUID' TEXT," + // 4: guid
                "'HEIGHT' TEXT," + // 5: height
                "'PREFERRED_NAME' TEXT," + // 6: preferredName
                "'DATE_LAST_MODIFIED' TEXT," + // 7: dateLastModified
                "'CURRENT_DEVICE_DEVICE_ID' INTEGER NOT NULL ," + // 8: currentDeviceDeviceId
                "'MIDDLE_NAME' TEXT," + // 9: middleName
                "'FIRST_NAME' TEXT," + // 10: firstName
                "'SYNC_BASE_ID' INTEGER REFERENCES 'SYNC_BASE'('SYNC_BASE_ID') ," + // 11: syncBaseId
                "'IS_DELETED' INTEGER," + // 12: isDeleted
                "'VERSION' INTEGER," + // 13: version
                "'WORK_HOURS' TEXT," + // 14: workHours
                "'EMAIL_ADDRESSES' TEXT," + // 15: emailAddresses
                "'WEIGHT' TEXT," + // 16: weight
                "'DISTINGUISHING_MARKS' TEXT," + // 17: distinguishingMarks
                "'GUARDIANS_CENTER_ID' INTEGER NOT NULL ," + // 18: guardiansCenterId
                "'_id' INTEGER PRIMARY KEY ," + // 19: id
                "'DATE_CREATED' TEXT," + // 20: dateCreated
                "'DATE_OF_LAST_PHYSICAL' TEXT," + // 21: dateOfLastPhysical
                "'SOCIAL_SECURITY_ENTRYPTED' TEXT," + // 22: socialSecurityEntrypted
                "'IS_PARENT' INTEGER," + // 23: isParent
                "'NAME' TEXT," + // 24: name
                "'BIRTH_DATE' TEXT," + // 25: birthDate
                "'SUFFIX' TEXT," + // 26: suffix
                "'EMAIL_ADDRESS_STRING' TEXT," + // 27: emailAddressString
                "'EMPLOYER' TEXT," + // 28: employer
                "'TAG_STRING' TEXT," + // 29: tagString
                "'TENANT_ID' INTEGER," + // 30: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 31: saveResultSaveResultId
                "'HAIR_COLOR' TEXT," + // 32: hairColor
                "'LANGUAGES' TEXT," + // 33: languages
                "'INTERESTS_STRING' TEXT," + // 34: interestsString
                "'IS_ENABLED' INTEGER," + // 35: isEnabled
                "'LAST_NAME' TEXT);"); // 36: lastName
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'GUARDIAN'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Guardian entity) {
        stmt.clearBindings();
 
        String socialSecurity = entity.getSocialSecurity();
        if (socialSecurity != null) {
            stmt.bindString(1, socialSecurity);
        }
 
        String prefix = entity.getPrefix();
        if (prefix != null) {
            stmt.bindString(2, prefix);
        }
 
        String socialSecurityRaw = entity.getSocialSecurityRaw();
        if (socialSecurityRaw != null) {
            stmt.bindString(3, socialSecurityRaw);
        }
 
        String externalID = entity.getExternalID();
        if (externalID != null) {
            stmt.bindString(4, externalID);
        }
 
        String guid = entity.getGuid();
        if (guid != null) {
            stmt.bindString(5, guid);
        }
 
        String height = entity.getHeight();
        if (height != null) {
            stmt.bindString(6, height);
        }
 
        String preferredName = entity.getPreferredName();
        if (preferredName != null) {
            stmt.bindString(7, preferredName);
        }
 
        String dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindString(8, dateLastModified);
        }
        stmt.bindLong(9, entity.getCurrentDeviceDeviceId());
 
        String middleName = entity.getMiddleName();
        if (middleName != null) {
            stmt.bindString(10, middleName);
        }
 
        String firstName = entity.getFirstName();
        if (firstName != null) {
            stmt.bindString(11, firstName);
        }
 
        Long syncBaseId = entity.getSyncBaseId();
        if (syncBaseId != null) {
            stmt.bindLong(12, syncBaseId);
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
 
        String emailAddresses = entity.getEmailAddresses();
        if (emailAddresses != null) {
            stmt.bindString(16, emailAddresses);
        }
 
        String weight = entity.getWeight();
        if (weight != null) {
            stmt.bindString(17, weight);
        }
 
        String distinguishingMarks = entity.getDistinguishingMarks();
        if (distinguishingMarks != null) {
            stmt.bindString(18, distinguishingMarks);
        }
        stmt.bindLong(19, entity.getGuardiansCenterId());
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(20, id);
        }
 
        String dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindString(21, dateCreated);
        }
 
        String dateOfLastPhysical = entity.getDateOfLastPhysical();
        if (dateOfLastPhysical != null) {
            stmt.bindString(22, dateOfLastPhysical);
        }
 
        String socialSecurityEntrypted = entity.getSocialSecurityEntrypted();
        if (socialSecurityEntrypted != null) {
            stmt.bindString(23, socialSecurityEntrypted);
        }
 
        Boolean isParent = entity.getIsParent();
        if (isParent != null) {
            stmt.bindLong(24, isParent ? 1l: 0l);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(25, name);
        }
 
        String birthDate = entity.getBirthDate();
        if (birthDate != null) {
            stmt.bindString(26, birthDate);
        }
 
        String suffix = entity.getSuffix();
        if (suffix != null) {
            stmt.bindString(27, suffix);
        }
 
        String emailAddressString = entity.getEmailAddressString();
        if (emailAddressString != null) {
            stmt.bindString(28, emailAddressString);
        }
 
        String employer = entity.getEmployer();
        if (employer != null) {
            stmt.bindString(29, employer);
        }
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(30, tagString);
        }
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(31, tenantID);
        }
        stmt.bindLong(32, entity.getSaveResultSaveResultId());
 
        String hairColor = entity.getHairColor();
        if (hairColor != null) {
            stmt.bindString(33, hairColor);
        }
 
        String languages = entity.getLanguages();
        if (languages != null) {
            stmt.bindString(34, languages);
        }
 
        String interestsString = entity.getInterestsString();
        if (interestsString != null) {
            stmt.bindString(35, interestsString);
        }
 
        Boolean isEnabled = entity.getIsEnabled();
        if (isEnabled != null) {
            stmt.bindLong(36, isEnabled ? 1l: 0l);
        }
 
        String lastName = entity.getLastName();
        if (lastName != null) {
            stmt.bindString(37, lastName);
        }
    }

    @Override
    protected void attachEntity(Guardian entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 19) ? null : cursor.getLong(offset + 19);
    }    

    /** @inheritdoc */
    @Override
    public Guardian readEntity(Cursor cursor, int offset) {
        Guardian entity = new Guardian( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // socialSecurity
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // prefix
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // socialSecurityRaw
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // externalID
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // guid
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // height
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // preferredName
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // dateLastModified
            cursor.getLong(offset + 8), // currentDeviceDeviceId
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // middleName
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // firstName
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11), // syncBaseId
            cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0, // isDeleted
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13), // version
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // workHours
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // emailAddresses
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // weight
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // distinguishingMarks
            cursor.getLong(offset + 18), // guardiansCenterId
            cursor.isNull(offset + 19) ? null : cursor.getLong(offset + 19), // id
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // dateCreated
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // dateOfLastPhysical
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // socialSecurityEntrypted
            cursor.isNull(offset + 23) ? null : cursor.getShort(offset + 23) != 0, // isParent
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // name
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // birthDate
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // suffix
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // emailAddressString
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // employer
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // tagString
            cursor.isNull(offset + 30) ? null : cursor.getLong(offset + 30), // tenantID
            cursor.getLong(offset + 31), // saveResultSaveResultId
            cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32), // hairColor
            cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33), // languages
            cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34), // interestsString
            cursor.isNull(offset + 35) ? null : cursor.getShort(offset + 35) != 0, // isEnabled
            cursor.isNull(offset + 36) ? null : cursor.getString(offset + 36) // lastName
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Guardian entity, int offset) {
        entity.setSocialSecurity(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setPrefix(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSocialSecurityRaw(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setExternalID(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setGuid(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setHeight(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPreferredName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDateLastModified(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCurrentDeviceDeviceId(cursor.getLong(offset + 8));
        entity.setMiddleName(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setFirstName(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSyncBaseId(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
        entity.setIsDeleted(cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0);
        entity.setVersion(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
        entity.setWorkHours(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setEmailAddresses(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setWeight(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setDistinguishingMarks(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setGuardiansCenterId(cursor.getLong(offset + 18));
        entity.setId(cursor.isNull(offset + 19) ? null : cursor.getLong(offset + 19));
        entity.setDateCreated(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setDateOfLastPhysical(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setSocialSecurityEntrypted(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setIsParent(cursor.isNull(offset + 23) ? null : cursor.getShort(offset + 23) != 0);
        entity.setName(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setBirthDate(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setSuffix(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setEmailAddressString(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setEmployer(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setTagString(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setTenantID(cursor.isNull(offset + 30) ? null : cursor.getLong(offset + 30));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 31));
        entity.setHairColor(cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32));
        entity.setLanguages(cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33));
        entity.setInterestsString(cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34));
        entity.setIsEnabled(cursor.isNull(offset + 35) ? null : cursor.getShort(offset + 35) != 0);
        entity.setLastName(cursor.isNull(offset + 36) ? null : cursor.getString(offset + 36));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Guardian entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Guardian entity) {
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
    
    /** Internal query to resolve the "guardians" to-many relationship of Center. */
    public List<Guardian> _queryCenter_Guardians(long guardiansCenterId) {
        synchronized (this) {
            if (center_GuardiansQuery == null) {
                QueryBuilder<Guardian> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.GuardiansCenterId.eq(null));
                center_GuardiansQuery = queryBuilder.build();
            }
        }
        Query<Guardian> query = center_GuardiansQuery.forCurrentThread();
        query.setParameter(0, guardiansCenterId);
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
            builder.append(" FROM GUARDIAN T");
            builder.append(" LEFT JOIN DEVICE T0 ON T.'CURRENT_DEVICE_DEVICE_ID'=T0.'_id'");
            builder.append(" LEFT JOIN SAVE_RESULT T1 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T1.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Guardian loadCurrentDeep(Cursor cursor, boolean lock) {
        Guardian entity = loadCurrent(cursor, 0, lock);
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

    public Guardian loadDeep(Long key) {
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
    public List<Guardian> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Guardian> list = new ArrayList<Guardian>(count);
        
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
    
    protected List<Guardian> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Guardian> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
    @Override
    protected void onPreInsertEntity(Guardian entity) {
        entity.insertBase(daoSession.getSyncBaseDao());
        entity.setSyncBaseId(entity.getSyncBaseId());
    }

    @Override
    protected void onPreLoadEntity(Guardian entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreRefreshEntity(Guardian entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreUpdateEntity(Guardian entity) {
        entity.updateBase(daoSession.getSyncBaseDao());
    }

    @Override
    protected void onPreDeleteEntity(Guardian entity) {
        entity.deleteBase(daoSession.getSyncBaseDao());
    }

    static {
        GreenSync.registerListTypeToken("Guardian", new TypeToken<List<Guardian>>(){}.getType());
        GreenSync.registerTypeToken("Guardian", Guardian.class);
    }

}