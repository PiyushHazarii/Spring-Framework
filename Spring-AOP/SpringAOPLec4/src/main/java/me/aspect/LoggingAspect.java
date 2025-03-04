package me.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* me.services.BankTrans.*(..))")
	public void myLogging() {
		System.out.println(">>>>>>>>>>>>Before Logging<<<<<<<<<<");
	}
}
