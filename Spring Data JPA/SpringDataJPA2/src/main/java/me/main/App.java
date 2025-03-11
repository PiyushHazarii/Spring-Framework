package me.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.entity.Student;
import me.resources.SpringConfig;
import me.service.StudentService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new
        		AnnotationConfigApplicationContext(SpringConfig.class);
        
       StudentService service = (StudentService) context.getBean("studentService");
       
       Student student = service.findByName("hululu");
       System.out.println(student.getName());
       System.out.println(student.getAge());
       System.out.println(student.getMarks());
    }
}
