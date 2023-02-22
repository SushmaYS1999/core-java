package com.xworkz.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AreoDTO {

	private int id;
	@Size(min = 3, max = 20, message = "company name should between 3 to 20 letters")
	private String companyName;
	@Size(min = 3, max = 20, message = "pasanger name should between 3 to 20 letters")
	private String pasangerName;
	@NotNull(message="cost shuold not be null value")
	private int cost;
	@NotBlank(message = "type should be selected")
	private String type;
	@NotBlank(message = "country should be selected")
	private String country;
}
