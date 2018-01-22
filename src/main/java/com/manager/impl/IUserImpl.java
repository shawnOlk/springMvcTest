package com.manager.impl;

import com.annotation.FruitMethod;
import com.manager.IUser;
import org.springframework.stereotype.Service;

@Service
public class IUserImpl implements IUser {


    public String findUser(String username) {
        return null;
    }

    public void addUser(String username) {

    }

    @FruitMethod
    public void findAll() {
        System.out.print("123213213");
    }
}