package com.revature.model;

public class Account {
// fields
	public static Integer numberOfAccounts = 0;
//	 account ID
	Integer accountId;
	// account type
	String accountType;
	// balance
	Double balance = 0.;
	
// constructor
	public Account (String accountType){
		// assign next available account number
		this.accountId = numberOfAccounts;
		// increment number of accounts
		numberOfAccounts += 1;
		this.accountType = accountType;
	}
// methods
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", balance=" + balance + "]";
	}

	// withdraw
	
	// deposit
	
	public void testAccount(){
		Account account1 = new Account("Checking");
		System.out.println(account1);

	}
	
}
