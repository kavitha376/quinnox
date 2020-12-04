package com.quinnox.springbootcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.springbootcrud.dto.LoanType;

@Repository
public class LoanTypeDaoImpl implements LoanTypeDao {


	@Autowired
	EntityManager manager;
    
	@Transactional
	@Override
	public boolean addLoanType(LoanType Type) {
		manager.persist(Type);
		return true;
	}

	@Transactional
	@Override
	public boolean updateLoanType(LoanType Type) {
		LoanType type1 = manager.find(LoanType.class, Type.getId());
		BeanUtils.copyProperties(Type,type1 );
			return true;
	}

	@Override
	public List<LoanType> getAllLoanType() {
		TypedQuery<LoanType> query = manager.createQuery("from LoanType",LoanType.class);
		return query.getResultList();
	}

	@Transactional
	@Override
	public boolean deleteLoanType(int id) {
		LoanType type = manager.find(LoanType.class, id);
		manager.remove(type);
		return true;
	}
	
//	@Override
//	@Transactional
//	public boolean addLoan(LoanType bean) {
//		double amount = bean.getLoanAmount();
//		double rateOfInterest = bean.getRateOfInterest();
//		double duration = bean.getDuration() * 12;
//		rateOfInterest = rateOfInterest / (12 * 100);
//		double result = (amount * rateOfInterest * Math.pow(1 + rateOfInterest, duration))
//				/ (Math.pow(1 + rateOfInterest, duration) - 1);
//		int emi = (int) result;
//		bean.setEmi(emi);
//	    manager.persist(bean);
//		manager.merge(bean);
//		
//		
//		return true;
//	}
//
//	@Override
//	@Transactional
//	public boolean updateLoan(LoanType bean) {
//		LoanType loanBean = manager.find(LoanType.class, bean.getId());
//		if (bean.getLoanType() != null) {
//			loanBean.setLoanType(bean.getLoanType());
//		} else {
//			loanBean.setLoanType(loanBean.getLoanType());
//		}
//		if (bean.getDuration() != 0) {
//			loanBean.setDuration(bean.getDuration());
//		} else {
//			loanBean.setDuration(loanBean.getDuration());
//		}
//		if (bean.getRateOfInterest() != 0) {
//			loanBean.setRateOfInterest(bean.getRateOfInterest());
//		} else {
//			loanBean.setRateOfInterest(loanBean.getRateOfInterest());
//		}
//		if (bean.getLoanAmount() != 0) {
//			loanBean.setLoanAmount(bean.getLoanAmount());
//		} else {
//			loanBean.setLoanAmount(loanBean.getLoanAmount());
//		}
//		double amount = bean.getLoanAmount();
//		double rateOfInterest = bean.getRateOfInterest();
//		double duration = bean.getDuration() * 12;
//		rateOfInterest = rateOfInterest / (12 * 100);
//		double result = (amount * rateOfInterest * Math.pow(1 + rateOfInterest, duration))
//				/ (Math.pow(1 + rateOfInterest, duration) - 1);
//		int emi = (int) result;
//		loanBean.setEmi(emi);
//
//		return true;
//	}
//
//	@Override
//	@Transactional
//	public LoanType searchLoanType(int id) {
//		LoanType bean = manager.find(LoanType.class, id);
//	
//		if (bean != null) {
//			return bean;
//		} 
//		return bean;
//	}
//
//	@Override
//	@Transactional
//	public List<LoanType> getAllLoans() {
//		String jpql = "from LoanType";
//		Query query = manager.createQuery(jpql);
//		List<LoanType> list = query.getResultList();
//		return list;
//	}
//
//	@Override
//	public boolean deleteLoanType(int id) {
//		LoanType bean = manager.find(LoanType.class, id);
//		if (bean != null) {
//		
//			manager.remove(bean);
//		}	
//			return true;
//	}

}
