package com.saulpower.GreenWireTest.database;

import java.util.List;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table IMMUNIZATION.
 */
public class Immunization extends SyncBase  {

    private transient long personPersonId;
    private transient long immunizationsGuardianId;
    private String definitionID;
    private String externalID;
    private String guid;
    private String name;
    private String tagString;
    private Long tenantID;
    private transient long saveResultSaveResultId;
    private transient long immunizationsStudentId;
    private String dateLastModified;
    private transient long definitionImmunizationDefinitionId;
    private transient Long syncBaseId;
    private Boolean isDeleted;
    private Integer version;
    private Long id;
    private transient long immunizationsPersonId;
    private String dateCreated;
    private transient long immunizationsImmunizationDefinitionId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient ImmunizationDao myDao;
    private ImmunizationDefinition definition;
    private Long definition__resolvedKey;
    private Person person;
    private Long person__resolvedKey;
    private SaveResult saveResult;
    private Long saveResult__resolvedKey;
    private List<CustomValue> customValues;

    public Immunization() {
    }

    public Immunization(Long id) {
        this.id = id;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    Immunization(long personPersonId, long immunizationsGuardianId, String definitionID, String externalID, String guid, String name, String tagString, Long tenantID, long saveResultSaveResultId, long immunizationsStudentId, String dateLastModified, long definitionImmunizationDefinitionId, Long syncBaseId, Boolean isDeleted, Integer version, Long id, long immunizationsPersonId, String dateCreated, long immunizationsImmunizationDefinitionId) {
        this.personPersonId = personPersonId;
        this.immunizationsGuardianId = immunizationsGuardianId;
        this.definitionID = definitionID;
        this.externalID = externalID;
        this.guid = guid;
        this.name = name;
        this.tagString = tagString;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.immunizationsStudentId = immunizationsStudentId;
        this.dateLastModified = dateLastModified;
        this.definitionImmunizationDefinitionId = definitionImmunizationDefinitionId;
        this.syncBaseId = syncBaseId;
        this.isDeleted = isDeleted;
        this.version = version;
        this.id = id;
        this.immunizationsPersonId = immunizationsPersonId;
        this.dateCreated = dateCreated;
        this.immunizationsImmunizationDefinitionId = immunizationsImmunizationDefinitionId;
    }

    public Immunization(long personPersonId, long immunizationsGuardianId, String definitionID, String externalID, String guid, String name, String tagString, Long tenantID, long saveResultSaveResultId, long immunizationsStudentId, String dateLastModified, long definitionImmunizationDefinitionId, Boolean isDeleted, Integer version, Long id, long immunizationsPersonId, String dateCreated, long immunizationsImmunizationDefinitionId) {
        this.personPersonId = personPersonId;
        this.immunizationsGuardianId = immunizationsGuardianId;
        this.definitionID = definitionID;
        this.externalID = externalID;
        this.guid = guid;
        this.name = name;
        this.tagString = tagString;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.immunizationsStudentId = immunizationsStudentId;
        this.dateLastModified = dateLastModified;
        this.definitionImmunizationDefinitionId = definitionImmunizationDefinitionId;
        this.isDeleted = isDeleted;
        this.version = version;
        this.id = id;
        this.immunizationsPersonId = immunizationsPersonId;
        this.dateCreated = dateCreated;
        this.immunizationsImmunizationDefinitionId = immunizationsImmunizationDefinitionId;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    /** called by internal mechanisms, do not call yourself. */
    @Override
    public void __setDaoSession(DaoSession daoSession) {
        super.__setDaoSession(daoSession);
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getImmunizationDao() : null;
    }

    public long getPersonPersonId() {
        return personPersonId;
    }

    public void setPersonPersonId(long personPersonId) {
        this.personPersonId = personPersonId;
    }

    public long getImmunizationsGuardianId() {
        return immunizationsGuardianId;
    }

    public void setImmunizationsGuardianId(long immunizationsGuardianId) {
        this.immunizationsGuardianId = immunizationsGuardianId;
    }

    public String getDefinitionID() {
        return definitionID;
    }

    public void setDefinitionID(String definitionID) {
        this.definitionID = definitionID;
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

    public long getImmunizationsStudentId() {
        return immunizationsStudentId;
    }

    public void setImmunizationsStudentId(long immunizationsStudentId) {
        this.immunizationsStudentId = immunizationsStudentId;
    }

    public String getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public long getDefinitionImmunizationDefinitionId() {
        return definitionImmunizationDefinitionId;
    }

    public void setDefinitionImmunizationDefinitionId(long definitionImmunizationDefinitionId) {
        this.definitionImmunizationDefinitionId = definitionImmunizationDefinitionId;
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

    public long getImmunizationsPersonId() {
        return immunizationsPersonId;
    }

    public void setImmunizationsPersonId(long immunizationsPersonId) {
        this.immunizationsPersonId = immunizationsPersonId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public long getImmunizationsImmunizationDefinitionId() {
        return immunizationsImmunizationDefinitionId;
    }

    public void setImmunizationsImmunizationDefinitionId(long immunizationsImmunizationDefinitionId) {
        this.immunizationsImmunizationDefinitionId = immunizationsImmunizationDefinitionId;
    }

    /** To-one relationship, resolved on first access. */
    public ImmunizationDefinition getDefinition() {
        long __key = this.definitionImmunizationDefinitionId;
        if (definition__resolvedKey == null || !definition__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ImmunizationDefinitionDao targetDao = daoSession.getImmunizationDefinitionDao();
            ImmunizationDefinition definitionNew = targetDao.load(__key);
            synchronized (this) {
                definition = definitionNew;
            	definition__resolvedKey = __key;
            }
        }
        return definition;
    }

    public void setDefinition(ImmunizationDefinition definition) {
        if (definition == null) {
            throw new DaoException("To-one property 'definitionImmunizationDefinitionId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.definition = definition;
            definitionImmunizationDefinitionId = definition.getId();
            definition__resolvedKey = definitionImmunizationDefinitionId;
        }
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
            List<CustomValue> customValuesNew = targetDao._queryImmunization_CustomValues(id);
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