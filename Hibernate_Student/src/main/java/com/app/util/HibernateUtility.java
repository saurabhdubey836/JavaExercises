package com.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
public static SessionFactory sf = null;
	
	public static SessionFactory getSessionFactory() {
		sf = new Configuration().configure().buildSessionFactory();
		return sf;
	}
}
