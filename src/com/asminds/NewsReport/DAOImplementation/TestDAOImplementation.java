package com.asminds.NewsReport.DAOImplementation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.asminds.NewsReport.DAO.TestDAO;
import com.asminds.NewsReport.Pojo.TestPojo;

public class TestDAOImplementation implements TestDAO {
	@Override
	public boolean save(TestPojo p) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Object Saved Successfully");
		return true;
	}

	@Override
	public List<TestPojo> viewAll() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Query qry = session.createQuery("from TestPojo p");
		List <TestPojo> l = qry.list();
		System.out.println("Total Number Of Records : " + l.size());
		Iterator it = l.iterator();

		while (it.hasNext()) {
			Object o = (Object) it.next();
			TestPojo p = (TestPojo) o;
			System.out.println(p);

		}
		return l;
	}
	public List<TestPojo> viewbySpecialist(TestPojo subject) {
		// TODO Auto-generated method stub
		
		System.out.println("I amin Viewbyspecialist implementation");
		System.out.println(subject);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
	
		String hql = "select * from TestPojo where subjectname =" +subject.getSubjectname();
		System.out.println(hql);
		Query qry = session.createQuery("from TestPojo where subjectname="+subject.getSubjectname());
		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		java.util.Iterator it = l.iterator();

		while(it.hasNext())
		{
		
			TestPojo reg = (TestPojo)it.next();
			System.out.println(reg.getSubjectname());
			System.out.println(reg.getQuestion());
			System.out.println(reg.getAnswer());
		}
		session.close();
		factory.close();
		return l;
	}


}
