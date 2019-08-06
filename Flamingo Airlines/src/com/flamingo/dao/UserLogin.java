package com.flamingo.dao;

import java.util.List;
import com.flamingo.model.User;

public interface UserLogin {
	
	User findUserById(int userId);
	User findUserByEmail(int emailId);
	
	List<User> listAllUsers();
}
