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

import com.saulpower.GreenWireTest.database.Application;
import com.saulpower.GreenWireTest.database.ApplicationStatus;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table APPLICATION.
*/
public class ApplicationDao extends AbstractDao<Application, Long> {

    public static final String TABLENAME = "APPLICATION";

    /**
     * Properties of entity Application.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Guid = new Property(0, String.class, "guid", false, "GUID");
        public final static Property ExternalID = new Property(1, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property ApplicationStatus = new Property(2, ApplicationStatus.class, "applicationStatus", false, "APPLICATION_STATUS");
        public final static Property ApplicationsCenterId = new Property(3, long.class, "applicationsCenterId", false, "APPLICATIONS_CENTER_ID");
        public final static Property ReviewerID = new Property(4, String.class, "reviewerID", false, "REVIEWER_ID");
        public final static Property DateLastModified = new Property(5, String.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property SourceID = new Property(6, String.class, "sourceID", false, "SOURCE_ID");
        public final static Property SyncBaseId = new Property(7, Long.class, "syncBaseId", false, "SYNC_BASE_ID");
        public final static Property IsDeleted = new Property(8, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property StartDate = new Property(9, String.class, "startDate", false, "START_DATE");
        public final static Property Version = new Property(10, Integer.class, "version", false, "VERSION");
        public final static Property AddressAddressId = new Property(11, long.class, "addressAddressId", false, "ADDRESS_ADDRESS_ID");
        public final static Property Id = new Property(12, Long.class, "id", true, "_id");
        public final static Property SourceApplicationSourceId = new Property(13, long.class, "sourceApplicationSourceId", false, "SOURCE_APPLICATION_SOURCE_ID");
        public final static Property ReviewerPersonId = new Property(14, long.class, "reviewerPersonId", false, "REVIEWER_PERSON_ID");
        public final static Property DateCreated = new Property(15, String.class, "dateCreated", false, "DATE_CREATED");
        public final static Property CampaignCampaignId = new Property(16, long.class, "campaignCampaignId", false, "CAMPAIGN_CAMPAIGN_ID");
        public final static Property Notes = new Property(17, String.class, "notes", false, "NOTES");
        public final static Property EmailAddress = new Property(18, String.class, "emailAddress", false, "EMAIL_ADDRESS");
        public final static Property Name = new Property(19, String.class, "name", false, "NAME");
        public final static Property CampaignID = new Property(20, String.class, "campaignID", false, "CAMPAIGN_ID");
        public final static Property Priority = new Property(21, Integer.class, "priority", false, "PRIORITY");
        public final static Property TagString = new Property(22, String.class, "tagString", false, "TAG_STRING");
        public final static Property TenantID = new Property(23, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(24, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property PhoneNumber = new Property(25, String.class, "phoneNumber", false, "PHONE_NUMBER");
    };

    private DaoSession daoSession;

    private Query<Application> center_ApplicationsQuery;

    public ApplicationDao(DaoConfig config) {
        super(config);
    }
    
    public ApplicationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'APPLICATION' (" + //
                "'GUID' TEXT," + // 0: guid
                "'EXTERNAL_ID' TEXT," + // 1: externalID
                "'APPLICATION_STATUS' INTEGER," + // 2: applicationStatus
                "'APPLICATIONS_CENTER_ID' INTEGER NOT NULL ," + // 3: applicationsCenterId
                "'REVIEWER_ID' TEXT," + // 4: reviewerID
                "'DATE_LAST_MODIFIED' TEXT," + // 5: dateLastModified
                "'SOURCE_ID' TEXT," + // 6: sourceID
                "'SYNC_BASE_ID' INTEGER REFERENCES 'SYNC_BASE'('SYNC_BASE_ID') ," + // 7: syncBaseId
                "'IS_DELETED' INTEGER," + // 8: isDeleted
                "'START_DATE' TEXT," + // 9: startDate
                "'VERSION' INTEGER," + // 10: version
                "'ADDRESS_ADDRESS_ID' INTEGER NOT NULL ," + // 11: addressAddressId
                "'_id' INTEGER PRIMARY KEY ," + // 12: id
                "'SOURCE_APPLICATION_SOURCE_ID' INTEGER NOT NULL ," + // 13: sourceApplicationSourceId
                "'REVIEWER_PERSON_ID' INTEGER NOT NULL ," + // 14: reviewerPersonId
                "'DATE_CREATED' TEXT," + // 15: dateCreated
                "'CAMPAIGN_CAMPAIGN_ID' INTEGER NOT NULL ," + // 16: campaignCampaignId
                "'NOTES' TEXT," + // 17: notes
                "'EMAIL_ADDRESS' TEXT," + // 18: emailAddress
                "'NAME' TEXT," + // 19: name
                "'CAMPAIGN_ID' TEXT," + // 20: campaignID
                "'PRIORITY' INTEGER," + // 21: priority
                "'TAG_STRING' TEXT," + // 22: tagString
                "'TENANT_ID' INTEGER," + // 23: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 24: saveResultSaveResultId
                "'PHONE_NUMBER' TEXT);"); // 25: phoneNumber
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'APPLICATION'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Application entity) {
        stmt.clearBindings();
 
        String guid = entity.getGuid();
        if (guid != null) {
            stmt.bindString(1, guid);
        }
 
        String externalID = entity.getExternalID();
        if (externalID != null) {
            stmt.bindString(2, externalID);
        }
 
        ApplicationStatus applicationStatus = entity.getApplicationStatus();
        if (applicationStatus != null) {
            stmt.bindLong(3, applicationStatus.getValue());
        }
        stmt.bindLong(4, entity.getApplicationsCenterId());
 
        String reviewerID = entity.getReviewerID();
        if (reviewerID != null) {
            stmt.bindString(5, reviewerID);
        }
 
        String dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindString(6, dateLastModified);
        }
 
        String sourceID = entity.getSourceID();
        if (sourceID != null) {
            stmt.bindString(7, sourceID);
        }
 
        Long syncBaseId = entity.getSyncBaseId();
        if (syncBaseId != null) {
            stmt.bindLong(8, syncBaseId);
        }
 
        Boolean isDeleted = entity.getIsDeleted();
        if (isDeleted != null) {
            stmt.bindLong(9, isDeleted ? 1l: 0l);
        }
 
        String startDate = entity.getStartDate();
        if (startDate != null) {
            stmt.bindString(10, startDate);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(11, version);
        }
        stmt.bindLong(12, entity.getAddressAddressId());
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(13, id);
        }
        stmt.bindLong(14, entity.getSourceApplicationSourceId());
        stmt.bindLong(15, entity.getReviewerPersonId());
 
        String dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindString(16, dateCreated);
        }
        stmt.bindLong(17, entity.getCampaignCampaignId());
 
        String notes = entity.getNotes();
        if (notes != null) {
            stmt.bindString(18, notes);
        }
 
        String emailAddress = entity.getEmailAddress();
        if (emailAddress != null) {
            stmt.bindString(19, emailAddress);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(20, name);
        }
 
        String campaignID = entity.getCampaignID();
        if (campaignID != null) {
            stmt.bindString(21, campaignID);
        }
 
        Integer priority = entity.getPriority();
        if (priority != null) {
            stmt.bindLong(22, priority);
        }
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(23, tagString);
        }
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(24, tenantID);
        }
        stmt.bindLong(25, entity.getSaveResultSaveResultId());
 
        String phoneNumber = entity.getPhoneNumber();
        if (phoneNumber != null) {
            stmt.bindString(26, phoneNumber);
        }
    }

    @Override
    protected void attachEntity(Application entity) {
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
    public Application readEntity(Cursor cursor, int offset) {
        Application entity = new Application( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // guid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // externalID
            cursor.isNull(offset + 2) ? null : ApplicationStatus.fromInt(cursor.getLong(offset + 2)), // applicationStatus
            cursor.getLong(offset + 3), // applicationsCenterId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // reviewerID
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // dateLastModified
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // sourceID
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7), // syncBaseId
            cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0, // isDeleted
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // startDate
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // version
            cursor.getLong(offset + 11), // addressAddressId
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12), // id
            cursor.getLong(offset + 13), // sourceApplicationSourceId
            cursor.getLong(offset + 14), // reviewerPersonId
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // dateCreated
            cursor.getLong(offset + 16), // campaignCampaignId
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // notes
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // emailAddress
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // name
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // campaignID
            cursor.isNull(offset + 21) ? null : cursor.getInt(offset + 21), // priority
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // tagString
            cursor.isNull(offset + 23) ? null : cursor.getLong(offset + 23), // tenantID
            cursor.getLong(offset + 24), // saveResultSaveResultId
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25) // phoneNumber
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Application entity, int offset) {
        entity.setGuid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setExternalID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setApplicationStatus(cursor.isNull(offset + 2) ? null : ApplicationStatus.fromInt(cursor.getLong(offset + 2)));
        entity.setApplicationsCenterId(cursor.getLong(offset + 3));
        entity.setReviewerID(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDateLastModified(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSourceID(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSyncBaseId(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
        entity.setIsDeleted(cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0);
        entity.setStartDate(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setVersion(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setAddressAddressId(cursor.getLong(offset + 11));
        entity.setId(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
        entity.setSourceApplicationSourceId(cursor.getLong(offset + 13));
        entity.setReviewerPersonId(cursor.getLong(offset + 14));
        entity.setDateCreated(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setCampaignCampaignId(cursor.getLong(offset + 16));
        entity.setNotes(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setEmailAddress(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setName(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setCampaignID(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setPriority(cursor.isNull(offset + 21) ? null : cursor.getInt(offset + 21));
        entity.setTagString(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setTenantID(cursor.isNull(offset + 23) ? null : cursor.getLong(offset + 23));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 24));
        entity.setPhoneNumber(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Application entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Application entity) {
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
    
    /** Internal query to resolve the "applications" to-many relationship of Center. */
    public List<Application> _queryCenter_Applications(long applicationsCenterId) {
        synchronized (this) {
            if (center_ApplicationsQuery == null) {
                QueryBuilder<Application> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.ApplicationsCenterId.eq(null));
                center_ApplicationsQuery = queryBuilder.build();
            }
        }
        Query<Application> query = center_ApplicationsQuery.forCurrentThread();
        query.setParameter(0, applicationsCenterId);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getAddressDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getPersonDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T2", daoSession.getApplicationSourceDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T3", daoSession.getCampaignDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T4", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM APPLICATION T");
            builder.append(" LEFT JOIN ADDRESS T0 ON T.'ADDRESS_ADDRESS_ID'=T0.'_id'");
            builder.append(" LEFT JOIN PERSON T1 ON T.'REVIEWER_PERSON_ID'=T1.'_id'");
            builder.append(" LEFT JOIN APPLICATION_SOURCE T2 ON T.'SOURCE_APPLICATION_SOURCE_ID'=T2.'_id'");
            builder.append(" LEFT JOIN CAMPAIGN T3 ON T.'CAMPAIGN_CAMPAIGN_ID'=T3.'_id'");
            builder.append(" LEFT JOIN SAVE_RESULT T4 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T4.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Application loadCurrentDeep(Cursor cursor, boolean lock) {
        Application entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Address address = loadCurrentOther(daoSession.getAddressDao(), cursor, offset);
         if(address != null) {
            entity.setAddress(address);
        }
        offset += daoSession.getAddressDao().getAllColumns().length;

        Person reviewer = loadCurrentOther(daoSession.getPersonDao(), cursor, offset);
         if(reviewer != null) {
            entity.setReviewer(reviewer);
        }
        offset += daoSession.getPersonDao().getAllColumns().length;

        ApplicationSource source = loadCurrentOther(daoSession.getApplicationSourceDao(), cursor, offset);
         if(source != null) {
            entity.setSource(source);
        }
        offset += daoSession.getApplicationSourceDao().getAllColumns().length;

        Campaign campaign = loadCurrentOther(daoSession.getCampaignDao(), cursor, offset);
         if(campaign != null) {
            entity.setCampaign(campaign);
        }
        offset += daoSession.getCampaignDao().getAllColumns().length;

        SaveResult saveResult = loadCurrentOther(daoSession.getSaveResultDao(), cursor, offset);
         if(saveResult != null) {
            entity.setSaveResult(saveResult);
        }

        return entity;    
    }

    public Application loadDeep(Long key) {
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
    public List<Application> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Application> list = new ArrayList<Application>(count);
        
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
    
    protected List<Application> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Application> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
    @Override
    protected void onPreInsertEntity(Application entity) {
        entity.insertBase(daoSession.getSyncBaseDao());
        entity.setSyncBaseId(entity.getSyncBaseId());
    }

    @Override
    protected void onPreLoadEntity(Application entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreRefreshEntity(Application entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreUpdateEntity(Application entity) {
        entity.updateBase(daoSession.getSyncBaseDao());
    }

    @Override
    protected void onPreDeleteEntity(Application entity) {
        entity.deleteBase(daoSession.getSyncBaseDao());
    }

    static {
        GreenSync.registerListTypeToken("Application", new TypeToken<List<Application>>(){}.getType());
        GreenSync.registerTypeToken("Application", Application.class);
    }

}
