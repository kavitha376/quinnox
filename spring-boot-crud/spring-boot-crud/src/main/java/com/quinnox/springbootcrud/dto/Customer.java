package com.quinnox.springbootcrud.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	
	@Id
	@Column(name="applicationId")
	@GeneratedValue
	private int applicationId;
	@Column(name="customerName")
	private String customerName;
//	@Column(unique = true, nullable = false)
	@Column(name="email")
	private String email;
	@Column(name="customerPhoneNo")
	private int customerPhoneNo;
	@Column(name="address")
	private String address;
	@Column(name="dateOfBirth")
	private String dateOfBirth;
	@Column(name=" gender")
	private String gender;
	@Column(name="occupation")
	private String occupation;
	@Column(name="annualIncome")
	private double  annualIncome;
//	@Column
//	private String panCardNumber;
	@Column(name="assurerName")
	private String assurerName;
	@Column(name="assurerContactNumber")
	private int assurerContactNumber;
	@Column(name="assurerAddress")
	private String assurerAddress;
	@Column(name="loanType")
	private String loanType;
	@Column(name="loanAmount")
	private double loanAmount;
	
	@Column(name="status")
	private String status="pending";
	
	@Column(name="interviewDate")
	private String interviewDate;
	
  
	public String getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCustomerPhoneNo() {
		return customerPhoneNo;
	}

	public void setCustomerPhoneNo(int customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getAssurerName() {
		return assurerName;
	}

	public void setAssurerName(String assurerName) {
		this.assurerName = assurerName;
	}

	public int getAssurerContactNumber() {
		return assurerContactNumber;
	}

	public void setAssurerContactNumber(int assurerContactNumber) {
		this.assurerContactNumber = assurerContactNumber;
	}

	public String getAssurerAddress() {
		return assurerAddress;
	}

	public void setAssurerAddress(String assurerAddress) {
		this.assurerAddress = assurerAddress;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
	
	
	

}
