package com.migrantalks.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * feign 方式，调用服务
 * @author migrantalks
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class CloudFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFeignApplication.class, args);
	}

}
