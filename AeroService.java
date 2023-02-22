package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.dto.AreoDTO;


public interface AeroService {

	Set<ConstraintViolation<AreoDTO>> validateAndSave(AreoDTO dto);
	
	default AreoDTO findById(int id)
	{
		System.out.println("running fingById in service");
		return null;
	}
}
