package com.hibernate.ManyToMany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Consultant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long consultantid;
    private String consultantName;
    private LocalDate dob;
    private String phoneNumber;
	
	

//	@Version
//	private LocalDateTime updatedDateTime;

	@ManyToMany(fetch = FetchType.LAZY,cascade =
        {
                CascadeType.DETACH,
                CascadeType.MERGE,
                CascadeType.REFRESH,
                CascadeType.PERSIST
        }, targetEntity=Vendor.class)
	@JoinTable(name = "consultant_Vendor", joinColumns = {
			@JoinColumn(name = "consultantId", nullable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "VendorId", nullable = false) 
	})	
	private List<Vendor> vendors = new ArrayList<>();

	public Consultant() {
		super();
	}

	public Consultant(Long consultantId, String consultantName, LocalDate dob,
			String phoneNumber) {
		super();
		this.consultantName = consultantName;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		//this.updatedDateTime = LocalDateTime.now();
	}

	
	public Long getConsultantid() {
		return consultantid;
	}

	public void setConsultantid(Long consultantid) {
		this.consultantid = consultantid;
	}

	public String getConsultantName() {
		return consultantName;
	}

	public void setConsultantName(String consultantName) {
		this.consultantName = consultantName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

//	public LocalDateTime getUpdatedDateTime() {
//		return updatedDateTime;
//	}
//
//	public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
//		this.updatedDateTime = updatedDateTime;
//	}

	public List<Vendor> getVendors() {
		return vendors;
	}

	public void setVendors(List<Vendor> vendors) {
		this.vendors = vendors;
	}

	
	
}
