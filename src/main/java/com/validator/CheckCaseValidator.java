package com.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by sunlei on 2017/5/9.
 */
public class CheckCaseValidator implements ConstraintValidator<CheckCase, String> {

    private CaseMode caseMode;
    private String message;

    public void initialize(CheckCase constraintAnnotation) {
        this.caseMode = constraintAnnotation.value();
        this.message=constraintAnnotation.message();
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean isUpper = false;
        if (value == null) {
            return true;
        }

        boolean isValid;
        if (caseMode == CaseMode.UPPER) {
            isValid = value.equals(value.toUpperCase());
            isUpper = true;
        } else {
            isValid = value.equals(value.toLowerCase());
        }
        if (!isValid) {
            context.disableDefaultConstraintViolation();
            if (isUpper) {
                context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
            } else {

                context.buildConstraintViolationWithTemplate(message).addConstraintViolation();

            }

        }
        return isValid;
    }
}
