/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.mask;

import com.bcarsoft.struct.utilities.StringUtil;
import java.util.List;

/**
 * Mask to Password.
 * @author abelbcarvalho
 */
public class PassMask {
    
    /**
     * This method inserts a mask into a password field. get(0) is the txt, get(1) 
     * is the auxiliary.
     * @param pass String
     * @return List.
     */
    public static List<String> returnPass(List<String> pass) {
        if (!(pass.size() == 3)) return null;
        if (StringUtil.isNullOrEmpty(pass.get(0))) {
            pass.set(0, "");
            pass.set(1, "");
            pass.set(2, "");
            return pass;}
        if (StringUtil.isStringThisLen(pass.get(0), 1)) {
            pass.set(1, pass.get(0));}
        else {
            pass.set(1, pass.get(1)+StringUtil.lastStrChar(pass.get(0)));}
        if (StringUtil.isStringGreaterThan(pass.get(0), 15))
        {pass.set(0, StringUtil.cutString
            (pass.get(0), 0, StringUtil.strLen(pass.get(0))-1));}
        // equipare str
        equipareStr(pass);
        // new String
        String ps = "*";
        // insert all into position 3
        for (short i = 1; i < StringUtil.strLen(pass.get(0)); i += 1) ps += "*";
        pass.set(2, ps);
        return pass;
    }
    
    private static void equipareStr(List<String> pass) {
        if (StringUtil.strLen(pass.get(0)) < StringUtil.strLen(pass.get(1))) {
            pass.set(1, StringUtil.cutString(pass.get(1), 0, StringUtil.strLen(pass.get(0))));
        }
    }
    
}
