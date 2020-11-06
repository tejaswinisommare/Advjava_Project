package com.cdac.dao;

import com.cdac.dto.Users;

public interface UsersDao {
	
	void insertUser(Users userlogin);
	boolean checkUser(Users userlogin);


}
