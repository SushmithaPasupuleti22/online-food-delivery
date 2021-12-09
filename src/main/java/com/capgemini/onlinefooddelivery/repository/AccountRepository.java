package com.capgemini.onlinefooddelivery.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountRepository {
	
	  @Autowired private SessionFactory sessionFactory;
	 
		/*
		 * public Account findAccount(String userName) { Session session = (Session)
		 * this.sessionFactory.getCurrentSession(); return ((EntityManager)
		 * session).find(Account.class, userName); }
		 */
}
