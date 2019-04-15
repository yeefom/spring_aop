package com.yeefom.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class ApiAspect {

    @Before("com.yeefom.aop.aspect.AopExpressions.addAccount()")
    public void beforeAddAccount() {
        System.out.println("@Before advice: add account");
    }

}
