package com.oops;

/**
 * Composition vs Inheritance
 * check Composition.java for a loosely coupled and more flexible approach of doing this.
 * Inheritance: is-a relationship
 */
public class Inheritance {
    public static void main(String[] args) {
        InheritanceCar car = new InheritanceCar();
        car.startCar();
    }
}

class InheritanceEngine {

    protected void startEngine() {
        System.out.println("Engine starting...");
    }
}

class InheritanceCar extends InheritanceEngine {

    void startCar() {
        startEngine();
        System.out.println("Car is running...");
    }
}