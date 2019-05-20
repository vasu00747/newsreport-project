package com.asminds.NewsReport.DAOImplementation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.asminds.NewsReport.DAO.UserDAO;
import com.asminds.NewsReport.Pojo.UserPojo;

public class UserDAOImplementation implements UserDAO {

	@Override
	public boolean save(UserPojo p) {
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
	public List<UserPojo> viewAll() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Query qry = session.createQuery("from UserPojo p");
		List <UserPojo> l = qry.list();
		System.out.println("Total Number Of Records : " + l.size());
		Iterator it = l.iterator();

		while (it.hasNext()) {
			Object o = (Object) it.next();
			UserPojo p = (UserPojo) o;
			System.out.println(p);

		}
		return l;
	}

	public List<UserPojo> validateUser(UserPojo login) {
		System.out.println(login.getUsername() +" " +login.getPassword());
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Query qry = session.createQuery("from UserPojo where username=:username and password=:password");
		qry.setParameter("username", login.getUsername());
		qry.setParameter("password", login.getPassword());
		List l = qry.list();
		System.out.println("Total Number Of Records : " + l.size());
		Iterator it = l.iterator();

		while (it.hasNext()) 
		{
			Object o = (Object) it.next();
			UserPojo p = (UserPojo) o;
			System.out.println("userName : " + p.getUsername());
			System.out.println("Password : " + p.getPassword());
			System.out.println("----------------------");
		}
		session.close();
		factory.close();
		return l;
	}

}
