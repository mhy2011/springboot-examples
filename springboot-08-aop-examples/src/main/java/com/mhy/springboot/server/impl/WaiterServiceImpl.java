package com.mhy.springboot.server.impl;

import com.mhy.springboot.server.WaiterService;

/**
 * @author mahaiyuan
 * @ClassName: WaiterServiceImpl
 * @date 2018-09-30 下午5:08
 */
public class WaiterServiceImpl implements WaiterService {
    @Override
    public void greetTo(String name) {
        System.out.println("greetTo:" + name);
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serveTo:" + name);
    }
}
