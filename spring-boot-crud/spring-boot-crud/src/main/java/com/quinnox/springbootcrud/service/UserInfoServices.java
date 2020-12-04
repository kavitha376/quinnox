package com.quinnox.springbootcrud.service;

import com.quinnox.springbootcrud.dto.UserInfo;

public interface UserInfoServices {
	
	public boolean registerUser(UserInfo user);

	public UserInfo loginUser(String email, String password);

//	public boolean updatePassword(String email, String password);
	public boolean changePassword(String email,String password,String newPassword);

	
	public boolean deleteUser(int id);

}
