package com.cdac.service;

import com.cdac.dto.Admin;

public interface AdminService {
	boolean findAdmin(Admin adminlogin);
	void addAdmin(Admin adminlogin);


}
