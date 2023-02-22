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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.dto.AreoDTO;
import com.xworkz.service.AeroService;


@Controller
@RequestMapping("/")
public class AeroController {

	@Autowired
	private AeroService aeroService;
	
	 List<String> type = Arrays.asList("PISTON AIRCRAFT","LIGHT JETS","HEAVY JETS");
	 List<String>  country = Arrays.asList("INDIA","JAPAN","USA","ISREAL");
	 
	public AeroController() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	@GetMapping("/display")
	public String onAeroplane(Model model)
	{
		
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		return "Register";	
	}
	
	@GetMapping("/search")
	public String onAeroplane(@RequestParam int id, Model model)
	{
		System.out.println("running onAeroplane"+id);
		AreoDTO dto=this.aeroService.findById(id);
		if(dto!=null)
		{
			model.addAttribute("dto",dto);
		}
		else
		{
			model.addAttribute("message","data not found");
		}
		return "Search";
		
	}
	
	@PostMapping("/display")
	public String onAeroplane(AreoDTO dto, Model model)
	{
		System.out.println("running post mapping"+dto);
		Set<ConstraintViolation<AreoDTO>> violation=this.aeroService.validateAndSave(dto);
		if(violation.isEmpty())
		{
			System.out.println("data success go to vialation");
			return "Register";
		}
		
		
		
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		model.addAttribute("error", violation);
		model.addAttribute("dto", dto);
		System.err.println("violation in controll");
		return "violation";
		
	}
}
