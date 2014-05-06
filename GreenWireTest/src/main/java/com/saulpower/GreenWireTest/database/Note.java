package com.saulpower.GreenWireTest.database;

import java.util.List;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table NOTE.
 */
public class Note extends SyncBase  {

    private String externalID;
    private String guid;
    private String name;
    private String tagString;
    private transient long notesGuardianId;
    private Long tenantID;
    private transient long saveResultSaveResultId;
    private String dateLastModified;
    private transient long notesPersonId;
    private transient Long syncBaseId;
    private Boolean isDeleted;
    private Integer version;
    private String content;
    private String ownerID;
    private Long id;
    private String dateCreated;
    private transient long notesStudentId;
    private String userID;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient NoteDao myDao;
    private SaveResult saveResult;
    private Long saveResult__resolvedKey;
    private List<CustomValue> customValues;

    public Note() {
    }

    public Note(Long id) {
        this.id = id;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    Note(String externalID, String guid, String name, String tagString, long notesGuardianId, Long tenantID, long saveResultSaveResultId, String dateLastModified, long notesPersonId, Long syncBaseId, Boolean isDeleted, Integer version, String content, String ownerID, Long id, String dateCreated, long notesStudentId, String userID) {
        this.externalID = externalID;
        this.guid = guid;
        this.name = name;
        this.tagString = tagString;
        this.notesGuardianId = notesGuardianId;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.dateLastModified = dateLastModified;
        this.notesPersonId = notesPersonId;
        this.syncBaseId = syncBaseId;
        this.isDeleted = isDeleted;
        this.version = version;
        this.content = content;
        this.ownerID = ownerID;
        this.id = id;
        this.dateCreated = dateCreated;
        this.notesStudentId = notesStudentId;
        this.userID = userID;
    }

    public Note(String externalID, String guid, String name, String tagString, long notesGuardianId, Long tenantID, long saveResultSaveResultId, String dateLastModified, long notesPersonId, Boolean isDeleted, Integer version, String content, String ownerID, Long id, String dateCreated, long notesStudentId, String userID) {
        this.externalID = externalID;
        this.guid = guid;
        this.name = name;
        this.tagString = tagString;
        this.notesGuardianId = notesGuardianId;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.dateLastModified = dateLastModified;
        this.notesPersonId = notesPersonId;
        this.isDeleted = isDeleted;
        this.version = version;
        this.content = content;
        this.ownerID = ownerID;
        this.id = id;
        this.dateCreated = dateCreated;
        this.notesStudentId = notesStudentId;
        this.userID = userID;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    /** called by internal mechanisms, do not call yourself. */
    @Override
    public void __setDaoSession(DaoSession daoSession) {
        super.__setDaoSession(daoSession);
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getNoteDao() : null;
    }

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagString() {
        return tagString;
    }

    public void setTagString(String tagString) {
        this.tagString = tagString;
    }

    public long getNotesGuardianId() {
        return notesGuardianId;
    }

    public void setNotesGuardianId(long notesGuardianId) {
        this.notesGuardianId = notesGuardianId;
    }

    public Long getTenantID() {
        return tenantID;
    }

    public void setTenantID(Long tenantID) {
        this.tenantID = tenantID;
    }

    public long getSaveResultSaveResultId() {
        return saveResultSaveResultId;
    }

    public void setSaveResultSaveResultId(long saveResultSaveResultId) {
        this.saveResultSaveResultId = saveResultSaveResultId;
    }

    public String getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public long getNotesPersonId() {
        return notesPersonId;
    }

    public void setNotesPersonId(long notesPersonId) {
        this.notesPersonId = notesPersonId;
    }

    public Long getSyncBaseId() {
        return syncBaseId;
    }

    public void setSyncBaseId(Long syncBaseId) {
        this.syncBaseId = syncBaseId;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public long getNotesStudentId() {
        return notesStudentId;
    }

    public void setNotesStudentId(long notesStudentId) {
        this.notesStudentId = notesStudentId;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    /** To-one relationship, resolved on first access. */
    public SaveResult getSaveResult() {
        long __key = this.saveResultSaveResultId;
        if (saveResult__resolvedKey == null || !saveResult__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SaveResultDao targetDao = daoSession.getSaveResultDao();
            SaveResult saveResultNew = targetDao.load(__key);
            synchronized (this) {
                saveResult = saveResultNew;
            	saveResult__resolvedKey = __key;
            }
        }
        return saveResult;
    }

    public void setSaveResult(SaveResult saveResult) {
        if (saveResult == null) {
            throw new DaoException("To-one property 'saveResultSaveResultId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.saveResult = saveResult;
            saveResultSaveResultId = saveResult.getId();
            saveResult__resolvedKey = saveResultSaveResultId;
        }
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<CustomValue> getCustomValues() {
        if (customValues == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CustomValueDao targetDao = daoSession.getCustomValueDao();
            List<CustomValue> customValuesNew = targetDao._queryNote_CustomValues(id);
            synchronized (this) {
                if(customValues == null) {
                    customValues = customValuesNew;
                }
            }
        }
        return customValues;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetCustomValues() {
        customValues = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}