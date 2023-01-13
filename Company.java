package com.xworkzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
		
		@Autowired
		private Location loc;
		
		public void show1()
		{
			
			System.out.println("==location hashcode==");
			System.out.println(loc.hashCode());
		}
		
}
