package com.dubbo.dubboprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo_api.service.SayHelloService;

/**
 * @Classname SayHelloServiceImpl
 * @Description TODO
 * @Date 2019/7/9 14:55
 * @Created by du
 */
@Service
public class SayHelloServiceImpl implements SayHelloService {
    @Override
    public String sayHello(String name) {
        return "hello:"+name;
    }
}
