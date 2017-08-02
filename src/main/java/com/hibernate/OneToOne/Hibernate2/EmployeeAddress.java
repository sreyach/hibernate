package com.hibernate.OneToOne.Hibernate2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class EmployeeAddress {
	@Id
	@GeneratedValue
	private int aptNo;
	private String street;
	private String city;
	private String state;
	private String zipCode;
	@OneToOne()
	@JoinColumn(name = "employeeId")
	Employee employee;

	public int getAptNo() {
		return aptNo;
	}

	public void setAptNo(int aptNo) {
		this.aptNo = aptNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Employee getCustomer() {
		return employee;
	}

	public void setCustomer(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + aptNo + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}
}
