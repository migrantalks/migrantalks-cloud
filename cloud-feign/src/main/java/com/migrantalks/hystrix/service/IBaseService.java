package com.migrantalks.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-client")
public interface IBaseService {

    @GetMapping("/hello")
    String sayHello(@RequestParam (value = "name") String name);
}
