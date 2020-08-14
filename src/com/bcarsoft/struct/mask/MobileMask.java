/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.mask;

import com.bcarsoft.struct.utilities.StringUtil;

/**
 * Mask To Mobile
 * @author abelbcarvalho
 */
public final class MobileMask {
    
    /**
     * This method returns the mobile number valid.
     * @param mobile String.
     * @return String,
     */
    public static String returnMobile(String mobile) {
        if (StringUtil.isStringGreaterThan(mobile, 17))
        {return StringUtil.cutString(mobile, 0, 17);}
        if (StringUtil.isStringThisLen(mobile, 1)) {
            mobile = "+"+mobile;
        }
        else if (StringUtil.isStringThisLen(mobile, 3) ||
                StringUtil.isStringThisLen(mobile, 6)) {
            mobile += " ";
        }
        else if (StringUtil.isStringThisLen(mobile, 12)) {
            mobile += "-";
        }
        try {
            for (short i = 0; i < StringUtil.strLen(mobile); i += 1) {
                if (!StringUtil.isNumeric(mobile.charAt(i))) {
                    if (!(i == 0) && !(i == 3) && !(i == 6) && !(i == 12)) {
                        mobile = StringUtil.cutString(mobile, 0, i);
                    }
                }
            }
            return mobile;
        } catch (StringIndexOutOfBoundsException e) {
            return "";
        }
    }
    
}
