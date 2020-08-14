/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.security;

/**
 * This Class is the password of encrypt security.
 * @author abelbcarvalho
 */
public abstract class AESPass {
    private final String accountPass = "Pafjne(qja59a1f26)&asfshf#r9Iq3e7q4e";
    private final String loginPass   = "42E9qPafnje459af12el#rge&a89K273FWWF";
    private final String sitePass    = "12692afsjasofnionNARWJfndifueO#&rW15";
    
    // getters

    public String getAccountPass() {
        return accountPass;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public String getSitePass() {
        return sitePass;
    }
    
}
