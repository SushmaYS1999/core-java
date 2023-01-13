package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkzz.Producer;

@Component
public class Movie {

		@Autowired
		private Director director;
		@Autowired
		private CameraMan camera;
		@Autowired
		private Producer producer;
		
		
		public void movie()
		{
			System.out.println("==director hashcode==");
			System.out.println(director.hashCode());
			System.out.println("==camera hashcode==");
			System.out.println(camera.hashCode());
			System.out.println("==producer hashcode==");
			System.out.println(producer.hashCode());
		}
		
}
