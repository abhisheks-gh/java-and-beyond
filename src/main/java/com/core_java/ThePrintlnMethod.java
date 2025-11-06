package com.core_java;

/**
 * System.out.println() is used to print messages to the console.
 * This method outputs a message followed by a new line character.
 * System is a final class.
 * out is a static and final field of type PrintStream in System class.
 * println() is a method of PrintStream.
 */
public class ThePrintlnMethod {

    // System.out is thread safe because PrintStream, the class that System.out
    // belongs to, synchronizes all its methods internally. Therefore, even in a
    // multithreaded environment, concurrent access to System.out.println is safe and
    // won't result in interleaved or corrupted output.
    public static void main(String[] args) {
        System.out.println();
    }
}
