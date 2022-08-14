package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Flights;

public class UserDao {
	public List<Flights> flightDetails(String src,String des,String date){
			Configuration con= new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			TypedQuery qry = session.createQuery("select f from Flights f where f.source=:source and f.Destination = :Destination and f.date= :date");
			qry.setParameter("source", src);
			qry.setParameter("Destination", des);
			qry.setParameter("date", date);
			List<Flights> listOfFlight = qry.getResultList();
			return listOfFlight;
	}
	public int bookFlights(int srno,int seat) {
		Configuration con= new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		Flights f	= session.get(Flights.class, srno);
		if(seat<f.getSeats())
		{
			tran.begin();
			f.setSeats(f.getSeats()-seat);
			session.update(f);
			tran.commit();
			return 1;
		}else {
			return 0;
		}
	}
}
