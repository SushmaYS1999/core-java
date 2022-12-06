package com.xworkz.has;

import com.xworkz.has.constent.Gender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Patient {
	private  String patientName;
	private  String address;
	private  Gender gender;
	private  int age;
	
////	public Patient(String patientName, String address, Gender gender, int age) {
////		this.patientName = patientName;
////		this.address = address;
////		this.gender = gender;
////		this.age = age;
//	}
	public void displayInfo()
	{
		System.out.println("patient name is:" +this.patientName);
		System.out.println("patient address is:" +this.address);
		System.out.println("patient gender is:" +this.gender);
		System.out.println("patient age is:" +this.age);
	}
	
}
