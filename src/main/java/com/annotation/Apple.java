package com.annotation;

import lombok.Data;

/**
 * Created by sunlei on 2017/4/27.
 */
@Data
public class Apple {
    @FruitName("Apple")
    private String appleName;
    @FruitColor(fruitColor=FruitColor.Color.RED)
    private String appleColor;
    @FruitProvider(id=123,name="红富士",address = "上海")
    private String appleProvider;
    public void displayName() {
        System.out.println(appleColor+"水果的名字是：苹果");
    }
}
