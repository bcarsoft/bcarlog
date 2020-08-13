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

    @Override
    public boolean saveAccount(Account account) {
        return getDAO().saveAccount(account);
    }

    @Override
    public boolean updateAccount(Account account) {
        return getDAO().updateAccount(account);
    }

    @Override
    public boolean updatePasswordAccount(Account account) {
        return getDAO().updatePasswordAccount(account);
    }

    @Override
    public boolean deleteAccount(Account account) {
        return getDAO().deleteAccount(account);
    }

    @Override
    public List<Account> findAccount(Account account) {
        return getDAO().findAccount(account);
    }

    // getters
    
    public static IDAOAccount getDAO() {
        return DAO;
    }
    
}
