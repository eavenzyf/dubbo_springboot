package com.dubbo.dubboconsumer.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.demo_api.service.SayHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Classname DemoConsumerController
 * @Description TODO
 * @Date 2019/7/9 15:04
 * @Created by du
 */
@RestController
public class DemoConsumerController {
    @Reference
    private SayHelloService sayHelloService;
    @RequestMapping("sayHello")
    public String sayHello(String name){
        return sayHelloService.sayHello(name);
    }
}
