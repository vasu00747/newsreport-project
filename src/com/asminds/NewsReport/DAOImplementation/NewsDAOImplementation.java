package com.asminds.NewsReport.DAOImplementation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.asminds.NewsReport.DAO.NewsDAO;
import com.asminds.NewsReport.Pojo.NewsPojo;


public class NewsDAOImplementation implements NewsDAO {

	@Override
	public boolean save(NewsPojo p) {
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
	public List<NewsPojo> viewAll() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Query qry = session.createQuery("from NewsPojo p");
		List <NewsPojo> l = qry.list();
		System.out.println("Total Number Of Records : " + l.size());
		Iterator it = l.iterator();

		while (it.hasNext()) {
			Object o = (Object) it.next();
			NewsPojo p = (NewsPojo) o;
			System.out.println(p.getPostname());
			System.out.println(p.getDescription());

		}
		return l;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		
		Object o=session.load(NewsPojo.class, new Integer (id));
		NewsPojo p=(NewsPojo) o;
		/*Query qry = session.createQuery("delete from NewsPojo where postname="+p.getPostname());*/
		Transaction tx=session.beginTransaction();
		session.delete(p);
		System.out.println("Object Deleted Successfully");
		tx.commit();
		session.close();
		factory.close();
		
		
		
	}

}
