package com.xworkzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	
	@Autowired
	private Area area; 

	public void show()
	{
		System.out.println("==area hashcode==");
		System.out.println(area.hashCode());
	}
}
