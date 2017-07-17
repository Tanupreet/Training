package com.tanu.project;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@Entity
@Table
public class Airport implements Serializable {
	@Id
	@Column(name="code")
	private String code;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name= "city", nullable=false)
	private String city;

	
	public Airport(String code, String name, String city) {
		super();
		this.code = code;
		this.name = name;
		this.city = city;
	}
	
	
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public static Session getSession() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;

	}
	public static void main(String args[]) {
		Session session = getSession();
		Transaction t = session.beginTransaction();
		Query query= session.createSQLQuery("LOAD DATA INFILE :filename INTO TABLE Airport (,price)")
				.setString("filename", "/path/to/MyFile.csv")
				.executeUpdate();
		session.getTransaction().commit();
		session.close();
		
	}
}