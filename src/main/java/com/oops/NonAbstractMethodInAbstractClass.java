package com.oops;

public class NonAbstractMethodInAbstractClass {
    public static void main(String[] args) {
        ConcreteOne concrete = new ConcreteOne();
        concrete.doSomething();
    }
}

abstract class AbstractOne {
    public void doSomething() {
        System.out.println("abstract method of doing it...");
    }
}

class ConcreteOne extends AbstractOne {
    @Override
    public void doSomething() {
        System.out.println("concrete way of doing...");
    }
}
