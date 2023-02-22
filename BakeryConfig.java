package com.xworkz.configiration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class BakeryConfig {

	public BakeryConfig() {
	System.out.println("created..");
	}
}
