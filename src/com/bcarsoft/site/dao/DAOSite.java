/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.site.dao;

import com.bcarsoft.site.model.Site;
import com.bcarsoft.struct.dao.DAOBase;
import com.bcarsoft.struct.sql.ConFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is the DAO layer for Site Model Class.
 * @author abelbcarvalho
 */
public class DAOSite extends DAOBase implements IDAOSite {
    private String sql;
    
    /**
     * New instance of DAO Site class.
     */
    public DAOSite() {
        super();
        this.sql = "";
    }

    /**
     * Save Site.
     * @param site Site Instance.
     * @return true if success.
     */
    @Override
    public boolean saveSite(Site site) {
        // sql query
        this.setSql(
            "INSERT INTO tbSite (nameSite,urlSite,idAcc) VALUES (?,?,?)"
        );
        // insert data into a List
        this.insertFromObjectInsideList(site);
        this.getData().add(site.getFk());
        return this.save(this.getSql());
    }

    /**
     * Update Site.
     * @param site Site Instance.
     * @return true if success.
     */
    @Override
    public boolean updateSite(Site site) {
        // sql query
        this.setSql(
            "UPDATE tbSite SET nameSite=?,urlSite=? WHERE idSite=? AND idAcc=?"
        );
        // insert data into a List
        this.insertFromObjectInsideList(site);
        this.getData().add(site.getId());
        this.getData().add(site.getFk());
        return this.save(this.getSql());
    }

    /**
     * Delete Site.
     * @param site Site Instance.
     * @return true if success.
     */
    @Override
    public boolean deleteSite(Site site) {
        this.setSql("DELETE FROM tbSite WHERE idSite=?");
        return this.delete(site.getId(), this.getSql());
    }
    
    /**
     * Delete all sites by the foreign key.
     * @param site Site instance.
     * @return true if success.
     */
    @Override
    public boolean deleteAllSite(Site site) {
        this.setSql("DELETE FROM tbSite WHERE idAcc=?");
        return this.delete(site.getFk(), this.getSql());
    }

    /**
     * Find All Site.
     * @param site Site Instance.
     * @return not null if success.
     */
    @Override
    public List<Site> findAllSite(Site site) {
        // set data and sql query
        this.setData(new ArrayList<>());
        this.getData().clear();
        this.getData().add(site.getFk());
        this.setSql("SELECT * FROM tbSite WHERE idAcc=?");
        // new Login list
        List<Site> sitL = new ArrayList<>();
        // try catch
        try {
            this.setResult(this.findAll(this.getSql()));
            while (this.getResult().next()) {
                Site st = new Site();
                st.setId(this.getResult().getInt("idSite"));
                st.setNameSite(this.getResult().getString("nameSite"));
                st.setUrlSite(this.getResult().getString("urlSite"));
                st.setFk(this.getResult().getInt("idAcc"));
                sitL.add(st);
            }
            return sitL;
        } catch (SQLException e) {
            return null;
        } finally {
            ConFactory.closeConnection(this.getCon(), this.getStmt(), this.getResult());
        }
    }

    /**
     * Find Specific Site.
     * @param data List.
     * @param sql String.
     * @return not null if success.
     */
    @Override
    public List<Site> findSpecificSite(List data, String sql) {
        // seting data
        this.setData(data);
        this.setSql(sql);
        // new Login list
        List<Site> sitL = new ArrayList<>();
        // try catch
        try {
            this.setResult(this.findAll(this.getSql()));
            while (this.getResult().next()) {
                Site st = new Site();
                st.setId(this.getResult().getInt("idSite"));
                st.setNameSite(this.getResult().getString("nameSite"));
                st.setUrlSite(this.getResult().getString("urlSite"));
                st.setFk(this.getResult().getInt("idAcc"));
                sitL.add(st);
            }
            return sitL;
        } catch (SQLException e) {
            return null;
        } finally {
            ConFactory.closeConnection(this.getCon(), this.getStmt(), this.getResult());
        }
    }
    
    /**
     * This method take the object parameters and insert into a list
     * @param login Login instance
     */
    private void insertFromObjectInsideList(Site site) {
        if (site == null) {return;}
        this.setData(new ArrayList<>());
        this.getData().clear();
        this.getData().add(site.getNameSite());
        this.getData().add(site.getUrlSite());
    }
    
    // getters and setters

    protected String getSql() {
        return sql;
    }

    protected void setSql(String sql) {
        this.sql = sql;
    }
    
}
