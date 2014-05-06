package com.saulpower.GreenWireTest.database;

import java.util.List;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SECURITY_QUESTION.
 */
public class SecurityQuestion extends SyncBase  {

    private String externalID;
    private String guid;
    private String name;
    private String question;
    private String tagString;
    private Long tenantID;
    private transient long saveResultSaveResultId;
    private transient long securityQuestionsStudentId;
    private String dateLastModified;
    private String answer;
    private transient Long syncBaseId;
    private Boolean isDeleted;
    private Integer version;
    private Long id;
    private transient long studentStudentId;
    private String dateCreated;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient SecurityQuestionDao myDao;
    private Student student;
    private Long student__resolvedKey;
    private SaveResult saveResult;
    private Long saveResult__resolvedKey;
    private List<CustomValue> customValues;

    public SecurityQuestion() {
    }

    public SecurityQuestion(Long id) {
        this.id = id;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    SecurityQuestion(String externalID, String guid, String name, String question, String tagString, Long tenantID, long saveResultSaveResultId, long securityQuestionsStudentId, String dateLastModified, String answer, Long syncBaseId, Boolean isDeleted, Integer version, Long id, long studentStudentId, String dateCreated) {
        this.externalID = externalID;
        this.guid = guid;
        this.name = name;
        this.question = question;
        this.tagString = tagString;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.securityQuestionsStudentId = securityQuestionsStudentId;
        this.dateLastModified = dateLastModified;
        this.answer = answer;
        this.syncBaseId = syncBaseId;
        this.isDeleted = isDeleted;
        this.version = version;
        this.id = id;
        this.studentStudentId = studentStudentId;
        this.dateCreated = dateCreated;
    }

    public SecurityQuestion(String externalID, String guid, String name, String question, String tagString, Long tenantID, long saveResultSaveResultId, long securityQuestionsStudentId, String dateLastModified, String answer, Boolean isDeleted, Integer version, Long id, long studentStudentId, String dateCreated) {
        this.externalID = externalID;
        this.guid = guid;
        this.name = name;
        this.question = question;
        this.tagString = tagString;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.securityQuestionsStudentId = securityQuestionsStudentId;
        this.dateLastModified = dateLastModified;
        this.answer = answer;
        this.isDeleted = isDeleted;
        this.version = version;
        this.id = id;
        this.studentStudentId = studentStudentId;
        this.dateCreated = dateCreated;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    /** called by internal mechanisms, do not call yourself. */
    @Override
    public void __setDaoSession(DaoSession daoSession) {
        super.__setDaoSession(daoSession);
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getSecurityQuestionDao() : null;
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
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

    public long getSecurityQuestionsStudentId() {
        return securityQuestionsStudentId;
    }

    public void setSecurityQuestionsStudentId(long securityQuestionsStudentId) {
        this.securityQuestionsStudentId = securityQuestionsStudentId;
    }

    public String getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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

    public long getStudentStudentId() {
        return studentStudentId;
    }

    public void setStudentStudentId(long studentStudentId) {
        this.studentStudentId = studentStudentId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /** To-one relationship, resolved on first access. */
    public Student getStudent() {
        long __key = this.studentStudentId;
        if (student__resolvedKey == null || !student__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            StudentDao targetDao = daoSession.getStudentDao();
            Student studentNew = targetDao.load(__key);
            synchronized (this) {
                student = studentNew;
            	student__resolvedKey = __key;
            }
        }
        return student;
    }

    public void setStudent(Student student) {
        if (student == null) {
            throw new DaoException("To-one property 'studentStudentId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.student = student;
            studentStudentId = student.getId();
            student__resolvedKey = studentStudentId;
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
            List<CustomValue> customValuesNew = targetDao._querySecurityQuestion_CustomValues(id);
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