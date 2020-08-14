/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.mask;

import com.bcarsoft.struct.utilities.StringUtil;

/**
 * Mask to Date.
 * @author abelbcarvalho
 */
public final class DateMask {
    
    /**
     * This method returns the CPF valid.
     * @param date String
     * @return String
     */
    public static String returnDate(String date) {
        if (StringUtil.isStringThisLen(date, 2) ||
                StringUtil.isStringThisLen(date, 5)) {
            date+="/";
        }
        if (StringUtil.isStringGreaterThan(date, 10)) {
            date = StringUtil.cutString(date, 0, 10);
        }
        try {
            for (short i = 0; i < StringUtil.strLen(date); i += 1) {
                if (!StringUtil.isNumeric(date.charAt(i))) {
                    if (!(i == 2) && !(i == 5)) {
                        date = StringUtil.cutString(date, 0, i);
                    }
                }
            }
            return date;
        } catch (StringIndexOutOfBoundsException e) {return "";}
    }
    
}
