package com.db.core.dao;

import java.util.List;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.db.core.model.User;
import com.db.core.util.HIbernateUtil;

public class UserDao {

	public void SaveUser(User user) {
		Transaction transaction = null;
		try(Session session = HIbernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
		}catch(Exception e) {
//			if(transaction==null) {transaction.rollback();}
//			else {e.printStackTrace();}
			e.printStackTrace();
		}
	}
	public void UpdateUser(User user) {
		Transaction transaction = null;
		try(Session session=HIbernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.saveOrUpdate(user);
			transaction.commit();
		}catch(Exception e) {
			if(transaction==null) {transaction.rollback();} else {e.printStackTrace();}
		}
	}
	public void DeleteUser(long id) {
		Transaction transaction = null;
		User userExisting = new User();
		try(Session session=HIbernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			userExisting = session.load(User.class, id);
			session.delete(userExisting);
			transaction.commit();
		}catch(Exception e) {
			if(transaction==null) {transaction.rollback();} else {e.printStackTrace();}
		}
	}
	public User GetUserById(long id) {
		User userExisting = new User();
		
		Transaction transaction =null;
		try(Session session = HIbernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			userExisting = session.load(User.class, id);
			transaction.commit();
		} catch(Exception e ) {if(transaction==null) {transaction.rollback();}else{e.printStackTrace();}}
		
		return userExisting;
	}
	public List<User> GetAllUsers(){
		List<User> userList = new ArrayList<User>();
		
		Transaction transaction =null;
		try(Session session = HIbernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			userList = session.createQuery("from user").getResultList();
			transaction.commit();
		} catch(Exception e ) {if(transaction==null) {transaction.rollback();}else{e.printStackTrace();}}
		
		return userList;
		
	}
}
