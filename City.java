package com.xworkz.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class City {

	@Autowired
	@Qualifier("cityName")
	private String name;
	@Autowired
	@Qualifier("FamousPlace")
	private String famousPlace;
	@Autowired
	@Qualifier("Nickname")
	private String nickName;
	@Autowired
	@Qualifier("smartCity")
	private boolean smartCity;
	@Autowired
	@Qualifier("temp")
	private double temp;
	
	@Override
	public String toString() {
		return "City [name=" + name + ", famousPlace=" + famousPlace + ", nickName=" + nickName + ", smartCity="
				+ smartCity + ", temp=" + temp + "]";
	}
	
	
}
