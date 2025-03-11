package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.dao.StudentDAO;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new 
        		ClassPathXmlApplicationContext("me/resources/applicationContext.xml");
       StudentDAO studentDAO = (StudentDAO) context.getBean("studentImpl");
       
       studentDAO.searchStudent(1);
        
       
    }
}
