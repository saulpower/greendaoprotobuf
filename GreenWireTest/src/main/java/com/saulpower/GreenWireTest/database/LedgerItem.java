package com.saulpower.GreenWireTest.database;

import java.util.List;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table LEDGER_ITEM.
 */
public class LedgerItem extends SyncBase  {

    private transient long ledgerItemsLedgerAccountId;
    private transient long personPersonId;
    private String postingDate;
    private String externalID;
    private Boolean isVoid;
    private String guid;
    private String name;
    private String tagString;
    private Long tenantID;
    private transient long saveResultSaveResultId;
    private Float debit;
    private String dateLastModified;
    private transient Long syncBaseId;
    private Float credit;
    private Boolean isDeleted;
    private Integer version;
    private Long id;
    private transient long ledgerAccountLedgerAccountId;
    private String dateCreated;
    private String notes;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient LedgerItemDao myDao;
    private LedgerAccount ledgerAccount;
    private Long ledgerAccount__resolvedKey;
    private Person person;
    private Long person__resolvedKey;
    private SaveResult saveResult;
    private Long saveResult__resolvedKey;
    private List<Attachment> attachments;
    private List<CustomValue> customValues;

    public LedgerItem() {
    }

    public LedgerItem(Long id) {
        this.id = id;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    LedgerItem(long ledgerItemsLedgerAccountId, long personPersonId, String postingDate, String externalID, Boolean isVoid, String guid, String name, String tagString, Long tenantID, long saveResultSaveResultId, Float debit, String dateLastModified, Long syncBaseId, Float credit, Boolean isDeleted, Integer version, Long id, long ledgerAccountLedgerAccountId, String dateCreated, String notes) {
        this.ledgerItemsLedgerAccountId = ledgerItemsLedgerAccountId;
        this.personPersonId = personPersonId;
        this.postingDate = postingDate;
        this.externalID = externalID;
        this.isVoid = isVoid;
        this.guid = guid;
        this.name = name;
        this.tagString = tagString;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.debit = debit;
        this.dateLastModified = dateLastModified;
        this.syncBaseId = syncBaseId;
        this.credit = credit;
        this.isDeleted = isDeleted;
        this.version = version;
        this.id = id;
        this.ledgerAccountLedgerAccountId = ledgerAccountLedgerAccountId;
        this.dateCreated = dateCreated;
        this.notes = notes;
    }

    public LedgerItem(long ledgerItemsLedgerAccountId, long personPersonId, String postingDate, String externalID, Boolean isVoid, String guid, String name, String tagString, Long tenantID, long saveResultSaveResultId, Float debit, String dateLastModified, Float credit, Boolean isDeleted, Integer version, Long id, long ledgerAccountLedgerAccountId, String dateCreated, String notes) {
        this.ledgerItemsLedgerAccountId = ledgerItemsLedgerAccountId;
        this.personPersonId = personPersonId;
        this.postingDate = postingDate;
        this.externalID = externalID;
        this.isVoid = isVoid;
        this.guid = guid;
        this.name = name;
        this.tagString = tagString;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.debit = debit;
        this.dateLastModified = dateLastModified;
        this.credit = credit;
        this.isDeleted = isDeleted;
        this.version = version;
        this.id = id;
        this.ledgerAccountLedgerAccountId = ledgerAccountLedgerAccountId;
        this.dateCreated = dateCreated;
        this.notes = notes;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    /** called by internal mechanisms, do not call yourself. */
    @Override
    public void __setDaoSession(DaoSession daoSession) {
        super.__setDaoSession(daoSession);
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getLedgerItemDao() : null;
    }

    public long getLedgerItemsLedgerAccountId() {
        return ledgerItemsLedgerAccountId;
    }

    public void setLedgerItemsLedgerAccountId(long ledgerItemsLedgerAccountId) {
        this.ledgerItemsLedgerAccountId = ledgerItemsLedgerAccountId;
    }

    public long getPersonPersonId() {
        return personPersonId;
    }

    public void setPersonPersonId(long personPersonId) {
        this.personPersonId = personPersonId;
    }

    public String getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(String postingDate) {
        this.postingDate = postingDate;
    }

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    public Boolean getIsVoid() {
        return isVoid;
    }

    public void setIsVoid(Boolean isVoid) {
        this.isVoid = isVoid;
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

    public Float getDebit() {
        return debit;
    }

    public void setDebit(Float debit) {
        this.debit = debit;
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

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
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

    public long getLedgerAccountLedgerAccountId() {
        return ledgerAccountLedgerAccountId;
    }

    public void setLedgerAccountLedgerAccountId(long ledgerAccountLedgerAccountId) {
        this.ledgerAccountLedgerAccountId = ledgerAccountLedgerAccountId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /** To-one relationship, resolved on first access. */
    public LedgerAccount getLedgerAccount() {
        long __key = this.ledgerAccountLedgerAccountId;
        if (ledgerAccount__resolvedKey == null || !ledgerAccount__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            LedgerAccountDao targetDao = daoSession.getLedgerAccountDao();
            LedgerAccount ledgerAccountNew = targetDao.load(__key);
            synchronized (this) {
                ledgerAccount = ledgerAccountNew;
            	ledgerAccount__resolvedKey = __key;
            }
        }
        return ledgerAccount;
    }

    public void setLedgerAccount(LedgerAccount ledgerAccount) {
        if (ledgerAccount == null) {
            throw new DaoException("To-one property 'ledgerAccountLedgerAccountId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.ledgerAccount = ledgerAccount;
            ledgerAccountLedgerAccountId = ledgerAccount.getId();
            ledgerAccount__resolvedKey = ledgerAccountLedgerAccountId;
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
    public List<Attachment> getAttachments() {
        if (attachments == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AttachmentDao targetDao = daoSession.getAttachmentDao();
            List<Attachment> attachmentsNew = targetDao._queryLedgerItem_Attachments(id);
            synchronized (this) {
                if(attachments == null) {
                    attachments = attachmentsNew;
                }
            }
        }
        return attachments;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetAttachments() {
        attachments = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<CustomValue> getCustomValues() {
        if (customValues == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CustomValueDao targetDao = daoSession.getCustomValueDao();
            List<CustomValue> customValuesNew = targetDao._queryLedgerItem_CustomValues(id);
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