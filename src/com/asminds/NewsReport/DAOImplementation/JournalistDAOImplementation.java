package com.asminds.NewsReport.DAOImplementation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.asminds.NewsReport.DAO.JournalistDAO;
import com.asminds.NewsReport.Pojo.JournalistPojo;


public class JournalistDAOImplementation implements JournalistDAO {
	@Override
	public boolean save(JournalistPojo p) {
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
	public List<JournalistPojo> viewAll() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Query qry = session.createQuery("from JournalistPojo p");
		List <JournalistPojo> l = qry.list();
		System.out.println("Total Number Of Records : " + l.size());
		Iterator it = l.iterator();

		while (it.hasNext()) {
			Object o = (Object) it.next();
			JournalistPojo p = (JournalistPojo) o;
			System.out.println(p);

		}
		return l;
	}
	public List<JournalistPojo> viewbySpecialist(JournalistPojo emp) {
		// TODO Auto-generated method stub
		
		System.out.println("I amin Viewbyspecialist implementation");
		System.out.println(emp.getjournalistname());
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
	
		String hql = "select * from JournalistPojo where journalistname =" +emp.getjournalistname();
		System.out.println(hql);
		Query qry = session.createQuery("from JournalistPojo where journalistname="+emp.getjournalistname());
		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		java.util.Iterator it = l.iterator();

		while(it.hasNext())
		{
		
			JournalistPojo reg = (JournalistPojo)it.next();
			System.out.println(reg.getjournalistname());
			System.out.println(reg.getEmailId());
			System.out.println(reg.getPassword());
		}
		session.close();
		factory.close();
		return l;
	}

	
	public List<JournalistPojo> validateUser(JournalistPojo login) {
		System.out.println(login.getjournalistname() +" " +login.getPassword());
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Query qry = session.createQuery("from JournalistPojo where journalistname=:journalistname and password=:password");
		qry.setParameter("journalistname", login.getjournalistname());
		qry.setParameter("password", login.getPassword());
		List l = qry.list();
		System.out.println("Total Number Of Records : " + l.size());
		Iterator it = l.iterator();

		while (it.hasNext()) 
		{
			Object o = (Object) it.next();
			JournalistPojo p = (JournalistPojo) o;
			System.out.println("JournalistName : " + p.getjournalistname());
			System.out.println("Password : " + p.getPassword());
			System.out.println("----------------------");
		}
		session.close();
		factory.close();
		return l;
	}
}
