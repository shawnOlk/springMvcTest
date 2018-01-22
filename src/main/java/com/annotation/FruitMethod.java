package com.annotation;

import java.lang.annotation.*;

/**
 * Created by sunlei on 2017/5/2.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface FruitMethod {
    String descraption() default "";
}
