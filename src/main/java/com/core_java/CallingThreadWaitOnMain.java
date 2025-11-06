package com.core_java;

// what happens when we call Thread.wait() in the main method
public class CallingThreadWaitOnMain {

    public static void main(String[] args) throws InterruptedException {
        /** Non-static method cannot be referenced by a static context */
        // Thread.wait();

        /**
         * This will compile but fail at runtime as the current thread (main)
         * must own the monitor lock of the object it's waiting on.
         * Put it in synchronized block for that.
         */
//        Thread t = Thread.currentThread(); // main thread
//        t.wait(); // trying to make main thread wait.

        /** This will work */
//        Thread t = Thread.currentThread();
//        synchronized (t) {
//            t.wait(); // main thread will now wait indefinitely
//        }

        // But, the better way to do this is
        Thread.sleep(1000);
    }
}
