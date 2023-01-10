package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {

	@Value("India")
	private String country;
	
	@Value("ISRN-2023")
	private String name;
	
	@Value("300000000.0")
	private Double budget;
	
	public Rocket()
	{
		
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Double getBudget()
	{
		return budget;
	}
}
