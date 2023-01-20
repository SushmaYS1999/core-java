package com.xworkz.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;

import com.xworkz.dto.FirstAidDTO;
import com.xworkz.dto.ResortDTO;

@Component
public class ResortRepoImpl implements ResortRepo {
	
	
	@Override
	public boolean save(ResortDTO rDto) {
		System.out.println("running validate and save..");
		System.out.println("rdto " +rDto);
		return false;
	}

	
	
}
