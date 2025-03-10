package me.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import me.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Student student = new  Student();
    	student.setId(1);
    	student.setAge(32);
    	student.setName("Ayush");
    	student.setMarks(324);
    	
        EntityManagerFactory entityManagerFactory =
        		Persistence.createEntityManagerFactory("mainpersistanceunit");
        
       EntityManager entityManager= entityManagerFactory.createEntityManager();
       
       EntityTransaction entityTransaction = entityManager.getTransaction();
       try {
    	   entityTransaction.begin();
    	   entityManager.persist(student);
    	   entityTransaction.commit();
    	   System.out.println("Success");
    	   
       }catch (Exception e) {
    	   e.printStackTrace();
    	   entityTransaction.rollback();
    	   System.out.println("Fail");
       }
       finally {
		entityManager.close();
		entityManagerFactory.close();
       }
    }
}
