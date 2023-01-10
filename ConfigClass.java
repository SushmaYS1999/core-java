package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.things.Actor;
import com.xworkz.things.Rocket;
import com.xworkz.things.Season;

@Configuration
@ComponentScan("com.xworkz")
public class ConfigClass {
	
	@Bean
	public Rocket rocky() {
		System.out.println("register rocket method object to string");
		Rocket rk=new Rocket();
		return rk;	
	}
	
	@Bean
	public Actor act() {
		System.out.println("register actor method object to string");
		Actor act=new Actor("RamPothini","Tamil",39);
		return act;	
	}
	
	@Bean
	public Season sea() {
		System.out.println("register Season method object to string");
		Season sea=new Season();
		sea.setName("rainy");
		sea.setDuration(4);
		sea.setStartingMonth("June");
		return sea;
		
	}
	
}
