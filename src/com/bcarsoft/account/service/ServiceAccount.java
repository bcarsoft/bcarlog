/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.account.service;

import com.bcarsoft.account.dao.IDAOAccount;
import com.bcarsoft.account.model.Account;
import java.util.List;

/**
 * This is the service class for Account Model Class.
 * @author abelbcarvalho
 */
public class ServiceAccount implements IServiceAccount {
    private final static IDAOAccount DAO;
    
    static {DAO = new com.bcarsoft.account.dao.DAOAccount();}

    /**
     * This method checks data for Save.
     * @param account Account Instance.
     * @return true if success and saved.
     */
    @Override
    public boolean saveAccount(Account account) {
        return getDAO().saveAccount(account);
    }

    /**
     * This method checks data for Update.
     * @param account Account Instance.
     * @return true if success and updated.
     */
    @Override
    public boolean updateAccount(Account account) {
        return getDAO().updateAccount(account);
    }

    /**
     * This method checks data for Update Password
     * @param account Account Instance.
     * @return true if success and password updated.
     */
    @Override
    public boolean updatePasswordAccount(Account account) {
        return getDAO().updatePasswordAccount(account);
    }

    /**
     * This method checks data for Delete.
     * @param account Account Instance.
     * @return true if success and deleted.
     */
    @Override
    public boolean deleteAccount(Account account) {
        return getDAO().deleteAccount(account);
    }

    /**
     * This method checks data for Find a Account
     * @param account Account Instance.
     * @return not null object if success.
     */
    @Override
    public List<Account> findAccount(Account account) {
        return getDAO().findAccount(account);
    }

    // getters
    
    public static IDAOAccount getDAO() {
        return DAO;
    }
    
}
