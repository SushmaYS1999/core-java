package com.xworkz;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.ConfigurationAll;
import com.xworkz.configuration.bean.Engine;
import com.xworkz.configuration.bean.Ghost;
import com.xworkz.configuration.bean.NewsPaper;
import com.xworkz.configuration.bean.Snake;

public class AllRunner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(ConfigurationAll.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println((container.getBeanDefinitionCount()));
		
		System.out.println("====== class Newspaper ======");
		NewsPaper ref = container.getBean(NewsPaper.class);
		System.out.println(ref);
		
		System.out.println("====== class Snake ======");
		Snake ref1 = container.getBean(Snake.class);
		System.out.println(ref1);
		
		System.out.println("====== class Engine ======");
		Engine ref2 = container.getBean(Engine.class);
		System.out.println(ref2);
		
		System.out.println("====== class Ghost ======");
		Ghost ref3 = container.getBean(Ghost.class);
		System.out.println(ref3);
		
	}
}
