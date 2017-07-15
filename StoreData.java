package com.tanu;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static Session getSession() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;

	}
	public static void main(String[] args) {
		Session session = getSession();
		Transaction t = session.beginTransaction();
		Query query = session.getNamedQuery("@findEmployeeByName");  
	    query.setString("firstName", "Taupreet");  
		List<Employee> list = query.list();
		t.commit();
		session.close();
		
		System.out.println(list);
	}
	
	
	
	
	

	/*public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file

		// creating seession factory object
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();

		Query query = session.createQuery("from Employee");
		java.util.List list = query.list();
		List<Employee> user = (List<Employee>) query.list();
		session.getTransaction().commit();
		session.close();

		for (Employee u : user) {
			System.out.println("User id : " + u.getId());
			System.out.println("User Address:" + u.getFirstName());
		}
		System.out.println(list);
		t.commit();
		session.close();
	}*/

	
	/*  public static void main(String[] args) {
	  
	  Session session = getSession(); Transaction t = session.beginTransaction();
	  
	  Employee e1 = new Employee(); e1.setId(110); e1.setFirstName("Tanu");
	  e1.setLastName("Singh");
	  
	  session.persist(e1);// persisting the object // session.getEmployee();
	  t.commit();// transaction is committed session.close();
	  
	  System.out.println("successfully saved");
	  
	  }
	 */

	/*
	 * public static Employee getEmployee(final int id) { Session session =
	 * factory.openSession(); Query query = session.createQuery("from Employee");
	 * 
	 * java.util.List list = query.list(); System.out.println(list);
	 * 
	 * }
	 */

	public static List<Employee> getAllEmployees() {
		return null;
	}
}