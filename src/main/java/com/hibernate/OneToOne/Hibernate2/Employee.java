package com.hibernate.OneToOne.Hibernate2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee", schema = "sreya")
public class Employee {
	@Id
	@GeneratedValue
	private int employeeId;
	private String name;
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private EmployeeAddress address;

	public String getName() {
		return name;
	}

	public int getemployeeId() {
		return employeeId;
	}

	public void setemployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [Employeer Id=" + employeeId + ", name=" + name + ", Employee address=" + address + "]";
	}

}