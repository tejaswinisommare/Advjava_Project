package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Order;

@Repository
public class OrderDaoImple implements OrderDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;


	@Override
	public void insertOrder(Order order) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(order);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});


		
	}


	@Override
	public List<Order> selectAll() {
		List<Order> oList = hibernateTemplate.execute(new HibernateCallback<List<Order>>() {

			@Override
			public List<Order> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Order");
				List<Order> li = q.list();
				System.out.println(li); 
				tr.commit();
				session.flush();
				session.close();
				return li;
               }
			
		});
		return oList;
	}


	@Override
	public void deleteOrder(int orderId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Order(orderId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});

		
	}


	@Override
	public Order selectOrder(int orderId) {
		Order order = hibernateTemplate.execute(new HibernateCallback<Order>() {
			@Override
			public Order doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Order ex = (Order)session.get(Order.class, orderId);
				tr.commit();
				session.flush();
				session.close();
				return ex;
			}
			
		});
		return order;
		}
	}
	

	
