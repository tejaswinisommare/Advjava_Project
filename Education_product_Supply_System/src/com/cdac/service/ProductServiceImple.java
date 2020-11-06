package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.ProductDao;
import com.cdac.dto.Product;

@Service
public class ProductServiceImple implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	@Override
	public void addProduct(Product product) {

	productDao.insertProduct(product);	
	}

	@Override
	public void removeProduct(int productId) {

		productDao.deleteProduct(productId);
	}
	@Override
	public Product findProduct(int productId) {
		return productDao.selectProduct(productId);
	}

	@Override
	public void modifyProduct(Product product) {
    productDao.updateProduct(product);
		
	}

	@Override
	public List<Product> selectAll() {
		return productDao.selectAll();
	}

	
	
	

}
