package com.core_java.proxies.dynamic_proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceProxy {

    public static Service create(Service realService) {
        return (Service) Proxy.newProxyInstance(realService.getClass().getClassLoader(), new Class<?>[]{Service.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Proxy: Before method call");
                        Object result = method.invoke(realService, args);
                        System.out.println("Proxy: After method call");
                        return result;
                    }
                });
    }
}
