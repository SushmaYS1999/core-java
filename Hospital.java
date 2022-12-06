package com.xworkz.has;

public class Hospital {
	public Patient patient;
	public boolean isEmergency;
	public boolean isTreatementRequired;
	
	public boolean admit(Patient patient)
	{ 
		boolean isAdmited=false;
		if(isTreatementRequired==true)
		{
			if(isEmergency==true)
			{
				this.patient=patient;
				this.patient.displayInfo();
			
				System.out.println("patient can be allowed in ICU");
				//isAdmited=true;	
			}
			else
			{
				System.out.println("Add the patient in general ward:)");
			}
		}
		else
		{
			isAdmited=true;
			System.out.println("NoTreatement Required..maneg hogi Enjoy madi...!!");
		}
			
		return isAdmited;
	}
}