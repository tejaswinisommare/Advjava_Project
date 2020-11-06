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

import com.cdac.dto.Users;

@Repository
public class UsersDaoImple implements UsersDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertUser(Users userlogin) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(userlogin);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	@Override
	public boolean checkUser(Users userlogin) {
         boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

        	 @Override
 			public Boolean doInHibernate(Session session) throws HibernateException {
 				Transaction tr = session.beginTransaction();
 				Query q = session.createQuery("from Users where userName = ? and userPass = ?");
 				q.setString(0, userlogin.getUserName());
 				q.setString(1, userlogin.getUserPass());
 				List<Users> li = q.list();
 				boolean flag = !li.isEmpty();
				userlogin.setUserId(li.get(0).getUserId()); 
 				tr.commit();
 				session.flush();
 				session.close();
 				return flag;
 			}
 			
 		});
 		return b;
 	}

 	
 }
