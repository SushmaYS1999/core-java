package com.xworkz.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;
	private String type;
	@Value("EA1928")
	private String number;
	@Value("4.0")
	private double version;
	private String company;
	private boolean strokes;
	
	
	
	public Engine(@Qualifier("enginName")String name,@Qualifier("eTtype") String type,@Qualifier("Ecompany") String company) {
		super();
		this.name = name;
		this.type = type;
		this.number = number;
		this.version = version;
		this.company = company;
	}

	@Autowired
	@Qualifier("isStroke")
	public void setstrokes(boolean strokes)
	{
		this.strokes=strokes;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}
	
	
}
