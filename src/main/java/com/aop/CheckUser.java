package com.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Log4j2
public class CheckUser {

    @Pointcut("execution(* com.manager.impl.*.find*(..))")
    public void checkUser(){
        log.info("**************The System is Searching Information For You****************");
    }

    @Pointcut("execution(* com.tgb.spring.aop.*.add*(..))")
    public void checkAdd(){
        log.info("**************<< Add User >> Checking.....***************");
    }

    @Before("checkUser()")
    public void beforeCheck(){
       log.info(">>>>>>>> 准备搜查用户..........");
    }

    @After("checkUser()")
    public void afterCheck(){
        log.info(">>>>>>>>　搜查用户完毕..........");
    }

    @Before("checkAdd()")
    public void beforeAdd(){
        log.info(">>>>>>>>　增加用户--检查ing..........");
    }

    @After("checkAdd()")
    public void afterAdd(){
        log.info(">>>>>>>>　增加用户--检查完毕！未发现异常!..........");
    }

    //声明环绕通知
    @Around("checkUser()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        log.info("进入方法---环绕通知");
        Object o = pjp.proceed();
        log.info("退出方法---环绕通知");
        return o;
    }
}