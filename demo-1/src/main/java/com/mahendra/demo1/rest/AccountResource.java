package com.mahendra.demo1.rest;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.demo1.models.Account;

@RestController
@RequestMapping("/api/accounts")
public class AccountResource {

	@GetMapping
	public Account info() {
		Account acc= new Account();
		acc.setAccNo("SB188888353753");
		acc.setCustomerName("Ajay Deol");
		
		acc.setOpeningDate(new Date());
		return acc;
	}
}
