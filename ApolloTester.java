package com.xworkz.has;

import java.util.Scanner;

import com.xworkz.has.constent.Gender;

public class ApolloTester {

	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		
		Appolo ap=new Appolo(size);
		
		for(int i=0;i<size;i++)
		{
			
		Patient patient=new Patient();
		//while(n<size)
		//{
		System.out.println("enter patient name:");
		patient.setPatientName(sc.next());
		System.out.println("enter patient age:");
		patient.setAge(sc.nextInt());
		System.out.println("enter patient address:");
		patient.setAddress(sc.next());
		
		System.out.println("enter patient gender:");
		patient.setGender(Gender.valueOf(sc.next()));
		
		ap.added(patient);
		n=n+1;
	
		
	}
		ap.getPatient();
		System.out.println("Enter the patient name to search");
		String PatientName=sc.next();
		ap.getPatientByName(PatientName);
		
		System.out.println("Enter the patient age to search");
		int Age=sc.nextInt();
		ap.getPatientByAge(Age);
		
		System.out.println("Enter the patient address to search");
		String Address=sc.next();
		ap.getPatientByAddress(Address);
		
		System.out.println("Enter the patient gender to search");
		// Gender=sc.next();
		ap.getPatientByGender(Gender.valueOf(sc.next()));
	
		
		System.out.println("Enter the patient name to search patient gender");
		ap.getGenderByPatientName(sc.next());		
		
		System.out.println("enter gender to search patient name");
		ap.getPatientByGender(Gender.valueOf(sc.next()));
		//ap.getPatientByName(PatientName);
		
//		ap.getPatientByName(PatientName);
//		System.out.println("Enter the patient name");
//		String age=sc.next();
//		ap.getPatientByName(PatientName);
//		
//		ap.getPatientByAge(size);
//		System.out.println("Enter the patient name");
//		String Age=sc.next();
//		ap.getPatientByAge(size);
//		
//		ap.getPatientByAddress(address);
//		System.out.println("Enter the patient name");
//		String address=sc.next();
//		ap.getPatientByName(address);
//		
//		ap.getPatientNameByGender(gender);
//		System.out.println("Enter the patient name");
//		String gender=sc.next();
//		ap.getPatientByName(gender);
//		
//		ap.getGenderByPatientName(PatientName);
//		System.out.println("Enter the patient name");
//		String PatientName=sc.next();
//		ap.getPatientByName(PatientName1);
		
		
		
		//getPatientByGender(Gender gender)
		//getPatientByAddress(String address)
		//getPatientNameByGender(Gender)
		//getGenderByPatientName(String)
		
		
		
	}
	

}
