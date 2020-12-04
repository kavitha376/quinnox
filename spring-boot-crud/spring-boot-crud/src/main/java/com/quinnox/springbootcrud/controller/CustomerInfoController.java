package com.quinnox.springbootcrud.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.springbootcrud.dto.Customer;
import com.quinnox.springbootcrud.dto.LoanProcessingResponse;
import com.quinnox.springbootcrud.dto.LoanType;
import com.quinnox.springbootcrud.service.CustomerService;

@CrossOrigin
@RestController
public class CustomerInfoController {
	
	@Autowired
	private CustomerService service;
	
	@Autowired
	private LoanProcessingResponse response;
	
	@PostMapping(path = "/add-customer", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LoanProcessingResponse addCust(@RequestBody Customer customer) {
		if (service.addCustomer(customer)) {
			response.setStatusCode(200);
			response.setMessage("Successfully applied for loan");
			response.setDescription("Customer added successfully");
			response.setCustomer(Arrays.asList(customer));
			return response;

		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Customer not added");
			return response;
		}
		
	}
	
	@PutMapping(path = "/add-req/{applicationId}")
	public LoanProcessingResponse addReq(@PathVariable int applicationId) {
		if (service.addReq(applicationId)) {
			response.setStatusCode(200);
			response.setMessage("Successfully applied for loan");
			response.setDescription("Customer added successfully");
//			response.setCustomer(Arrays.asList());
			return response;

		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Customer not added");
			return response;
		}
		
	}
	@PutMapping(path = "/del-req/{applicationId}")
	public LoanProcessingResponse delReq(@PathVariable int applicationId) {
		if (service.delReq(applicationId)) {
			response.setStatusCode(200);
			response.setMessage("Successfully applied for loan");
			response.setDescription("Customer added successfully");
//			response.setCustomer(Arrays.asList());
			return response;

		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Customer not added");
			return response;
		}
		
	}
	
	
	

	@DeleteMapping(path = "/delete-customer")
	public LoanProcessingResponse deleteCustomer( int applicationId) {

		if (service.deleteCustomer(applicationId)) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("Customer deleted successfully");
			return response;
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Customer not deleted");
			return response;
		}
		
	}
	
	@GetMapping(path = "/getallcustomer", produces = MediaType.APPLICATION_JSON_VALUE)
	public LoanProcessingResponse getAllCustomers() {

		List<Customer> list = service.getAllCustomers();
		if (list != null && !list.isEmpty()) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("Customers found");
			response.setCustomer(list);
			
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Customers not found");
		}
		return response;
	}
	
	@GetMapping(path = "/get-customer/{applicationId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LoanProcessingResponse getCustomer(@PathVariable("applicationId") int applicationId) {
		
		Customer customer = service.searchCustomer(applicationId);
		if (customer != null) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("Application Id found successfully");
			response.setCustomer(Arrays.asList(customer));
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Customer Id is not present");
		}
		return response;
	}

	@PostMapping(path = "/allocated/{applicationId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LoanProcessingResponse  addLoanReg(@PathVariable("applicationId")int applicationId,@RequestBody Customer customer,HttpServletRequest request) {
		if (service.requestCust(customer, applicationId)) {
			System.out.println(service.deleteCustomer(customer.getApplicationId()));
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("data  successfully stored..");
			return response;
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not successfully stored..");
			return response;
		}
		
		
		
	}
	
	@GetMapping(path = "/viewreqs", produces = MediaType.APPLICATION_JSON_VALUE)
	public LoanProcessingResponse getAllCustreqs() {
	List<Customer> req = service.getAllCustomers();
	if(req!=null) {
		response.setStatusCode(200);
		response.setMessage("success");
		response.setDescription("data  successfully stored..");
		response.setCustomer(req);
		return response;
	} else {
		response.setStatusCode(401);
		response.setMessage("failure");
		response.setDescription("data not successfully stored..");
		return response;
	}
		
	
	}
	@PutMapping(path = "/update-status/{applicationId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LoanProcessingResponse updateLoanType( @PathVariable int applicationId) {
		
		if (service.updateCustomer(applicationId)) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Loan  updated");
			return response;
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Application Id not found");
			return response;
		}
		
	}
	
	

}
