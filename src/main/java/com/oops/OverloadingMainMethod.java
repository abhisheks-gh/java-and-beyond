package com.oops;

/**
 * We can overload the main method in Java. While you can overload
 * main, the JVM will only look for and execute the public static void
 * main(String[] args) method when starting the program. Other overloaded
 * versions can be called from within the program but won't serve as entry
 * points.
 */
public class OverloadingMainMethod {
    public static void main(String[] args) {
        System.out.println("Entry point: public static void main(String[] args) method");
        System.out.println(main(5, 6));
    }

    public static String main(int num1, int num2) {
        return "Overloaded main method, sum of two numbers " +
                num1 + " and " + num2 + " is " + Math.addExact(num1, num2);
    }
}
