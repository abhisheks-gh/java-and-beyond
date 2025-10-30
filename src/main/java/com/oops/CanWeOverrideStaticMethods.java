package com.oops;

/**
 * No, we cannot override static methods in Java. Static methods belong to the class
 * rather than an instance of the class.
 * If we define a static method with the same name and parameters in subclass, it will hide
 * the superclass's static method, not override it.
 */
public class CanWeOverrideStaticMethods {
    public static void main() {
        SuperClass1 ref = new SubClass1();
        ref.doSomething(); // This will call SuperClass's doSomething() method
        SubClass1.doSomething(); // This will call SubClass's doSomething() method
    }
}

class SuperClass1 {
    static void doSomething() {
        System.out.println("super...");
    }
}

class SubClass1 extends SuperClass1 {
    static void doSomething() {
        System.out.println("sub...");
    }
}
