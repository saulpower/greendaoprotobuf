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

import com.saulpower.GreenWireTest.database.JournalEntryComment;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table JOURNAL_ENTRY_COMMENT.
*/
public class JournalEntryCommentDao extends AbstractDao<JournalEntryComment, Long> {

    public static final String TABLENAME = "JOURNAL_ENTRY_COMMENT";

    /**
     * Properties of entity JournalEntryComment.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Guid = new Property(0, String.class, "guid", false, "GUID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property ExternalID = new Property(2, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property TagString = new Property(3, String.class, "tagString", false, "TAG_STRING");
        public final static Property CommentsJournalEntryId = new Property(4, long.class, "commentsJournalEntryId", false, "COMMENTS_JOURNAL_ENTRY_ID");
        public final static Property TenantID = new Property(5, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(6, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property DateLastModified = new Property(7, String.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property SyncBaseId = new Property(8, Long.class, "syncBaseId", false, "SYNC_BASE_ID");
        public final static Property IsDeleted = new Property(9, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Version = new Property(10, Integer.class, "version", false, "VERSION");
        public final static Property Content = new Property(11, String.class, "content", false, "CONTENT");
        public final static Property Id = new Property(12, Long.class, "id", true, "_id");
        public final static Property DateCreated = new Property(13, String.class, "dateCreated", false, "DATE_CREATED");
    };

    private DaoSession daoSession;

    private Query<JournalEntryComment> journalEntry_CommentsQuery;

    public JournalEntryCommentDao(DaoConfig config) {
        super(config);
    }
    
    public JournalEntryCommentDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'JOURNAL_ENTRY_COMMENT' (" + //
                "'GUID' TEXT," + // 0: guid
                "'NAME' TEXT," + // 1: name
                "'EXTERNAL_ID' TEXT," + // 2: externalID
                "'TAG_STRING' TEXT," + // 3: tagString
                "'COMMENTS_JOURNAL_ENTRY_ID' INTEGER NOT NULL ," + // 4: commentsJournalEntryId
                "'TENANT_ID' INTEGER," + // 5: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 6: saveResultSaveResultId
                "'DATE_LAST_MODIFIED' TEXT," + // 7: dateLastModified
                "'SYNC_BASE_ID' INTEGER REFERENCES 'SYNC_BASE'('SYNC_BASE_ID') ," + // 8: syncBaseId
                "'IS_DELETED' INTEGER," + // 9: isDeleted
                "'VERSION' INTEGER," + // 10: version
                "'CONTENT' TEXT," + // 11: content
                "'_id' INTEGER PRIMARY KEY ," + // 12: id
                "'DATE_CREATED' TEXT);"); // 13: dateCreated
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'JOURNAL_ENTRY_COMMENT'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, JournalEntryComment entity) {
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
        stmt.bindLong(5, entity.getCommentsJournalEntryId());
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(6, tenantID);
        }
        stmt.bindLong(7, entity.getSaveResultSaveResultId());
 
        String dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindString(8, dateLastModified);
        }
 
        Long syncBaseId = entity.getSyncBaseId();
        if (syncBaseId != null) {
            stmt.bindLong(9, syncBaseId);
        }
 
        Boolean isDeleted = entity.getIsDeleted();
        if (isDeleted != null) {
            stmt.bindLong(10, isDeleted ? 1l: 0l);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(11, version);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(12, content);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(13, id);
        }
 
        String dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindString(14, dateCreated);
        }
    }

    @Override
    protected void attachEntity(JournalEntryComment entity) {
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
    public JournalEntryComment readEntity(Cursor cursor, int offset) {
        JournalEntryComment entity = new JournalEntryComment( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // guid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // externalID
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // tagString
            cursor.getLong(offset + 4), // commentsJournalEntryId
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // tenantID
            cursor.getLong(offset + 6), // saveResultSaveResultId
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // dateLastModified
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8), // syncBaseId
            cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0, // isDeleted
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // version
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // content
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12), // id
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13) // dateCreated
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, JournalEntryComment entity, int offset) {
        entity.setGuid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setExternalID(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTagString(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCommentsJournalEntryId(cursor.getLong(offset + 4));
        entity.setTenantID(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 6));
        entity.setDateLastModified(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setSyncBaseId(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
        entity.setIsDeleted(cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0);
        entity.setVersion(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setContent(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setId(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
        entity.setDateCreated(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(JournalEntryComment entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(JournalEntryComment entity) {
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
    
    /** Internal query to resolve the "comments" to-many relationship of JournalEntry. */
    public List<JournalEntryComment> _queryJournalEntry_Comments(long commentsJournalEntryId) {
        synchronized (this) {
            if (journalEntry_CommentsQuery == null) {
                QueryBuilder<JournalEntryComment> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.CommentsJournalEntryId.eq(null));
                journalEntry_CommentsQuery = queryBuilder.build();
            }
        }
        Query<JournalEntryComment> query = journalEntry_CommentsQuery.forCurrentThread();
        query.setParameter(0, commentsJournalEntryId);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM JOURNAL_ENTRY_COMMENT T");
            builder.append(" LEFT JOIN SAVE_RESULT T0 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T0.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected JournalEntryComment loadCurrentDeep(Cursor cursor, boolean lock) {
        JournalEntryComment entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        SaveResult saveResult = loadCurrentOther(daoSession.getSaveResultDao(), cursor, offset);
         if(saveResult != null) {
            entity.setSaveResult(saveResult);
        }

        return entity;    
    }

    public JournalEntryComment loadDeep(Long key) {
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
    public List<JournalEntryComment> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<JournalEntryComment> list = new ArrayList<JournalEntryComment>(count);
        
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
    
    protected List<JournalEntryComment> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<JournalEntryComment> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
    @Override
    protected void onPreInsertEntity(JournalEntryComment entity) {
        entity.insertBase(daoSession.getSyncBaseDao());
        entity.setSyncBaseId(entity.getSyncBaseId());
    }

    @Override
    protected void onPreLoadEntity(JournalEntryComment entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreRefreshEntity(JournalEntryComment entity) {
        entity.loadBase(daoSession.getSyncBaseDao(), entity.getSyncBaseId());
    }

    @Override
    protected void onPreUpdateEntity(JournalEntryComment entity) {
        entity.updateBase(daoSession.getSyncBaseDao());
    }

    @Override
    protected void onPreDeleteEntity(JournalEntryComment entity) {
        entity.deleteBase(daoSession.getSyncBaseDao());
    }

    static {
        GreenSync.registerListTypeToken("JournalEntryComment", new TypeToken<List<JournalEntryComment>>(){}.getType());
        GreenSync.registerTypeToken("JournalEntryComment", JournalEntryComment.class);
    }

}
