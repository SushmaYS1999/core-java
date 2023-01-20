package com.xworkz.Boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.SpringConfiguration;
import com.xworkz.dto.ResortDTO;
import com.xworkz.service.ResortService;

public class ResortRunner {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		ResortService service = container.getBean(ResortService.class);
		boolean saved = service.validateAndSave(new ResortDTO());
				System.out.println("saved " +saved);
	}
}
