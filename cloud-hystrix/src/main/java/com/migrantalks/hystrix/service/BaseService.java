package com.migrantalks.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BaseService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String sayHello(String name) {
        // 访问不同端口的服务实例
        return restTemplate.getForObject("http://CLOUD-CLIENT/hello?name=" + name, String.class);
    }

    public String error(String name) {
        return "Hello " + name + ", sorry, error";
    }
}
