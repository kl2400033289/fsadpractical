package com.klu.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class Hibernate_util {
	private static SessionFactory factory;
	static {
		factory = new Configuration().
				configure("hibernate.cgf.xml").
				buildSessionFactory();
	}
	public static SessionFactory SessionFactory () {
		return factory;
		
	}
       

}
