package me.main;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
//		Locale locale = Locale.getDefault(); // ye en_IN print karega matlab english and india 
//		
//		System.out.println(locale);
//		System.out.println(locale.getDisplayCountry()+" "+
//				locale.getDisplayLanguage()+" "+locale.getCountry()) ;
		
		int no = 123234342;
		int no2 = 234567321;
		Locale locale = Locale.getDefault();
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		System.out.println(numberFormat.format(no2)) ;
	}
}
 