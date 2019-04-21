package com.migrantalks.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon + rest 方式，调用服务
 * @author migrantalks
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
