package com.yeefom.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class LoggingAspect {

    @Before("com.yeefom.aop.aspect.AopExpressions.daoAdds() && " +
            "!(com.yeefom.aop.aspect.AopExpressions.getters() || " +
            "com.yeefom.aop.aspect.AopExpressions.setters())")
    public void beforeDaoAddsExceptForGettersAndSetters() {
        System.out.println("@Before advice: dao add");
    }

}
