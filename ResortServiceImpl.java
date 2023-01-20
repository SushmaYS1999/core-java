package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;
import com.xworkz.dto.ResortDTO;
import com.xworkz.repository.FirstAidRepo;
import com.xworkz.repository.ResortRepo;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class ResortServiceImpl implements ResortService {

	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo = resortRepo;
		System.out.println("creating service by passing repo..from spring");
	}
	
	@Override
	public boolean validateAndSave(ResortDTO rDto) {
		System.out.println("running validate and save");
		System.out.println("rsto " +rDto);
		
		Set<ConstraintViolation<ResortDTO>> voilations = this.validator.validate(rDto);
		if(!voilations.isEmpty())
		{
			System.out.println("there are validation error..");
			voilations.forEach(cv -> System.out.println(cv.getMessage()));
			return false;
		} else {
			System.out.println("date is valid.. can save");
			boolean saved = this.resortRepo.save(rDto);
			System.out.println("saved " +saved);
			return saved;
		}
		
		
		
	}

	

}
