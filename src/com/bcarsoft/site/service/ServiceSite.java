/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.site.service;

import com.bcarsoft.site.dao.IDAOSite;
import com.bcarsoft.site.model.Site;
import java.util.List;

/**
 * This is the Service Site Class.
 * @author abelbcarvalho
 */
public class ServiceSite implements IServiceSite {
    private final static IDAOSite DAO;
    
    static {DAO = new com.bcarsoft.site.dao.DAOSite();}

    @Override
    public boolean saveSite(Site site) {
        return getDAO().saveSite(site);
    }

    @Override
    public boolean updateSite(Site site) {
        return getDAO().updateSite(site);
    }

    @Override
    public boolean deleteSite(Site site) {
        return getDAO().deleteSite(site);
    }

    @Override
    public List<Site> findAllSite(Site site) {
        return getDAO().findAllSite(site);
    }

    @Override
    public List<Site> findSpecificSite(List data, String sql) {
        return getDAO().findSpecificSite(data, sql);
    }

    // getters
    
    public static IDAOSite getDAO() {
        return DAO;
    }
    
}
