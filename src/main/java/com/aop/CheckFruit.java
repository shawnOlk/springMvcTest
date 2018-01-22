package com.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by sunlei on 2017/4/27.
 */
@Component
@Aspect
@Log4j2
public class CheckFruit {

//    @Pointcut("@annotation(com.annotation.FruitMethod)")
//    public void check() {
//    }

//    @Pointcut("execution(* com.manager.impl.*.find*(..))")
//    public void check() {
//    }

    @Around("@annotation(com.annotation.FruitMethod)")
    public void afterPoint(ProceedingJoinPoint point) throws Throwable {
        System.out.println(point.getTarget().getClass().getName());
        Object[] obj = point.getArgs();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj.toString());
        }
        Object o = point.proceed();
        System.out.print("around point");

    }

}
