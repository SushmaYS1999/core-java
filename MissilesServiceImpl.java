package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;
import com.xworkz.dto.MissilesDTO;
import com.xworkz.repository.FirstAidRepo;
import com.xworkz.repository.MissilesRepo;

@Component
public class MissilesServiceImpl implements MissilesService {
	
	@Autowired
	private Validator validator;
	private MissilesRepo missilesRepo;
	
	@Autowired
	public MissilesServiceImpl(MissilesRepo missilesRepo) {
		this.missilesRepo = missilesRepo;
		System.out.println("creating service by passing repo..from spring");
	}
	

	@Override
	public boolean validateAndSave(MissilesDTO msDTO) {
		System.out.println("running validate and save");
		System.out.println("msDTO " + msDTO);
		
		Set<ConstraintViolation<MissilesDTO>> voilations = this.validator.validate(msDTO);
		
		if(!voilations.isEmpty())
		{
			System.out.println("there are validation error..");
			voilations.forEach(cv -> System.out.println(cv.getMessage()));
			return false;
		} else {
			System.out.println("date is valide.. can save");
			boolean saved = this.missilesRepo.save(msDTO);
			System.out.println("saved missile" +saved);
			return saved;
		}
		
		
	}
	 

	

}
