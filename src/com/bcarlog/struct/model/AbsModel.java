/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarlog.struct.model;

/**
 * This is the project abstract model class, it is abstract and other model's class
 * use it.
 * @author abelbcarvalho
 */
public abstract class AbsModel {
    private int id;
    private int fk;

    /**
     * Builder Method.
     */
    public AbsModel() {
        this.id = 0;
        this.fk = 0;
    }
    
    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk() {
        return fk;
    }

    public void setFk(int fk) {
        this.fk = fk;
    }
    
}
