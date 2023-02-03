package com.xworkz.dto;

import lombok.Data;

@Data
public class InterviewDTO {

	private String name;
	private String company;
	private String role;

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
