package com.quinnox.springbootcrud.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.springbootcrud.dto.LoanProcessingResponse;
import com.quinnox.springbootcrud.dto.UserInfo;


@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	@Autowired
	EntityManager manager;
	
	UserInfo user = new UserInfo();

	@Override
	@Transactional
	public boolean registerUser(UserInfo user) {
	    manager.persist(user);
		return true;
	}

	@Override
	public UserInfo loginUser(String email, String password) {
		String jpql="from UserInfo where email=:email and password=:password";
		Query query=manager.createQuery(jpql);
		query.setParameter("email",email);
		query.setParameter("password",password);
		
		return (UserInfo) query.getSingleResult();
	}
	
	
//	@Override
//	@Transactional
//	public boolean updatePassword(String email, String password) {
//			user = manager.find(UserInfo.class, user.getId());
//
//	         user.setEmail(user.getEmail());
//			user.setPassword(user.getPassword());
//
//		
//		return true;
//	}

	@Override
	@Transactional
	public boolean deleteUser(int id ) {
		UserInfo userBean = manager.find(UserInfo.class, id);
		if (userBean != null) {
			manager.remove(userBean);
		
		}
	return true;
		
	
	}

//	@Override
//	public boolean changePassword(String email, String password, String newPassword) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	@Transactional
	public boolean changePassword(String email, String password, String newPassword) {
		String jpql="from UserInfo where email=:email and password=:password";
		Query query=manager.createQuery(jpql);
		query.setParameter("email",email);
		query.setParameter("password",password);
	 UserInfo dto = (UserInfo)query.getSingleResult();
	 if(dto != null) {
		 dto.setPassword(newPassword);
	 }
		 return true;
	 
	}

	
}


