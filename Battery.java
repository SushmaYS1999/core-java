package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {

	@Autowired
	private Capacity cap;
	
	public void see()
	{
		System.out.println("==capacity==");
		System.out.println(cap.hashCode());
		
	}
}
