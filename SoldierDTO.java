package com.xworkz.dto;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDto{
	
		@NotNull(message = "Name should not be null")
		@NotBlank
		@Size(min = 3, max=20)
		private String name;
		
		@Min(0)
		@Max(10000)
		private int id;
		@NotNull(message = "rank should not be null")
		@NotBlank
		@Size(min = 5, max=30)
		private String rank;
		@Size(min = 3, max=20)
		private String batallion;
		@NotNull(message = "country should not be null")
		@NotBlank
		@Size(min = 3, max=20)
		private String country;

}
