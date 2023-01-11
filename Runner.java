package com.xworkz;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.xworkz.configuration.ConfigurationClass;
import com.xworkz.configuration.bean.City;
import com.xworkz.configuration.bean.HardwareShop;
import com.xworkz.configuration.bean.Pencil;
import com.xworkz.configuration.bean.Rubber;
import com.xworkz.configuration.bean.Software;
import com.xworkz.configuration.bean.SoftwareEngineer;
public class Runner
{
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		System.out.println("==============with class Hardwareshop literals====");
		HardwareShop ref = container.getBean(HardwareShop.class);
		System.out.println(ref);
		
		System.out.println("==============with class software literals====");
		Software ref1 = container.getBean(Software.class);
		System.out.println(ref1);
		
		System.out.println("==============with class softwareEngineer literals====");
		SoftwareEngineer ref2 = container.getBean(SoftwareEngineer.class);
		System.out.println(ref2);
		
		System.out.println("==============with class Pencil literals====");
		Pencil ref3 = container.getBean(Pencil.class);
		System.out.println(ref3);
		
		System.out.println("==============with class Rubber literals====");
		Rubber ref4 = container.getBean(Rubber.class);
		System.out.println(ref4);
		
		System.out.println("==============with class City literals====");
		City ref5 = container.getBean(City.class);
		System.out.println(ref5);
		
	}

}
