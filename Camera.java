package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {

	@Autowired
	private Lens len;
	@Autowired
	private Battery bat;
	
	public void see()
	{
		System.out.println("==lens created==");
		System.out.println(len.hashCode());
		System.out.println("==battery created==");
		System.out.println(bat.hashCode());
	}
	
}
