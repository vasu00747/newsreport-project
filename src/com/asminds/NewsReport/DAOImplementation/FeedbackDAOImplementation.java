package com.asminds.NewsReport.DAOImplementation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.asminds.NewsReport.DAO.FeedbackDAO;
import com.asminds.NewsReport.Pojo.FeedbackPojo;



public class FeedbackDAOImplementation implements FeedbackDAO {

	@Override
	public boolean save(FeedbackPojo p) {
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
	public List<FeedbackPojo> viewAll() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Query qry = session.createQuery("from FeedbackPojo p");
		List <FeedbackPojo> l = qry.list();
		System.out.println("Total Number Of Records : " + l.size());
		Iterator it = l.iterator();

		while (it.hasNext()) {
			Object o = (Object) it.next();
			FeedbackPojo p = (FeedbackPojo) o;
			System.out.println(p);

		}
		return l;
	}


}
