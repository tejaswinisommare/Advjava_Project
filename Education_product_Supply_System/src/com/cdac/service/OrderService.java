package com.cdac.service;

import java.util.List;

import com.cdac.dto.Order;

public interface OrderService {
	void addOrder(Order order);
	List<Order> selectAll();
	Order findOrder(int orderId);

	void removeOrder(int orderId);

}
