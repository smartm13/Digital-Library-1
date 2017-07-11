package com.cd.coe.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cd.coe.model.User;

@Repository("userDao")
@Transactional(propagation=Propagation.REQUIRED)
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	protected EntityManager entityManager;

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		entityManager.persist((user));
	}

}
