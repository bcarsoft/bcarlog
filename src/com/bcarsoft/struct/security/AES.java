/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcarsoft.struct.security;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 * This class can encrypt and decrypt dada.
 * @author abelbcarvalho
 */
public class AES extends AESBase {
    private static MessageDigest sha;
    private static Cipher cipher;

    /**
     * Generate a new instance from AES.
     */
    public AES() {
        super();
    }

    // getters e setters
    
    /**
     * This method returns a MessegeDigest attributes - to create a password to encrypt/decrypt.
     * @return A MessageDigest object.
     */
    private static MessageDigest getSHA() {
        return sha;
    }
    
    /**
     * This method inserts an instance of MessegeDigest.
     * @param sh A MessageDigest Object.
     */
    private static void setSHA(MessageDigest sh) {
        sha = sh;
    }
    
    /**
     * This method just returns a Cipher object.
     * @return An object of Cipher class.
     */
    private static Cipher getCipher() {
        return cipher;
    }
    /**
     * This method insert a new instance to class Cipher.
     * @param cip A Cipher object
     */
    private static void setCipher(Cipher cip) {
        cipher = cip;
    }
    
    // final dos getters e setters

    /**
     * Inserts the key to encrypt / decrypt into the static method in abstract class ABSBase.
     * @param chave A String parameter that represents the key.
     */
    public static void inserirChave(String chave) {
        setSHA(null);
        try {
            // inserting at bytes array.
            setKeySecret(chave.getBytes("UTF-8"));
            // instancing MessegeDigest
            setSHA(MessageDigest.getInstance("SHA-1"));
            // doing instance array with sha base
            setKeySecret(getSHA().digest(getKey()));
            // repeating the process
            setKeySecret(Arrays.copyOf(getKey(), 16));
            // instancing secret word and sending parameters
            setSecretWord(new javax.crypto.spec.SecretKeySpec(getKey(), "AES"));
        }
        catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
        }
    }

    /**
     * This method encrypt a string with the method AES.
     * @param wordEncrypt String to encrypt.
     * @param passw Password to encrypt
     * @return An Encrypted String or null;
     */
    public static String encrypting(String wordEncrypt, String passw) {
        try {
            // Inserting key
            inserirChave(passw);
            // Setting model
            setCipher(Cipher.getInstance("AES/ECB/PKCS5Padding"));
            // Recovering word
            getCipher().init(Cipher.ENCRYPT_MODE, getSecretWord());
            // Returning encrypted word
            return Base64.getEncoder().encodeToString(getCipher().doFinal(wordEncrypt.getBytes()));
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException |
                IllegalBlockSizeException | NoSuchPaddingException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return null;
    }

    /**
     * This method decrypt a password with AES method.
     * @param wordDecript A encrypted word.
     * @param passw Password to decrypt
     * @return An Decrypt String or null;
     */
    public static String decrypting(String wordDecript, String passw) {
        try {
            // Inserting word
            inserirChave(passw);
            // Setting model
            setCipher(Cipher.getInstance("AES/ECB/PKCS5Padding"));
            // Recovering word
            getCipher().init(Cipher.DECRYPT_MODE, getSecretWord());
            // Returning a decrypted string
            return new String(getCipher().doFinal(Base64.getDecoder().decode(wordDecript)));
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException |
                IllegalBlockSizeException | NoSuchPaddingException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return null;
    }

}
