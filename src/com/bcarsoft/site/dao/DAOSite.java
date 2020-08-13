/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.site.dao;

import com.bcarsoft.site.model.Site;
import com.bcarsoft.struct.dao.DAOBase;
import java.util.List;

/**
 * This class is the DAO layer for Site Model Class.
 * @author abelbcarvalho
 */
public class DAOSite extends DAOBase implements IDAOSite {
    
    /**
     * New instance of DAO Site class.
     */
    public DAOSite() {
        super();
    }

    /**
     * Save Site.
     * @param site Site Instance.
     * @return true if success.
     */
    @Override
    public boolean saveSite(Site site) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Update Site.
     * @param site Site Instance.
     * @return true if success.
     */
    @Override
    public boolean updateSite(Site site) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Delete Site.
     * @param site Site Instance.
     * @return true if success.
     */
    @Override
    public boolean deleteSite(Site site) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Find All Site.
     * @param site Site Instance.
     * @return not null if success.
     */
    @Override
    public List<Site> findAllSite(Site site) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Find Specific Site.
     * @param data List.
     * @param sql String.
     * @return not null if success.
     */
    @Override
    public List<Site> findSpecificSite(List data, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
