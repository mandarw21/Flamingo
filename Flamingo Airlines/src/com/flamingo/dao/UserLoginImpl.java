package com.flamingo.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.flamingo.model.User;

public class UserLoginImpl implements UserLogin {
	
	private Session session;

	public UserLoginImpl() {
		// TODO Auto-generated constructor stub
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		session =  sessionFactory.openSession();
		System.out.println("DB Connection ESTD");
		
		
	}
	
	@Override
	public User findUserById(int userId) {
		// TODO Auto-generated method stub
		return session.get(User.class,userId);
	}



	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from User ");
		return query.getResultList();
	}

	@Override
	public User findUserByEmail(int emailId) {
		// TODO Auto-generated method stub
		return session.get(User.class,emailId);
	}

}
