package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.UsersDao;
import com.cdac.dto.Users;


@Service
public class UsersServiceImple implements UsersService {

	@Autowired
	private UsersDao  userDao; 
	
	@Override
	public void addUser(Users userlogin) {
         userDao.insertUser(userlogin);		
	}

	@Override
	public boolean findUser(Users userlogin) {
		return userDao.checkUser(userlogin);
	}

	
}
