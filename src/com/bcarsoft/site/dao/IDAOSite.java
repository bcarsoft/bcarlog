/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.site.dao;

import com.bcarsoft.site.model.Site;
import java.util.List;

/**
 * This is the Site DAO interface.
 * @author abelbcarvalho
 */
public interface IDAOSite {
    public abstract boolean saveSite(Site site);
    public abstract boolean updateSite(Site site);
    public abstract boolean deleteSite(Site site);
    public abstract List<Site> findAllSite(Site site);
    public abstract List<Site> findSpecificSite(List data, String sql);
}
