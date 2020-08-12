/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.login.model;

import com.bcarsoft.struct.model.AbsModel;

/**
 * This is the model for Login table inside database.
 * @author abelbcarvalho
 */
public class Login extends AbsModel {
    private String siteLogin;
    private String urlSiteLogin;
    private String userLogin;
    private String emailLogin;
    private String passLogin;

    /**
     * Create a new Login Instance.
     */
    public Login() {
        super();
        this.siteLogin = "";
        this.urlSiteLogin = this.siteLogin;
        this.userLogin = this.urlSiteLogin;
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

    public String getUrlSiteLogin() {
        return urlSiteLogin;
    }

    public void setUrlSiteLogin(String urlSiteLogin) {
        this.urlSiteLogin = urlSiteLogin;
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
