package com.xworkz.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("personName")
	private String name;
	@Autowired
	@Qualifier("Salary")
	private Double salary;
	@Autowired
	@Qualifier("company")
	private String companyName;
	@Autowired
	@Qualifier("experience")
	private int exp;
	@Override
	
	
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName + ", exp=" + exp
				+ "]";
	}
	
	
	
}
