package com.service.impl;


import com.dao.UserDao;
import com.domain.UserBean;
import com.domain.UserDto;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl
        implements UserService {
    @Autowired
    private  UserDao userDao ;


    @Override
    public UserBean selectByPrimaryKey(Long id) {
        return this.userDao.selectByPrimaryKey(id);
    }

    @Override
    public void deleteByPrimaryKey(Long id) {
        userDao.deleteByPrimaryKey(id);
    }

    @Override
    public UserBean getUserByQuery(UserDto dto) {
        return userDao.getUserByQuery(dto);
    }

    @Override
    public long insert(UserBean userBean) {
        return userDao.insert(userBean);
    }

    @Override
    public void update(UserBean userBean) {
      userDao.update(userBean.getId(),userBean);
    }

    @Override
    public UserBean selectByPrimaryName(String name) {
        return this.userDao.selectByPrimaryName(name);
    }
}