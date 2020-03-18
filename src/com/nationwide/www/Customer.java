package com.nationwide.www;

public class Customer extends Profile {
	String cartId;
	String bankName;
	String accountNumber;
	String routingNumber;
	
	public void retriveProfileData(String calledFrom) {
		//Business Logic Here
		System.out.println("retriveProfileData FROM Customer class: "+calledFrom);
	}
	
}
