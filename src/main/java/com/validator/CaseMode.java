package com.validator;

/**
 * Created by sunlei on 2017/5/9.
 */
public enum CaseMode {
    UPPER("1"),
    LOWER("2");
    private String code;

    CaseMode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
