/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.login.service;

import com.bcarsoft.login.dao.IDAOLogin;
import com.bcarsoft.login.model.Login;
import com.bcarsoft.struct.security.AES;
import com.bcarsoft.struct.singleton.SingAESPass;
import com.bcarsoft.struct.singleton.SingEmailUtil;
import com.bcarsoft.struct.singleton.SingPassUtil;
import com.bcarsoft.struct.singleton.SingUserUtil;
import com.bcarsoft.struct.utilities.StringUtil;
import java.util.List;

/**
 * This is the service for Login model class.
 * @author abelbcarvalho
 */
public class ServiceLogin implements IServiceLogin {
    private final static IDAOLogin DAO;
    private boolean done;
    
    static {DAO = new com.bcarsoft.login.dao.DAOLogin();}

    /**
     * This method checks data for Save.
     * @param login Login Instance.
     * @return true if success and saved.
     */
    @Override
    public boolean saveLogin(Login login) {
        // checks fk
        this.setDone(login.getFk() > 0);
        if (!this.isDone()) return this.isDone();
        // checks size
        this.setDone(this.stringLenChecks(login));
        if (!this.isDone()) return this.isDone();
        // checks enter info
        this.setDone(this.enterInfoCheck(login));
        if (!this.isDone()) return this.isDone();
        // encrypt
        login = this.encryptSiteUrl(login);
        login = this.enterInfoEncrypt(login);
        // if came here success with checks
        return getDAO().saveLogin(login);
    }

    /**
     * This method checks data for Update.
     * @param login Login Instance.
     * @return true if success and updated.
     */
    @Override
    public boolean updateLogin(Login login) {
        // checks id
        this.setDone(login.getId() > 0);        
        if (!this.isDone()) return this.isDone();
        // checks fk
        this.setDone(login.getFk() > 0);
        if (!this.isDone()) return this.isDone();
        // checks size
        this.setDone(this.stringLenChecks(login));
        if (!this.isDone()) return this.isDone();
        // checks enter info
        this.setDone(this.enterInfoCheck(login));
        if (!this.isDone()) return this.isDone();
        // encrypt
        login = this.encryptSiteUrl(login);
        login = this.enterInfoEncrypt(login);
        // if came here success with checks
        return getDAO().updateLogin(login);
    }

    /**
     * This method checks data for Delete.
     * @param login Login Instance.
     * @return true if success and deleted.
     */
    @Override
    public boolean deleteLogin(Login login) {
        // checks id
        this.setDone(login.getId() > 0);
        if (!this.isDone()) return this.isDone();
        // if came here, success with checks
        return getDAO().deleteLogin(login);
    }
    
    /**
     * Delete all logins by the foreign key.
     * @param login Login instance.
     * @return true if success.
     */
    @Override
    public boolean deleteAllLogin(Login login) {
        this.setDone(login.getFk() > 0);
        if (!this.isDone()) return this.isDone();
        // if came here, success with checks
        return getDAO().deleteAllLogin(login);
    }

    /**
     * This method checks data for Find All Logins.
     * @param login Login Instance.
     * @return not null if success.
     */
    @Override
    public List<Login> findAllLogin(Login login) {
        this.setDone(login.getFk() > 0);
        if (!this.isDone()) return null;
        // if came here, success with checks
        return getDAO().findAllLogin(login);
    }

    /**
     * This method checks data for Find Specifics Logins.
     * @param data List.
     * @param sql String.
     * @return not null if success.
     */
    @Override
    public List<Login> findSpecificLogin(List data, String sql) {
        if (data == null || StringUtil.isNullOrEmpty(sql)) return null;
        // encrypt
        data = this.encryptStringsAtIt(data);
        // if came here, checks success
        return getDAO().findSpecificLogin(data, sql);
    }
    
    /**
     * This method can verify if a string has a valid size.
     * @param login Login instance.
     * @return true if success.
     */
    private boolean stringLenChecks(Login login) {
        this.setDone(StringUtil.isNullOrEmpty(login.getSiteLogin()));
        if (this.isDone()) return !this.isDone();
        this.setDone(StringUtil.isNullOrEmpty(login.getUrlSiteLogin()));
        if (this.isDone()) return !this.isDone();
        this.setDone(StringUtil.isNullOrEmpty(login.getUserLogin()));
        if (this.isDone()) return !this.isDone();
        this.setDone(StringUtil.isNullOrEmpty(login.getEmailLogin()));
        if (this.isDone()) return !this.isDone();
        this.setDone(StringUtil.isNullOrEmpty(login.getPassLogin()));
        if (this.isDone()) return !this.isDone();
        // if came here, success with checks
        this.setDone(true);
        return this.isDone();
    }
    
    /**
     * This method can checker information like user, pass, email.
     * @param login Login instance.
     * @return true if success.
     */
    private boolean enterInfoCheck(Login login) {
        // check user name
        this.setDone(SingUserUtil.getInstance().isValidUsername(login.getUserLogin()));
        if (!this.isDone()) return this.isDone();
        // check email
        this.setDone(SingEmailUtil.getInstance().isEmailValid(login.getEmailLogin()));
        if (!this.isDone()) return this.isDone();
        // check password
        this.setDone(SingPassUtil.getInstance().isValidPassword(login.getPassLogin()));
        if (!this.isDone()) return this.isDone();
        // if came here, checks success
        this.setDone(true);
        return this.isDone();
    }
    
    // encrypt 
    
    /**
     * This method is for encrypt data.
     * @param login Login instance.
     * @return Login instance.
     */
    private Login encryptSiteUrl(Login login) {
        // site
        login.setSiteLogin(AES.encrypting(login.getSiteLogin(), SingAESPass.getInstance().getLoginPass()));
        // url
        login.setUrlSiteLogin(AES.encrypting(login.getUrlSiteLogin(), SingAESPass.getInstance().getLoginPass()));
        return login;
    }
    
    /**
     * This method is for encrypt data.
     * @param login Login instance.
     * @return Login instance.
     */
    private Login enterInfoEncrypt(Login login) {
        // user
        login.setUserLogin(AES.encrypting(login.getUserLogin(), SingAESPass.getInstance().getLoginPass()));
        // email
        login.setUserLogin(AES.encrypting(login.getEmailLogin(), SingAESPass.getInstance().getLoginPass()));
        // pass
        login.setUserLogin(AES.encrypting(login.getPassLogin(), SingAESPass.getInstance().getLoginPass()));
        return login;
    }
    
    // encrypt
    
    /**
     * This method takes all strings from a list and encrypt it.
     * @param data List.
     * @return not null if success.
     */
    private List encryptStringsAtIt(List data) {
        for (short i = 0; i < data.size(); i += 1) {
            if (data.get(i) instanceof java.lang.String) {
                data.set(i, AES.encrypting((String) data.get(i), SingAESPass.getInstance().getLoginPass()));
            }
        }
        return data;
    }

    // getters
    
    private static IDAOLogin getDAO() {
        return DAO;
    }

    protected boolean isDone() {
        return done;
    }

    protected void setDone(boolean done) {
        this.done = done;
    }
        
}
