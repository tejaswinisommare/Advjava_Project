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

import com.cdac.dto.Admin;

@Repository
public class AdminDaoImple implements AdminDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;


	@Override
	public boolean checkAdmin(Admin adminlogin) {
		 boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

        	 @Override
 			public Boolean doInHibernate(Session session) throws HibernateException {
 				Transaction tr = session.beginTransaction();
 				Query q = session.createQuery("from Admin where adminName = ? and adminPass = ?");
 				q.setString(0, adminlogin.getAdminName());
 				q.setString(1, adminlogin.getAdminPass());
 				List<Admin> li = q.list();
 				boolean flag = !li.isEmpty();
 				adminlogin.setAdminId(li.get(0).getAdminId());
 				tr.commit();
 				session.flush();
 				session.close();
 				return flag;
 			}
 			
 		});
 		return b;
	}

	@Override
	public void insertAdmin(Admin adminlogin) {

		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(adminlogin);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});

	}

 }
