package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.OneToOne.Hibernate2.Employee;
import com.hibernate.OneToOne.Hibernate2.EmployeeAddress;
import com.hibernate.util.HibernateUtil;



public class EmployeeMain {
	
	public static void getEmployee()
	{
		SessionFactory sf =HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Employee e = (Employee) s.get(Employee.class, 1);
		System.out.println(e);
		s.close();
		sf.close();
	}
	
	public static void insertEmployee()
	{
		SessionFactory sf =HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Employee e =new Employee();
		e.setName("sreya");
		Transaction t = s.beginTransaction();
		s.save(e);
		t.commit();
		s.close();
		sf.close();
	}
	
	public static void insertEmployeeAddress(){
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Employee c = new Employee();
		c.setName("John");
		EmployeeAddress address = new EmployeeAddress();
		address.setStreet("View");
		address.setCity("Lew");
		address.setState("TX");
		address.setZipCode("1234");
		c.setAddress(address);
		address.setCustomer(c);
		Transaction t = s.beginTransaction();
		s.save(c);
		t.commit();
		s.close();
		sf.close();
	}
	
	public static void updateEmployee()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Employee e2 =(Employee) s.load(Employee.class, 9);
		Transaction t = s.beginTransaction();
		e2.setName("archana");
		s.update(e2);
		t.commit();
		s.close();
		sf.close();
	}

	public static void main(String[] args) {
		
		//insertEmployee();
		//updateEmployee();
		//getEmployee();
		insertEmployeeAddress();
		
	}
}