package com.mhy.springboot.client;

import com.mhy.springboot.thrift.account.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * @ClassName AccountServiceDemo
 * @Description
 * @Author mahaiyuan
 * @Date 2018-12-15 13:37:00
 * @Versioin 1.0
 */
@Slf4j
public class AccountServiceDemo {

    public static void main(String[] args) {

        try {
            TTransport transport = new TSocket("localhost", 8888, 30000);
            TProtocol protocol = new TBinaryProtocol(transport);
            AccountService.Client accountService = new AccountService.Client(protocol);
            transport.open();
            log.info("远程调用服务...{}", accountService.createAccount("eeee"));
        } catch (TException e) {
            log.error("远程调用异常.", e);
        }
    }


}
