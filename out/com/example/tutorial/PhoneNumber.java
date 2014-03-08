package com.example.tutorial;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PHONE_NUMBER.
 */
public class PhoneNumber {

    private Long id;
    private long personId;

    public PhoneNumber() {
    }

    public PhoneNumber(Long id) {
        this.id = id;
    }

    public PhoneNumber(Long id, long personId) {
        this.id = id;
        this.personId = personId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

}
