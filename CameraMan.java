package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {

		@Autowired
		private Camera cam;
		
		public void camMan()
		{
			System.out.println(cam.hashCode());
		}
		
}
