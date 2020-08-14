/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.account.dao;

import com.bcarsoft.account.model.Account;
import com.bcarsoft.struct.dao.DAOBase;
import com.bcarsoft.struct.date.Date;
import com.bcarsoft.struct.sql.ConFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is the DAO layer for Account Model Class.
 * @author abelbcarvalho
 */
public class DAOAccount extends DAOBase implements IDAOAccount {
    private String sql;

    /**
     * New Instance of DAO Account.
     */
    public DAOAccount() {
        super();
        this.sql = "";
    }

    /**
     * Save Account.
     * @param account Account instance.
     * @return true if success.
     */
    @Override
    public boolean saveAccount(Account account) {
        // checks if username or email are existent
        if (this.thereAreUserOrEmail(account)) return false;
        // sql query
        this.setSql(
            "INSERT INTO tbAccount (nameAcc,genderAcc,monthAcc,dayAcc,yearAcc,"
            + "userAcc,emailAcc,passAcc,mobileAcc) VALUES (?,?,?,?,?,?,?,?,?)"
        );
        // insert data into a List
        this.insertFromObjectInsideList(account);
        return this.save(this.getSql());
    }

    /**
     * Update Account.
     * @param account Account instance.
     * @return true if success.
     */
    @Override
    public boolean updateAccount(Account account) {
        // checks if username or email are existent
        if (this.thereAreUserOrEmail(account)) return false;
        // sql query
        this.setSql(
            "UPDATE tbAccount SET nameAcc=?,genderAcc=?,monthAcc=?,dayAcc=?,yearAcc=?,"
            + "userAcc=?,emailAcc=?,passAcc=?,mobileAcc=? WHERE idAcc=?"
        );
        // insert data into a List
        this.insertFromObjectInsideList(account);
        this.getData().add(account.getId());
        // return statement
        return this.update(this.getSql());
    }

    /**
     * Update Password Account.
     * @param account Account instance.
     * @return true if success.
     */
    @Override
    public boolean updatePasswordAccount(Account account) {
        // checks if username or email are existent
        if (this.thereAreUserOrEmail(account)) return false;
        // sql query
        this.setSql(
            "UPDATE tbAccount SET passAcc=? WHERE (userAcc=? OR emailAcc=?) AND mobileAcc=?"
        );
        // insert data into a List
        this.setData(new ArrayList<>());
        this.getData().clear();
        this.getData().add(account.getPassAcc());
        this.getData().add(account.getUserAcc());
        this.getData().add(account.getEmailAcc());
        this.getData().add(account.getMobileAcc());
        // return statement
        return this.update(this.getSql());
    }

    /**
     * Delete Account.
     * @param account Account instance.
     * @return true if success.
     */
    @Override
    public boolean deleteAccount(Account account) {
        this.setSql("DELETE FROM tbAccount WHERE idAcc=?");
        return this.delete(account.getId(), this.getSql());
    }

    /**
     * Find an Account.
     * @param account Account instance.
     * @return not null if success.
     */
    @Override
    public List<Account> findAccount(Account account) {
        // set sql query
        this.setSql(
            "SELECT * FROM tbAccount WHERE (userAcc=? OR emailAcc=?) AND passAcc=?"
        );
        // account instance list
        List<Account> accL = new ArrayList<>();
        try {
            this.setResult(this.findAll(this.getSql()));
            while (this.getResult().next()) {
                Account acc = new Account();
                acc.setId(this.getResult().getInt("idAcc"));
                acc.setNameAcc(this.getResult().getString("nameAcc"));
                acc.setGenderAcc(this.getResult().getString("genderAcc"));
                acc.setDate(new Date());
                acc.getDate().setMonth(this.getResult().getInt("monthAcc"));
                acc.getDate().setDay(this.getResult().getInt("dayAcc"));
                acc.getDate().setYear(this.getResult().getInt("yearAcc"));
                acc.setUserAcc(this.getResult().getString("userAcc"));
                acc.setEmailAcc(this.getResult().getString("emailAcc"));
                acc.setPassAcc(this.getResult().getString("passAcc"));
                acc.setMobileAcc(this.getResult().getString("mobileAcc"));
                accL.add(acc);
            }
            return accL;
        } catch (SQLException e) {
            return null;
        } finally {
            ConFactory.closeConnection(this.getCon(), this.getStmt(), this.getResult());
        }
    }
    
    /**
     * This method checks if there is email or username registered.
     * @param account Account
     * @return true if success
     */
    private boolean thereAreUserOrEmail(Account account) {
        // sql initial
        this.setSql("SELECT idAcc FROM tbAccount WHERE userAcc=? OR emailAcc=?");
        // list of parameters
        this.setData(new ArrayList<>());
        this.getData().clear();
        this.getData().add(account.getUserAcc());
        this.getData().add(account.getEmailAcc());
        try {
            this.setResult(this.findAll(this.getSql()));
            this.getResult().next();
            account.setId(this.getResult().getInt("idAcc"));
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            ConFactory.closeConnection(this.getCon(), this.getStmt(), this.getResult());
        }
    }
    
    /**
     * This method take the object parameters and insert into a list
     * @param account Account instance
     */
    private void insertFromObjectInsideList(Account account) {
        if (account == null) {return;}
        this.setData(new ArrayList<>());
        this.getData().clear();
        this.getData().add(account.getNameAcc());
        this.getData().add(account.getGenderAcc());
        this.getData().add(account.getDate().getMonth());
        this.getData().add(account.getDate().getDay());
        this.getData().add(account.getDate().getYear());
        this.getData().add(account.getUserAcc());
        this.getData().add(account.getEmailAcc());
        this.getData().add(account.getPassAcc());
        this.getData().add(account.getMobileAcc());
    }

    // getters and setters

    private String getSql() {
        return sql;
    }
    
    private void setSql(String sql) {
        this.sql = sql;
    }
    
}
