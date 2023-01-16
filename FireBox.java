package com.xworkz;

import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser{

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("browser create in firebox");
	}

}
