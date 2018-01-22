package com.postProcessBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by sunlei on 2017/12/26.
 */
public class BeanPostPrcessorImpl implements BeanPostProcessor {


    // Bean 实例化之前进行的处理
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)

            throws BeansException {

        System.out.println("对象" + beanName + "开始实例化");

        return bean;

    }


    // Bean 实例化之后进行的处理
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)

            throws BeansException {

        System.out.println("对象" + beanName + "实例化完成");

        return bean;

    }

}