package com.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunlei on 2018/1/11.
 */
public class TestMain {

    public static void main(String[] args) {
        TestBean t1 = new TestBean(1, "111");
        TestBean t2 = new TestBean(2, "222");
        TestBean t3 = new TestBean(3, "333");
        List<TestBean> list = new ArrayList<TestBean>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        TestBean2 testBean2 = BeanCopyUtils.copyBeanTo(t1, TestBean2.class);
        List<TestBean2> list2 = BeanCopyUtils.copyListTo(list, TestBean2.class);
    }
}
