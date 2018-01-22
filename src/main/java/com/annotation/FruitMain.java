package com.annotation;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sunlei on 2017/4/27.
 */
@Controller
public class FruitMain {

    @RequestMapping(value = "/test/fruit")
    public void testFruit(){
        FruitUtil.getFruitInfo(Apple.class);
        Apple apple=new Apple();
        apple.displayName();
    }
    public static void main(String[] args){
        FruitUtil.getFruitInfo(Apple.class);
        Apple apple=new Apple();
        apple.displayName();

        try {
            apple.wait(1000L);
            System.out.print("12321321312");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
