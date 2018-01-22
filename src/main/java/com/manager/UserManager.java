package com.manager;

import com.domain.UserBean;
import com.domain.UserDto;

public interface UserManager {
    UserBean selectByPrimaryKey(Long id);
    UserBean getUserByQuery( UserDto dto);
    boolean registe(UserBean userBean);
    UserBean login(UserDto dto);
    UserBean update(UserBean userBean);
    UserBean selectByPrimaryName(String name);

    public String findUser(String username);
    public void addUser(String username);
    public void findAll();

    public void testTx() throws Exception;

}