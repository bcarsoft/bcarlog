/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.facade;

import java.util.List;
import com.bcarsoft.account.model.Account;
import com.bcarsoft.account.service.IServiceAccount;
import com.bcarsoft.login.model.Login;
import com.bcarsoft.login.service.IServiceLogin;
import com.bcarsoft.site.model.Site;
import com.bcarsoft.site.service.IServiceSite;

/**
 * This is the project Facade.
 * @author abelbcarvalho
 */
public class Facade implements IFacade {
    // Here you can see all need objects instances
    private final IServiceAccount serviceAccount = 
            new com.bcarsoft.account.service.ServiceAccount();
    private final IServiceLogin serviceLogin =
            new com.bcarsoft.login.service.ServiceLogin();
    private final IServiceSite serviceSite = 
            new com.bcarsoft.site.service.ServiceSite();
    // Bellow, all methods of this facade.
    
    // Account Part ------------------------------------------------------------

    /**
     * This method calls the Account service to Save and if it be okay, so it 
     * calls the DAO layer to work with database.
     * @param account Account Instance.
     * @return true if Account was created.
     */
    @Override
    public boolean saveAccount(Account account) {
        return this.serviceAccount.saveAccount(account);
    }

    /**
     * This method calls the Account service to Update and if it be okay, so it 
     * calls the DAO layer to work with database.
     * @param account Account Instance.
     * @return true if Account was updated.
     */
    @Override
    public boolean updateAccount(Account account) {
        return this.serviceAccount.updateAccount(account);
    }

    /**
     * This method calls the Account service to Update Password and if it be okay, 
     * so it calls the DAO layer to work with database.
     * @param account Account Instance.
     * @return true if Account Password was updated.
     */
    @Override
    public boolean updatePasswordAccount(Account account) {
        return this.serviceAccount.updatePasswordAccount(account);
    }

    /**
     * This method calls the Account service to Delete and if it be okay, so it 
     * calls the DAO layer to work with database.
     * @param account Account Instance.
     * @return true if Account was deleted.
     */
    @Override
    public boolean deleteAccount(Account account) {
        return this.serviceAccount.deleteAccount(account);
    }

    /**
     * This method is for find an Account from inside database.
     * @param account Account instance.
     * @return not null object if success.
     */
    @Override
    public List<Account> findAccount(Account account) {
        return this.serviceAccount.findAccount(account);
    }
    
    // Account Part ------------------------------------------------------------
    
    // Login Part --------------------------------------------------------------

    /**
     * This method calls the Login service to Save and if it be okay, so it 
     * calls the DAO layer to work with database.
     * @param login Login Instance.
     * @return true if Login was created.
     */
    @Override
    public boolean saveLogin(Login login) {
        return this.serviceLogin.saveLogin(login);
    }

    /**
     * This method calls the Login service to Update and if it be okay, so it 
     * calls the DAO layer to work with database.
     * @param login Login Instance.
     * @return true if Login was updated.
     */
    @Override
    public boolean updateLogin(Login login) {
        return this.serviceLogin.updateLogin(login);
    }

    /**
     * This method calls the Login service to Delete and if it be okay, so it 
     * calls the DAO layer to work with database.
     * @param login Login Instance.
     * @return true if Login was deleted.
     */
    @Override
    public boolean deleteLogin(Login login) {
       return this.serviceLogin.deleteLogin(login);
    }

    /**
     * This method is for find a Login from inside database.
     * @param login Account instance.
     * @return not null object if success.
     */
    @Override
    public List<Login> findAllLogin(Login login) {
        return this.serviceLogin.findAllLogin(login);
    }

    /**
     * Custom search. This method is for find a Login from inside database.
     * @param data List.
     * @param sql String.
     * @return not null object if success.
     */
    @Override
    public List<Login> findSpecificLogin(List data, String sql) {
        return this.serviceLogin.findSpecificLogin(data, sql);
    }
    
    // Login Part --------------------------------------------------------------
    
    // Site Part ---------------------------------------------------------------

    /**
     * This method calls the Site service to Save and if it be okay, so it 
     * calls the DAO layer to work with database.
     * @param site Site Instance.
     * @return true if Site was created.
     */
    @Override
    public boolean saveSite(Site site) {
        return this.serviceSite.saveSite(site);
    }

    /**
     * This method calls the Site service to Update and if it be okay, so it 
     * calls the DAO layer to work with database.
     * @param site Site Instance.
     * @return true if Site was updated.
     */
    @Override
    public boolean updateSite(Site site) {
        return this.serviceSite.updateSite(site);
    }

    /**
     * This method calls the Site service to Delete and if it be okay, so it 
     * calls the DAO layer to work with database.
     * @param site Site Instance.
     * @return true if Site was deleted.
     */
    @Override
    public boolean deleteSite(Site site) {
        return this.serviceSite.deleteSite(site);
    }

    /**
     * This method is for find a Site from inside database.
     * @param site Account instance.
     * @return not null object if success.
     */
    @Override
    public List<Site> findAllSite(Site site) {
        return this.serviceSite.findAllSite(site);
    }

    /**
     * Custom search. This method is for find a Site from inside database.
     * @param data List.
     * @param sql String.
     * @return not null object if success.
     */
    @Override
    public List<Site> findSpecificSite(List data, String sql) {
        return this.serviceSite.findSpecificSite(data, sql);
    }
    
    // Site Part ---------------------------------------------------------------
    
}
