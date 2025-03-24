package me.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@ComponentScan("me.controller")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
			  .authorizeRequests()
			  .antMatchers("/adminPanel").hasRole("ADMIN")
			  .and()
			  .formLogin();
	}
	// agar yaha pr httpbasic karnge to wo default wala page open karega but 
	// if we use formlogin() then wo proper form wala page jo ki spring ne banaya hoga wo open
	// karega 
	
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		UserDetails userDetails = User.withUsername("admin").
				password("$2a$12$CXtzZ0Ne2f1dOF0AlKsjCOCYwW6OWPrI1qOr9jr2Db/XhPLoH66cO")
				.roles("ADMIN").build();
		
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(userDetails);
		return manager;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}