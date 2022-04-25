package com.it2.controller;

import com.it2.nacos.client.ProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private static final Logger LOG= LoggerFactory.getLogger(ConsumerController.class);

    /**
     * 动态代理对象，内部远程调用生产者
     */
    @Autowired
    private ProviderClient providerClient;


    @GetMapping("/service")
    public String service(){
        LOG.info("consumer invoke");
        String result=providerClient.service(); //远程调用
        return "consumer invoke | "+result;
    }
}
