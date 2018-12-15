package com.mhy.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * 方法耗时拦截器
 * @author mahaiyuan
 * @ClassName: ProcTimeAspect
 * @date 2018-10-26 下午6:22
 */
@Aspect
public class ProcTimeAspect {

    private static final int ONE_MILLION = 1000000;

    @Around("execution(* com.mhy.springboot..*(..))")
    public void procTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        System.out.println("======" + joinPoint.getTarget().getClass().getName());
        System.out.println("======" + joinPoint.getSignature().getName());
        //执行目标方法
        joinPoint.proceed();

        long end = System.nanoTime();

        System.out.println("around end ....... procTime=" + (end - start) / ONE_MILLION);
    }

}
