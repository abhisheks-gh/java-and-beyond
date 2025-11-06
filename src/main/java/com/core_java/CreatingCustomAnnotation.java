package com.core_java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// My custom implemented interface
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CreatingCustomAnnotation {

    String value();
    int priority() default 1;
}
