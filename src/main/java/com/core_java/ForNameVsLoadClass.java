package com.core_java;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/** Difference between Class.forName() vs ClassLoader.loadClass() -
 * Class.forName():
 * Loads and initializes the class.
 * Syntax: Class.forName("com.example.MyClass");
 * Static blocks and fields are executed immediately.
 * Use when you need the class fully ready to use, like in JDBC.
 *
 * ClassLoader.loadClass():
 * Loads the class only (no initialization).
 * Syntax: ClassLoader.loadClass("com.example.MyClass");
 * Class is initialized later, when it's first used.
 * Use when you want to delay the initialization for better control.
 */
public class ForNameVsLoadClass {

    public static void main(String[] args) {
        try {
            // Using Class.forName()
//            Class<?> cls = Class.forName("java.util.ArrayList");
//            System.out.println(cls);
//            Method[] methods = cls.getDeclaredMethods();
//            System.out.println(Arrays.toString(methods));

            // Using ClassLoader.loadClass()
            Class<?> cls = ClassLoader.getSystemClassLoader().loadClass("java.util.HashMap");
            Field[] fields = cls.getDeclaredFields();
            System.out.println(Arrays.toString(fields));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------");
        ForNameVsLoadClass obj = new ForNameVsLoadClass();
        try {
            obj.printClassLoader();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
