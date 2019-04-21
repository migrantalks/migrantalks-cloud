package com.migrantalks.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供者
 * @author migrantalks
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class CloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudClientApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/hello")
	public String home(@RequestParam(value = "name", defaultValue = "migrantalks") String name) {
		return "Hello " + name + " ,i am from port:" + port;
	}
}
