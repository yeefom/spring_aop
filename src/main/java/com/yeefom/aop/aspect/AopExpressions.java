package com.yeefom.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopExpressions {

    @Pointcut("execution(* com.yeefom.aop.dao.*.add*(..))")
    public void daoAdds() {}

    @Pointcut("execution(* get*(..))")
    public void getters() {}

    @Pointcut("execution(* set*(..))")
    public void setters() {}

    @Pointcut("execution(public void addAccount())")
    public void addAccount() {}

}
