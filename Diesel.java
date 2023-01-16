package com.xworkz;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel{

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.println("Diesel implements Fuel");
	}

}
