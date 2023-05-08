package com.example.demo.utils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AESUtil {
    public static SecretKey generateKey() throws NoSuchAlgorithmException{
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // 키 크기를 128비트로 설정
        SecretKey secretKey = keyGenerator.generateKey();
        return secretKey;
    }
    @PrePersist
    @PreUpdate
    public static String encrypt(String pw, SecretKey secretKey) throws Exception{
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] iv = new byte[cipher.getBlockSize()];
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.ENCRYPT_MODE,secretKey,ivParameterSpec);
        byte[] encryptedBytes = cipher.doFinal(pw.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
    @PostLoad
    public static String decrypt(String encryptedPw, SecretKey secretKey) throws Exception{
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] iv = new byte[cipher.getBlockSize()];
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE,secretKey,ivParameterSpec);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedPw);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes,StandardCharsets.UTF_8);



    }
}
