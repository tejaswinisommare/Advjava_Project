package com.cdac.dao;

import com.cdac.dto.Admin;

public interface AdminDao {
	void insertAdmin(Admin adminlogin);
	boolean checkAdmin(Admin adminlogin);

}
