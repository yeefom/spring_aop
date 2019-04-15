package com.yeefom.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(* com.yeefom.aop.dao.*.add*(..))")
    public void daoAdds() {}

    @Pointcut("execution(* get*(..))")
    public void getters() {}

    @Pointcut("execution(* set*(..))")
    public void setters() {}

    @Before("daoAdds() && !(getters() || setters())")
    public void beforeDaoAddsExceptForGettersAndSetters() {
        System.out.println("@Before advice: dao add");
    }

//    @Before("execution(public void addAccount())")
//    public void beforeAddAccount() {
//        System.out.println("@Before advice: add account");
//    }

}
