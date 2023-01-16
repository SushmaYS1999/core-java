package com.xworkz;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("provider in jio class");
	}

}
