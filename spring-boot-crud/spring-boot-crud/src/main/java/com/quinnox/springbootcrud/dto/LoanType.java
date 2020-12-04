package com.quinnox.springbootcrud.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "loanType")
public class LoanType {
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String loanType;
	@Column
	private double duration;
	@Column
	private double rateOfInterest;
//	@Column
//	private int emi;
	@Column
	private double loanAmount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
//	public int getEmi() {
//		return emi;
//	}
//	public void setEmi(int emi) {
//		this.emi = emi;
//	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


}
