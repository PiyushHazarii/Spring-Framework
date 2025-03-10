package me.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import me.beans.Student;

public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("/me/resources/hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		try {
			// jo class hum get ke andar provide karenge usme hi wo value return karega 
			// then uske help se hum value access kr skte hai 
			Student student = session.get(Student.class, 1);
			
			System.out.println(student.getName());
			System.out.println(student.getAge());
			System.out.println(student.getMarks());
		} catch (Exception e) {

			e.printStackTrace();
		}

		finally {
			session.clear();
			sessionFactory.close();
		}

	}

}
