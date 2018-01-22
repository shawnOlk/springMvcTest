package com.validator;

import lombok.Data;

import javax.validation.constraints.DecimalMin;

/**
 * Created by sunlei on 2017/5/8.
 */
@Data
public class ValidTestBean {
    @DecimalMin(value = "100",message = "lt 100")
    private Long id;
}
