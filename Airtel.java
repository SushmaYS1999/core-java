package com.xworkz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Airtel implements Provider{

	
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("provider created...");
		//browser.browse();
	}

}
