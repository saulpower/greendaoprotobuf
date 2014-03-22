package com.saulpower.GreenWireTest.database;

import java.util.List;
import com.saulpower.GreenWireTest.database.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ACTIVITY.
 */
public class Activity {

    private String externalID;
    private Boolean isDeleted;
    private String name;
    private String guid;
    private Integer version;
    private String tagString;
    private transient long activitiesStudentId;
    private Long id;
    private Long dateCreated;
    private Long tenantID;
    private transient long saveResultSaveResultId;
    private Long dateLastModified;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient ActivityDao myDao;

    private SaveResult saveResult;
    private Long saveResult__resolvedKey;

    private List<Student> students;
    private List<CustomValue> customValues;

    public Activity() {
    }

    public Activity(Long id) {
        this.id = id;
    }

    public Activity(String externalID, Boolean isDeleted, String name, String guid, Integer version, String tagString, long activitiesStudentId, Long id, Long dateCreated, Long tenantID, long saveResultSaveResultId, Long dateLastModified) {
        this.externalID = externalID;
        this.isDeleted = isDeleted;
        this.name = name;
        this.guid = guid;
        this.version = version;
        this.tagString = tagString;
        this.activitiesStudentId = activitiesStudentId;
        this.id = id;
        this.dateCreated = dateCreated;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.dateLastModified = dateLastModified;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getActivityDao() : null;
    }

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getTagString() {
        return tagString;
    }

    public void setTagString(String tagString) {
        this.tagString = tagString;
    }

    public long getActivitiesStudentId() {
        return activitiesStudentId;
    }

    public void setActivitiesStudentId(long activitiesStudentId) {
        this.activitiesStudentId = activitiesStudentId;
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
    public List<Student> getStudents() {
        if (students == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            StudentDao targetDao = daoSession.getStudentDao();
            List<Student> studentsNew = targetDao._queryActivity_Students(id);
            synchronized (this) {
                if(students == null) {
                    students = studentsNew;
                }
            }
        }
        return students;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetStudents() {
        students = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<CustomValue> getCustomValues() {
        if (customValues == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CustomValueDao targetDao = daoSession.getCustomValueDao();
            List<CustomValue> customValuesNew = targetDao._queryActivity_CustomValues(id);
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