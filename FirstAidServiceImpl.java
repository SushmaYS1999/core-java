package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;
import com.xworkz.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService{

	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;
	
	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo)
	{
		this.firstAidRepo = firstAidRepo;
		System.out.println("created service by passing repo.. from spring...");
	}
	
	@Override
	public boolean validateAndSave(FirstAidDTO aidDTO) {
		System.out.println("running validate and save");
		System.out.println("aidDTO " + aidDTO);
		
		Set<ConstraintViolation<FirstAidDTO>> violations = this.validator.validate(aidDTO);
		
		if(!violations.isEmpty()) {
			System.out.println("there are validation errors");
			violations.forEach(cv -> System.out.println(cv.getMessage()));
			return false;
		} else {
			System.out.println("date is valid.. can save");
			boolean saved = this.firstAidRepo.save(aidDTO);
			System.out.println("saved first aid " +saved);
			return saved;
		}
		
		
	}

}
