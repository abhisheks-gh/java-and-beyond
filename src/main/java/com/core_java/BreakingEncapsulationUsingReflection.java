package com.core_java;

import java.lang.reflect.Field;

public class BreakingEncapsulationUsingReflection {

    public static void main(String[] args) throws Exception {
        Secret secret = new Secret();

        try {
            Field field = Secret.class.getDeclaredField("message");
            field.setAccessible(true); // breaks encapsulation
            String value = (String) field.get(secret);
            System.out.println(value);

            field.set(secret, "Hacked!!");
            System.out.println("Modified value: " + field.get(secret));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Secret {

    private String message = "top secret";

    private void revealMessage() {
        System.out.println("Revealed message: " + message);
    }
}
