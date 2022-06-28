package demo_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure().buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		
		AddressBook emp = new AddressBook();
		
		emp.setName("Fahmi");
		emp.setAddress("Jakarta");
		session.persist(emp);
		
		tx.commit();
	}
}
