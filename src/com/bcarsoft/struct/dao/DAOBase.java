/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.dao;

import com.bcarsoft.struct.sql.ConFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * DAOBase.
 * @author abelbcarvalho
 */
public class DAOBase implements IDAOBase {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet result;
    private List data;
    
    /**
     * Builder Method.
     */
    public DAOBase() {
        this.con = null;
        this.stmt = null;
        this.result = null;
        this.data = null;
    }

    /**
     * Inserts data inside database.
     * @param sql String
     * @return Boolean
     */
    @Override
    public boolean save(String sql) {
        // open connection and reset stament
        this.setCon(ConFactory.getConnection());
        this.setStmt(null);
        // try ... catch
        try {
            // sending sql command
            this.setStmt(this.getCon().prepareStatement(sql));
            this.setParamenter();
            this.getStmt().executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        } finally {
            // closing connection
            ConFactory.closeConnection(this.getCon(), this.getStmt());
        }
    }

    /**
     * Updates data inside database.
     * @param sql String
     * @return Boolean
     */
    @Override
    public boolean update(String sql) {
        return this.save(sql); // economize code with it
    }

    /**
     * Delete data inside database.
     * @param sql String
     * @return Boolean
     */
    @Override
    public boolean delete(String sql) {
        return this.save(sql); // economize code with it
    }
    
    /**
     * Delete data inside database by the key.
     * @param thekey Integer that represents the key.
     * @param sql String, SQL query.
     * @return true if it be a success.
     */
    @Override
    public boolean delete(int thekey, String sql) {
        this.setCon(ConFactory.getConnection());
        this.setStmt(null);
        try {
            // prepare the command
            this.setStmt(this.getCon().prepareStatement(sql));
            // insert parameter
            this.getStmt().setInt(1,thekey);
            // update table
            this.getStmt().executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            ConFactory.closeConnection(this.getCon(), this.getStmt());
        }
    }

    /**
     * Returns all registers inside database.
     * @param sql String
     * @return List
     */
    @Override
    public ResultSet findAll(String sql) {
        // open connection and reset statement and result
        this.setCon(ConFactory.getConnection());
        this.setStmt(null);
        this.setResult(null);
        // try ... catch
        try {
            this.setStmt(this.getCon().prepareStatement(sql));
            this.setParamenter();
            this.setResult(this.getStmt().executeQuery());
            return this.getResult();
        } catch (SQLException ex) {
            return null;
        }
    }

    /**
     * Returns the register by ID.
     * @param sql String
     * @return List
     */
    @Override
    public ResultSet searchBy(String sql) {
        return this.findAll(sql);
    }

    /**
     * Get a Connection Instance.
     * @return Connection Instance
     */
    @Override
    public Connection getCon() {
        return this.con;
    }

    /**
     * Set a Connection Instance.
     * @param con Connection Instance
     */
    @Override
    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * Get a Prepared Statement Instance.
     * @return PreparedStatement Instance
     */
    @Override
    public PreparedStatement getStmt() {
        return this.stmt;
    }

    /**
     * Set a PreparedStatement Instance.
     * @param stmt PreparedStatement Instance
     */
    @Override
    public void setStmt(PreparedStatement stmt) {
        this.stmt = stmt;
    }

    /**
     * Get a ResultSet.
     * @return ResultSet Instance
     */
    @Override
    public ResultSet getResult() {
        return this.result;
    }

    /**
     * Set a ResultSet.
     * @param result ResultSet Instance
     */
    @Override
    public void setResult(ResultSet result) {
        this.result = result;
    }
    
    /**
     * Get the List of parameters.
     * @return List.
     */
    @Override
    public List getData() {
        return this.data;
    }
    
    /**
     * Set a New List of parameters.
     * @param data List.
     */
    @Override
    public void setData(List data) {
        this.data = data;
    }

    /**
     * This method discovery data type and makes insert commands
     * inside SQL to salve into database.
     */
    protected void setParamenter() {
        // nothing can be inserted
        if (this.getData() == null) return; // can't be null.
        for (int i = 0; i < getData().size(); i += 1) {
            if (getData().get(i) instanceof java.lang.String) {
                try {
                    this.getStmt().setString(i+1, (String) getData().get(i));
                } catch (SQLException ex) {
                    Logger.getLogger(DAOBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (getData().get(i) instanceof java.lang.Integer) {
                try {
                    this.getStmt().setInt(i+1, (int) getData().get(i));
                } catch (SQLException ex) {
                    Logger.getLogger(DAOBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (getData().get(i) instanceof java.lang.Long) {
                try {
                    this.getStmt().setLong(i+1, (long) getData().get(i));
                } catch (SQLException ex) {
                    Logger.getLogger(DAOBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (getData().get(i) instanceof java.lang.Float) {
                try {
                    this.getStmt().setFloat(i+1, (float) getData().get(i));
                } catch (SQLException ex) {
                    Logger.getLogger(DAOBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (getData().get(i) instanceof java.lang.Double) {
                try {
                    this.getStmt().setDouble(i+1, (double) getData().get(i));
                } catch (SQLException ex) {
                    Logger.getLogger(DAOBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (getData().get(i) instanceof java.lang.Boolean) {
                try {
                    this.getStmt().setBoolean(i+1, (boolean) getData().get(i));
                } catch (SQLException ex) {
                    Logger.getLogger(DAOBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (getData().get(i) instanceof java.util.Date) {
                try {
                    this.getStmt().setDate(i+1, (Date) getData().get(i));
                } catch (SQLException ex) {
                    Logger.getLogger(DAOBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (getData().get(i) instanceof java.math.BigDecimal) {
                try {
                    this.getStmt().setBigDecimal(i+1, (java.math.BigDecimal) getData().get(i));
                } catch (SQLException ex) {
                    Logger.getLogger(DAOBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
