package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.ManyToMany.Consultant;
import com.hibernate.util.HibernateUtil;

public class ConsultantVendorMain {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session =sf.openSession();
		session.beginTransaction();
//		Consultant consultant = new Consultant();
//		consultant.setConsultantName("Michael");
//		consultant.setPhoneNumber("816-572-3034");
//		Consultant consultant1 = new Consultant();
//		consultant1.setConsultantName("Alby");
//		consultant1.setPhoneNumber("Marcel");
//		
		Consultant consultant2 = new Consultant(); 
		consultant2.setConsultantName("Davey");
		consultant2.setPhoneNumber("816-572-3034");

//		Vendor vendor = new Vendor();
//		vendor.setVendorName("David");
//		vendor.getConsultants().add(consultant);
//		vendor.getConsultants().add(consultant1);
//		
//		Vendor vendor1 = new Vendor();
//		vendor1.setVendorName("Alex");
//		vendor1.getConsultants().add(consultant);
//		
//		
//		
//		session.save(consultant);
//		session.save(consultant1);
		session.save(consultant2);
		
//		session.save(vendor);
//		session.save(vendor1);

//		Consultant consultant = session.load(Student.class, 2L);
//		session.delete(consultant);
//		Vendor vendor = session.load(Vendor.class, 1L);
//		session.delete(vendor);
		
//		Consultant consultant = session.load(Consultant.class, 2L);
//		Vendor vendor = session.load(Vendor.class, 1L);
//		vendor.getStudents().add(consultant);
//		session.update(vendor);

		session.getTransaction().commit();
		session.close();
		sf.close();

	}

}
