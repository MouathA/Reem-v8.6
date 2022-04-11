//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import javax.crypto.spec.*;
import java.io.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class efdghdfghdfghdfghfdghfdgh
{
    private static byte[] key;
    private static SecretKeySpec secretKey;
    
    public static void setKey(final String s) {
        try {
            efdghdfghdfghdfghfdghfdgh.key = s.getBytes("UTF-8");
            efdghdfghdfghdfghfdghfdgh.key = MessageDigest.getInstance("SHA-1").digest(efdghdfghdfghdfghfdghfdgh.key);
            efdghdfghdfghdfghfdghfdgh.key = Arrays.copyOf(efdghdfghdfghdfghfdghfdgh.key, 16);
            efdghdfghdfghdfghfdghfdgh.secretKey = new SecretKeySpec(efdghdfghdfghdfghfdghfdgh.key, "AES");
        }
        catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        catch (UnsupportedEncodingException ex2) {
            ex2.printStackTrace();
        }
    }
    
    public static String D(final String src, final String key) {
        try {
            setKey(key);
            final Cipher instance = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            instance.init(2, efdghdfghdfghdfghfdghfdgh.secretKey);
            return new String(instance.doFinal(Base64.getDecoder().decode(src)));
        }
        catch (Exception ex) {
            System.out.println("Error while decrypting: " + ex.toString());
            return null;
        }
    }
}
