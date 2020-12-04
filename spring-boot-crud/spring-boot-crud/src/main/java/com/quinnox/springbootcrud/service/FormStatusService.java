package com.quinnox.springbootcrud.service;

import java.util.List;

import com.quinnox.springbootcrud.dto.FormStatus;

public interface FormStatusService {
	
	public boolean addFormStatusDetails(FormStatus details);

	public boolean DeleteFormStatusDetails(FormStatus details) ;
	
	public boolean setDateDetails(FormStatus details) ;
	
	
	
	public boolean updateFormStatusDetails(FormStatus details);

	public FormStatus searchFormStatusDetails(int id);

	public List<FormStatus> getAllFormStatus();

//	public boolean deleteFormStatus(int applicationId);

public boolean requestLoans(FormStatus status, int applicationId);
	
//	public boolean removeLoansreq(int applicationId);
	

	


}
