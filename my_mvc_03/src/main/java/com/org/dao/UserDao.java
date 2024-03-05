package com.org.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.org.dto.User;

public class UserDao {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
	static EntityManager em = emf.createEntityManager();

	public void saveAndUpdate(User user) {
			
			
			EntityTransaction et = em.getTransaction();
			
			et.begin();
			em.merge(user);
			et.commit();
	}
	
	
	public List<User> fetchByEmailPassword(String email , String password) {
		
			String jpql = "select u from User u where u.email=?1 and u.password=?2";
			
			Query query = em.createQuery(jpql);
			query.setParameter(1, email);
			query.setParameter(2, password);
			
			List<User> users = query.getResultList();
			
			return users;
	}
}
