package com.flamingo.dao;

import java.util.List;

import com.flamingo.model.UserDetails;

public interface UsersDetail {

	
	void insertUserDetails(UserDetails userDetails); 
	void updateUserDetails(UserDetails userDetails);
	void deleteUserDetails(UserDetails userDetails);
	
	
	UserDetails findUserDetailsById(int userId);
	UserDetails findUserDetailsByEmail(int emailId);
	UserDetails findUserDetailsByName(String name);
	
	List<UserDetails> findAllUsersDetails(UserDetails userDetails);
	
	
	
	
}
