package com.flamingo.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flamingo.model.City;
import com.flamingo.model.UserDetails;

public class UsersDetailImpl implements UsersDetail {

	private Session session;
	
	public UsersDetailImpl() {
		// TODO Auto-generated constructor stub
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		session =  sessionFactory.openSession();
		System.out.println("DB Connection ESTD");
		
	}
	@Override
	public void insertUserDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		Transaction txTransaction =  session.beginTransaction();
		session.save(userDetails);
		txTransaction.commit();
		System.out.println("User Details Inserted");
	}

	@Override
	public void updateUserDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		Transaction txTransaction =  session.beginTransaction();
		session.update(userDetails);
		txTransaction.commit();
		System.out.println("User Details Updated");
	}

	@Override
	public void deleteUserDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		Transaction txTransaction =  session.beginTransaction();
		session.delete(userDetails);
		txTransaction.commit();
		System.out.println("User Details Updated");
	
	}

	@Override
	public UserDetails findUserDetailsById(int userId) {
		// TODO Auto-generated method stub
		return session.get(UserDetails.class,userId);
	}

	@Override
	public UserDetails findUserDetailsByEmail(int emailId) {
		// TODO Auto-generated method stub
		return session.get(UserDetails.class,emailId);
	}
	@Override
	public UserDetails findUserDetailsByName(String name) {
		// TODO Auto-generated method stub
		return session.get(UserDetails.class,name);
	}
	@Override
	public List<UserDetails> findAllUsersDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from UserDetails ");
		return query.getResultList();
	}

}
