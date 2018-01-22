package com.postProcessBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by sunlei on 2017/12/26.
 */
public class mainTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("applicationContext.xml");

        // 得到Bean

        ctx.getBean("logic");

    }
}
