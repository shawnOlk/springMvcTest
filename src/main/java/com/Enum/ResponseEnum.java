package com.Enum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2016/9/6.
 */
public enum  ResponseEnum {
    SUCCESS(0,"成功"),
    FAIL(1,"失败");
    private Integer code;
    private String value;
    private ResponseEnum(Integer code,String value){
        this.code=code;
        this.value=value;
    }
    public Integer getCode(){return code;}
    public String getValue(){return value;}
    private static final Map<Integer, String> stringToEnum = new HashMap<Integer, String>();
    static {
        for (ResponseEnum status : ResponseEnum.values()) {
            stringToEnum.put(status.getCode(), status.getValue());
        }
    }

    // Returns Operation for string, or null if string is invalid
    public static String getDisplayName(Integer symbol) {
        return stringToEnum.get(symbol);
    }
}
