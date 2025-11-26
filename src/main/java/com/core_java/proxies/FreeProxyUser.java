package com.core_java.proxies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FreeProxyUser implements ProxyUser {

    public static void main(String[] args) {
        User user = new FreeProxyUser();
        System.out.println(user.getType());
    }

    private FreeUser freeUser = new FreeUser();
    private static final Logger log = LoggerFactory.getLogger(FreeProxyUser.class);

    @Override
    public String getType() {
        log.info("getType() called");
        return freeUser.getType();
    }
}
