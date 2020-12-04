package com.quinnox.springbootcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.springbootcrud.dao.UserInfoDao;
import com.quinnox.springbootcrud.dto.UserInfo;

@Service
public class UserInfoServicesImpl implements UserInfoServices {

	@Autowired
	private UserInfoDao dao;
	
	
	@Override
	public boolean registerUser(UserInfo user) {
		
		return dao.registerUser(user);
	}

	@Override
	public UserInfo loginUser(String email, String password) {
		
		return dao.loginUser(email, password);
	}

//	@Override
//	public boolean updatePassword(String email, String password) {
//		
//		return dao.updatePassword(email,password);
//	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return dao.deleteUser(id);
	}

	@Override
	public boolean changePassword(String email, String password, String newPassword) {
		
		return dao.changePassword(email, password, newPassword);
	}

}
