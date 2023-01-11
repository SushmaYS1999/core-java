package com.xworkz.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	@Qualifier("rubbertype")
	private String type;
	@Autowired
	@Qualifier("rubbercost")
	private int price;
	@Autowired
	@Qualifier("rubbercolor")
	private String color;
	@Autowired
	@Qualifier("shape")
	private String shape;
	@Autowired
	@Qualifier("isstolenby")
	private boolean stolen;
	@Autowired
	@Qualifier("size")
	private int size;
	
	
	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}
	
	
	
}
