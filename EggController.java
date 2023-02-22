package com.xworkz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.EggDTO;
import com.xworkz.service.EggService;

@Controller
@RequestMapping("/egg")
public class EggController {

	public EggController() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	@Autowired
	private EggService eggService;
	
	@PostMapping
	public String onEgg(EggDTO dto, Model model)
	{
		System.out.println("running.." +dto);		
		boolean saved=this.eggService.validateAndSave(dto);
		System.out.println("validate and save " + saved);
		return "index";
		
		
	}
}
