package com.xworkzz;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.config.ConfigClass;
import com.xworkz.things.Actor;
import com.xworkz.things.Rocket;
import com.xworkz.things.Season;

public class Runner {
	public static void main(String[] args) {
		
	ApplicationContext container = new AnnotationConfigApplicationContext(ConfigClass.class);
	System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
	
	System.out.println("==============with class Rocket literals====");
	Rocket refOfRocket = container.getBean("rocket",Rocket.class);
	System.out.println(refOfRocket.getCountry());
	System.out.println(refOfRocket.getName());
	System.out.println(refOfRocket.getBudget());
	
	System.out.println("==========Rocket with methode object with literals==========");
	Rocket refOfRocket1 = container.getBean("rocky",Rocket.class);
	System.out.println(refOfRocket1);
	System.out.println(refOfRocket1.getCountry());
	System.out.println(refOfRocket1.getName());
	System.out.println(refOfRocket1.getBudget());
	
	System.out.println("==========Actor class with constructor==========");
	Actor Act = container.getBean("actor",Actor.class);
	System.out.println(Act);
	System.out.println(Act.getName());
	System.out.println(Act.getLanguage());
	System.out.println(Act.getAge());
	
	System.out.println("=========Actor constructor with methode object============");
	Actor Act1 = container.getBean("act",Actor.class);
	System.out.println(Act1);
	System.out.println(Act1.getName());
	System.out.println(Act1.getLanguage());
	System.out.println(Act1.getAge());
	
	System.out.println("=========Season setter with class file============");
	Season Sea = container.getBean("sea",Season.class);
	System.out.println(Sea);
	System.out.println(Sea.getName());
	System.out.println(Sea.getDuration());
	System.out.println(Sea.getStartingMonth());
	
	System.out.println("=========Season setter with class file============");
	Season Sea1 = container.getBean("season",Season.class);
	System.out.println(Sea1);
	System.out.println(Sea1.getName());
	System.out.println(Sea1.getDuration());
	System.out.println(Sea1.getStartingMonth());
	
	}
}
