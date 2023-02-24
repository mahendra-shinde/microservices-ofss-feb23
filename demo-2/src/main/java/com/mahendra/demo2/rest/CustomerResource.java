package com.mahendra.demo2.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.mahendra.demo2.models.Account;

@RestController
@RequestMapping("/api/customer")
public class CustomerResource {

	@Autowired
	private RestTemplate rest;

	@Value("${service.baseurl}")
	private String service1;

	public void setService1(String service1) {
		this.service1 = service1;
	}

	@GetMapping
	public Account info() {
		
		Account acc = rest.getForObject(service1+"/api/accounts/", Account.class);
		return acc;
	}
}
