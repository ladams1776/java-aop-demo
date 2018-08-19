package com.aop.demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging

    // let's start with an @Before advice

    @Before("execution(public void com.aop.demo.dao.AccountDAO.addAccount())") // call this aspect's method when addAccount() method is called
    public void beforeAddAccountAdvice() {
        System.out.println("\n========>>>>> Executing @Before advice on addAccount()");
    }


    @Before("execution(public void add*())")
    public void beforeAnyAddMethodAdvice() {
        System.out.println("\n==========>>> Executing @Before advice on any method that starts with add, e.g. addAccount()");
    }
}