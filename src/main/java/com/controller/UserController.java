package com.controller;

import com.Enum.ResponseEnum;
import com.common.CommonReponse;
import com.domain.UserBean;
import com.domain.UserDto;
import com.manager.UserManager;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by sunlei on 2016/9/6.
 */
@Log4j2
@Api(value = "Internal", description = "Internal Use")
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserManager userManager;

    /**
     * 登录
     *
     * @param dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "用户登录", httpMethod = "POST", produces = "application/json; charset=utf-8", notes = "用户登录")
    public CommonReponse<UserBean> userLogin(@RequestBody UserDto dto) {
        if (checkInfo(dto)) {
            UserBean userBean = userManager.login(dto);
            if (userBean != null) {
                return new CommonReponse<UserBean>("/hello", ResponseEnum.SUCCESS.getCode(), "登录成功", userBean);
            }
        }
        log.debug("login failed userName:{} date:{}",dto.getAccount(),new Date());
        return new CommonReponse<UserBean>("/register", ResponseEnum.FAIL.getCode(), "登录失败", null);
    }

    /**
     * 注册
     *
     * @param dto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/registe", method = RequestMethod.POST)
    @ApiOperation(value = "用户注册", httpMethod = "POST", produces = "application/json; charset=utf-8", notes = "用户注册")
    public CommonReponse<Void> userRegiste(@RequestBody UserDto dto) {
        if (checkInfo(dto)) {
            UserBean userBean = new UserBean();
            BeanUtils.copyProperties(dto, userBean);
            userBean.setLoginTime(new Date());
            userBean.setRegeditTime(new Date());
            userBean.setAge(dto.getAge());
            Boolean result = userManager.registe(userBean);
            if (result) {
                return new CommonReponse<Void>("/hello", ResponseEnum.SUCCESS.getCode(), "注册成功", null);
            }
        }
        return new CommonReponse<Void>("/register", ResponseEnum.FAIL.getCode(), "注册失败", null);
    }

    /**
     * 判断消息是否为空
     *
     * @param dto
     * @return
     */
    public Boolean checkInfo(UserDto dto) {

        if (dto.getAccount() != null && dto.getPasswd() != null) {
            return true;
        } else {
            return false;
        }
    }


}
