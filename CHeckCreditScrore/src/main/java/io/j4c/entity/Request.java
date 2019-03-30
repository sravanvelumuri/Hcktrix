package io.j4c.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="registration")
public class Request {
	
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	private String id;
	
	@Column(name="NAME")
	String name;
	@Column(name="PAN")
	String pan;
	@Column(name="ADHAAR")
	String adhaar;
	@Column(name="SALARY")
	String salary;
	@Column(name="LOANAMOUNT")
	String loanAmount;
	@Column(name="STATUS")
	String status;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAdhaar() {
		return adhaar;
	}
	public void setAdhaar(String adhaar) {
		this.adhaar = adhaar;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
