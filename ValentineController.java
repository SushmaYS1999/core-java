package com.xworkz.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.ValentineDTO;
import com.xworkz.service.ValentineService;

@Controller
@RequestMapping("/valentine")
public class ValentineController {

	@Autowired
	private ValentineService valentineService;
	
	 List<String> places = Arrays.asList("cubbon park","lalbag","J P Nagar", "Xworkz");
	 List<String>  gifts = Arrays.asList("teddy bear","chocolate","I phone","sarry");
	
	public ValentineController() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String onValentine(Model model)
	{
		
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		return "valentine";	
	}
	
	@PostMapping
	public String onValentine(ValentineDTO dto, Model model)
	{
		System.out.println("running post mapping"+dto);
		Set<ConstraintViolation<ValentineDTO>> violation=this.valentineService.validateAndSave(dto);
		if(violation.isEmpty())
		{
			System.out.println("data success go to vialation");
			return "valentineSuccess";
		}
		
		
		
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("error", violation);
		model.addAttribute("dto", dto);
		System.err.println("violation in controll");
		return "valentine";
		
	}
}
