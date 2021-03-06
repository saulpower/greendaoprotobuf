package com.saulpower.GreenWireTest.database;

import java.util.List;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CLASS_ASSIGNMENT.
 */
public class ClassAssignment extends SyncBase  {

    private transient long employeesClaszId;
    private transient long personPersonId;
    private Boolean isPrimary;
    private String externalID;
    private String guid;
    private String name;
    private transient long claszClaszId;
    private String classID;
    private String tagString;
    private Long tenantID;
    private transient long saveResultSaveResultId;
    private String dateLastModified;
    private transient long classAssignmentsStudentId;
    private transient Long syncBaseId;
    private Boolean isDeleted;
    private Integer version;
    private Long id;
    private String dateCreated;
    private transient long classAssignmentsClaszId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient ClassAssignmentDao myDao;
    private Person person;
    private Long person__resolvedKey;
    private Clasz clasz;
    private Long clasz__resolvedKey;
    private SaveResult saveResult;
    private Long saveResult__resolvedKey;
    private List<CustomValue> customValues;

    public ClassAssignment() {
    }

    public ClassAssignment(Long id) {
        this.id = id;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    ClassAssignment(long employeesClaszId, long personPersonId, Boolean isPrimary, String externalID, String guid, String name, long claszClaszId, String classID, String tagString, Long tenantID, long saveResultSaveResultId, String dateLastModified, long classAssignmentsStudentId, Long syncBaseId, Boolean isDeleted, Integer version, Long id, String dateCreated, long classAssignmentsClaszId) {
        this.employeesClaszId = employeesClaszId;
        this.personPersonId = personPersonId;
        this.isPrimary = isPrimary;
        this.externalID = externalID;
        this.guid = guid;
        this.name = name;
        this.claszClaszId = claszClaszId;
        this.classID = classID;
        this.tagString = tagString;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.dateLastModified = dateLastModified;
        this.classAssignmentsStudentId = classAssignmentsStudentId;
        this.syncBaseId = syncBaseId;
        this.isDeleted = isDeleted;
        this.version = version;
        this.id = id;
        this.dateCreated = dateCreated;
        this.classAssignmentsClaszId = classAssignmentsClaszId;
    }

    public ClassAssignment(long employeesClaszId, long personPersonId, Boolean isPrimary, String externalID, String guid, String name, long claszClaszId, String classID, String tagString, Long tenantID, long saveResultSaveResultId, String dateLastModified, long classAssignmentsStudentId, Boolean isDeleted, Integer version, Long id, String dateCreated, long classAssignmentsClaszId) {
        this.employeesClaszId = employeesClaszId;
        this.personPersonId = personPersonId;
        this.isPrimary = isPrimary;
        this.externalID = externalID;
        this.guid = guid;
        this.name = name;
        this.claszClaszId = claszClaszId;
        this.classID = classID;
        this.tagString = tagString;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.dateLastModified = dateLastModified;
        this.classAssignmentsStudentId = classAssignmentsStudentId;
        this.isDeleted = isDeleted;
        this.version = version;
        this.id = id;
        this.dateCreated = dateCreated;
        this.classAssignmentsClaszId = classAssignmentsClaszId;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    /** called by internal mechanisms, do not call yourself. */
    @Override
    public void __setDaoSession(DaoSession daoSession) {
        super.__setDaoSession(daoSession);
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getClassAssignmentDao() : null;
    }

    public long getEmployeesClaszId() {
        return employeesClaszId;
    }

    public void setEmployeesClaszId(long employeesClaszId) {
        this.employeesClaszId = employeesClaszId;
    }

    public long getPersonPersonId() {
        return personPersonId;
    }

    public void setPersonPersonId(long personPersonId) {
        this.personPersonId = personPersonId;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
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

    public long getClaszClaszId() {
        return claszClaszId;
    }

    public void setClaszClaszId(long claszClaszId) {
        this.claszClaszId = claszClaszId;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
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

    public String getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public long getClassAssignmentsStudentId() {
        return classAssignmentsStudentId;
    }

    public void setClassAssignmentsStudentId(long classAssignmentsStudentId) {
        this.classAssignmentsStudentId = classAssignmentsStudentId;
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

    public long getClassAssignmentsClaszId() {
        return classAssignmentsClaszId;
    }

    public void setClassAssignmentsClaszId(long classAssignmentsClaszId) {
        this.classAssignmentsClaszId = classAssignmentsClaszId;
    }

    /** To-one relationship, resolved on first access. */
    public Person getPerson() {
        long __key = this.personPersonId;
        if (person__resolvedKey == null || !person__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PersonDao targetDao = daoSession.getPersonDao();
            Person personNew = targetDao.load(__key);
            synchronized (this) {
                person = personNew;
            	person__resolvedKey = __key;
            }
        }
        return person;
    }

    public void setPerson(Person person) {
        if (person == null) {
            throw new DaoException("To-one property 'personPersonId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.person = person;
            personPersonId = person.getId();
            person__resolvedKey = personPersonId;
        }
    }

    /** To-one relationship, resolved on first access. */
    public Clasz getClasz() {
        long __key = this.claszClaszId;
        if (clasz__resolvedKey == null || !clasz__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ClaszDao targetDao = daoSession.getClaszDao();
            Clasz claszNew = targetDao.load(__key);
            synchronized (this) {
                clasz = claszNew;
            	clasz__resolvedKey = __key;
            }
        }
        return clasz;
    }

    public void setClasz(Clasz clasz) {
        if (clasz == null) {
            throw new DaoException("To-one property 'claszClaszId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.clasz = clasz;
            claszClaszId = clasz.getId();
            clasz__resolvedKey = claszClaszId;
        }
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
            List<CustomValue> customValuesNew = targetDao._queryClassAssignment_CustomValues(id);
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