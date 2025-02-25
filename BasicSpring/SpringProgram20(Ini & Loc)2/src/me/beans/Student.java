package me.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class Student {
	private String names;
	private String country;
	private MessageSource messageSource;

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public  void display() {
		Locale locale = new Locale("en","US");
		String message = messageSource.getMessage("key_message",new Object[]{names,country},locale);	
		System.out.println(message);
	}

	public void setNames(String names) {
		this.names = names;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}


