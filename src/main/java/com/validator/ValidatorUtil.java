package com.validator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by sunlei on 2017/9/8.
 */
public class ValidatorUtil {

    public static <T> void util(T testBean) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(testBean);
        Iterator<ConstraintViolation<T>> iterator = constraintViolations.iterator();
        while (iterator.hasNext()) {
            ConstraintViolation<T> cardTemplateConstraintViolation = iterator.next();
            System.out.println(cardTemplateConstraintViolation.getMessage());
        }
    }
}
