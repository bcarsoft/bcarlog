/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.login.dao;

import com.bcarsoft.login.model.Login;
import com.bcarsoft.struct.dao.DAOBase;
import java.util.List;

/**
 * This class is the DAO layer for Login Model Class.
 * @author abelbcarvalho
 */
public class DAOLogin extends DAOBase implements IDAOLogin {

    /**
     * New Instance of DAO Login Class.
     */
    public DAOLogin() {
        super();
    }

    @Override
    public boolean saveLogin(Login login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateLogin(Login login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteLogin(Login login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Login> findAllLogin(Login login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Login> findSpecificLogin(List data, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
