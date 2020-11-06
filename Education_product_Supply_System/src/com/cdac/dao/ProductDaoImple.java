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

import com.cdac.dto.Product;

@Repository
public class ProductDaoImple implements ProductDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	
	@Override
	public void insertProduct(Product product) {

		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(product);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});

		
	}

	@Override
	public void deleteProduct(int productId) {

		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Product(productId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});

	}
	@Override
	public Product selectProduct(int productId) {
		Product product = hibernateTemplate.execute(new HibernateCallback<Product>() {

			@Override
			public Product doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Product ex = (Product)session.get(Product.class, productId);
				tr.commit();
				session.flush();
				session.close();
				return ex;
			}
			
		});
		return product;


}

	
	@Override
	public void updateProduct(Product product) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
						session.update(product);		
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	
	@Override
	public List<Product> selectAll() {
		List<Product> proList = hibernateTemplate.execute(new HibernateCallback<List<Product>>() {

			@Override
			public List<Product> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Product");
				List<Product> li = q.list();
				System.out.println(li); 
				tr.commit();
				session.flush();
				session.close();
				return li;
               }
			
		});
		return proList;
	}

			
	}

	
