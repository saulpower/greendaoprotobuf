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

import com.saulpower.GreenWireTest.database.LedgerAccount;
import com.saulpower.GreenWireTest.database.LedgerAccount.BalanceType;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table LEDGER_ACCOUNT.
*/
public class LedgerAccountDao extends AbstractDao<LedgerAccount, Long> {

    public static final String TABLENAME = "LEDGER_ACCOUNT";

    /**
     * Properties of entity LedgerAccount.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property TypicalBalance = new Property(0, BalanceType.class, "typicalBalance", false, "TYPICAL_BALANCE");
        public final static Property ExternalID = new Property(1, String.class, "externalID", false, "EXTERNAL_ID");
        public final static Property Guid = new Property(2, String.class, "guid", false, "GUID");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property AccountNumber = new Property(4, String.class, "accountNumber", false, "ACCOUNT_NUMBER");
        public final static Property SortOrder = new Property(5, Integer.class, "sortOrder", false, "SORT_ORDER");
        public final static Property TagString = new Property(6, String.class, "tagString", false, "TAG_STRING");
        public final static Property LedgerAccountsOUId = new Property(7, long.class, "ledgerAccountsOUId", false, "LEDGER_ACCOUNTS_OUID");
        public final static Property LedgerGroupLedgerGroupId = new Property(8, long.class, "ledgerGroupLedgerGroupId", false, "LEDGER_GROUP_LEDGER_GROUP_ID");
        public final static Property TenantID = new Property(9, Long.class, "tenantID", false, "TENANT_ID");
        public final static Property SaveResultSaveResultId = new Property(10, long.class, "saveResultSaveResultId", false, "SAVE_RESULT_SAVE_RESULT_ID");
        public final static Property DateLastModified = new Property(11, Long.class, "dateLastModified", false, "DATE_LAST_MODIFIED");
        public final static Property IsDeleted = new Property(12, Boolean.class, "isDeleted", false, "IS_DELETED");
        public final static Property Version = new Property(13, Integer.class, "version", false, "VERSION");
        public final static Property Id = new Property(14, Long.class, "id", true, "_id");
        public final static Property OUOUId = new Property(15, long.class, "oUOUId", false, "O_UOUID");
        public final static Property DateCreated = new Property(16, Long.class, "dateCreated", false, "DATE_CREATED");
        public final static Property AccountsLedgerGroupId = new Property(17, long.class, "accountsLedgerGroupId", false, "ACCOUNTS_LEDGER_GROUP_ID");
        public final static Property IsActive = new Property(18, Boolean.class, "isActive", false, "IS_ACTIVE");
    };

    private DaoSession daoSession;

    private Query<LedgerAccount> oU_LedgerAccountsQuery;
    private Query<LedgerAccount> ledgerGroup_AccountsQuery;

    public LedgerAccountDao(DaoConfig config) {
        super(config);
    }
    
    public LedgerAccountDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'LEDGER_ACCOUNT' (" + //
                "'TYPICAL_BALANCE' INTEGER," + // 0: typicalBalance
                "'EXTERNAL_ID' TEXT," + // 1: externalID
                "'GUID' TEXT," + // 2: guid
                "'NAME' TEXT," + // 3: name
                "'ACCOUNT_NUMBER' TEXT," + // 4: accountNumber
                "'SORT_ORDER' INTEGER," + // 5: sortOrder
                "'TAG_STRING' TEXT," + // 6: tagString
                "'LEDGER_ACCOUNTS_OUID' INTEGER NOT NULL ," + // 7: ledgerAccountsOUId
                "'LEDGER_GROUP_LEDGER_GROUP_ID' INTEGER NOT NULL ," + // 8: ledgerGroupLedgerGroupId
                "'TENANT_ID' INTEGER," + // 9: tenantID
                "'SAVE_RESULT_SAVE_RESULT_ID' INTEGER NOT NULL ," + // 10: saveResultSaveResultId
                "'DATE_LAST_MODIFIED' INTEGER," + // 11: dateLastModified
                "'IS_DELETED' INTEGER," + // 12: isDeleted
                "'VERSION' INTEGER," + // 13: version
                "'_id' INTEGER PRIMARY KEY ," + // 14: id
                "'O_UOUID' INTEGER NOT NULL ," + // 15: oUOUId
                "'DATE_CREATED' INTEGER," + // 16: dateCreated
                "'ACCOUNTS_LEDGER_GROUP_ID' INTEGER NOT NULL ," + // 17: accountsLedgerGroupId
                "'IS_ACTIVE' INTEGER);"); // 18: isActive
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'LEDGER_ACCOUNT'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, LedgerAccount entity) {
        stmt.clearBindings();
 
        BalanceType typicalBalance = entity.getTypicalBalance();
        if (typicalBalance != null) {
            stmt.bindLong(1, typicalBalance.getValue());
        }
 
        String externalID = entity.getExternalID();
        if (externalID != null) {
            stmt.bindString(2, externalID);
        }
 
        String guid = entity.getGuid();
        if (guid != null) {
            stmt.bindString(3, guid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String accountNumber = entity.getAccountNumber();
        if (accountNumber != null) {
            stmt.bindString(5, accountNumber);
        }
 
        Integer sortOrder = entity.getSortOrder();
        if (sortOrder != null) {
            stmt.bindLong(6, sortOrder);
        }
 
        String tagString = entity.getTagString();
        if (tagString != null) {
            stmt.bindString(7, tagString);
        }
        stmt.bindLong(8, entity.getLedgerAccountsOUId());
        stmt.bindLong(9, entity.getLedgerGroupLedgerGroupId());
 
        Long tenantID = entity.getTenantID();
        if (tenantID != null) {
            stmt.bindLong(10, tenantID);
        }
        stmt.bindLong(11, entity.getSaveResultSaveResultId());
 
        Long dateLastModified = entity.getDateLastModified();
        if (dateLastModified != null) {
            stmt.bindLong(12, dateLastModified);
        }
 
        Boolean isDeleted = entity.getIsDeleted();
        if (isDeleted != null) {
            stmt.bindLong(13, isDeleted ? 1l: 0l);
        }
 
        Integer version = entity.getVersion();
        if (version != null) {
            stmt.bindLong(14, version);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(15, id);
        }
        stmt.bindLong(16, entity.getOUOUId());
 
        Long dateCreated = entity.getDateCreated();
        if (dateCreated != null) {
            stmt.bindLong(17, dateCreated);
        }
        stmt.bindLong(18, entity.getAccountsLedgerGroupId());
 
        Boolean isActive = entity.getIsActive();
        if (isActive != null) {
            stmt.bindLong(19, isActive ? 1l: 0l);
        }
    }

    @Override
    protected void attachEntity(LedgerAccount entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 14) ? null : cursor.getLong(offset + 14);
    }    

    /** @inheritdoc */
    @Override
    public LedgerAccount readEntity(Cursor cursor, int offset) {
        LedgerAccount entity = new LedgerAccount( //
            cursor.isNull(offset + 0) ? null : BalanceType.fromInt(cursor.getLong(offset + 0)), // typicalBalance
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // externalID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // guid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // accountNumber
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // sortOrder
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // tagString
            cursor.getLong(offset + 7), // ledgerAccountsOUId
            cursor.getLong(offset + 8), // ledgerGroupLedgerGroupId
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // tenantID
            cursor.getLong(offset + 10), // saveResultSaveResultId
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11), // dateLastModified
            cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0, // isDeleted
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13), // version
            cursor.isNull(offset + 14) ? null : cursor.getLong(offset + 14), // id
            cursor.getLong(offset + 15), // oUOUId
            cursor.isNull(offset + 16) ? null : cursor.getLong(offset + 16), // dateCreated
            cursor.getLong(offset + 17), // accountsLedgerGroupId
            cursor.isNull(offset + 18) ? null : cursor.getShort(offset + 18) != 0 // isActive
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, LedgerAccount entity, int offset) {
        entity.setTypicalBalance(cursor.isNull(offset + 0) ? null : BalanceType.fromInt(cursor.getLong(offset + 0)));
        entity.setExternalID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setGuid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAccountNumber(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSortOrder(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setTagString(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setLedgerAccountsOUId(cursor.getLong(offset + 7));
        entity.setLedgerGroupLedgerGroupId(cursor.getLong(offset + 8));
        entity.setTenantID(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setSaveResultSaveResultId(cursor.getLong(offset + 10));
        entity.setDateLastModified(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
        entity.setIsDeleted(cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0);
        entity.setVersion(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
        entity.setId(cursor.isNull(offset + 14) ? null : cursor.getLong(offset + 14));
        entity.setOUOUId(cursor.getLong(offset + 15));
        entity.setDateCreated(cursor.isNull(offset + 16) ? null : cursor.getLong(offset + 16));
        entity.setAccountsLedgerGroupId(cursor.getLong(offset + 17));
        entity.setIsActive(cursor.isNull(offset + 18) ? null : cursor.getShort(offset + 18) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(LedgerAccount entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(LedgerAccount entity) {
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
    
    /** Internal query to resolve the "ledgerAccounts" to-many relationship of OU. */
    public List<LedgerAccount> _queryOU_LedgerAccounts(long ledgerAccountsOUId) {
        synchronized (this) {
            if (oU_LedgerAccountsQuery == null) {
                QueryBuilder<LedgerAccount> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.LedgerAccountsOUId.eq(null));
                oU_LedgerAccountsQuery = queryBuilder.build();
            }
        }
        Query<LedgerAccount> query = oU_LedgerAccountsQuery.forCurrentThread();
        query.setParameter(0, ledgerAccountsOUId);
        return query.list();
    }

    /** Internal query to resolve the "accounts" to-many relationship of LedgerGroup. */
    public List<LedgerAccount> _queryLedgerGroup_Accounts(long accountsLedgerGroupId) {
        synchronized (this) {
            if (ledgerGroup_AccountsQuery == null) {
                QueryBuilder<LedgerAccount> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.AccountsLedgerGroupId.eq(null));
                ledgerGroup_AccountsQuery = queryBuilder.build();
            }
        }
        Query<LedgerAccount> query = ledgerGroup_AccountsQuery.forCurrentThread();
        query.setParameter(0, accountsLedgerGroupId);
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
            SqlUtils.appendColumns(builder, "T1", daoSession.getLedgerGroupDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T2", daoSession.getSaveResultDao().getAllColumns());
            builder.append(" FROM LEDGER_ACCOUNT T");
            builder.append(" LEFT JOIN OU T0 ON T.'O_UOUID'=T0.'_id'");
            builder.append(" LEFT JOIN LEDGER_GROUP T1 ON T.'LEDGER_GROUP_LEDGER_GROUP_ID'=T1.'_id'");
            builder.append(" LEFT JOIN SAVE_RESULT T2 ON T.'SAVE_RESULT_SAVE_RESULT_ID'=T2.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected LedgerAccount loadCurrentDeep(Cursor cursor, boolean lock) {
        LedgerAccount entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        OU oU = loadCurrentOther(daoSession.getOUDao(), cursor, offset);
         if(oU != null) {
            entity.setOU(oU);
        }
        offset += daoSession.getOUDao().getAllColumns().length;

        LedgerGroup ledgerGroup = loadCurrentOther(daoSession.getLedgerGroupDao(), cursor, offset);
         if(ledgerGroup != null) {
            entity.setLedgerGroup(ledgerGroup);
        }
        offset += daoSession.getLedgerGroupDao().getAllColumns().length;

        SaveResult saveResult = loadCurrentOther(daoSession.getSaveResultDao(), cursor, offset);
         if(saveResult != null) {
            entity.setSaveResult(saveResult);
        }

        return entity;    
    }

    public LedgerAccount loadDeep(Long key) {
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
    public List<LedgerAccount> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<LedgerAccount> list = new ArrayList<LedgerAccount>(count);
        
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
    
    protected List<LedgerAccount> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<LedgerAccount> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
