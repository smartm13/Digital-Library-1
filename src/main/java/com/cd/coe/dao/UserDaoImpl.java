package com.cd.coe.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.*;
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
	
	public boolean checkLogin(String userName, String userPassword){
	try{
		CriteriaBuilder builder = entityManager.
				getCriteriaBuilder();
		CriteriaQuery<User> cq = builder.createQuery(User.class);
//select *from
		Root<User> r = cq.from(User.class);
		cq.select(r);
//where
		Predicate usereq = builder.equal(r.get("username"),userName);
		Predicate pwdeq = builder.equal(r.get("userPwd"), userPassword);
		Predicate predicate = builder.and(usereq,pwdeq);
		cq.where(predicate);
//execution
		User user = (User) entityManager.createQuery(cq).getSingleResult();

	//	System.out.println(user);
		return user != null;
	}
	catch(Exception e)
	{
		return false;
	}

   }

}
