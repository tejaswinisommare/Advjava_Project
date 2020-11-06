package com.cdac.service;

import com.cdac.dto.Users;

public interface UsersService {
	void addUser(Users userlogin);
	boolean findUser(Users userlogin);
}
