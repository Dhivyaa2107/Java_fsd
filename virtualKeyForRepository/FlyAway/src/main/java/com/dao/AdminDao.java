package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Flights;
import com.bean.AdminLogin;

public class AdminDao {
	public int addFlights(Flights flight) {
		try {
			Configuration con= new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
			session.save(flight);
			tran.commit();
			return 1;
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public int changePassword(String email,String pass) {
		Configuration con= new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		AdminLogin ad = session.get(AdminLogin.class, email);
		if(ad.getPassword().equals(pass))
		{
			return 0;
		}else {
			tran.begin();	
			ad.setPassword(pass);
			session.update(ad);
			tran.commit();
			return 1;
		}
		
	}
	public List<Flights> AllflightDetails(){
		Configuration con= new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		TypedQuery qry = session.createQuery("select f from Flights f");
		List<Flights> listOfFlight = qry.getResultList();
		return listOfFlight;
	}
	public int addAdmin(AdminLogin a) {
		Configuration con= new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
		session.save(a);
		tran.commit();
		return 1;
	}
}
