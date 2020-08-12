/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.account.model;

import com.bcarsoft.struct.model.AbsModel;

/**
 * This is the model for Account table inside database.
 * @author abelbcarvalho
 */
public class Account extends AbsModel {
    private String nameAcc;
    private String genderAcc;
    private int monthAcc;
    private int dayAcc;
    private int yearAcc;
    private String userAcc;
    private String emailAcc;
    private String passAcc;
    private String mobileAcc;

    /**
     * Create a new Account Instance.
     */
    public Account() {
        super();
        this.monthAcc = 0;
        this.dayAcc = this.monthAcc;
        this.yearAcc = this.dayAcc;
        this.nameAcc = "";
        this.genderAcc = this.nameAcc;
        this.userAcc = this.genderAcc;
        this.emailAcc = this.userAcc;
        this.passAcc = this.emailAcc;
        this.mobileAcc = this.passAcc;
    }

    // getters and setters
    
    public String getNameAcc() {
        return nameAcc;
    }

    public void setNameAcc(String nameAcc) {
        this.nameAcc = nameAcc;
    }

    public String getGenderAcc() {
        return genderAcc;
    }

    public void setGenderAcc(String genderAcc) {
        this.genderAcc = genderAcc;
    }

    public int getMonthAcc() {
        return monthAcc;
    }

    public void setMonthAcc(int monthAcc) {
        this.monthAcc = monthAcc;
    }

    public int getDayAcc() {
        return dayAcc;
    }

    public void setDayAcc(int dayAcc) {
        this.dayAcc = dayAcc;
    }

    public int getYearAcc() {
        return yearAcc;
    }

    public void setYearAcc(int yearAcc) {
        this.yearAcc = yearAcc;
    }

    public String getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(String userAcc) {
        this.userAcc = userAcc;
    }

    public String getEmailAcc() {
        return emailAcc;
    }

    public void setEmailAcc(String emailAcc) {
        this.emailAcc = emailAcc;
    }

    public String getPassAcc() {
        return passAcc;
    }

    public void setPassAcc(String passAcc) {
        this.passAcc = passAcc;
    }

    public String getMobileAcc() {
        return mobileAcc;
    }

    public void setMobileAcc(String mobileAcc) {
        this.mobileAcc = mobileAcc;
    }
    
}
