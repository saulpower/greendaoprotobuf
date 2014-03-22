package de.greenrobot.daoexample.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table NOTE.
*/
public class NoteDao extends AbstractDao<Note, Long> {

    public static final String TABLENAME = "NOTE";

    /**
     * Properties of entity Note.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Text = new Property(0, String.class, "text", false, "TEXT");
        public final static Property Comment = new Property(1, String.class, "comment", false, "COMMENT");
        public final static Property Id = new Property(2, Long.class, "id", true, "_id");
        public final static Property Type = new Property(3, NoteType.class, "type", false, "TYPE");
        public final static Property BaseObjectId = new Property(4, Long.class, "baseObjectId", false, "BASE_OBJECT_ID");
    };

    private DaoSession daoSession;


    public NoteDao(DaoConfig config) {
        super(config);
    }
    
    public NoteDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'NOTE' (" + //
                "'TEXT' TEXT NOT NULL ," + // 0: text
                "'COMMENT' TEXT," + // 1: comment
                "'_id' INTEGER PRIMARY KEY ," + // 2: id
                "'TYPE' INTEGER," + // 3: type
                "'BASE_OBJECT_ID' INTEGER REFERENCES 'BASE_OBJECT'('BASE_ID') );"); // 4: baseObjectId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'NOTE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Note entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getText());
 
        String comment = entity.getComment();
        if (comment != null) {
            stmt.bindString(2, comment);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(3, id);
        }
 
        NoteType type = entity.getType();
        if (type != null) {
            stmt.bindLong(4, type.getValue());
        }
 
        Long baseObjectId = entity.getBaseObjectId();
        if (baseObjectId != null) {
            stmt.bindLong(5, baseObjectId);
        }
    }

    @Override
    protected void attachEntity(Note entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2);
    }    

    /** @inheritdoc */
    @Override
    public Note readEntity(Cursor cursor, int offset) {
        Note entity = new Note( //
            cursor.getString(offset + 0), // text
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // comment
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // id
            cursor.isNull(offset + 3) ? null : NoteType.fromInt(cursor.getLong(offset + 3)), // type
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4) // baseObjectId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Note entity, int offset) {
        entity.setText(cursor.getString(offset + 0));
        entity.setComment(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setId(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setType(cursor.isNull(offset + 3) ? null : NoteType.fromInt(cursor.getLong(offset + 3)));
        entity.setBaseObjectId(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Note entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Note entity) {
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
    

    @Override
    protected void onInsertEntity(Note entity) {
        entity.insertBase(daoSession.getBaseObjectDao());
        entity.setBaseObjectId(entity.getBaseId());
    }

    @Override
    protected void onLoadEntity(Note entity) {
        entity.loadBase(daoSession.getBaseObjectDao(), entity.getBaseObjectId());
    }

    @Override
    protected void onRefreshEntity(Note entity) {
        entity.loadBase(daoSession.getBaseObjectDao(), entity.getBaseObjectId());
    }

    @Override
    protected void onUpdateEntity(Note entity) {
        entity.updateBase();
    }

    @Override
    protected void onDeleteEntity(Note entity) {
        entity.deleteBase();
    }
}