package com.itmo.arrays;

/**
 * Created by xmitya on 17.03.17.
 */
public class EncryptExample {
    public static void main(String[] args) {
        String text = "hello!";
        byte key = 42;

        byte[] bytes = text.getBytes();

        crypt(bytes, key);

        System.out.println(new String(bytes)); // Шифрованный текст

        crypt(bytes, key);

        System.out.println(new String(bytes)); // hello!
    }

    static void crypt(byte[] bytes, byte key) {
        // TODO implement
    }

    static void crypt(byte[] bytes, byte[] key) {
        // TODO implement
    }
}
