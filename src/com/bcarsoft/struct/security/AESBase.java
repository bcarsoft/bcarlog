/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.security;

import javax.crypto.spec.SecretKeySpec;

/**
 * Abstract class of AES encrypt and Decrypt.
 * @author abelbcarvalho
 */
public abstract class AESBase {
    private static SecretKeySpec secretWord;
    private static byte[] keySecret;
    
    /**
     * This method insert the secret word to encrypt or decrypt.
     * @param secret A SecretKeySpec attribute thar represents the keyword do decrypt.
     */
    protected static void setSecretWord(SecretKeySpec secret) {secretWord = secret; }
    
    /**
     * This method return the secret word to encrypt/decrypt.
     * @return An SecretKeySpec Object
     */
    protected static SecretKeySpec getSecretWord() {
        return secretWord;
    }
    
    /**
     * This method set a byte array.
     * @param key a vector of byte.
     */
    protected static void setKeySecret(byte[] key) {
        keySecret = key;
    }
    
    /**
     * This method get/return a byte array.
     * @return A byte[] array.
     */
    protected static byte[] getKey() {
        return keySecret;
    }

}
