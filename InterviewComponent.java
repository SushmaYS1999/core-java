package com.xworkz.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.InterviewDTO;

@Component
@RequestMapping("/attend")
public class InterviewComponent {
	
	public InterviewComponent() {
		System.out.println("Interview.." +this.getClass().getSimpleName());
	}
	@PostMapping
	public String onAttend(InterviewDTO dto)
	{
		System.out.println("running onattend");
		System.out.println("dto is" +dto);
		return "Interview.jsp";
		
	}

}
