package com.saulpower.GreenWireTest.database;

import java.util.List;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PICKUP_AUTHORIZATION.
 */
public class PickupAuthorization extends SyncBase  {

    private String externalID;
    private String guid;
    private String name;
    private transient long pickupListStudentId;
    private transient long authorizedPickupsStudentId;
    private String tagString;
    private Long tenantID;
    private transient long saveResultSaveResultId;
    private transient long authorizedPickupsPersonId;
    private transient long authorizedPickupsGuardianId;
    private String dateLastModified;
    private transient Long syncBaseId;
    private Boolean isDeleted;
    private Integer version;
    private String startDate;
    private Long id;
    private String dateCreated;
    private Boolean requiresConfirmation;
    private Boolean isActive;
    private String notes;
    private String endDate;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient PickupAuthorizationDao myDao;
    private SaveResult saveResult;
    private Long saveResult__resolvedKey;
    private List<CustomValue> customValues;

    public PickupAuthorization() {
    }

    public PickupAuthorization(Long id) {
        this.id = id;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    PickupAuthorization(String externalID, String guid, String name, long pickupListStudentId, long authorizedPickupsStudentId, String tagString, Long tenantID, long saveResultSaveResultId, long authorizedPickupsPersonId, long authorizedPickupsGuardianId, String dateLastModified, Long syncBaseId, Boolean isDeleted, Integer version, String startDate, Long id, String dateCreated, Boolean requiresConfirmation, Boolean isActive, String notes, String endDate) {
        this.externalID = externalID;
        this.guid = guid;
        this.name = name;
        this.pickupListStudentId = pickupListStudentId;
        this.authorizedPickupsStudentId = authorizedPickupsStudentId;
        this.tagString = tagString;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.authorizedPickupsPersonId = authorizedPickupsPersonId;
        this.authorizedPickupsGuardianId = authorizedPickupsGuardianId;
        this.dateLastModified = dateLastModified;
        this.syncBaseId = syncBaseId;
        this.isDeleted = isDeleted;
        this.version = version;
        this.startDate = startDate;
        this.id = id;
        this.dateCreated = dateCreated;
        this.requiresConfirmation = requiresConfirmation;
        this.isActive = isActive;
        this.notes = notes;
        this.endDate = endDate;
    }

    public PickupAuthorization(String externalID, String guid, String name, long pickupListStudentId, long authorizedPickupsStudentId, String tagString, Long tenantID, long saveResultSaveResultId, long authorizedPickupsPersonId, long authorizedPickupsGuardianId, String dateLastModified, Boolean isDeleted, Integer version, String startDate, Long id, String dateCreated, Boolean requiresConfirmation, Boolean isActive, String notes, String endDate) {
        this.externalID = externalID;
        this.guid = guid;
        this.name = name;
        this.pickupListStudentId = pickupListStudentId;
        this.authorizedPickupsStudentId = authorizedPickupsStudentId;
        this.tagString = tagString;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.authorizedPickupsPersonId = authorizedPickupsPersonId;
        this.authorizedPickupsGuardianId = authorizedPickupsGuardianId;
        this.dateLastModified = dateLastModified;
        this.isDeleted = isDeleted;
        this.version = version;
        this.startDate = startDate;
        this.id = id;
        this.dateCreated = dateCreated;
        this.requiresConfirmation = requiresConfirmation;
        this.isActive = isActive;
        this.notes = notes;
        this.endDate = endDate;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    /** called by internal mechanisms, do not call yourself. */
    @Override
    public void __setDaoSession(DaoSession daoSession) {
        super.__setDaoSession(daoSession);
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPickupAuthorizationDao() : null;
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

    public long getPickupListStudentId() {
        return pickupListStudentId;
    }

    public void setPickupListStudentId(long pickupListStudentId) {
        this.pickupListStudentId = pickupListStudentId;
    }

    public long getAuthorizedPickupsStudentId() {
        return authorizedPickupsStudentId;
    }

    public void setAuthorizedPickupsStudentId(long authorizedPickupsStudentId) {
        this.authorizedPickupsStudentId = authorizedPickupsStudentId;
    }

    public String getTagString() {
        return tagString;
    }

    public void setTagString(String tagString) {
        this.tagString = tagString;
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

    public long getAuthorizedPickupsPersonId() {
        return authorizedPickupsPersonId;
    }

    public void setAuthorizedPickupsPersonId(long authorizedPickupsPersonId) {
        this.authorizedPickupsPersonId = authorizedPickupsPersonId;
    }

    public long getAuthorizedPickupsGuardianId() {
        return authorizedPickupsGuardianId;
    }

    public void setAuthorizedPickupsGuardianId(long authorizedPickupsGuardianId) {
        this.authorizedPickupsGuardianId = authorizedPickupsGuardianId;
    }

    public String getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
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

    public Boolean getRequiresConfirmation() {
        return requiresConfirmation;
    }

    public void setRequiresConfirmation(Boolean requiresConfirmation) {
        this.requiresConfirmation = requiresConfirmation;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
            List<CustomValue> customValuesNew = targetDao._queryPickupAuthorization_CustomValues(id);
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