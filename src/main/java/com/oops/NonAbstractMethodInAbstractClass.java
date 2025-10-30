package com.oops;

public abstract class NonAbstractMethodInAbstractClass {

    public static void main() {
        ConcreteOne concrete = new ConcreteOne();
        concrete.doSomething();
    }
}

abstract class AbstractOne {
    void doSomething() {
        System.out.println("abstract method of doing it...");
    }
}

class ConcreteOne extends AbstractOne {

    @Override
    void doSomething() {
        System.out.println("concrete way of doing...");
    }
}

        }

