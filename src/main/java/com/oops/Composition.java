package com.oops;

/**
 * Composition vs Inheritance
 * For comparison, check Inheritance.java
 * Composition: has-a relationship
 * Loosely coupled unlike Inheritance.java
 * Here the Car class is only dependent on the interface, not the concrete class.
 * If we later create a HybridEngine class, the Car class still works!
 */
public class Composition {
    public static void main(String[] args) {
        CompositionEngine petrol = new PetrolEngine();
        CompositionCar car = new CompositionCar(petrol);
        car.startCar();
    }
}

interface CompositionEngine {

    void startEngine();
}

class PetrolEngine implements CompositionEngine {

    public void startEngine() {
        System.out.println("Starting petrol engine...");
    }
}

class ElectricEngine implements CompositionEngine {

    public void startEngine() {
        System.out.println("Starting electric engine...");
    }
}

class CompositionCar {

    private CompositionEngine engine;

    public CompositionCar(CompositionEngine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.startEngine();
        System.out.println("Car is running...");
    }
}