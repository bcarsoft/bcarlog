/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.date;

/**
 * This class is for date information.
 * @author abel
 */
public class Date {
    private int month;
    private int day;
    private int year;

    /**
     * Builder Method.
     */
    public Date() {
        this.month = 0;
        this.day = this.month;
        this.year = this.day;
    }
    
    // getters and setters

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
