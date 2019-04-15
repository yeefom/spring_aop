package com.yeefom.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class LoggingAspect {

    @Before("com.yeefom.aop.aspect.AopExpressions.dao() && " +
            "!(com.yeefom.aop.aspect.AopExpressions.getter() || " +
            "com.yeefom.aop.aspect.AopExpressions.setter())")
    public void beforeDaoExceptForGettersAndSetters() {
        System.out.println("@Before dao");
    }

}
