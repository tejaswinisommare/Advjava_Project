package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Details")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int productId;
	@Column(name="product_name")
	private String productName;
	private float Price;
	private int adminId;
	
	
	
	
	public Product(int productId) {
		super();
		this.productId = productId;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Product(int productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		Price = price;
	}




	public int getProductId() {
		return productId;
	}




	public void setProductId(int productId) {
		this.productId = productId;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public float getPrice() {
		return Price;
	}




	public void setPrice(float price) {
		Price = price;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

		    
}
