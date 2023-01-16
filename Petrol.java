package com.xworkz;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel{

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.println("Petrol implements fuel");
	}

	
}
