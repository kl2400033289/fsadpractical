package pom.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// load Configuration & create Sessionfactory
		SessionFactory factory = new Configuration()
		      .configure().buildSessionFactory();
		
		//Open Session
		Session session = factory.openSession();
		
		//Begin Transaction 
		Transaction tx = session.beginTransaction();
		
		//create the table/ object
		Student s = new Student("Ravi");
		
		//Save the data / object
		session.save(s);
		
		//commit
		tx.commit();
		//close
		session.close();
		factory.close();
		
		System.out.println("Student data saved successfully");

	

	}

}
