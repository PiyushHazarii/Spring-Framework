package me.main;

import java.awt.Adjustable;
import java.awt.image.Kernel;
import java.beans.beancontext.BeanContext;
import java.io.PushbackReader;
import java.time.Year;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.objenesis.instantiator.android.Android10Instantiator;

import me.beans.Student;

public class Main {
	public static void main(String[] args) {
//		jaise hi Ye initialize hoga tab hi ye bana dega Bean object And
//		get Bean Ke time just return kr dega uska object
		ApplicationContext container = new ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
		Student std = (Student) container.getBean("stdd");
		std.display();
	}
}
