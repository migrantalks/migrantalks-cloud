package com.migrantalks.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BaseService {

    @Autowired
    RestTemplate restTemplate;

    public String sayHello(String name) {
        // 访问不同端口的服务实例
        return restTemplate.getForObject("http://CLOUD-CLIENT/hello?name=" + name, String.class);
    }
}
