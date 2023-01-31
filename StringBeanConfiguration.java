package com.xworkz.laser.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.laser")
public class StringBeanConfiguration {
	
	public StringBeanConfiguration() {
		System.out.println("created:" +this.getClass().getSimpleName());
	}

}
