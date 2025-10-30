package com.oops;

/**
 * When you declare two static methods with same name and signature in both
 * superclass and subclass then they hide each other i.e. a call to the method in
 * the subclass will call the static method declared in that class and a call to the
 * same method is superclass is resolved to the static method declared in the
 * superclass.
 */
public class MethodHiding {
    public static void main() {
        SuperClass ref = new SubClass();
        ref.printSomething(); // This will call SuperClass's printSomething() method
        SubClass.printSomething(); // This will call SubClass's printSomething() method
    }
}

class SuperClass {
    static void printSomething() {
        System.out.println("SuperClass method");
    }
}

class SubClass extends SuperClass {
    static void printSomething() {
        System.out.println("SubClass method");
    }
}
