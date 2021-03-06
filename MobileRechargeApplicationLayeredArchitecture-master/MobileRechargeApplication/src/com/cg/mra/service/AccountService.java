package com.cg.mra.service;

//Packages to include the exception class

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileException;

//Service Layer Interface

public interface AccountService {

	//declaration of the methods
	
	public Account getAccountDetails(String mobileNo);
	
	public double rechargeAccount(String mobileNo, double rechargeAmount);
	
	public boolean validateMobileNo(String mobileNo) throws MobileException;
	
	public boolean validateRechargeAmount(double rechargeAmount) throws MobileException;
	
}
