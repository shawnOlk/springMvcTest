package com.service;


import com.domain.UserBean;
import com.domain.UserDto;

public interface UserService  {
    UserBean selectByPrimaryKey(Long id);
    void deleteByPrimaryKey(Long id);
    UserBean getUserByQuery( UserDto dto);
    long insert(UserBean userBean);
    void update(UserBean userBean);
    UserBean selectByPrimaryName(String name);
}