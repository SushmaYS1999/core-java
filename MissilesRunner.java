package com.xworkz.Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.SpringConfiguration;
import com.xworkz.dto.MissilesDTO;
import com.xworkz.service.MissilesService;

public class MissilesRunner {
	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		MissilesService service = container.getBean(MissilesService.class);
		boolean saved = service.validateAndSave(new MissilesDTO());
		System.out.println("saved " +saved);
	}
}
