package com.domain;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * Created by lenovo on 2016/9/2.
 */
@Data
@ToString
public class UserBean {
    private Long id;
    private String account;
    private String passwd;
    private Date regeditTime;
    private Date loginTime;
    private String email;
    private Integer age;

}
