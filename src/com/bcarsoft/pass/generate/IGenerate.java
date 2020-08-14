/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.pass.generate;

import com.bcarsoft.pass.model.Pass;

/**
 * Generate interface.
 * @author abelbcarvalho
 */
public interface IGenerate {
    public abstract void gerenciandoPassInfo(Pass pass);
    public abstract String getPasswordGenerate();
}
