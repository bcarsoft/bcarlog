/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.login.dao;

import com.bcarsoft.login.model.Login;
import java.util.List;

/**
 * This is the DAO Login Interface.
 * @author abelbcarvalho
 */
public interface IDAOLogin {
    public abstract boolean saveLogin(Login login);
    public abstract boolean updateLogin(Login login);
    public abstract boolean deleteLogin(Login login);
    public abstract boolean deleteAllLogin(Login login);
    public abstract List<Login> findAllLogin(Login login);
    public abstract List<Login> findSpecificLogin(List data, String sql);
}
