 package com.alanlyu.springdemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.alanlyu.springdemo.service.BusinessService;
import com.alanlyu.springdemo.serviceimpl.EcommerceServiceImpl;

public class Organization {
	private String companyName;
	private int yearOfIncorporation;
	
	@Value("${org.postalCode}")
	private String postalCode;
	private int employeeCount;
	private String slogan;
	private BusinessService businessService;
	
	@Autowired
	public void setSlogan(@Value("${org.slogan}") String slogan) {
		this.slogan = slogan;
		System.out.println("setSlogan called");
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public Organization(){
		System.out.println("default constructor called");
	}
	public String corporateSlogan(){
		return slogan;
	}
	
	public void postConstruct(){
		System.out.println("organization:postConstruct");
	}
	
	public void preDestroy(){
		System.out.println("organization:preDestroy");
	}
	
	public String corporateService(){
		return businessService.offerService(companyName);
	}
	
	
	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + ", slogan=" + slogan + "]";
	}

	public Organization(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		System.out.println("constructor called");
	}

	

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		System.out.println("setEmployeeCount called");
	}
	
	
}
