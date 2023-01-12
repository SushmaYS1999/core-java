package com.xworkz.configuration.bean;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	@Value("Pooja")
	private String name;
	private String gender;
	@Value("Sringari")
	private String location;
	private int age;
	@Value("5.5")
	private double height;
	private LocalDate dateOfBirth;
	private LocalDate dateOfDeath;
	private boolean isSiblings;
	@Value("9181615")
	private int phoneNumber;
	@Value("true")
	private boolean isAdharcard;
	
	
	public Ghost(@Qualifier("gender")String gender, @Qualifier("GostAge") int age, @Qualifier("dateOfBirth")LocalDate dateOfBirth, @Qualifier("dateOfDeath")LocalDate dateOfDeath, @Qualifier("isSiblings")boolean isSiblings, @Qualifier("isAdharCard")boolean isAdharcard) {
		super();
		this.gender = gender;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.dateOfDeath = dateOfDeath;
		this.isSiblings = isSiblings;
		this.isAdharcard = isAdharcard;
	}
	
	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", location=" + location + ", age=" + age + ", height="
				+ height + ", dateOfBirth=" + dateOfBirth + ", dateOfDeath=" + dateOfDeath + ", isSiblings="
				+ isSiblings + ", phoneNumber=" + phoneNumber + ", isAdharcard=" + isAdharcard + "]";
	}
	
	
	
	
	
}
