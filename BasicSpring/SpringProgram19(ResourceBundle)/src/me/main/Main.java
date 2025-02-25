package me.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
	public static void main(String[] args) {
		Locale locale = new Locale("hi","IN");
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("me/resources/MessageBundle",locale);
		
		String msg = resourceBundle.getString("key_greet");
		System.out.println(msg);
	}
}
