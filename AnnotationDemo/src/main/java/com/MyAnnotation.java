package com;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by wb-spq324872 on 2018/8/13.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    int age();
    String name();
}
