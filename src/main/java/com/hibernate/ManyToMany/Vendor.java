package com.hibernate.ManyToMany;


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
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vendorId;
	private String vendorName;
	

//	@Enumerated(EnumType.ORDINAL)
//	private SkillLevel level;
//	private String description;
//	private String prereqs;
//	private BigDecimal fee;
//	private String endGoal;
//	private String type;

	@ManyToMany(fetch = FetchType.LAZY, cascade =
        { CascadeType.DETACH,
                CascadeType.MERGE,
                CascadeType.REFRESH,
                CascadeType.PERSIST
        },targetEntity=Consultant.class)
	@JoinTable(name = "Consultant_Vendor", joinColumns = {
			@JoinColumn(name = "vendorId", nullable = false) }, inverseJoinColumns = {
			@JoinColumn(name = "consultantId", nullable = false) })
	private List<Consultant> consultants = new ArrayList<>();
	
	
//	@Version
//	private LocalDateTime updatedDateTime;

//	@Transient
//	private String authorFullName;

	public Vendor() {

	}

	public Vendor(Long vendorId, String vendorName) {
		super();
		this.vendorId=vendorId;
		this.vendorName=vendorName;
		//this.updatedDateTime = LocalDateTime.now();
	}

	public Long getVendorId() {
		return vendorId;
	}

	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public List<Consultant> getConsultants() {
		return consultants;
	}

	public void setConsultants(List<Consultant> consultants) {
		this.consultants = consultants;
	}

//	public List<Topic> getJobs() {
//		return jobs;
//	}
//
//	public void setJobs(List<Topic> jobs) {
//		this.jobs = jobs;
//	}
//
//	public LocalDateTime getUpdatedDateTime() {
//		return updatedDateTime;
//	}
//
//	public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
//		this.updatedDateTime = updatedDateTime;
//	}

	
}

