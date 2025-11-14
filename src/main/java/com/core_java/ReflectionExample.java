package com.core_java;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Reflection with Class.forName() lets java program look into a class's structure
 * while the code is running. That includes methods, fields, constructors, etc.
 */
public class ReflectionExample {

    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.util.ArrayList");
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("Methods of " + cls + ":");
            System.out.println(Arrays.toString(methods));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
