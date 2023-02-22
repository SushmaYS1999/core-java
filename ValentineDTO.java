package com.xworkz.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ValentineDTO {
	
	@Size(min = 3, max = 20,message = "name should be greater then 3 less the 20")
	private String name;
	@Size(min = 3, max = 20,message = "name should be greater then 3 less the 20")
	private String valentineName;
	@NotBlank(message = "place should be select")
	private String places;
	@NotBlank(message = "gifts should be select")
	private String gifts;
	
}
