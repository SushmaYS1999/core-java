package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	
	@Autowired
	private Experience ex;

	public void dir()
	{
		System.out.println("exp hashcode");
		System.out.println(ex.hashCode());
	}
}
