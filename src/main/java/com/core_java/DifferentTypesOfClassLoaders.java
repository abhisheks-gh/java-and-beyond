package com.core_java;

import java.util.ArrayList;

/**
 * Types -
 * 1) Bootstrap ClassLoader: Loads the core java libraries (e.g., rt.jar) // rt stands for runtime & contains all the
 * standard java API classes.
 * 2) Extension ClassLoader: Loads the classes from the ext directory.
 * 3) System/Application ClassLoader: Loads classes from classpath.
 * 4) Custom ClassLoader: User defined class loaders.
 */
public class DifferentTypesOfClassLoaders {

    public static void main(String[] args) {
        DifferentTypesOfClassLoaders obj = new DifferentTypesOfClassLoaders();
        try {
            obj.printClassLoader();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printClassLoader() throws ClassNotFoundException {
        System.out.println("Platform ClassLoader:" +
                ClassLoader.getPlatformClassLoader());
        System.out.println("System ClassLoader:" +
                ClassLoader.getSystemClassLoader());
        System.out.println("ClassLoader of this class:" +
                ForNameVsLoadClass.class.getClassLoader());
        System.out.println("ClassLoader of ArrayList:" +
                ArrayList.class.getClassLoader());
    }
}
