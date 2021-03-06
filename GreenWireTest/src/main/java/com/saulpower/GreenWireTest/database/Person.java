package com.saulpower.GreenWireTest.database;

import java.util.List;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PERSON.
 */
public class Person extends SyncBase  {

    private transient long blackListStudentId;
    private String socialSecurity;
    private String prefix;
    private String socialSecurityRaw;
    private String externalID;
    private String guid;
    private String height;
    private String preferredName;
    private String dateLastModified;
    private transient long currentDeviceDeviceId;
    private String middleName;
    private String firstName;
    private transient Long syncBaseId;
    private Boolean isDeleted;
    private Integer version;
    private String workHours;
    private String weight;
    private String emailAddresses;
    private String distinguishingMarks;
    private Long id;
    private String dateCreated;
    private String dateOfLastPhysical;
    private String socialSecurityEntrypted;
    private String name;
    private String birthDate;
    private transient long peopleJournalEntryId;
    private String suffix;
    private String employer;
    private String emailAddressString;
    private String tagString;
    private Long tenantID;
    private transient long saveResultSaveResultId;
    private String hairColor;
    private String languages;
    private String interestsString;
    private Boolean isEnabled;
    private String lastName;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient PersonDao myDao;
    private Device currentDevice;
    private Long currentDevice__resolvedKey;
    private SaveResult saveResult;
    private Long saveResult__resolvedKey;
    private List<Attachment> attachments;
    private List<Address> addresses;
    private List<PersonalRelationship> relationships;
    private List<Note> notes;
    private List<PickupAuthorization> authorizedPickups;
    private List<Identification> identification;
    private List<Student> blacklistedFrom;
    private List<Allergy> allergies;
    private List<Immunization> immunizations;
    private List<JournalEntry> journalEntries;
    private List<Vehicle> vehicles;
    private List<Association> associations;
    private List<PhoneNumber> phoneNumbers;
    private List<CustomValue> customValues;

    public Person() {
    }

