package com.xworkz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements Petrolbunk{
	
	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;
	
	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("shell has implemented..");
		fuel.consume();
	}
}
