package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dam {
	public static void main(String[] args) {
	
	String dam1="Gajanur";
	String dam2="Almatti";
	String dam3="Basava Sagar";
	String dam4="Hidkal";
	String dam5="Markonahalli";
	String dam6="Vani Vilasa Sagara";
	String dam7="Lakkavalli";
	String dam8="Hemavathi Reservoir";
	String dam9="Kabini Reservoir";
	String dam10="Harangi";
	String dam11="Krishna Raja Sagara";
	String dam12="Linganamakki";
	String dam13="Chakra Reservoir";
	String dam14="Supa";
	String dam15="Kodasalli";
	String dam16="Kadra";
	String dam17="Shanti Sagara";
	String dam18="Karanja";
	String dam19="Ballasamudra";
	String dam20="Devaramardikere";
	String dam21="Shirur";
	String dam22="Nugu";
	String dam23="Maralvadi";
	String dam24="Almatti";
	String dam25="Bheemasamudra";
	String dam26="Chiklihole";
	String dam27="Bennithora";
	String dam28="Arkavathi";
	String dam29="Tunga Bhadra";
	
	Collection<String>dams=new ArrayList<String>();
	dams.add(dam1);
	dams.add(dam2);
	dams.add(dam3);
	dams.add(dam4);
	dams.add(dam5);
	dams.add(dam6);
	dams.add(dam7);
	dams.add(dam8);
	dams.add(dam9);
	dams.add(dam10);
	dams.add(dam11);
	dams.add(dam12);
	dams.add(dam13);
	dams.add(dam14);
	dams.add(dam15);
	dams.add(dam16);
	dams.add(dam17);
	dams.add(dam18);
	dams.add(dam19);
	dams.add(dam20);
	dams.add(dam21);
	dams.add(dam22);
	dams.add(dam23);
	dams.add(dam24);
	dams.add(dam25);
	dams.add(dam26);
	dams.add(dam27);
	dams.add(dam28);
	dams.add(dam29);
	
	System.out.println("total dams are:"+dams.size());
	System.out.println("========STARTS WITH T=======");
	Iterator<String> Dam = dams.iterator();
	while(Dam.hasNext())
	{
		String element = Dam.next();
		if(element.startsWith("T"))
		{
			System.out.println("element starts with T:"+element);
		}
	}
	System.out.println("=========ENDS WITH RA========");
	
	Iterator<String> Dam1 = dams.iterator();
	while(Dam1.hasNext())
	{
		String element = Dam1.next();
		if(element.endsWith("ra"))
		{
			System.out.println("element ends with ra:"+element);
		}
	}
	System.out.println("=========OVER 15 CHARACTERS=======");
	
	Iterator<String> Dam2 = dams.iterator();
	while(Dam2.hasNext())
	{
		String element = Dam2.next();
		if(element.length()>=15)
		{
			System.out.println("element over 15 character :"+element);
		}
	}
	System.out.println("========UPPER CASE============");
	
	for(String element : dams)
	{
		
			System.out.println(element.toUpperCase());
		
	}
	
	
	System.out.println("=========LOWER CASE==========");
	
	for(String element : dams)
	{
		
			System.out.println(element.toLowerCase());
		
	}
	
System.out.println("========REMOVE ELEMENT========");
	
	Iterator<String> Dam5 = dams.iterator();
	while(Dam5.hasNext())
	{
		String element = Dam5.next();
		if(element.contains("p"))
		{
			System.out.println("remove element in p :"+element);
			Dam5.remove();
			System.out.println("total dams are:"+dams.size());
		}
	}
	
	System.out.println("========polindrome of dam========");
	

	Iterator<String> itr5=dams.iterator();
	while(itr5.hasNext())
	{
		String rev="";
		String element=itr5.next();

		for(int i=element.length()-1 ; i>=0;i--)
		{
			rev=rev+element.toLowerCase().charAt(i);
		}
		System.out.println(rev);
	
		if(element.equals(rev))
		{
			System.out.println("========================");
			System.out.println("element is polindrome "+element);
		}
			
		}
	}
}