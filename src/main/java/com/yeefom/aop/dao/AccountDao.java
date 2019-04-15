package com.yeefom.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

    private String name;

    public void addAccount() {
        System.out.println(getClass() + ": add account");
    }

    public String getName() {
        System.out.println(getClass() + ": get name");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": set name");
        this.name = name;
    }
}
