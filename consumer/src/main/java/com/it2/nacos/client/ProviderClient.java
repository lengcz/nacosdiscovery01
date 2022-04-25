package com.it2.nacos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 定义远程调用
 */
@FeignClient(value="provider")   //value值是注册到nacos的服务名
public interface ProviderClient {

    @GetMapping("/service")
    public String service();

}
