package com.yeefom.aop;

import com.yeefom.aop.dao.AccountDao;
import com.yeefom.aop.dao.MembershipDao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
        MembershipDao membershipDao = context.getBean("membershipDao", MembershipDao.class);

        accountDao.addAccount();
        accountDao.setName("account name");
        accountDao.getName();
        membershipDao.addAccount();

        context.close();
    }

}
