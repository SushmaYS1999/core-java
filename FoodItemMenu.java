package com.xworkz.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/share")
public class FoodItemMenu {
	
	public FoodItemMenu() {
		System.out.println("created...."+this.getClass().getSimpleName());
	}
	@PostMapping
	public String food(@RequestParam String fname,@RequestParam String fitem,@RequestParam int fquantity,@RequestParam double fprice)
	{
		System.out.println("created,,,,,");
		System.out.println("name: "+fname);
		System.out.println("item: "+fitem);
		System.out.println("quantity: "+fquantity);
		System.out.println("price: "+fprice);

		return "FoodItem.jsp";
		
	}

}