package com.mahendra.demo2.models;

import java.util.Date;

public class Account {

	private String accNo;
	private String customerName;
	private Date openingDate;
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
