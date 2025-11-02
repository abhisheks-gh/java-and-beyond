package com.oops;

/**
 * Java 5 onwards, we can change the return type of method from superclass to subclass while overriding.
 * This feature is known as Covariant Method Overriding.
 * What is Covariant Return Type?
 * Covariant return type allows a method in subclass to override a method in the superclass
 * and return a more specific value (a subtype of the original return type).
 */
public class CovariantMethodOverriding {
    public static void main(String[] args) {
        Animal ref = new Dog();
        System.out.println(ref.createInstance());
    }
}

class Animal {
    Animal createInstance() {
        return new Animal();
    }
}

class Dog extends Animal {
    // Covariant return type: Dog is a subclass of Animal
    @Override
    Dog createInstance() {
        return new Dog();
    }
}