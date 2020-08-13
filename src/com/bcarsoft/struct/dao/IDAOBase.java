/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * DAOBase interface.
 * @author abelbcarvalho
 */
public interface IDAOBase {
    public abstract boolean save(String sql);
    public abstract boolean update(String sql);
    public abstract boolean delete(String sql);
    public abstract boolean delete(int thekey, String sql);
    public abstract ResultSet findAll(String sql);
    public abstract ResultSet searchBy(String sql);
    public abstract Connection getCon();
    public abstract void setCon(Connection con);
    public abstract PreparedStatement getStmt();
    public abstract void setStmt(PreparedStatement stmt);
    public abstract ResultSet getResult();
    public abstract void setResult(ResultSet result);
    public abstract List getData();
    public abstract void setData(List data);
}
