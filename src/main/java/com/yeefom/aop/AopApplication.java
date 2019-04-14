package com.yeefom.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        AccountDao accountDao = context.getBean("accountDao", AccountDao.class);

        accountDao.addAccount();

        context.close();
    }

}
