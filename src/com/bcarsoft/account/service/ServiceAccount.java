/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.account.service;

import com.bcarsoft.account.dao.IDAOAccount;
import com.bcarsoft.account.model.Account;
import com.bcarsoft.struct.security.AES;
import com.bcarsoft.struct.singleton.SingAESPass;
import com.bcarsoft.struct.singleton.SingDateUtil;
import com.bcarsoft.struct.singleton.SingEmailUtil;
import com.bcarsoft.struct.singleton.SingMobileUtil;
import com.bcarsoft.struct.singleton.SingPassUtil;
import com.bcarsoft.struct.singleton.SingUserUtil;
import com.bcarsoft.struct.utilities.StringUtil;
import java.util.List;

/**
 * This is the service class for Account Model Class.
 * @author abelbcarvalho
 */
public class ServiceAccount implements IServiceAccount {
    private final static IDAOAccount DAO;
    private boolean done;
    
    static {DAO = new com.bcarsoft.account.dao.DAOAccount();}

    /**
     * This method checks data for Save.
     * @param account Account Instance.
     * @return true if success and saved.
     */
    @Override
    public boolean saveAccount(Account account) {
        // null or empty checker
        if (!this.isNotNullOrEmpty(account)) return this.isDone();
        // date checker
        this.setDone(this.isValideDate(account));
        if (!this.isDone()) return this.isDone();
        // login info checks
        this.setDone(this.enterInfoCheck(account));
        if (!this.isDone()) return this.isDone();
        // mobile info checks
        this.setDone(this.isMobileValid(account));
        if (!this.isDone()) return this.isDone();
        // encrypt
        account = this.encryptNameGender(account);
        account = this.enterInfoEncrypt(account);
        account = this.enterMobileEncrypt(account);
        // if came here, sucess with checker
        return getDAO().saveAccount(account);
    }

    /**
     * This method checks data for Update.
     * @param account Account Instance.
     * @return true if success and updated.
     */
    @Override
    public boolean updateAccount(Account account) {
        // id checker
        this.setDone(account.getId() > 0);
        if (!this.isDone()) return this.isDone();
        // null or empty checker
        if (!this.isNotNullOrEmpty(account)) return this.isDone();
        // date checker
        this.setDone(this.isValideDate(account));
        if (!this.isDone()) return this.isDone();
        // login info checks
        this.setDone(this.enterInfoCheck(account));
        if (!this.isDone()) return this.isDone();
        // mobile info checks
        this.setDone(this.isMobileValid(account));
        if (!this.isDone()) return this.isDone();
        // encrypt
        account = this.encryptNameGender(account);
        account = this.enterInfoEncrypt(account);
        account = this.enterMobileEncrypt(account);
        // if came here, success with checker
        return getDAO().updateAccount(account);
    }

    /**
     * This method checks data for Update Password
     * @param account Account Instance.
     * @return true if success and password updated.
     */
    @Override
    public boolean updatePasswordAccount(Account account) {
        // user or email
        if (!(SingEmailUtil.getInstance().isEmailValid(account.getUserAcc()) ||
                SingUserUtil.getInstance().isValidUsername(account.getUserAcc()))) {
            return false;
        }
        if (!SingPassUtil.getInstance().isValidPassword(account.getPassAcc())) {
            return false;
        }
        // mobile info checks
        this.setDone(this.isMobileValid(account));
        if (!this.isDone()) return this.isDone();
        // encrypt
        account = this.enterInfoEncrypt(account);
        account = this.enterMobileEncrypt(account);
        // if came here, success to checks
        return getDAO().updatePasswordAccount(account);
    }

    /**
     * This method checks data for Delete.
     * @param account Account Instance.
     * @return true if success and deleted.
     */
    @Override
    public boolean deleteAccount(Account account) {
        // id checker
        this.setDone(account.getId() > 0);
        if (!this.isDone()) return this.isDone();
        // if came here, success with checker
        return getDAO().deleteAccount(account);
    }

    /**
     * This method checks data for Find a Account
     * @param account Account Instance.
     * @return not null object if success.
     */
    @Override
    public List<Account> findAccount(Account account) {
        if (StringUtil.isNullOrEmpty(account.getUserAcc()) || 
                StringUtil.isNullOrEmpty(account.getEmailAcc())) {
            return null;
        }
        if (StringUtil.isNullOrEmpty(account.getPassAcc())) {return null;}
        // encrypt
        account = this.enterInfoEncrypt(account);
        // if came here, success
        return getDAO().findAccount(account);
    }
    
