package com.saulpower.GreenWireTest.database;

import java.util.List;
import com.saulpower.GreenWireTest.database.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table APPLICATION_SOURCE.
 */
public class ApplicationSource {

    private String guid;
    private String name;
    private String externalID;
    private String tagString;
    private transient long applicationSourcesOUId;
    private Long tenantID;
    private transient long saveResultSaveResultId;
    private Long dateLastModified;
    private Boolean isDeleted;
    private Integer version;
    private Long id;
    private Long dateCreated;
    private Boolean isActive;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient ApplicationSourceDao myDao;

    private SaveResult saveResult;
    private Long saveResult__resolvedKey;

    private List<CustomValue> customValues;

    public ApplicationSource() {
    }

    public ApplicationSource(Long id) {
        this.id = id;
    }

    public ApplicationSource(String guid, String name, String externalID, String tagString, long applicationSourcesOUId, Long tenantID, long saveResultSaveResultId, Long dateLastModified, Boolean isDeleted, Integer version, Long id, Long dateCreated, Boolean isActive) {
        this.guid = guid;
        this.name = name;
        this.externalID = externalID;
        this.tagString = tagString;
        this.applicationSourcesOUId = applicationSourcesOUId;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.dateLastModified = dateLastModified;
        this.isDeleted = isDeleted;
        this.version = version;
        this.id = id;
        this.dateCreated = dateCreated;
        this.isActive = isActive;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getApplicationSourceDao() : null;
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

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    public String getTagString() {
        return tagString;
    }

    public void setTagString(String tagString) {
        this.tagString = tagString;
    }

    public long getApplicationSourcesOUId() {
        return applicationSourcesOUId;
    }

    public void setApplicationSourcesOUId(long applicationSourcesOUId) {
        this.applicationSourcesOUId = applicationSourcesOUId;
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

    public Long getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(Long dateLastModified) {
        this.dateLastModified = dateLastModified;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Long dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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
            List<CustomValue> customValuesNew = targetDao._queryApplicationSource_CustomValues(id);
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