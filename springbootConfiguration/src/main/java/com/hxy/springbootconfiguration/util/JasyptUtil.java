package com.hxy.springbootconfiguration.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor=new BasicTextEncryptor();
        encryptor.setPassword("1234");

        String username = encryptor.encrypt("root");
        String password= encryptor.encrypt("root");
        System.out.println(username+"\t"+password);
        String decrypt = encryptor.decrypt("5H47TU3fa1/mH/3sJNpEUQ==");
        System.out.println(decrypt);
//        5H47TU3fa1/mH/3sJNpEUQ==	ZVAY2APUp3+LbCE6crPkVw==
//        8WGPfvIn2Mau88gPBJ6U/A==	JXdKpQ61zgKUM9JUg/Ou6w==

    }
}
