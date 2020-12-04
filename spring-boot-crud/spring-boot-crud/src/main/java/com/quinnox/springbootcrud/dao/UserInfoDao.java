package com.quinnox.springbootcrud.dao;

import com.quinnox.springbootcrud.dto.UserInfo;


public interface UserInfoDao {
	public boolean registerUser(UserInfo user);

	public UserInfo loginUser(String email, String password);
	
	public boolean changePassword(String email,String password,String newPassword);

//	public boolean updatePassword(String email, String password);
	
	public boolean deleteUser(int id);

}
