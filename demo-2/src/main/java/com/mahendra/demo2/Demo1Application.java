package com.mahendra.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.client.RestTemplate;
import  org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient

public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate rest(){
		return new RestTemplate();
	}

}
