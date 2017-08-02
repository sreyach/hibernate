package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.OneToOne.Hibernate2.Employee;
import com.hibernate.OneToOne.Hibernate2.EmployeeAddress;
import com.hibernate.util.HibernateUtil;


public class OneToOneMain {
	
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Employee e = new Employee();
		e.setName("vineela");
		EmployeeAddress address = new EmployeeAddress();
		address.setStreet("valley");
		address.setCity("LewisVille");
		address.setState("TX");
		address.setZipCode("1234");
		e.setAddress(address);
		address.setCustomer(e);
		Transaction t = s.beginTransaction();
		s.save(e);
		t.commit();
		s.close();
		sf.close();
	}

}
