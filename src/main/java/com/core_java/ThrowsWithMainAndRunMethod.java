package com.core_java;

public class ThrowsWithMainAndRunMethod implements Runnable {

    @Override
    public void run() {
        System.out.println("run() can use throws but makes no sense as exceptions are not propagated back to " +
                "the calling thread. Instead they are handled internally by the thread's runtime environment.");
    }

    public static void main(String[] args) throws Exception {
        throw new Exception("tantanan.....");
    }
}
