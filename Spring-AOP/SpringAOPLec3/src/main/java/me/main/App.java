package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.services.BankTrans;

// agar normally run karenge to error aayega to humko XSD ke liye ek dependency add krna hoga 
// aspectj weaver
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		BankTrans bankTrans = (BankTrans) context.getBean("bankID");
		bankTrans.transactionUsingInternet();
		bankTrans.transUsingUPI();
		bankTrans.transactionUsingMob();
	}
}
