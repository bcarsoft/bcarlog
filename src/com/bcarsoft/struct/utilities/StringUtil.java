/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.utilities;

/**
 * String Checker Utility.
 * @author abelbcarvalho
 */
public final class StringUtil {
    
    /**
     * This method can return the last character of a String.
     * @param str String.
     * @return String that is the last character.
     */
    public static String lastStrChar(final String str) {
        try {
            return Character.toString(str.charAt(strLen(str)-1));
        } catch (StringIndexOutOfBoundsException e) {
            return "";
        }
    }
    
    /**
     * This method verifies if a specific String is greater.
     * @param word String
     * @param len Integer
     * @return true if it's.
     */
    public static boolean isStringGreaterThan(final String word, int len) {
        return strLen(word) > len;
    }
    
    /**
     * This method verifies if a specific String is smaller.
     * @param word String
     * @param len Integer
     * @return true if it's.
     */
    public static boolean isStringSmallerThan(final String word, int len) {
        return strLen(word) < len;
    }
    
    /**
     * This method returns the length of a String.
     * @param word String.
     * @return Integer equals to word.length().
     */
    public static int strLen(final String word) {
        return word.length();
    }
    
    /**
     * This method verifies if a String has up to this length sent.
     * @param word String - the word.
     * @param len Integer - the length sent.
     * @return true if word.length() is smaller or equals to len.
     */
    public static boolean isStringUtilLen(final String word, final int len) {
        return strLen(word) <= len;
    }
    
    /**
     * This method can calculate the string length.
     * @param word String.
     * @param len Integer.
     * @return true if string length is equals to len.
     */
    public static boolean isStringThisLen(final String word, final int len) {
        return strLen(word) == len;
    }
    
    /**
     * This method is for cut a String in a small string.
     * @param word String
     * @param init Integer
     * @param end Integer
     * @return A Original String or SubString.
     */
    public static String cutString(String word, int init, int end) {
        String newWord;
        try {
            newWord = word.substring(init, end);
            return newWord;
        } catch (StringIndexOutOfBoundsException e) {
            return word;
        }
    }
    
    /**
     * Verifies if String is empty.
     * @param word String
     * @return true if it is empty.
     */
    public static boolean isEmpty(final String word) {
        return word.length() == 0;
    }
    
    /**
     * Verifies if String is null.
     * @param word String
     * @return true if it is null.
     */
    public static boolean isNull(final String word) {
        return word == null;
    }
    
    /**
     * Verifies if String is empty or null.
     * @param word String
     * @return true if it is empty or null.
     */
    public static boolean isNullOrEmpty(final String word) {
        return word == null || word.length() == 0;
    }
    
    /**
     * Verifies if a character sent is an . point
     * @param letter Character
     * @return true if it be . point
     */
    public static boolean isPointFound(final char letter) {
        return letter == '.';
    }
    
    /**
     * Verifies if a character sent is an _.
     * @param letter Character
     * @return true if it be _
     */
    public static boolean isUnderscoreFound(final char letter) {
        return letter == '_';
    }
    
    /**
     * Verifies if a character sent is a ' '
     * @param letter Character
     * @return true if it be ' '
     */
    public static boolean isSpaceFound(final char letter) {
        return letter == ' ';
    }
    
    /**
     * Verifies if a character is a letter
     * @param letter Character
     * @return true if it is a letter.
     */
    public static boolean isLetter(final char letter) {
        return Character.isLetter(letter);
    }
    
    /**
     * Verifies if a character is numeric by ascii table.
     * @param letter Character
     * @return true if it is a number.
     */
    public static boolean isNumeric(final char letter) {
        return letter > 47 && letter < 58;
    }
    
    /**
     * Verifies if a character is numeric by ascii table.
     * NOTE: IT IS ONLY USE WITH COMBINATION WITH 
     * LAST CHAR METHOD AT THIS CLASS.
     * @param letter String
     * @return true if it is a number.
     */
    public static boolean isNumeric(final String letter) {
        char let = letter.charAt(0);
        return let > 47 && let < 58;
    }
    
    /**
     * Verifies if a character is a '-' hyphen
     * @param letter Character
     * @return true if it is '-' hyphen
     */
    public static boolean isHyphen(final char letter) {
        return letter == 45;
    }
    
    /**
     * This method verifies each character searching if something is different 
     * of a letter of alphabet. It is need to verifies personal names for example.
     * @param word String.
     * @return true if all characters is a letter.
     */
    public static boolean isNameValidLetters(final String word) {
        if (!StringUtil.isLetter(word.charAt(0))) return false;
        for (short i = 0; i < word.length(); i += 1) {
            if (!isLetter(word.charAt(i))) {
                if (isSpaceFound(word.charAt(i))) continue;
                if (isHyphen(word.charAt(i))) continue;
                return false;
            }
        }
        return true;
    }
    
    /**
     * This method verifies each character searching if something is different 
     * of a letter of alphabet. It is need to verifies personal names for example.
     * @param word String.
     * @return true if all characters is a letter.
     */
    public static boolean isNameValidLettersWithPoint(final String word) {
        if (!StringUtil.isLetter(word.charAt(0))) return false;
        for (short i = 0; i < word.length(); i += 1) {
            if (!isLetter(word.charAt(i))) {
                if (isSpaceFound(word.charAt(i))) continue;
                if (isHyphen(word.charAt(i))) continue;
                if (isPointFound(word.charAt(i))) continue;
                return false;
            }
        }
        return true;
    }
    
    /**
     * This method verifies each character searching if something is different 
     * of a letter of alphabet. It is need to verifies personal names for example.
     * @param word String.
     * @return true if all characters is a letter.
     */
    public static boolean isNameValidLettersWithPointNumber(final String word) {
        if (!StringUtil.isLetter(word.charAt(0))) return false;
        for (short i = 0; i < word.length(); i += 1) {
            if (!isLetter(word.charAt(i))) {
                if (isSpaceFound(word.charAt(i))) continue;
                if (isHyphen(word.charAt(i))) continue;
                if (isPointFound(word.charAt(i))) continue;
                if (isNumeric(word.charAt(i))) continue;
                return false;
            }
        }
        return true;
    }
    
}
