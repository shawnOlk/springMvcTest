package com.domain.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by lenovo on 2016/9/2.
 */
@Data
public class UserBeanQueryBean {
    private Long id;
    private String account;
    private String passwd;
    private Date regeditTime;
    private Date loginTime;
    private String email;
}
