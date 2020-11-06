package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.OrderDao;
import com.cdac.dto.Order;


@Service
public class OrderServiceImple implements OrderService {

	@Autowired
	private OrderDao  orderDao; 
	
	
	@Override
	public void addOrder(Order order) {
        orderDao.insertOrder(order);		

	}


	@Override
	public List<Order> selectAll() {
		return orderDao.selectAll();
	}


	@Override
	public void removeOrder(int orderId) {
		orderDao.deleteOrder(orderId);
	}


	@Override
	public Order findOrder(int orderId) {
		return orderDao.selectOrder(orderId);
	}

	
}
