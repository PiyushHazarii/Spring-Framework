package me.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import me.aspect.LoggingAspect;
import me.services.BankTrans;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
	
	@Bean
	public BankTrans bankTrans() {
		
		return new BankTrans();
	}
	
	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
}
