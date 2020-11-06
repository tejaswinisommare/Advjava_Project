package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class Order {
	@Id
	@GeneratedValue
	@Column(name = "order_id")
	private int orderId;	
	@Column(name = "order_name")
	private String orderName;
	@Column(name = "product_name")
	private String proName;
	@Column(name="MobileNo")
	private String mobNo;
	@Column(name="Quantity")
	private int quantity;
	@Column(name="Payment")
	private String payment;
	private int userId;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId) {
		super();
		this.orderId = orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
		
}