package com.yeefom.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class ApiAspect {

    @Before("com.yeefom.aop.aspect.AopExpressions.getter()")
    public void beforeGetter(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        System.out.println("@Before getter - method: " + signature);

        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    @AfterReturning(
            pointcut = "com.yeefom.aop.aspect.AopExpressions.stringGetter()",
            returning = "result")
    public void afterReturningStringGetter(JoinPoint joinPoint, String result) {
        System.out.println("@AfterReturning string getter - method: " + joinPoint.getSignature() + "; result: " + result);
    }

}
