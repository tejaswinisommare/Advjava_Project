package com.cdac.service;

import java.util.List;

import com.cdac.dto.Product;


public interface ProductService {
	void addProduct(Product product);
	void removeProduct(int productId);
	Product findProduct(int productId);
	void modifyProduct(Product product);
	List<Product> selectAll();

}
