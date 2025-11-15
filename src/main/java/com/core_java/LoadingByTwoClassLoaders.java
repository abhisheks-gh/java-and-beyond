package com.core_java;

import java.net.URL;
import java.net.URLClassLoader;

// shows how to load a class using multiple ClassLoaders
public class LoadingByTwoClassLoaders {

    public static void main(String[] args) throws Exception {
        URL classDir1 = new URL("file:///C:/Users/abhis/IdeaProjects/java-and-beyond/target/classes/");
        URL classDir2 = new URL("file:///C:/Users/abhis/IdeaProjects/java-and-beyond/target/classes/");

        // two independent class loader
        URLClassLoader loader1 = new URLClassLoader(new URL[]{classDir1}, null);
        URLClassLoader loader2 = new URLClassLoader(new URL[]{classDir2}, null);

        // load the same class using each loader
        Class<?> classFromLoader1 = loader1.loadClass("com.core_java.ClassLoaderEgUtility");
        Class<?> classFromLoader2 = loader2.loadClass("com.core_java.ClassLoaderEgUtility");

        // Are the two classes the same?
        System.out.println("Same class objects? " + (classFromLoader1 == classFromLoader2));

        // Instantiate and call method
        Object obj1 = classFromLoader1.getDeclaredConstructor().newInstance();
        Object obj2 = classFromLoader2.getDeclaredConstructor().newInstance();

        classFromLoader1.getDeclaredMethod("greet").invoke(obj1);
        classFromLoader2.getDeclaredMethod("greet").invoke(obj2);
    }
}