package com.billing.entity;

import java.util.List;

public class Bill extends BaseEntity{
    private MonthAndYear month;
    private BillStatus status;
    private List<Call> calls;

    public void setCalls(List<Call> calls) {
        this.calls = calls;
    }

    public List<Call> getCalls() {
        return calls;
    }

    public void setStatus(BillStatus status) {
        this.status = status;
    }

    public BillStatus getStatus() {
        return status;
    }

    public Bill setMonth(MonthAndYear month) {
        this.month = month;
        return this;
    }

    public Bill setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public Bill setPrivateAmount(double privateAmount) {
        this.privateAmount = privateAmount;
        return this;
    }

    public MonthAndYear getMonth() {
        return month;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getPrivateAmount() {
        return privateAmount;
    }

    private double totalAmount;
    private double privateAmount;
}
