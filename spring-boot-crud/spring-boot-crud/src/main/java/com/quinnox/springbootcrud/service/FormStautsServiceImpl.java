package com.quinnox.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.springbootcrud.dao.FormStatusDao;
import com.quinnox.springbootcrud.dto.FormStatus;

@Service
public class FormStautsServiceImpl implements FormStatusService {
 
	@Autowired
	private FormStatusDao dao;
	
	
	@Override
	public boolean addFormStatusDetails(FormStatus details) {
		return dao.addFormStatusDetails(details);
	}

	@Override
	public boolean updateFormStatusDetails(FormStatus details) {
		
		return dao.updateFormStatusDetails(details);
	}

	@Override
	public FormStatus searchFormStatusDetails(int id) {
		
		return dao.searchFormStatusDetails(id);
	}

	@Override
	public List<FormStatus> getAllFormStatus() {
	
		return dao.getAllFormStatus();
	}

//	@Override
//	public boolean deleteFormStatus(int applicationId) {
//		
//		return dao.deleteFormStatus(applicationId);
//	}

	@Override
	public boolean requestLoans(FormStatus status, int applicationId) {
	
		return dao.requestLoans(status, applicationId);
	}

	@Override
	public boolean DeleteFormStatusDetails(FormStatus details) {
				return  dao.DeleteFormStatusDetails(details);
	}

	@Override
	public boolean setDateDetails(FormStatus details) {
		
		return dao.setDateDetails(details);
	}

//	@Override
//	public boolean removeLoansreq(int applicationId) {
//		
//		return dao.removeLoansreq(applicationId);
//	}


}