    /**
     * It is not null or empty.
     * @param account Account Instance.
     * @return true if success.
     */
    private boolean isNotNullOrEmpty(Account account) {
        this.setDone(StringUtil.isNullOrEmpty(account.getNameAcc()));
        if (this.isDone()) return !this.isDone();
        this.setDone(StringUtil.isNullOrEmpty(account.getGenderAcc()));
        if (this.isDone()) return !this.isDone();
        this.setDone(StringUtil.isNullOrEmpty(account.getUserAcc()));
        if (this.isDone()) return !this.isDone();
        this.setDone(StringUtil.isNullOrEmpty(account.getEmailAcc()));
        if (this.isDone()) return !this.isDone();
        this.setDone(StringUtil.isNullOrEmpty(account.getPassAcc()));
        if (this.isDone()) return !this.isDone();
        this.setDone(StringUtil.isNullOrEmpty(account.getMobileAcc()));
        if (this.isDone()) return !this.isDone();
        // if came here, all wright
        this.setDone(true);
        return this.isDone();
    }
    
    /**
     * This method checker.
     * @param account Account Instance.
     * @return true if success.
     */
    private boolean isValideDate(Account account) {
        // date checker
        this.setDone(SingDateUtil.getInstance().isDateValid(account.getDate()));
        if (!this.isDone()) return this.isDone();
        // if came here, success with checker
        this.setDone(true);
        return this.isDone();
    }
    
    /**
     * This method can checker information like user, pass, email.
     * @param account Account instance.
     * @return true if success.
     */
    private boolean enterInfoCheck(Account account) {
        // check user name
        this.setDone(SingUserUtil.getInstance().isValidUsername(account.getUserAcc()));
        if (!this.isDone()) return this.isDone();
        // check email
        this.setDone(SingEmailUtil.getInstance().isEmailValid(account.getEmailAcc()));
        if (!this.isDone()) return this.isDone();
        // check password
        this.setDone(SingPassUtil.getInstance().isValidPassword(account.getPassAcc()));
        if (!this.isDone()) return this.isDone();
        // if came here, checks success
        this.setDone(true);
        return this.isDone();
    }
    
    // encrypt 
    
    /**
     * This method is for encrypt data.
     * @param account Account Instance.
     * @return Account instance.
     */
    private Account encryptNameGender(Account account) {
        // name
        account.setUserAcc(AES.encrypting(account.getNameAcc(), SingAESPass.getInstance().getAccountPass()));
        // gender
        account.setUserAcc(AES.encrypting(account.getGenderAcc(), SingAESPass.getInstance().getAccountPass()));
        return account;
    }
    
    /**
     * This method is for encrypt data.
     * @param account Account Instance.
     * @return Account instance.
     */
    private Account enterInfoEncrypt(Account account) {
        // user
        account.setUserAcc(AES.encrypting(account.getUserAcc(), SingAESPass.getInstance().getAccountPass()));
        // email
        account.setUserAcc(AES.encrypting(account.getEmailAcc(), SingAESPass.getInstance().getAccountPass()));
        // pass
        account.setUserAcc(AES.encrypting(account.getPassAcc(), SingAESPass.getInstance().getAccountPass()));
        return account;
    }
    
    /**
     * This method is for encrypt data.
     * @param account Account Instance.
     * @return Account instance.
     */
    private Account enterMobileEncrypt(Account account) {
        // mobile
        account.setUserAcc(AES.encrypting(account.getMobileAcc(), SingAESPass.getInstance().getAccountPass()));
        return account;
    }
    
    // encrypt
    
    /**
     * This method is for validate a phone number before sent information to database,
     * @param account Account instance.
     * @return true if success.
     */
    private boolean isMobileValid(Account account) {
        // mobile checks
        this.setDone(SingMobileUtil.getInstance().isValidMobile(account.getMobileAcc()));
        if (!this.isDone()) return this.isDone();
        // if came here, sucess
        this.setDone(true);
        return this.isDone();
    }

    // getters
    
    private static IDAOAccount getDAO() {
        return DAO;
    }
    
    // is and setters

    protected boolean isDone() {
        return done;
    }

    protected void setDone(boolean done) {
        this.done = done;
    }
    
}
