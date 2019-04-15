package com.yeefom.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopExpressions {

    @Pointcut("execution(* com.yeefom.aop.dao.*.*(..))")
    public void dao() {}

    @Pointcut("execution(* get*(..))")
    public void getter() {}

    @Pointcut("execution(* set*(..))")
    public void setter() {}

    @Pointcut("execution(public void addAccount())")
    public void addAccount() {}

    @Pointcut("execution(String get*())")
    public void stringGetter() {}

}
