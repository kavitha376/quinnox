package com.quinnox.springbootcrud.service;

import java.util.List;

import com.quinnox.springbootcrud.dto.LoanType;

public interface LoanTypeService {

//	public boolean addLoan(LoanType bean);
//
//	public boolean updateLoan(LoanType bean);
//	
//	public LoanType searchLoanType(int id);
//	public List<LoanType> getAllLoans();
//	public boolean deleteLoanType(int id);
	
	
	public boolean addLoanType(LoanType Type);
	public boolean updateLoanType(LoanType Type);
	
	public List<LoanType> getAllLoanType();
    
    public boolean deleteLoanType(int id);
}
