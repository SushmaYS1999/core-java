package com.xworkz.configuration.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	private String name;
	@Value("8")
	private int length;
	@Value("black")
	private String color;
	private String type;
	private boolean poisionous;
	
	
	
	public Snake(@Qualifier("snakeName")String name,@Qualifier("sType") String type,@Qualifier("ispoisinius") boolean poisionous) {
		super();
		this.name = name;
		this.type = type;
		this.poisionous = poisionous;
	}



	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}
	
	
	
}
