package com.mahendra.demo1.rest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.demo1.models.Account;

@RestController
@RequestMapping("/api/accounts")
public class AccountResource {

	@Value("${interest.rate}")
	private Double rateOfInterest;

	public Double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	@GetMapping
	public Account info() {
		Account acc= new Account();
		acc.setAccNo("SB188888353753");
		acc.setCustomerName("Ajay Deol");
		
		acc.setOpeningDate(new Date());
		System.out.println(rateOfInterest);
		return acc;

	}
}
