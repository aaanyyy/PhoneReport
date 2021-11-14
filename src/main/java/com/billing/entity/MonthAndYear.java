package com.billing.entity;

public class MonthAndYear extends BaseEntity{
    private Month monthName;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public Month getMonth() {
        return monthName;
    }

    public void setMonth(int month) {
        this.monthName = Month.values()[month-1];
    }


}
