package com.example.tutorial;

import java.util.List;
import de.greenrobot.dao.DaoEnum;
import java.util.HashMap;
import java.util.Map;

import com.example.tutorial.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PERSON.
 */
public class Person {

    private Long id;
    private String name;
    private String email;
    private long addressBookId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient PersonDao myDao;

    private List<PhoneNumber> phoneNumbers;

    public Person() {
    }

    public Person(Long id) {
        this.id = id;
    }

    public Person(Long id, String name, String email, long addressBookId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.addressBookId = addressBookId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPersonDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAddressBookId() {
        return addressBookId;
    }

    public void setAddressBookId(long addressBookId) {
        this.addressBookId = addressBookId;
    }

    public enum PhoneType implements DaoEnum {
        MOBILE(0),
        HOME(1),
        WORK(2);

        private static final Map<Long, PhoneType> intToTypeMap = new HashMap<Long, PhoneType>();

        static {
            for (PhoneType type : PhoneType.values()) {
                intToTypeMap.put(type.value, type);
            }
        }

        public static PhoneType fromInt(long i) {
            PhoneType type = intToTypeMap.get(Long.valueOf(i));
            return type;
        }

        private final long value;

        private PhoneType(long value) {
            this.value = value;
        }

        @Override
        public long getValue() {
            return value;
        }
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
