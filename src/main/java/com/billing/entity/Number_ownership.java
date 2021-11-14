package com.billing.entity;


import java.sql.Date;

public class Number_ownership extends BaseEntity{
    private PhoneNumber phoneNumber;
    private User user;
    private java.sql.Date beginDate;
    private java.sql.Date endDate;

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public User getUser() {
        return user;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }



}
