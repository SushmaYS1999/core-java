package com.xworkzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	@Autowired
	private Company compy;
	@Autowired
	private Assistent asst;
	
	public void begin()
	{
		System.out.println("==compeny==");
		System.out.println(compy.hashCode());
		System.out.println("==assistent==");
		System.out.println(asst.hashCode());
		
	}
}
