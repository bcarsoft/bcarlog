/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.account.dao;

import com.bcarsoft.account.model.Account;
import java.util.List;

/**
 * This is the Interface for DAOAccount.
 * @author abelbcarvalho
 */
public interface IDAOAccount {
    public abstract boolean saveAccount(Account account);
    public abstract boolean updateAccount(Account account);
    public abstract boolean updatePasswordAccount(Account account);
    public abstract boolean deleteAccount(Account account);
    public abstract List<Account> findAccount(Account account);
}
