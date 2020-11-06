package com.cdac.cntr;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Order;
import com.cdac.dto.Users;
import com.cdac.service.OrderService;


@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/Order_form")
	public String orderAddForm() {
		return "Order_form";
	}
	
		@RequestMapping(path = "/process4",method = RequestMethod.POST)
	public String register(Order order,ModelMap modelMap,HttpSession session) {
		int userId = ((Users)session.getAttribute("userlogin")).getUserId();
		order.setOrderId(userId);
		orderService.addOrder(order);
		return "home";
	}
	
	@RequestMapping(path= "/showOrder",method = RequestMethod.GET)
	public String AllOrder(ModelMap map,HttpSession session) {
		int userId = ((Users)session.getAttribute("userlogin")).getUserId();
        List<Order> li = orderService.selectAll();
        map.put("orderlist",li);
		return "Order_listForm";

	}
	@RequestMapping(value = "/Order_delete",method = RequestMethod.GET)
	public String productDelete(@RequestParam int orderId,ModelMap map,HttpSession session) {
		
		orderService.removeOrder(orderId); 
		
		int userId = ((Users)session.getAttribute("userlogin")).getUserId();
        List<Order> li = orderService.selectAll();
		map.put("orderlist", li);
		return "Order_listForm";
	}
	


}