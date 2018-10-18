package com.mhy.springboot.service.impl;

import com.mhy.springboot.aspect.GreetingAspect;
import com.mhy.springboot.service.WaiterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.aspectj.annotation.AspectJAdvisorFactory;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author mahaiyuan
 * @ClassName: WaiterServiceImplTest
 * @date 2018-09-30 下午5:14
 */
public class WaiterServiceImplTest {

    @Test
    public void testGreetTo() throws Exception {
        WaiterService service = new WaiterServiceImpl();
        AspectJProxyFactory factory = new AspectJProxyFactory(service);
        factory.addAspect(GreetingAspect.class);

        WaiterService service2 = factory.getProxy();
        service2.greetTo("张三");
    }

    @Test
    public void testServeTo() throws Exception {
        WaiterService service = new WaiterServiceImpl();
        AspectJProxyFactory factory = new AspectJProxyFactory(service);
        factory.addAspect(GreetingAspect.class);

        WaiterService service2 = factory.getProxy();
        service2.serveTo("张三");
    }
}