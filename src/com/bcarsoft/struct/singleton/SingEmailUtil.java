/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.singleton;

import com.bcarsoft.struct.utilities.EmailUtil;

/**
 * Singleton Pattern to EmailUtil.
 * @author abelbcarvalho
 */
public class SingEmailUtil extends EmailUtil {
    
     /**
     * Represents the singleton instance of the class.
     */
    private static SingEmailUtil instance;

    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();
    
    /**
     * Create a new instance of this class.
     */
    public SingEmailUtil() {
        super();
    }
    
    /**
     * Return a new instance of EmailUtil if there's not.
     * @return 
     */
    public static SingEmailUtil getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new SingEmailUtil();
            }
        }
        return instance;
    }
    
}
