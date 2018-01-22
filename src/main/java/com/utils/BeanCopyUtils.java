package com.utils;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunlei on 2018/1/11.
 */
public class BeanCopyUtils {
    public static <E> List<E> copyListTo(List<?> source, Class<E> destinationClass) {
        try {
            if (CollectionUtils.isEmpty(source)) {
                return Collections.emptyList();
            }
            List<E> res = new ArrayList<E>(source.size());
            for (Object o : source) {
                E dest = destinationClass.newInstance();
                BeanUtils.copyProperties(o, dest);
                res.add(dest);
            }
            return res;
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    public static <E> E copyBeanTo(Object source, Class<E> destinationClass) {
        System.out.println(source);

        try {
            if (source == null) {
                return null;
            }
            E dest = destinationClass.newInstance();
            BeanUtils.copyProperties(source, dest);
            return dest;
        } catch (Exception e) {
            return null;
        }
    }
}
