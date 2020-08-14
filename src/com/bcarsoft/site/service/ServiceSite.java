/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.site.service;

import com.bcarsoft.site.dao.IDAOSite;
import com.bcarsoft.site.model.Site;
import com.bcarsoft.struct.security.AES;
import com.bcarsoft.struct.singleton.SingAESPass;
import com.bcarsoft.struct.utilities.StringUtil;
import java.util.List;

/**
 * This is the Service Site Class.
 * @author abelbcarvalho
 */
public class ServiceSite implements IServiceSite {
    private final static IDAOSite DAO;
    
    static {DAO = new com.bcarsoft.site.dao.DAOSite();}

    /**
     * This method checks data for Save.
     * @param site Site Instance.
     * @return true if success and saved.
     */
    @Override
    public boolean saveSite(Site site) {
        // checks fk
        if (!(site.getFk() > 0)) return false;
        // checks data
        if (this.isNullOrEmptyString(site)) return false;
        // encrypt
        site = this.encryptSiteUrl(site);
        // if came here, success
        return getDAO().saveSite(site);
    }

    /**
     * This method checks data for Update.
     * @param site Site Instance.
     * @return true if success and updated.
     */
    @Override
    public boolean updateSite(Site site) {
        // checks id
        if (!(site.getId() > 0)) return false;
        // checks fk
        if (!(site.getFk() > 0)) return false;
        // checks data
        if (this.isNullOrEmptyString(site)) return false;
        // encrypt
        site = this.encryptSiteUrl(site);
        // if came here, success
        return getDAO().updateSite(site);
    }

    /**
     * This method checks data for Delete.
     * @param site Site Instance.
     * @return true if success and deleted.
     */
    @Override
    public boolean deleteSite(Site site) {
        if (!(site.getId() > 0)) return false;
        return getDAO().deleteSite(site);
    }
    
    /**
     * This method checks data for Delete All.
     * @param site Site Instance.
     * @return true if success and deleted.
     */
    @Override
    public boolean deleteAllSite(Site site) {
        if (!(site.getFk() > 0)) return false;
        return getDAO().deleteAllSite(site);
    }

    /**
     * This method checks data for Find All Sites.
     * @param site Site Instance.
     * @return not null if success.
     */
    @Override
    public List<Site> findAllSite(Site site) {
        if (site.getFk() < 1) return null;
        // if came here, checks success
        return this.decryptAll(getDAO().findAllSite(site));
    }

    /**
     * This method checks data for Find Specifics Sites.
     * @param data List.
     * @param sql String.
     * @return not null if success.
     */
    @Override
    public List<Site> findSpecificSite(List data, String sql) {
        // checks the data list and sql string command
        if (data == null || StringUtil.isNullOrEmpty(sql)) return null;
        // encrypt
        data = this.encryptStringsAtIt(data);
        // if came here, success with checks
        return this.decryptAll(getDAO().findSpecificSite(data, sql));
    }
    
    /**
     * This method checks if there's empty or null string.
     * @param site Site Instance.
     * @return true if success.
     */
    private boolean isNullOrEmptyString(Site site) {
        if (StringUtil.isNullOrEmpty(site.getNameSite())) return true;
        return StringUtil.isNullOrEmpty(site.getUrlSite());
    }
    
    // encrypt
    
    /**
     * This method is for encrypt data.
     * @param site Site instance.
     * @return Site instance.
     */
    private Site encryptSiteUrl(Site site) {
        // site
        site.setNameSite(AES.encrypting(site.getNameSite(), SingAESPass.getInstance().getSitePass()));
        // url
        site.setUrlSite(AES.encrypting(site.getUrlSite(), SingAESPass.getInstance().getSitePass()));
        return site;
    }
    
    // encrypt
    
    /**
     * This method takes all strings from a list and encrypt it.
     * @param data List.
     * @return not null if success.
     */
    private List encryptStringsAtIt(List data) {
        for (short i = 0; i < data.size(); i += 1) {
            if (data.get(i) instanceof java.lang.String) {
                data.set(i, AES.encrypting((String) data.get(i), SingAESPass.getInstance().getLoginPass()));
            }
        }
        return data;
    }
    
    // decrypt
    
    /**
     * This method is for decrypt all data of saved sites.
     * @param site Site Instance.
     * @return not null if success.
     */
    private List<Site> decryptAll(List<Site> site) {
        if (site == null) return null;
        // decrypt
        for (short i = 0; i < site.size(); i += 1) {
            // site
            site.get(i).setNameSite(AES.decrypting(site.get(i).getNameSite(), 
                    SingAESPass.getInstance().getSitePass()));
            // url
            site.get(i).setUrlSite(AES.decrypting(site.get(i).getUrlSite(), 
                    SingAESPass.getInstance().getSitePass()));
        }
        return site;
    }
    
    // decrypt

    // getters
    
    public static IDAOSite getDAO() {
        return DAO;
    }
    
}
