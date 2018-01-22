package com.controller;

import com.domain.UserBean;
import com.manager.UserManager;
import com.manager.IUser;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lenovo on 2016/9/1.
 */
@Controller
@Log4j2
public class HelloController {
    @Autowired
    private IUser user;
    //    private static Logger log = LogManager.getLogger(HelloController.class.getName());
    @Autowired
    private UserManager userManager;

    @RequestMapping(value = "/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("login");
        UserBean user = userManager.selectByPrimaryKey(1L);
        System.out.println(user.getId());
        mv.addObject("result", user);
        log.error("123213213213");
        new ChromeDriver().manage();
        return mv;
    }

    @RequestMapping(value = "/test")
    public void test() throws Exception {
        userManager.testTx();
    }


}
