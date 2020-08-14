/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.singleton;

import com.bcarsoft.struct.security.AESPass;

/**
 * AESPass Model Class Singleton Pattern.
 * @author abelbcarvalho
 */
public class SingAESPass extends AESPass {
    
    /**
     * Represents the singleton instance of the class.
     */
    private static SingAESPass instance;

    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();
    
    /**
     * Create a new instance of this class.
     */
    public SingAESPass() {
        super();
    }
    
    /**
     * Return a new instance of AESPass if there's not.
     * @return 
     */
    public static SingAESPass getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new SingAESPass();
            }
        }
        return instance;
    }
    
}
