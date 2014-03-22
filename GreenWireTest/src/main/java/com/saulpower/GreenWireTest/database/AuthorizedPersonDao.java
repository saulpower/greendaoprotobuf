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

import com.saulpower.GreenWireTest.database.AuthorizedPerson;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table AUTHORIZED_PERSON.
*/
public class AuthorizedPersonDao extends AbstractDao<AuthorizedPerson, Long> {

    public static final String TABLENAME = "AUTHORIZED_PERSON";

    /**
     * Properties of entity AuthorizedPerson.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property SocialSecurity = new Property(0, String.class, "socialSecurity", false, "SOCIAL_SECURITY");
        public final static Property Prefix = new Property(1, String.class, "prefix", false, "PREFIX");
        public final static Property ExternalID = new Property(2, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property Guid = new Property(4, String.class, "guid", false, "GUID");
        public final static Property BirthDate = new Property(5, Long.class, "birthDate", false, "BIRTH_DATE");
        public final static Property Suffix = new Property(6, String.class, "suffix", false, "SUFFIX");
        public final static Property EmailAddressString = new Property(7, String.class, "emailAddressString", false, "EMAIL_ADDRESS_STRING");
        public final static Property TagString = new Property(8, String.class, "tagString", false, "TAG_STRING");
        public final static Property TenantID = new Property(9, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property PreferredName = new Property(10, String.class, "preferredName", false, "PREFERRED_NAME");
        public final static Property SaveResultSaveResultId = new Property(11, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property DateLastModified = new Property(12, Long.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property CurrentDeviceDeviceId = new Property(13, long.class, "currentDeviceDeviceId", false, "CURRENT_DEVICE_DEVICE_ID");
        public final static Property MiddleName = new Property(14, String.class, "middleName", false, "MIDDLE_NAME");
        public final static Property FirstName = new Property(15, String.class, "firstName", false, "FIRST_NAME");
        public final static Property IsDeleted = new Property(16, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Version = new Property(17, Integer.class, "version", false, "VERSION");
        public final static Property EmailAddresses = new Property(18, String.class, "emailAddresses", false, "EMAIL_ADDRESSES");
        public final static Property Id = new Property(19, Long.class, "id", true, "_id");
        public final static Property DateCreated = new Property(20, Long.class, "dateCreated", false, "DATE_CREATED");
        public final static Property IsEnabled = new Property(21, Boolean.class, "isEnabled", false, "IS_ENABLED");
        public final static Property LastName = new Property(22, String.class, "lastName", false, "LAST_NAME");
    };

    private DaoSession daoSession;


    public AuthorizedPersonDao(DaoConfig config) {
        super(config);
    }
    
    public AuthorizedPersonDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'AUTHORIZED_PERSON' (" + //
                "'SOCIAL_SECURITY' TEXT," + // 0: socialSecurity
                "'PREFIX' TEXT," + // 1: prefix
                "'EXTERNAL_ID' TEXT," + // 2: externalID
                "'NAME' TEXT," + // 3: name
                "'GUID' TEXT," + // 4: guid
                "'BIRTH_DATE' INTEGER," + // 5: birthDate
                "'SUFFIX' TEXT," + // 6: suffix
                "'EMAIL_ADDRESS_STRING' TEXT," + // 7: emailAddressString
                "'TAG_STRING' TEXT," + // 8: tagString
                "'TENANT_ID' INTEGER," + // 9: tenantID
                "'PREFERRED_NAME' TEXT," + // 10: preferredName
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 11: saveResultSaveResultId
                "'DATE_LAST_MODIFIED' INTEGER," + // 12: dateLastModified
                "'CURRENT_DEVICE_DEVICE_ID' INTEGER NOT NULL ," + // 13: currentDeviceDeviceId
                "'MIDDLE_NAME' TEXT," + // 14: middleName
                "'FIRST_NAME' TEXT," + // 15: firstName
                "'IS_DELETED' INTEGER," + // 16: isDeleted
                "'VERSION' INTEGER," + // 17: version
                "'EMAIL_ADDRESSES' TEXT," + // 18: emailAddresses
                "'_id' INTEGER PRIMARY KEY ," + // 19: id
                "'DATE_CREATED' INTEGER," + // 20: dateCreated
                "'IS_ENABLED' INTEGER," + // 21: isEnabled
                "'LAST_NAME' TEXT);"); // 22: lastName
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'AUTHORIZED_PERSON'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, AuthorizedPerson entity) {
        stmt.clearBindings();
 
        String socialSecurity = entity.getSocialSecurity();
        if (socialSecurity != null) {
            stmt.bindString(1, socialSecurity);
        }
 
        String prefix = entity.getPrefix();
        if (prefix != null) {
            stmt.bindString(2, prefix);
        }
 
        String externalID = entity.getExternalID();
        if (externalID != null) {
            stmt.bindString(3, externalID);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String guid = entity.getGuid();
        if (guid != null) {
            stmt.bindString(5, guid);
        }
 
        Long birthDate = entity.getBirthDate();
        if (birthDate != null) {
            stmt.bindLong(6, birthDate);
        }
 
        String suffix = entity.getSuffix();
        if (suffix != null) {
            stmt.bindString(7, suffix);
        }
 
        String emailAddressString = entity.getEmailAddressString();
        if (emailAddressString != null) {
            stmt.bindString(8, emailAddressString);
        }
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(9, tagString);
        }
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(10, tenantID);
        }
 
        String preferredName = entity.getPreferredName();
        if (preferredName != null) {
            stmt.bindString(11, preferredName);
        }
        stmt.bindLong(12, entity.getSaveResultSaveResultId());
 
        Long dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindLong(13, dateLastModified);
        }
        stmt.bindLong(14, entity.getCurrentDeviceDeviceId());
 
        String middleName = entity.getMiddleName();
        if (middleName != null) {
            stmt.bindString(15, middleName);
        }
 
        String firstName = entity.getFirstName();
        if (firstName != null) {
            stmt.bindString(16, firstName);
        }
 
        Boolean isDeleted = entity.getIsDeleted();
        if (isDeleted != null) {
            stmt.bindLong(17, isDeleted ? 1l: 0l);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(18, version);
        }
 
        String emailAddresses = entity.getEmailAddresses();
        if (emailAddresses != null) {
            stmt.bindString(19, emailAddresses);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(20, id);
        }
 
        Long dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindLong(21, dateCreated);
        }
 
        Boolean isEnabled = entity.getIsEnabled();
        if (isEnabled != null) {
            stmt.bindLong(22, isEnabled ? 1l: 0l);
        }
 
        String lastName = entity.getLastName();
        if (lastName != null) {
            stmt.bindString(23, lastName);
        }
    }

    @Override
    protected void attachEntity(AuthorizedPerson entity) {
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
    public AuthorizedPerson readEntity(Cursor cursor, int offset) {
        AuthorizedPerson entity = new AuthorizedPerson( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // socialSecurity
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // prefix
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // externalID
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // guid
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // birthDate
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // suffix
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // emailAddressString
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // tagString
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // tenantID
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // preferredName
            cursor.getLong(offset + 11), // saveResultSaveResultId
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12), // dateLastModified
            cursor.getLong(offset + 13), // currentDeviceDeviceId
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // middleName
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // firstName
            cursor.isNull(offset + 16) ? null : cursor.getShort(offset + 16) != 0, // isDeleted
            cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17), // version
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // emailAddresses
            cursor.isNull(offset + 19) ? null : cursor.getLong(offset + 19), // id
            cursor.isNull(offset + 20) ? null : cursor.getLong(offset + 20), // dateCreated
            cursor.isNull(offset + 21) ? null : cursor.getShort(offset + 21) != 0, // isEnabled
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22) // lastName
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, AuthorizedPerson entity, int offset) {
        entity.setSocialSecurity(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setPrefix(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setExternalID(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setGuid(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBirthDate(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setSuffix(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setEmailAddressString(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setTagString(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setTenantID(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setPreferredName(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 11));
        entity.setDateLastModified(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
        entity.setCurrentDeviceDeviceId(cursor.getLong(offset + 13));
        entity.setMiddleName(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setFirstName(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setIsDeleted(cursor.isNull(offset + 16) ? null : cursor.getShort(offset + 16) != 0);
        entity.setVersion(cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17));
        entity.setEmailAddresses(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setId(cursor.isNull(offset + 19) ? null : cursor.getLong(offset + 19));
        entity.setDateCreated(cursor.isNull(offset + 20) ? null : cursor.getLong(offset + 20));
        entity.setIsEnabled(cursor.isNull(offset + 21) ? null : cursor.getShort(offset + 21) != 0);
        entity.setLastName(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(AuthorizedPerson entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(AuthorizedPerson entity) {
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
            SqlUtils.appendColumns(builder, "T0", daoSession.getDeviceDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM AUTHORIZED_PERSON T");
            builder.append(" LEFT JOIN DEVICE T0 ON T.'CURRENT_DEVICE_DEVICE_ID'=T0.'_id'");
            builder.append(" LEFT JOIN SAVE_RESULT T1 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T1.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected AuthorizedPerson loadCurrentDeep(Cursor cursor, boolean lock) {
        AuthorizedPerson entity = loadCurrent(cursor, 0, lock);
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

    public AuthorizedPerson loadDeep(Long key) {
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
    public List<AuthorizedPerson> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<AuthorizedPerson> list = new ArrayList<AuthorizedPerson>(count);
        
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
    
    protected List<AuthorizedPerson> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<AuthorizedPerson> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}