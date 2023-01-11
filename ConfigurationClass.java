package com.xworkz.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz")
public class ConfigurationClass {

	@Bean
	public int identity() {
		int id=123;
		return id;	
	}
	
	@Bean
	public String nameofshop() {
		return "shiva";
	}

	@Bean
	public String gstnnumber() {
		return "gsdt66";
	}

	@Bean
	public String ownerofshopname() {
		return "sumanth";
	}
	
	@Bean
	public String addressofshop() {
		return "bglr";
	}
	
	@Bean
	public String softname() {
		return "chrome";
		
	}
	
	@Bean
	public String softversion() {
		return "5.1";
		
	}
	
	@Bean
	public String devop() {
		return "sushma";
		
	}
	
	@Bean
	public LocalDate date() {
		
		return LocalDate.of(2022, 04, 22);
	}

	@Bean
	public boolean frees() {
		return true;
		
	}
	
	@Bean
	public String personName() {
		return "Sangeetha";
		
	}
	
	@Bean
	public Double Salary() {
		return 300000.0;
		
	}
	
	@Bean
	public String company() {
		return "Infosys";
		
	}
	
	@Bean
	public int experience() {
		
		return 1;
	}
	
	@Bean
	public String pencilname() {
		return "Apsara";	
	}
	
	@Bean
	public String type() {
		return "with rubber";
	}

	@Bean
	public int cost() {
		int cost=10;
		return cost;
	}

	@Bean
	public String color() {
		return "black";
	}
	
	@Bean
	public boolean issharp() {
		return true;
	}
	
	@Bean
	public boolean isstolen() {
		return false;
		
	}
	
	@Bean
	public String rubberName() {
		return "Doms";	
	}
	
	@Bean
	public String rubbertype() {
		return "with out dust";
	}

	@Bean
	public int rubbercost() {
		int cost=20;
		return cost;
	}

	@Bean
	public String rubbercolor() {
		return "white";
	}
	
	@Bean
	public String shape() {
		return "Rectangle";
	}
	
	@Bean
	public boolean isstolenby() {
		return true;
		
	}
	
	@Bean
	public int size() {
		int size=4;
		return size;
		
	}
	
	@Bean
	public String cityName() {
		return "Shivamogga";	
	}
	
	@Bean
	public String FamousPlace() {
		return "Jog Falls";
	}

	@Bean
	public String Nickname() {
		return "Capital Of Malenadu";
	}

	@Bean
	public boolean smartCity() {
		return true;
	}
	
	@Bean
	public double temp() {
		return 35.0;
	}
		

}
