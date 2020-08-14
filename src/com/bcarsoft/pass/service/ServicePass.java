/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.pass.service;

import com.bcarsoft.pass.generate.IGenerate;
import com.bcarsoft.pass.model.Pass;

/**
 * Service Pass Class.
 * @author abelbcarvalho
 */
public class ServicePass implements IServicePass{
    private String password;
    private final static IGenerate GEN;
    
    static {GEN = new com.bcarsoft.pass.generate.Generate();}

    /**
     * Builder.
     */
    public ServicePass() {
        this.password = "";
    }

    /** 
     * This method is for generate a new Password if it be fine.
     * @param pass Pass Object.
     * @return String doesn't empty if everything is good.
     */
    @Override
    public String generatePassword(Pass pass) {
        this.setPassword("");
        if (this.isInvalidSize(pass) || 
                !this.isOneNotFalse(pass)) return this.getPassword();
        getGEN().gerenciandoPassInfo(pass);
        this.setPassword(getGEN().getPasswordGenerate());
        return this.getPassword();
    }
    
    /**
     * Verify if the size of data is valid or not.
     * @param pass Pass Object.
     * @return true if the size is invalid.
     */
    private boolean isInvalidSize(Pass pass) {
        return pass.getSize() < 1;
    }
    
    /**
     * This method is for verify if the options sent by user,
     * are valid to generate a new password.
     * @param pass Pass Object.
     * @return true if it was found as true.
     */
    private boolean isOneNotFalse(Pass pass) {
        if (pass.isLowcase()) return true;
        else if (pass.isUpcase()) return true;
        else if (pass.isNumber()) return true;
        else if (pass.isSymbol()) return true;
        return false; // in case of everything be false.
    }
    
    // getters and setters

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static IGenerate getGEN() {
        return GEN;
    }
    
}
