package com.core_java;

import java.util.Arrays;

// why is char array preferred over strings for storing passwords
// char array is mutable, sensitive data can be erased & won't remain in memory like in String.
public class CharArrayOverStringsForPasswords {

    public static void main(String[] args) {
        String passwordString = "mySecurePassword";
        char[] password = {'m', 'y', 'S', 'e', 'c', 'u', 'r', 'e', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd'};

        System.out.println("Char array password before use: " + Arrays.toString(password));

        // after use, StringPassword will still be in memory, even if you refer it to new object
        passwordString = "newObject"; // the passwordString might also be stored vulnerably in String pool as well

        // but in case of char array, we can clear it after use like this
        Arrays.fill(password, '\0');
        System.out.println(password);
    }
}
