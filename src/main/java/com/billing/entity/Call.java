package com.billing.entity;

public class Call extends BaseEntity{
    private CallType callType;
    private String calledNumber;
    private String phoneNumber;
    private int duration;
    private boolean isPrivate;

    public CallType getCallType() {
        return callType;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setCallType(CallType callType) {
        this.callType = callType;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public void setType(CallType type) {
        this.callType = type;
    }

    public void setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public CallType getType() {
        return callType;
    }

    public String getCalledNumber() {
        return calledNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getDuration() {
        return duration;
    }
}
