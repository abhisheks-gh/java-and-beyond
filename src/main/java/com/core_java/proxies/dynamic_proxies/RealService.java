package com.core_java.proxies.dynamic_proxies;

public class RealService implements Service {

    @Override
    public void doSomething() {
        System.out.println("Real service is doing something");
    }
}
