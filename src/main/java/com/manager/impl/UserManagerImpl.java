package com.manager.impl;


import com.domain.UserBean;
import com.domain.UserDto;
import com.manager.UserManager;
import com.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Log4j2
public class UserManagerImpl
        implements UserManager {

    @Autowired
    private UserService userService;

    public UserBean selectByPrimaryKey(Long id) {
        return userService.selectByPrimaryKey(id);
    }

    public UserBean selectByPrimaryName(String name) {
        return userService.selectByPrimaryName(name);
    }

    public String findUser(String username) {
        return null;
    }

    public void addUser(String username) {

    }

    public void findAll() {

    }

    @Override
    @Transactional
    public void testTx() throws Exception {
        UserBean userBean1=  selectByPrimaryKey(1L);
        log.info("1--------{}",userBean1.getEmail());
        userBean1.setEmail("222222222222");
        userService.update(userBean1);
        UserBean userBean2= selectByPrimaryKey(1L);
        log.info("2--------{}",userBean2.getEmail());
        userBean2.setEmail("1111111");
        throw new Exception();
//        update(userBean2);
    }

    public UserBean getUserByQuery(UserDto dto) {
        return userService.getUserByQuery(dto);
    }

    public boolean registe(UserBean userBean) {
        try {
            if (selectByPrimaryName(userBean.getAccount()) == null) {
               long id= userService.insert(userBean);
                log.debug("registe userName:{} date:{} id{}", userBean.getAccount(), new Date(),id);
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public UserBean login(UserDto dto) {

        UserBean userBean = getUserByQuery(dto);
        if (userBean != null) {
            userBean.setLoginTime(new Date());
            return update(userBean);
        }
        return null;
    }

//    @Transactional(propagation= Propagation.REQUIRES_NEW)
    public UserBean update(UserBean userBean) {
        userService.update(userBean);
        return userBean;
    }



}