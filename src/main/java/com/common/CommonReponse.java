package com.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by lenovo on 2016/9/6.
 */
@Data
@AllArgsConstructor
public class CommonReponse<T>{
    private String url;
    //ResponseEnum
    private Integer status;
    private String message;
    private T data;
}
