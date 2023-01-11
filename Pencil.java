package com.xworkz.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {

	@Autowired
	@Qualifier("pencilname")
	private String name;
	@Autowired
	@Qualifier("pencilname")
	private String type;
	@Autowired
	@Qualifier("cost")
	private int price;
	@Autowired
	@Qualifier("color")
	private String color;
	@Autowired
	@Qualifier("issharp")
	private boolean sharp;
	@Autowired
	@Qualifier("isstolen")
	private boolean stolen;
	
	
	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}

	
	
	
	
}
