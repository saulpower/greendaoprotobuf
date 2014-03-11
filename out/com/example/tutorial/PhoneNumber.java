package com.example.tutorial;

import com.example.tutorial.Person.PhoneType;
// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PHONE_NUMBER.
 */
public class PhoneNumber {

    private Long id;
    private long personId;
    private String number;
    private PhoneType type;

    public PhoneNumber() {
    }

    public PhoneNumber(Long id) {
        this.id = id;
    }

    public PhoneNumber(Long id, long personId, String number, PhoneType type) {
        this.id = id;
        this.personId = personId;
        this.number = number;
        this.type = type;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }

}
