package com.xworkz.has;

public class Appolo extends Hospital{

		public Patient[] Patients;
		int index;
		public Appolo(int size) 
		{
			Patients=new Patient[size];
		}		
		public boolean added(Patient Patient)
		{
			System.out.println("inside added method");
			boolean ispatientAdded=false;
			if(Patient!=null)
			{
				System.out.println("patient details are right");
				this.Patients[index++]=Patient;
				ispatientAdded=true;
				
			}
			return ispatientAdded;
		}
		public void getPatient()
		{
			System.out.println("=================");
			System.out.println("patient lists are:");
			for(int i=0;i<Patients.length;i++)
			{
				System.out.println(this.Patients[i].getPatientName());
				System.out.println(this.Patients[i].getAddress());
				System.out.println(this.Patients[i].getGender());
				System.out.println(this.Patients[i].getAge());
				System.out.println("=================");
			}
		}
		
		
		public void getPatientByName(String PatientName)
		{
			System.out.println("inside getpatientName");
			System.out.println("No of parameters : 1 : patientName(String)");
			for(int i=0;i<Patients.length;i++) {
				if(Patients[i].getPatientName().equals(PatientName))
				{
					System.out.println(Patients[i].getPatientName() +" "+ Patients[i].getAddress() +" "+ Patients[i].getGender() +" "+ Patients[i].getAge());
				}
				
			}
		}
			
			public void getPatientByAge(int Age)
			{
				System.out.println("inside getpatientName");
				System.out.println("No of parameters : 1 : patientName(String)");
				for(int i=0;i<Patients.length;i++) {
					if(Patients[i].getAge()==(Age))
					{
						System.out.println(Patients[i].getPatientName() +" "+ Patients[i].getAddress() +" "+ Patients[i].getGender() +" "+ Patients[i].getAge());
					}
					
				}
			}
				
				public void getPatientByGender(com.xworkz.has.constent.Gender gender)
				{
					System.out.println("inside getpatientName");
					System.out.println("No of parameters : 1 : patientName(String)");
					for(int i=0;i<Patients.length;i++) {
						if(Patients[i].getGender().equals(gender))
						{
							System.out.println(Patients[i].getPatientName() +" "+ Patients[i].getAddress() +" "+ Patients[i].getGender() +" "+ Patients[i].getAge());
						}
						
					}
				}
					public void getPatientByAddress(String address)
					{
						System.out.println("inside getpatientName");
						System.out.println("No of parameters : 1 : patientName(String)");
						for(int i=0;i<Patients.length;i++) {
							if(Patients[i].getAddress().equals(address))
							{
								System.out.println(Patients[i].getPatientName() +" "+ Patients[i].getAddress() +" "+ Patients[i].getGender() +" "+ Patients[i].getAge());
							}
							
						}
					}
						
						public void getPatientNameByGender(Gender gender)
						{
							System.out.println("inside getpatientName");
							System.out.println("No of parameters : 1 : patientName(String)");
							for(int i=0;i<Patients.length;i++) {
								if(Patients[i].getGender().equals(gender))
								{
									System.out.println(Patients[i].getPatientName());
								}
								
							}
						}
						
							
							public void getGenderByPatientName(String PatientName)
							{
								System.out.println("inside getpatientName");
								System.out.println("No of parameters : 1 : patientName(String)");
								for(int i=0;i<Patients.length;i++) {
									if(Patients[i].getPatientName().equals(PatientName))
									{
										System.out.println( Patients[i].getGender());
									}
									
								}	
		}
	}

//getPatientByAge(int age)
//getPatientByGender(Gender gender)
//getPatientByAddress(String address)
//getPatientNameByGender(Gender)
//getGenderByPatientName(String)
