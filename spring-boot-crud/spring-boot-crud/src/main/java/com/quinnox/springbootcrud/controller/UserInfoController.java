package com.quinnox.springbootcrud.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.springbootcrud.dto.LoanProcessingResponse;
import com.quinnox.springbootcrud.dto.UserInfo;
import com.quinnox.springbootcrud.service.UserInfoServices;

@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
@RestController

public class UserInfoController {
	
	@Autowired
	private UserInfoServices service;
	
	@Autowired
	private LoanProcessingResponse response;  
	
	@PostMapping(path = "/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LoanProcessingResponse registerUser(@RequestBody UserInfo user ) {

		if (service.registerUser(user)) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("User registered");
			return response;
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User already exists");
			return response;
		}
		
	}	
	@PostMapping(path="/login",produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public LoanProcessingResponse loginUser(@RequestBody UserInfo user , HttpServletRequest request) {
		UserInfo userBean = service.loginUser(user.getEmail(), user.getPassword());

		if (userBean != null) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Successfully logged in");
			response.setUsers(Arrays.asList(userBean));

			System.out.println(response);
			
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Credentials are invalid");
		}
		return response;
	}

//	@PutMapping(path = "/changepass", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public LoanProcessingResponse updateUserPassword(@RequestParam("email") String email,@RequestParam("password") String password,@RequestParam("newPassword") String newPassword ) {
//		
//		if(service.changePassword(email, password, newPassword))  {
//			response.setStatusCode(200);
//			response.setMessage("Success");
//			response.setDescription("Password updated successfully");
//		} else {
//			response.setStatusCode(401);
//			response.setMessage("Failure");
//			response.setDescription("Couldn't update your password");
//		}
//		return response;
//	}

	@DeleteMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public LoanProcessingResponse delete(@RequestParam("id") int id) {

		if (service.deleteUser(id)) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("deleted successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Application Id not found");
		}
		return response;
	}


}
