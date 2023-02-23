package com.mahendra.demo2.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import com.mahendra.demo2.models.Account;

@RestController
@RequestMapping("/api/customer")
public class CustomerResource {

	@Autowired
	private RestTemplate rest;

	@GetMapping
	public Account info() {
		
		Account acc = rest.getForObject("http://service-1/api/accounts/", Account.class);
		return acc;
	}
}
