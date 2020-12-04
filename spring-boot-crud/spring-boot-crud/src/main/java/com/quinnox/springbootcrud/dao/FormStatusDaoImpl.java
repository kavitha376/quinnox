package com.quinnox.springbootcrud.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.springbootcrud.dto.Customer;
import com.quinnox.springbootcrud.dto.FormStatus;
import com.quinnox.springbootcrud.dto.LoanType;

import net.bytebuddy.asm.Advice.Return;

@Repository
public class FormStatusDaoImpl implements FormStatusDao {

	@Autowired
	EntityManager manager;
	
	@Autowired
   CustomerDao CustomerDao;
	
	@Override
	@Transactional
	public boolean addFormStatusDetails(FormStatus details) {
		
		if (CustomerDao.searchCustomer(details.getApplicationId()) != null) {
			Customer customer1 = CustomerDao.searchCustomer(details.getApplicationId());
			if (customer1.getAnnualIncome() > customer1.getLoanAmount()) {

				details.setStatus("Accepted ");
				SimpleDateFormat sdf = new SimpleDateFormat();
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DAY_OF_MONTH, 9);
				String newDate = sdf.format(calendar.getTime());
				details.setInterviewDate(newDate);
				

				
			} else {
				details.setStatus("not eligible try again ");
				
			}
		 
		}
		manager.persist(details);
		
		return true;
	}

//	@Override
//	@Transactional
//	public boolean DeleteFormStatusDetails(FormStatus details) {
//		
//		if (CustomerDao.searchCustomer(details.getApplicationId()) != null) {
//			Customer customer1 = CustomerDao.searchCustomer(details.getApplicationId());
//			if (customer1 != null) {
//				
//				manager.remove(customer1);
//				details.setStatus("Rejected");
//			}
//				
//				
//			
//		 
//		}
//		manager.persist(details);
//		
//		return true;
//	}

//	@Override
//	@Transactional
//	public boolean updateFormStatusDetails(FormStatus details) {
//		FormStatus statusBean = manager.find(FormStatus.class, details.getId());
//		if (details.getId() != 0) {
//			statusBean.setId(details.getId());
//		} else {
//			statusBean.setApplicationId(statusBean.);
//		}
//		if (bean.getInterviewDate() != null) {
//			statusBean.setInterviewDate(bean.getInterviewDate());
//		} else {
//			statusBean.setInterviewDate(statusBean.getInterviewDate());
//		}
//		if (bean.getStatus() != null) {
//			statusBean.setStatus(bean.getStatus());
//		} else {
//			statusBean.setStatus(statusBean.getStatus());
//		}
//		return true;
//	}

	@Override
	@Transactional
	public FormStatus searchFormStatusDetails(int id) {
		
		FormStatus bean = manager.find(FormStatus.class, id);
		
		if (bean != null) {
			return bean;
		}
		return bean;
	
	}

	@Override
	@Transactional
	public List<FormStatus> getAllFormStatus() {
		String jpql = "from FormStatus";
		Query query = manager.createQuery(jpql);
		List<FormStatus> list = query.getResultList();
		return list;
	}

//	@Override
//	@Transactional
//	public boolean deleteFormStatus(int applicationId) {
//		FormStatus status = manager.find(FormStatus.class,applicationId);
//		
////			manager.remove(type);
////			manager.remove(status );
//			status.setStatus("declined");
//		
//		return true;
//	}

	@Override
	public boolean updateFormStatusDetails(FormStatus details) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public boolean requestLoans(FormStatus status, int applicationId) {
	     Customer cust = new Customer();
			cust.setApplicationId(applicationId);
			cust.getCustomerName();
		
			
				manager.merge(cust);
				
				return true;
			
	}

	@Override
	@Transactional
	public boolean DeleteFormStatusDetails(FormStatus details) {
		if (CustomerDao.searchCustomer(details.getApplicationId()) != null) {
			Customer customer1 = CustomerDao.searchCustomer(details.getApplicationId());
			if (customer1.getAnnualIncome() > customer1.getLoanAmount()) {
			  
				details.setStatus("Rejected");
				details.setInterviewDate("Not eligible for loan");
				
			} else {
				details.setStatus("Rejected");
				details.setInterviewDate("Not eligible for loan");
				
			}
		 
		}
		manager.persist(details);
		
		return true;
	}

	@Transactional
	@Override
	public boolean setDateDetails(FormStatus details) {
		
		if (CustomerDao.searchCustomer(details.getApplicationId()) != null) {
			Customer customer1 = CustomerDao.searchCustomer(details.getApplicationId());
			if (customer1.getAnnualIncome() > customer1.getLoanAmount()) {
//		  details.setApplicationId(applicationId);
				String dateInString = "2020-11-30";  // Start date
			    
				SimpleDateFormat sdf = new SimpleDateFormat();
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DAY_OF_MONTH, 9);
				String newDate = sdf.format(calendar.getTime());
				details.setInterviewDate(dateInString);
//				details.setStatus("Pending");
//				details.setInterviewDate("interview will shedule soon");
				
			} 
		 
		}
		manager.persist(details);
		
		return true;
		}
}

//	@Override
//	@Transactional
//	public boolean removeLoansreq(int applicationId) {
//		FormStatus status = manager.find(FormStatus.class,applicationId);
//		if (status == null) {
//			return false;
//		}
//		
//		manager.remove(status);
//		return true;
//
//	}

	
//}
