/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.pass.service;

import com.bcarsoft.pass.model.Pass;

/**
 * Service Pass Interface.
 * @author abelbcarvalho
 */
public interface IServicePass {
    public abstract String generatePassword(Pass pass);
}
