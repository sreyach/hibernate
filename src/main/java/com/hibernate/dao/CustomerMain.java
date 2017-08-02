package com.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.OneToMany.Customer;
import com.hibernate.OneToMany.Food;
import com.hibernate.util.HibernateUtil;


public class CustomerMain {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Customer c = new Customer();
		c.setCustomerName("sreya");

		Food f1 = new Food();
		f1.setItem("burger");
		f1.setCustomer(c);

		Food f2 = new Food();
		f2.setItem("pizza");
		f2.setCustomer(c);

		List<Food> food= new ArrayList<Food>();
		food.add(f1);
		food.add(f2);
		c.setFood(food);
		Transaction t = s.beginTransaction();
		s.save(c);
		t.commit();
		s.close();
		sf.close();

	}
}

