/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.login.service;

import com.bcarsoft.login.dao.IDAOLogin;
import com.bcarsoft.login.model.Login;
import java.util.List;

/**
 * This is the service for Login model class.
 * @author abelbcarvalho
 */
public class ServiceLogin implements IServiceLogin {
    private final static IDAOLogin DAO;
    
    static {DAO = new com.bcarsoft.login.dao.DAOLogin();}

    /**
     * This method checks data for Save.
     * @param login Login Instance.
     * @return true if success and saved.
     */
    @Override
    public boolean saveLogin(Login login) {
        return getDAO().saveLogin(login);
    }

    /**
     * This method checks data for Update.
     * @param login Login Instance.
     * @return true if success and updated.
     */
    @Override
    public boolean updateLogin(Login login) {
        return getDAO().updateLogin(login);
    }

    /**
     * This method checks data for Delete.
     * @param login Login Instance.
     * @return true if success and deleted.
     */
    @Override
    public boolean deleteLogin(Login login) {
        return getDAO().deleteLogin(login);
    }

    /**
     * This method checks data for Find All Logins.
     * @param login Login Instance.
     * @return not null if success.
     */
    @Override
    public List<Login> findAllLogin(Login login) {
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
        return getDAO().findSpecificLogin(data, sql);
    }

    // getters
    
    public static IDAOLogin getDAO() {
        return DAO;
    }
    
}
