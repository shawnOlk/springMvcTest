package com.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by sunlei on 2017/5/9.
 */
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy =CheckCaseValidator.class)
@Documented
public @interface CheckCase {
    String message() default "自定义标注校验失败";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default {};
    CaseMode value();
 }
