package com.oops;

/**
 * Invoking static method on null object reference does not return a NullPointerException
 * as static members belongs to class.
 * In the same scenario, if an instance method was invoked - it would have resulted in
 * a NullPointerException.
 */
public class CallingStaticMethodOnNullObjectReference {
    static String str;

    public static String giveStr() {
        return str;
    }

    public static void main(String[] args) {
        System.out.println(giveStr());  // null
    }
}
