package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	
	@Autowired
	private Skill skill;
	
	public void s()
	{
		System.out.println("==skill hashCode==");
		System.out.println(skill.hashCode());
	}
}
