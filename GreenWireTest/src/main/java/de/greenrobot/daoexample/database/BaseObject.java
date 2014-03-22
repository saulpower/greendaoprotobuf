package de.greenrobot.daoexample.database;

import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table BASE_OBJECT.
 */
public class BaseObject {

    private java.util.Date updatedOn;
    private java.util.Date createdOn;
    /** Not-null value. */
    private transient String derivedEntityType;
    private transient Long baseId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient BaseObjectDao myDao;


    public BaseObject() {
    }

    public BaseObject(Long baseId) {
        this.baseId = baseId;
    }

    public BaseObject(java.util.Date updatedOn, java.util.Date createdOn, String derivedEntityType, Long baseId) {
        this.updatedOn = updatedOn;
        this.createdOn = createdOn;
        this.derivedEntityType = derivedEntityType;
        this.baseId = baseId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getBaseObjectDao() : null;
    }

    void loadBase(BaseObjectDao dao, Long baseId) {
        myDao = dao;
        this.baseId = baseId;
        myDao.refresh(this);
    }

    void insertBase(BaseObjectDao dao) {
        myDao = dao;
        dao.insert(this);
    }

    void updateBase() {
        myDao.update(this);
    }

    void deleteBase() {
        myDao.delete(this);
    }

    public java.util.Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(java.util.Date updatedOn) {
        this.updatedOn = updatedOn;
    }


    public java.util.Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }


    /** Not-null value. */
    public String getDerivedEntityType() {
        return derivedEntityType;
    }
    /** Not-null value; ensure this value is available before it is saved to the database. */

    public void setDerivedEntityType(String derivedEntityType) {
        this.derivedEntityType = derivedEntityType;
    }


    public Long getBaseId() {
        return baseId;
    }

    public void setBaseId(Long baseId) {
        this.baseId = baseId;
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
