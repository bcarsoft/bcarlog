/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.singleton;

import com.bcarsoft.struct.facade.Facade;

/**
 * Facade Singleton Pattern.
 * @author abelbcarvalho
 */
public class SingFacade extends Facade {
    
    /**
     * Represents the singleton instance of the class.
     */
    private static SingFacade instance;

    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();
    
    /**
     * Create a new instance of this class.
     */
    public SingFacade() {
        super();
    }
    
    /**
     * Return a new instance of Facade if there's not.
     * @return Facade.
     */
    public static SingFacade getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new SingFacade();
            }
        }
        return instance;
    }
    
}
