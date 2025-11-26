package com.core_java.proxies.dynamic_proxies;

public class Main {

    Service real = new RealService();
    Service proxy = ServiceProxy.create(real);

    proxy.doSomething();
}
