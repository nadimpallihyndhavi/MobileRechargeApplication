//Class Account exist in below defined package

package com.cg.mra.beans;

public class Account {

	private String accountType;
	private String customerName;
	private double accountBalance;
	
	//Constructor of Account class to initialize object at time of creation
	
	public Account(String accountType, String customerName, double accountBalance) {
		
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
		
	}

	//getters and setters of the declared variables
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	
}
