package com.quinnox.springbootcrud.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class FormStatus {
	@Id
	@Column
	@GeneratedValue
	private int id;
//	@Id
	@Column(name="applicationId")
	private int applicationId;
//	@Column
//	private String interviewDate;
	@Column(name="interviewDate")
	private String interviewDate;
	@Column(name="status")
	private String status="Pending";
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="formstatus",referencedColumnName ="id" )
//	private List<Customer> cust = new ArrayList();
//	
	
      public int getId() {
		return id;
	}
	public void setId(int id) {
	this.id = id;
	}
//	public List<Customer> getCust() {
//		return cust;
//	}
//	public void setCust(List<Customer> cust) {
//		this.cust = cust;
//	}


	public String getInterviewDate() {
		return interviewDate;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
  
	
}
