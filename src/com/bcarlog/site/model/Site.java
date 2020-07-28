/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarlog.site.model;

import com.bcarlog.struct.model.AbsModel;

/**
 * This is the model for Site table inside database.
 * @author abelbcarvalho
 */
public class Site extends AbsModel {
    private String nameSite;
    private String urlSite;

    /**
     * Create a new Site Instance.
     */
    public Site() {
        super();
        this.nameSite = "";
        this.urlSite = this.nameSite;
    }

    // getters and setters
    
    public String getNameSite() {
        return nameSite;
    }

    public void setNameSite(String nameSite) {
        this.nameSite = nameSite;
    }

    public String getUrlSite() {
        return urlSite;
    }

    public void setUrlSite(String urlSite) {
        this.urlSite = urlSite;
    }
    
}
