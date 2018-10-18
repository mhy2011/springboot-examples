package com.mhy.springboot.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author mahaiyuan
 * @ClassName: GreetingAspect
 * @date 2018-09-30 下午5:12
 */
@Aspect
public class GreetingAspect {

    /**
     * 前置增强
     */
    @Before("execution(* greetTo(..))")
    public void before() {
        //增强横切逻辑
        System.out.println("How are you...............");
    }

    @After("execution(* serveTo(..))")
    public void after() {
        System.out.println("after.............");
    }

    @AfterReturning("execution(* serveTo(..))")
    public void afterReturning() {
        System.out.println("afterReturning.............");
    }
}
