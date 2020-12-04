package com.quinnox.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.springbootcrud.dao.LoanTypeDao;
import com.quinnox.springbootcrud.dto.LoanType;

@Service
public class LoanTypeServiceImpl implements LoanTypeService{
  
	@Autowired
	private LoanTypeDao dao;

	@Override
	public boolean addLoanType(LoanType Type) {
		
		return dao.addLoanType(Type);
	}

	@Override
	public boolean updateLoanType(LoanType Type) {
		
		return dao.updateLoanType(Type);
	}

	@Override
	public List<LoanType> getAllLoanType() {
		
		return dao.getAllLoanType();
	}

	@Override
	public boolean deleteLoanType(int id) {
		
		return dao.deleteLoanType(id);
	}
	
	
	
//	@Override
//	public boolean addLoan(LoanType bean) {
//		return dao.addLoan(bean);
//	}
//
//	@Override
//	public boolean updateLoan(LoanType bean) {
//		
//		return dao.updateLoan(bean);
//	}
//
//	@Override
//	public LoanType searchLoanType(int id) {
//	
//		return dao.searchLoanType(id);
//	}
//
//	@Override
//	public List<LoanType> getAllLoans() {
//		
//		return dao.getAllLoans();
//	}
//
//	@Override
//	public boolean deleteLoanType(int id) {
//		
//		return dao.deleteLoanType(id);
//	}
//	

}
