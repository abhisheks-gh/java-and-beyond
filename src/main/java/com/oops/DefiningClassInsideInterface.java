package com.oops;

public interface DefiningClassInsideInterface {

    // Implicitly public and static
    // This class can be instantiated without an instance of the interface
    class ClassInsideInterface {
        public void printMessage() {
            System.out.println("Hello from inner class");
        }
    }
}
