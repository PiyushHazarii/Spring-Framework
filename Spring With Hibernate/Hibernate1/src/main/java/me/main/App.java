package me.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import me.beans.Student;

// hibernate ke andar auto commit by default false hota hai
public class App {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("PPPP");
		student.setAge(32);
		student.setMarks(233);

		// these above values are saved in the database
		Configuration cfg = new Configuration();
		// it is used to load the hibernate configuration details from an external file
		cfg.configure("/me/resources/hibernate.cfg.xml");
		// it is used to load the configuration details from configuration file and
		// setting
		// up the databse

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		try {
			// hibernate khud se hi sql query bana dega humko likhne ki zarurat nhi hai
			// humko sirf mehtod likhna hoga aur kuch nhi
			session.save(student);
			System.out.println("Success");
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Fail");
			transaction.rollback();

			e.printStackTrace();
		}

		finally {
			session.clear();
			sessionFactory.close();
		}

	}

}
