package com.cg.mra.dao;

import com.cg.mra.beans.Account;

//interface for DAO Layer

public interface AccountDao {

	//method declaration
	
	public Account getAccountDetails(String mobileNo);
	
	public double rechargeAccount(String mobileNo, double rechargeAmount);
	
}
