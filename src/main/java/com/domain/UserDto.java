package com.domain;

import lombok.Data;

/**
 * Created by lenovo on 2016/9/6.
 */
@Data
public class UserDto {
    private String account;
    private String passwd;
    private String email;
    private Integer age;
}
