package me.services;

// this is the service class we provide aspect or point cuts so that they will execute before 
// the main service method like before entering into the account it always asks for pin
// that is the before aspect that will execute before accessing to the account. 
public class BankTrans {


	public void transUsingUPI() {
		System.out.println("=====Business logic for UPI=====");
	}
	
	public void transactionUsingMob() {
		System.out.println("====Business logic for Mobile transaction====");
	}
	
	public void transactionUsingInternet() {
		System.out.println("=====Business Logic for Intenet transaction====");
	}
}
