/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.login.dao;

import com.bcarsoft.login.model.Login;
import com.bcarsoft.struct.dao.DAOBase;
import com.bcarsoft.struct.sql.ConFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is the DAO layer for Login Model Class.
 * @author abelbcarvalho
 */
public class DAOLogin extends DAOBase implements IDAOLogin {
    private String sql;

    /**
     * New Instance of DAO Login Class.
     */
    public DAOLogin() {
        super();
        this.sql = "";
    }

    /**
     * Save Login.
     * @param login Login Instance.
     * @return true if success.
     */
    @Override
    public boolean saveLogin(Login login) {
        // checks if username or email are existent
        if (this.thereAreUserOrEmailWithLogin(login)) return false;
        // sql query
        this.setSql(
            "INSERT INTO tbLogin (siteLogin,urlSiteLogin,userLogin,emailLogin,"
                    + "passLogin,idAcc) VALUES (?,?,?,?,?,?)"
        );
        // insert data into a List
        this.insertFromObjectInsideList(login);
        this.getData().add(login.getFk());
        return this.save(this.getSql());
    }

    /**
     * Update Login.
     * @param login Login Instance.
     * @return true if success.
     */
    @Override
    public boolean updateLogin(Login login) {
        // checks if username or email are existent
        if (this.thereAreUserOrEmailWithLogin(login)) return false;
        // sql query
        this.setSql(
            "UPDATE tbLogin SET siteLogin=?,urlSiteLogin=?,userLogin=?,emailLogin=?,"
                    + "passLogin=? WHERE idLogin=? AND idAcc=?"
        );
        // insert data into a List
        this.insertFromObjectInsideList(login);
        this.getData().add(login.getId());
        this.getData().add(login.getFk());
        return this.update(this.getSql());
    }

    /**
     * Delete Login.
     * @param login Login Instance.
     * @return true if success.
     */
    @Override
    public boolean deleteLogin(Login login) {
        this.setSql("DELETE FROM tbLogin WHERE idLogin=?");
        return this.delete(login.getId(), this.getSql());
    }
    
    /**
     * Delete All Logins.
     * @param login Login Instance.
     * @return true if success.
     */
    @Override
    public boolean deleteAllLogin(Login login) {
        this.setSql("DELETE FROM tbLogin WHERE idAcc=?");
        return this.delete(login.getFk(), this.getSql());
    }

    /**
     * Find All Login.
     * @param login Login Instance.
     * @return not null if success.
     */
    @Override
    public List<Login> findAllLogin(Login login) {
        // setting data and sql query
        this.setData(new ArrayList<>());
        this.getData().clear();
        this.getData().add(login.getFk());
        this.setSql(
            "SELECT * FROM tbLogin WHERE idAcc=?"
        );
        // new Login list
        List<Login> logL = new ArrayList<>();
        // try catch
        try {
            this.setResult(this.findAll(this.getSql()));
            while (this.getResult().next()) {
                Login lg = new Login();
                lg.setId(this.getResult().getInt("idLogin"));
                lg.setSiteLogin(this.getResult().getString("siteLogin"));
                lg.setUrlSiteLogin(this.getResult().getString("urlSiteLogin"));
                lg.setUserLogin(this.getResult().getString("userLogin"));
                lg.setEmailLogin(this.getResult().getString("emailLogin"));
                lg.setPassLogin(this.getResult().getString("passLogin"));
                lg.setFk(this.getResult().getInt("idAcc"));
                logL.add(lg);
            }
            return logL;
        } catch (SQLException e) {
            return null;
        } finally {
            ConFactory.closeConnection(this.getCon(), this.getStmt(), this.getResult());
        }
    }

    /**
     * Save Login.
     * @param data List.
     * @param sql String.
     * @return not null if success.
     */
    @Override
    public List<Login> findSpecificLogin(List data, String sql) {
        // seting data
        this.setData(data);
        this.setSql(sql);
        // new Login list
        List<Login> logL = new ArrayList<>();
        // try catch
        try {
            this.setResult(this.findAll(this.getSql()));
            while (this.getResult().next()) {
                Login lg = new Login();
                lg.setId(this.getResult().getInt("idLogin"));
                lg.setSiteLogin(this.getResult().getString("siteLogin"));
                lg.setUrlSiteLogin(this.getResult().getString("urlSiteLogin"));
                lg.setUserLogin(this.getResult().getString("userLogin"));
                lg.setEmailLogin(this.getResult().getString("emailLogin"));
                lg.setPassLogin(this.getResult().getString("passLogin"));
                lg.setFk(this.getResult().getInt("idAcc"));
                logL.add(lg);
            }
            return logL;
        } catch (SQLException e) {
            return null;
        } finally {
            ConFactory.closeConnection(this.getCon(), this.getStmt(), this.getResult());
        }
    }
    
    /**
     * This method checks if there is email or username registered.
     * @param login Login instance
     * @return true if success
     */
    private boolean thereAreUserOrEmailWithLogin(Login login) {
        // sql initial
        this.setSql("SELECT idLogin FROM tbLogin WHERE (userAcc=? OR emailAcc=?) and siteLogin=?");
        // list of parameters
        this.setData(new ArrayList<>());
        this.getData().clear();
        this.getData().add(login.getUserLogin());
        this.getData().add(login.getEmailLogin());
        this.getData().add(login.getSiteLogin());
        try {
            this.setResult(this.findAll(this.getSql()));
            this.getResult().next();
            login.setId(this.getResult().getInt("idLogin"));
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            ConFactory.closeConnection(this.getCon(), this.getStmt(), this.getResult());
        }
    }
    
    /**
     * This method take the object parameters and insert into a list
     * @param login Login instance
     */
    private void insertFromObjectInsideList(Login login) {
        if (login == null) {return;}
        this.setData(new ArrayList<>());
        this.getData().clear();
        this.getData().add(login.getSiteLogin());
        this.getData().add(login.getUrlSiteLogin());
        this.getData().add(login.getUserLogin());
        this.getData().add(login.getEmailLogin());
        this.getData().add(login.getPassLogin());
    }
    
    // getters and setters

    protected String getSql() {
        return sql;
    }

    protected void setSql(String sql) {
        this.sql = sql;
    }
    
}
