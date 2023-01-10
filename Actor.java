package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	
	private String name;
	private String language;
	private int age;
	
	public Actor(@Value("Darshan") String name, @Value("Kannada") String language, @Value("47") int age)
	{
		this.name=name;
		this.language=language;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getLanguage()
	{
		return language;
	}
	
	public int getAge()
	{
		return age;
	}
}
