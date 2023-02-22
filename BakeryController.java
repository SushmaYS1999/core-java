package com.xworkz.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.BakeryDTO;
import com.xworkz.service.BakeryService;

@Controller
@RequestMapping("/bakery")
public class BakeryController {

	@Autowired
	BakeryService bakeryService;
	
	public BakeryController() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBakery(BakeryDTO dto, Model model) {
	System.out.println("running "+dto);
	model.addAttribute("bname", dto.getBname());
	model.addAttribute("owner", dto.getOwner());
	model.addAttribute("wife", dto.getWife());
	model.addAttribute("married", dto.isMarried());
	model.addAttribute("sweet", dto.getSweet());
	model.addAttribute("since", dto.getSince());
	boolean save=this.bakeryService.ValidateAndSave(dto);
	System.out.println("validate and save " + save);
	return "sucess.jsp";
	
}
}
