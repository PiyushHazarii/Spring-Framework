package me.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class Student {
	private MessageSource messageSource;

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public  void display() {
		Locale locale = new Locale("en","US");
		String message = messageSource.getMessage("key_message",null, locale);	
		System.out.println(message);
	}
}
