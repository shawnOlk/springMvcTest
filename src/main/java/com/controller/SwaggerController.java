package com.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lenovo on 2016/9/5.
 */
@Controller
public class SwaggerController {
    @RequestMapping(value = "/swagger" )
    public ModelAndView swagger(){
        ModelAndView mv=new ModelAndView("swagger");
        return mv;
    }
}