    public Person(Long id) {
        this.id = id;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    Person(long blackListStudentId, String socialSecurity, String prefix, String socialSecurityRaw, String externalID, String guid, String height, String preferredName, String dateLastModified, long currentDeviceDeviceId, String middleName, String firstName, Long syncBaseId, Boolean isDeleted, Integer version, String workHours, String weight, String emailAddresses, String distinguishingMarks, Long id, String dateCreated, String dateOfLastPhysical, String socialSecurityEntrypted, String name, String birthDate, long peopleJournalEntryId, String suffix, String employer, String emailAddressString, String tagString, Long tenantID, long saveResultSaveResultId, String hairColor, String languages, String interestsString, Boolean isEnabled, String lastName) {
        this.blackListStudentId = blackListStudentId;
        this.socialSecurity = socialSecurity;
        this.prefix = prefix;
        this.socialSecurityRaw = socialSecurityRaw;
        this.externalID = externalID;
        this.guid = guid;
        this.height = height;
        this.preferredName = preferredName;
        this.dateLastModified = dateLastModified;
        this.currentDeviceDeviceId = currentDeviceDeviceId;
        this.middleName = middleName;
        this.firstName = firstName;
        this.syncBaseId = syncBaseId;
        this.isDeleted = isDeleted;
        this.version = version;
        this.workHours = workHours;
        this.weight = weight;
        this.emailAddresses = emailAddresses;
        this.distinguishingMarks = distinguishingMarks;
        this.id = id;
        this.dateCreated = dateCreated;
        this.dateOfLastPhysical = dateOfLastPhysical;
        this.socialSecurityEntrypted = socialSecurityEntrypted;
        this.name = name;
        this.birthDate = birthDate;
        this.peopleJournalEntryId = peopleJournalEntryId;
        this.suffix = suffix;
        this.employer = employer;
        this.emailAddressString = emailAddressString;
        this.tagString = tagString;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.hairColor = hairColor;
        this.languages = languages;
        this.interestsString = interestsString;
        this.isEnabled = isEnabled;
        this.lastName = lastName;
    }

    public Person(long blackListStudentId, String socialSecurity, String prefix, String socialSecurityRaw, String externalID, String guid, String height, String preferredName, String dateLastModified, long currentDeviceDeviceId, String middleName, String firstName, Boolean isDeleted, Integer version, String workHours, String weight, String emailAddresses, String distinguishingMarks, Long id, String dateCreated, String dateOfLastPhysical, String socialSecurityEntrypted, String name, String birthDate, long peopleJournalEntryId, String suffix, String employer, String emailAddressString, String tagString, Long tenantID, long saveResultSaveResultId, String hairColor, String languages, String interestsString, Boolean isEnabled, String lastName) {
        this.blackListStudentId = blackListStudentId;
        this.socialSecurity = socialSecurity;
        this.prefix = prefix;
        this.socialSecurityRaw = socialSecurityRaw;
        this.externalID = externalID;
        this.guid = guid;
        this.height = height;
        this.preferredName = preferredName;
        this.dateLastModified = dateLastModified;
        this.currentDeviceDeviceId = currentDeviceDeviceId;
        this.middleName = middleName;
        this.firstName = firstName;
        this.isDeleted = isDeleted;
        this.version = version;
        this.workHours = workHours;
        this.weight = weight;
        this.emailAddresses = emailAddresses;
        this.distinguishingMarks = distinguishingMarks;
        this.id = id;
        this.dateCreated = dateCreated;
        this.dateOfLastPhysical = dateOfLastPhysical;
        this.socialSecurityEntrypted = socialSecurityEntrypted;
        this.name = name;
        this.birthDate = birthDate;
        this.peopleJournalEntryId = peopleJournalEntryId;
        this.suffix = suffix;
        this.employer = employer;
        this.emailAddressString = emailAddressString;
        this.tagString = tagString;
        this.tenantID = tenantID;
        this.saveResultSaveResultId = saveResultSaveResultId;
        this.hairColor = hairColor;
        this.languages = languages;
        this.interestsString = interestsString;
        this.isEnabled = isEnabled;
        this.lastName = lastName;
        setDerivedEntityType(getClass().getCanonicalName());
    }

    /** called by internal mechanisms, do not call yourself. */
    @Override
    public void __setDaoSession(DaoSession daoSession) {
        super.__setDaoSession(daoSession);
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPersonDao() : null;
    }

    public long getBlackListStudentId() {
        return blackListStudentId;
    }

    public void setBlackListStudentId(long blackListStudentId) {
        this.blackListStudentId = blackListStudentId;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSocialSecurityRaw() {
        return socialSecurityRaw;
    }

    public void setSocialSecurityRaw(String socialSecurityRaw) {
        this.socialSecurityRaw = socialSecurityRaw;
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public long getCurrentDeviceDeviceId() {
        return currentDeviceDeviceId;
    }

    public void setCurrentDeviceDeviceId(long currentDeviceDeviceId) {
        this.currentDeviceDeviceId = currentDeviceDeviceId;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(String emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public String getDistinguishingMarks() {
        return distinguishingMarks;
    }

    public void setDistinguishingMarks(String distinguishingMarks) {
        this.distinguishingMarks = distinguishingMarks;
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

    public String getDateOfLastPhysical() {
        return dateOfLastPhysical;
    }

    public void setDateOfLastPhysical(String dateOfLastPhysical) {
        this.dateOfLastPhysical = dateOfLastPhysical;
    }

    public String getSocialSecurityEntrypted() {
        return socialSecurityEntrypted;
    }

    public void setSocialSecurityEntrypted(String socialSecurityEntrypted) {
        this.socialSecurityEntrypted = socialSecurityEntrypted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public long getPeopleJournalEntryId() {
        return peopleJournalEntryId;
    }

    public void setPeopleJournalEntryId(long peopleJournalEntryId) {
        this.peopleJournalEntryId = peopleJournalEntryId;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmailAddressString() {
        return emailAddressString;
    }

    public void setEmailAddressString(String emailAddressString) {
        this.emailAddressString = emailAddressString;
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

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getInterestsString() {
        return interestsString;
    }

    public void setInterestsString(String interestsString) {
        this.interestsString = interestsString;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** To-one relationship, resolved on first access. */
    public Device getCurrentDevice() {
        long __key = this.currentDeviceDeviceId;
        if (currentDevice__resolvedKey == null || !currentDevice__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            DeviceDao targetDao = daoSession.getDeviceDao();
            Device currentDeviceNew = targetDao.load(__key);
            synchronized (this) {
                currentDevice = currentDeviceNew;
            	currentDevice__resolvedKey = __key;
            }
        }
        return currentDevice;
    }

    public void setCurrentDevice(Device currentDevice) {
        if (currentDevice == null) {
            throw new DaoException("To-one property 'currentDeviceDeviceId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.currentDevice = currentDevice;
            currentDeviceDeviceId = currentDevice.getId();
            currentDevice__resolvedKey = currentDeviceDeviceId;
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
            List<Attachment> attachmentsNew = targetDao._queryPerson_Attachments(id);
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
    public List<Address> getAddresses() {
        if (addresses == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AddressDao targetDao = daoSession.getAddressDao();
            List<Address> addressesNew = targetDao._queryPerson_Addresses(id);
            synchronized (this) {
                if(addresses == null) {
                    addresses = addressesNew;
                }
            }
        }
        return addresses;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetAddresses() {
        addresses = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<PersonalRelationship> getRelationships() {
        if (relationships == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PersonalRelationshipDao targetDao = daoSession.getPersonalRelationshipDao();
            List<PersonalRelationship> relationshipsNew = targetDao._queryPerson_Relationships(id);
            synchronized (this) {
                if(relationships == null) {
                    relationships = relationshipsNew;
                }
            }
        }
        return relationships;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetRelationships() {
        relationships = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Note> getNotes() {
        if (notes == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            NoteDao targetDao = daoSession.getNoteDao();
            List<Note> notesNew = targetDao._queryPerson_Notes(id);
            synchronized (this) {
                if(notes == null) {
                    notes = notesNew;
                }
            }
        }
        return notes;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetNotes() {
        notes = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<PickupAuthorization> getAuthorizedPickups() {
        if (authorizedPickups == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PickupAuthorizationDao targetDao = daoSession.getPickupAuthorizationDao();
            List<PickupAuthorization> authorizedPickupsNew = targetDao._queryPerson_AuthorizedPickups(id);
            synchronized (this) {
                if(authorizedPickups == null) {
                    authorizedPickups = authorizedPickupsNew;
                }
            }
        }
        return authorizedPickups;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetAuthorizedPickups() {
        authorizedPickups = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Identification> getIdentification() {
        if (identification == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            IdentificationDao targetDao = daoSession.getIdentificationDao();
            List<Identification> identificationNew = targetDao._queryPerson_Identification(id);
            synchronized (this) {
                if(identification == null) {
                    identification = identificationNew;
                }
            }
        }
        return identification;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetIdentification() {
        identification = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Student> getBlacklistedFrom() {
        if (blacklistedFrom == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            StudentDao targetDao = daoSession.getStudentDao();
            List<Student> blacklistedFromNew = targetDao._queryPerson_BlacklistedFrom(id);
            synchronized (this) {
                if(blacklistedFrom == null) {
                    blacklistedFrom = blacklistedFromNew;
                }
            }
        }
        return blacklistedFrom;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetBlacklistedFrom() {
        blacklistedFrom = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Allergy> getAllergies() {
        if (allergies == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AllergyDao targetDao = daoSession.getAllergyDao();
            List<Allergy> allergiesNew = targetDao._queryPerson_Allergies(id);
            synchronized (this) {
                if(allergies == null) {
                    allergies = allergiesNew;
                }
            }
        }
        return allergies;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetAllergies() {
        allergies = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Immunization> getImmunizations() {
        if (immunizations == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ImmunizationDao targetDao = daoSession.getImmunizationDao();
            List<Immunization> immunizationsNew = targetDao._queryPerson_Immunizations(id);
            synchronized (this) {
                if(immunizations == null) {
                    immunizations = immunizationsNew;
                }
            }
        }
        return immunizations;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetImmunizations() {
        immunizations = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<JournalEntry> getJournalEntries() {
        if (journalEntries == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            JournalEntryDao targetDao = daoSession.getJournalEntryDao();
            List<JournalEntry> journalEntriesNew = targetDao._queryPerson_JournalEntries(id);
            synchronized (this) {
                if(journalEntries == null) {
                    journalEntries = journalEntriesNew;
                }
            }
        }
        return journalEntries;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetJournalEntries() {
        journalEntries = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Vehicle> getVehicles() {
        if (vehicles == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            VehicleDao targetDao = daoSession.getVehicleDao();
            List<Vehicle> vehiclesNew = targetDao._queryPerson_Vehicles(id);
            synchronized (this) {
                if(vehicles == null) {
                    vehicles = vehiclesNew;
                }
            }
        }
        return vehicles;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetVehicles() {
        vehicles = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<Association> getAssociations() {
        if (associations == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AssociationDao targetDao = daoSession.getAssociationDao();
            List<Association> associationsNew = targetDao._queryPerson_Associations(id);
            synchronized (this) {
                if(associations == null) {
                    associations = associationsNew;
                }
            }
        }
        return associations;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetAssociations() {
        associations = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<PhoneNumber> getPhoneNumbers() {
        if (phoneNumbers == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PhoneNumberDao targetDao = daoSession.getPhoneNumberDao();
            List<PhoneNumber> phoneNumbersNew = targetDao._queryPerson_PhoneNumbers(id);
            synchronized (this) {
                if(phoneNumbers == null) {
                    phoneNumbers = phoneNumbersNew;
                }
            }
        }
        return phoneNumbers;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetPhoneNumbers() {
        phoneNumbers = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<CustomValue> getCustomValues() {
        if (customValues == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CustomValueDao targetDao = daoSession.getCustomValueDao();
            List<CustomValue> customValuesNew = targetDao._queryPerson_CustomValues(id);
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