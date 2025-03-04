package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.resources.JavaConfig;
import me.services.BankTrans;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new 
				AnnotationConfigApplicationContext(JavaConfig.class);
		
		BankTrans bankTrans = context.getBean(BankTrans.class);
		bankTrans.transactionUsingInternet();
		bankTrans.transUsingUPI();
		bankTrans.transactionUsingMob();
	}
}
