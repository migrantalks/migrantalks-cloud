package com.migrantalks.ribbon.controller;

import com.migrantalks.ribbon.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Autowired
    BaseService baseService;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return baseService.sayHello(name);
    }
}
