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
    	Student student = new Student();
    	student.setId(2);
    	student.setName("fgsefgdsf");
    	student.setMarks(65);
    	student.setAge(87);
    	
    	
        ApplicationContext context = new
        		AnnotationConfigApplicationContext(SpringConfig.class);
        
       StudentService service = (StudentService) context.getBean("studentService");
       
       service.addStdDetails(student);
    }
}
