package com.xworkz.configiration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebMvc extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		Class[] ref1= {Configuration1.class};
		return ref1;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] ref2= {Configuration1.class};
		return ref2;
	}

	@Override
	protected String[] getServletMappings() {
		String[] ref3= {"/"};
		return ref3;
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("created..");
		configurer.enable();
	}

}
