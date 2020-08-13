/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.facade;

import java.util.List;
import com.bcarsoft.account.model.Account;
import com.bcarsoft.login.model.Login;
import com.bcarsoft.site.model.Site;

/**
 * This is the interface for the Project Facade.
 * @author abelbcarvalho
 */
public interface IFacade {
    
    // Account Part ------------------------------------------------------------
    public abstract boolean saveAccount(Account account);
    public abstract boolean updateAccount(Account account);
    public abstract boolean updatePasswordAccount(Account account);
    public abstract boolean deleteAccount(Account account);
    public abstract List<Account> findAccount(Account account);
    // Account Part ------------------------------------------------------------
    
    // Login Part --------------------------------------------------------------
    public abstract boolean saveLogin(Login login);
    public abstract boolean updateLogin(Login login);
    public abstract boolean deleteLogin(Login login);
    public abstract List<Login> findAllLogin(Login login);
    public abstract List<Login> findSpecificLogin(List data, String sql);
    // Login Part --------------------------------------------------------------
    
    // Site Part ---------------------------------------------------------------
    public abstract boolean saveSite(Site site);
    public abstract boolean updateSite(Site site);
    public abstract boolean deleteSite(Site site);
    public abstract List<Site> findAllSite(Site site);
    public abstract List<Site> findSpecificSite(List data, String sql);
    // Site Part ---------------------------------------------------------------
    
}
