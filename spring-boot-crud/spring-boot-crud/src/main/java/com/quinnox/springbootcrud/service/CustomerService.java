package com.quinnox.springbootcrud.service;

import java.util.List;

import com.quinnox.springbootcrud.dto.Customer;

public interface CustomerService {
	
	public boolean addCustomer(Customer customer);
	public boolean addReq(int applicationId);

	public boolean delReq(int applicationId);

	
	public boolean deleteCustomer(int applicationId);

	public Customer searchCustomer(int applicationId);

	public List<Customer> getAllCustomers();

	public boolean updateCustomer(int  applicationId);
	
	public boolean requestCust(Customer customer,int applicationId);


}
