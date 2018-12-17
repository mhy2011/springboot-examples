package com.mhy.springboot.server.service;

import com.mhy.springboot.thrift.account.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

/**
 * @ClassName AccountServiceImpl
 * @Description
 * @Author mahaiyuan
 * @Date 2018-12-15 13:31:00
 * @Versioin 1.0
 */
@Slf4j
@Service("accountService")
public class AccountServiceImpl implements AccountService.Iface {
    @Override
    public String createAccount(String param) throws TException {
        System.out.println("createAccount param=" + param);
        return param;
    }
}
