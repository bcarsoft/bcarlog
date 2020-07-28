/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarlog.login.model;

import com.bcarlog.struct.model.AbsModel;

/**
 * This is the model for Login table inside database.
 * @author abelbcarvalho
 */
public class Login extends AbsModel {
    private String siteLogin;
    private String userLogin;
    private String emailLogin;
    private String passLogin;

    /**
     * Create a new Login Instance.
     */
    public Login() {
        super();
        this.siteLogin = "";
        this.userLogin = this.siteLogin;
        this.emailLogin = this.userLogin;
        this.passLogin = this.emailLogin;
    }

    // getters and setters
    
    public String getSiteLogin() {
        return siteLogin;
    }

    public void setSiteLogin(String siteLogin) {
        this.siteLogin = siteLogin;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getEmailLogin() {
        return emailLogin;
    }

    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    public String getPassLogin() {
        return passLogin;
    }

    public void setPassLogin(String passLogin) {
        this.passLogin = passLogin;
    }
    
}
