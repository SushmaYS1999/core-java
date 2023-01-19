package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

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

public abstract class AbstractAuditDto implements Serializable{
	
	private String createdBy;
	private LocalDate createdDate;
	private String UpdatedBy;
	private LocalDate UpdatedDate;


}
