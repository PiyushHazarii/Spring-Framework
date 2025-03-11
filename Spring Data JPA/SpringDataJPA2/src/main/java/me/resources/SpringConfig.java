package me.resources;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("me.repository")
@ComponentScan(basePackages = {"me"})
public class SpringConfig {
	
	@Bean
	public DataSource myDataSource()
	{
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();

	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/hibernate");
	    dataSource.setUsername("root");
	    dataSource.setPassword("piyush.hazari11");
	    return dataSource;
	}
	
	// this method name is fixed
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory()
	{
	    LocalContainerEntityManagerFactoryBean lcEntityManagerFactoryBean = 
	    		new LocalContainerEntityManagerFactoryBean();

	    lcEntityManagerFactoryBean.setDataSource(myDataSource());

	    lcEntityManagerFactoryBean.setPackagesToScan("me.entity");

	    lcEntityManagerFactoryBean.setJpaVendorAdapter
	    					(new HibernateJpaVendorAdapter());	

//	     Properties properties = new Properties();
//	     properties.setProperty("hibernate.hbm2ddl.auto", "update");
//	     properties.setProperty("hibernate.show_sql", "true");
	     lcEntityManagerFactoryBean.setJpaProperties(myProperties());

	    return lcEntityManagerFactoryBean;
	}
	
	/// iska bean nhi bana rahe hai kyuki ye method direct use ho rha hai essi liye
	public Properties myProperties() {
		 Properties properties = new Properties();
	     properties.setProperty("hibernate.hbm2ddl.auto", "update");
//	     properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
	     properties.setProperty("hibernate.show_sql", "true");
	     return properties;
	}
	
	// iska bhi name same hai method ka change nhi krna hai methoda name
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf)
	{
	    JpaTransactionManager transactionManager = new JpaTransactionManager(emf);
	    return transactionManager;
	}



}
