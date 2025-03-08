package me.piyush;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import me.resources.javaConfig;

/**
 * Hello world!
 *
 */
// we have to use spring jdbc dependency for sppring jdbc module/
// see below this is the way to build the connection from the database
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new 
    			AnnotationConfigApplicationContext(javaConfig.class);
    	JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
    	
    	
    	try {
    		Connection connection = jdbcTemplate.getDataSource().getConnection();
    		if(connection!= null) {
    			System.out.println("Success");
    		}else {
    			System.out.println("Failed");
    		} 
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}



//
//
//DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jbdc");
//dataSource.setUsername("root");
//dataSource.setPassword("piyush.hazari11");
//
//JdbcTemplate jdbcTemplate = new JdbcTemplate();
//jdbcTemplate.setDataSource(dataSource);
// sara ye jitna bhi likha hai wo sara cheez hum xml mein provide kr diye hai  
