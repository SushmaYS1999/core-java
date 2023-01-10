package com.xworkz.things;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz")
public class SuperConfiguration {
	
	@Bean
	public String getString()
	{
		System.out.println("creating a string of get");
		
		return "hii";	
	}
	
	@Bean
	public String rat()
	{
		System.out.println("creating a float of rat");
		String s = "how are you";
		return s;
	}
	
	@Bean
	public String bird()
	{
		System.out.println("creating a string of bird");
		
		return "fly";
	}
	
	@Bean
	public String flower()
	{
		System.out.println("creating a string of flower");
		String b = "bundle of flower";
		return b;
	}
	
	@Bean
	public String child()
	{
		System.out.println("creating a string of child");
		return "beautifull heart";
	}
	
	
	@Bean
	public boolean cost()
	{
		System.out.println("true or false");
		return false;
		
	}
	
	@Bean
	public boolean temp()
	{
		System.out.println("true or false");
		return false;
		
	}
	@Bean
	public boolean fever()
	{
		System.out.println("true or false");
		return true;
		
	}
	@Bean
	public boolean percentage()
	{
		System.out.println("true or false");
		return false;
		
	}
	@Bean
	public boolean radious()
	{
		System.out.println("true or false");
		return true;
		
	}
	
	
	@Bean
	public double d1()
	{
		System.out.println("creating bollean ");
		return 1;
		
	}
	
	@Bean
	public double d2()
	{
		System.out.println("creating boolean ");
		return 1;
		
	}
	@Bean
	public double d3()
	{
		System.out.println("creating boolean");
		return 2;
		
	}
	@Bean
	public double d4()
	{
		System.out.println("creating boolean");
		return 3;
		
	}
	@Bean
	public double d5()
	{
		System.out.println("creating boolean");
		return 4;
		
	}
	
	@Bean
	public StringBuffer sb1()
	{
		System.out.println("buffering 1");
		StringBuffer sb1=new StringBuffer("buffering 1");
		return sb1;
		
	}
	
	@Bean
	public StringBuffer sb2()
	{
		System.out.println("buffering 2");
		StringBuffer sb2=new StringBuffer("buffering 2");
		return sb2;
		
	}
	@Bean
	public StringBuffer sb3()
	{
		System.out.println("buffering 3");
		StringBuffer sb3=new StringBuffer("buffering 3");
		return sb3;
		
	}
	@Bean
	public StringBuffer sb4()
	{
		System.out.println("buffering 4");
		StringBuffer sb4=new StringBuffer("buffering 4");
		return sb4;
		
	}
	@Bean
	public StringBuffer sb5()
	{
		System.out.println("buffering 5");
		StringBuffer sb5=new StringBuffer("buffering 5");
		return sb5;
		
	}
	
	@Bean
	public StringBuilder sbuilder1()
	{
		System.out.println("buildering 1");
		StringBuilder sbuilder1=new StringBuilder("buildering 1");
		return sbuilder1;
		
	}
	
	@Bean
	public StringBuilder sbuilder2()
	{
		System.out.println("buildering 2");
		StringBuilder sbuilder2=new StringBuilder("buildering 2");
		return sbuilder2;
		
	}
	@Bean
	public StringBuilder sbuilder3()
	{
		System.out.println("buildering 3");
		StringBuilder sbuilder3=new StringBuilder("buildering 3");
		return sbuilder3;
		
	}
	@Bean
	public StringBuilder sbuilder4()
	{
		System.out.println("buildering 4");
		StringBuilder sbuilder4=new StringBuilder("buildering 4");
		return sbuilder4;
		
	}	@Bean
	public StringBuilder sbuilder5()
	{
		System.out.println("buildering 5");
		StringBuilder sbuilder5=new StringBuilder("buildering 5");
		return sbuilder5;
		
	}
	
	@Bean
	public ArrayList arr1()
	{
		System.out.println("array list is");
		ArrayList <Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		
		return a;
		
	}
	
	@Bean
	public Map hash()
	{
		
		System.out.println("hashmap object is crteated");
		HashMap<String,Integer> hs=new HashMap();
		
		hs.put("java", 1);
		hs.put("python", 2);
		hs.put("c", 3);
		hs.put("html", 4);
		hs.put("css", 5);
	
		return hs;
		
	}
	
	
}
