package com.annotation;

import java.lang.annotation.*;

/**
 * Created by sunlei on 2017/4/27.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    public enum Color {BULE, RED, GREEN}

    ;

    Color fruitColor() default Color.BULE;
}
