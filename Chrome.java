package com.xworkz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser{

	@Autowired
	@Qualifier("airtel")
	private Provider provider;
	
	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("create browser in chrome");
		provider.connect();
	}

}
