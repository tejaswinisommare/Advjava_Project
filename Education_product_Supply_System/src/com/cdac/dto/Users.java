package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userlogin")
public class Users {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_pass")
	private String userPass;
	@Column(name="email")
	private String emailId;
	@Column(name="MobileNo")
	private String mobNo;
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPass() {
		return userPass;
	}


	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getMobNo() {
		return mobNo;
	}


	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPass=" + userPass + ", emailId=" + emailId
				+ ", mobNo=" + mobNo + "]";
	}
	
	
}
