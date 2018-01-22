package com.annotation;

import java.lang.reflect.Field;

/**
 * Created by sunlei on 2017/4/27.
 */
public class FruitUtil {
    public static void getFruitInfo(Class<?> Clazz) {
        String strFruitName = "水果名称";
        String strFruitColor = "水果颜色";
        String strFruitProvider = "供应商信息";
        Field[] fields = Clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = (FruitColor) field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor + fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.value().toString();
                System.out.println(strFruitName);
            }
            if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = (FruitProvider) field.getAnnotation(FruitProvider.class);
                strFruitProvider = strFruitProvider + fruitProvider.id() + fruitProvider.name().toString() + fruitProvider.address().toString();
                System.out.println(strFruitProvider);
            }
        }

    }
}
