package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.AdminDao;
import com.cdac.dto.Admin;


@Service
public class AdminServiceImple implements AdminService {

	@Autowired
	private AdminDao  adminDao; 
	
	@Override
	public boolean findAdmin(Admin adminlogin) {
		return adminDao.checkAdmin(adminlogin);
	}

	@Override
	public void addAdmin(Admin adminlogin) {
     adminDao.insertAdmin(adminlogin);		
	}

	

}
