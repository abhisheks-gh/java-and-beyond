package com.core_java;

// A utility class for example demonstration in com.core_java.LoadingByTwoClassLoader.java
public class ClassLoaderEgUtility {

    public static void main(String[] args) {
        System.out.println("main method...");
    }

    public void greet() {
        System.out.println("Hello from " + this.getClass().getClassLoader());
    }
}
