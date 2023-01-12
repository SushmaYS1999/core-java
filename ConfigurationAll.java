package com.xworkz.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz")
public class ConfigurationAll {


	@Bean
	public String name()
	{
		return "karnataka times";
	}

	@Bean
	public String owner()
	{
		return "sumanth";
	}

	@Bean
	public double pricee()
	{
		return 30.0;
	}

	@Bean
	public String snakeName()
	{
		return "nagarahavu";
	}

	@Bean
	public String sType()
	{
		return "male";
	}

	@Bean
	public boolean ispoisinius()
	{
		return true;
	}

	@Bean
	public String enginName()
	{
		return "German";
	}

	@Bean
	public String eTtype()
	{
		return "medium";
	}

	@Bean
	public String Ecompany()
	{
		return "IBL";
	}

	@Bean
	public boolean isStroke()
	{
		return false;
	}

	@Bean
	public String gender()
	{
		return "female";
	}
	@Bean
	public int GostAge()
	{
		return 23;
	}

	@Bean
	public LocalDate dateOfBirth()
	{
		return LocalDate.of(2000, 05, 02);
	}
	@Bean
	public LocalDate dateOfDeath()
	{
		return LocalDate.of(2018, 04, 07);
	}


	@Bean
	public boolean isSiblings()
	{
		return true;
	}

	@Bean
	public boolean isAdharCard()
	{
		return true;
	}

}
