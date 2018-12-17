package com.mhy.springboot.server.impl;

import com.mhy.springboot.aspect.GreetingAspect;
import com.mhy.springboot.aspect.ProcTimeAspect;
import com.mhy.springboot.server.WaiterService;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

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
        factory.addAspect(ProcTimeAspect.class);

        WaiterService service2 = factory.getProxy();
        service2.serveTo("张三");
    }
}