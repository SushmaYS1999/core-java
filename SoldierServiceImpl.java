package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.dto.SoldierDTO;
import com.xworkz.repository.SoldierRepo;

public class SoldierServiceImpl implements SoldierService{
	
	private SoldierRepo soldierRepo;

	public SoldierServiceImpl() {
			
		System.out.println("created soldier service implement using no args const...");
	}

	public void setSoldierRepo(SoldierRepo soldierRepo)
	{
		this.soldierRepo = soldierRepo;
	}
	
	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("starting validateAndSave");
		System.out.println("dto passed :" +dto);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if(!violations.isEmpty())
		{
			System.out.println("There is validation Error..");
			
			violations.forEach(v -> {
				System.out.println("violating message " + v.getMessage());
			});
			
			return false;
		} else {
			System.out.println("Date is valid");
			boolean saved=soldierRepo.save(dto);
			System.out.println("Dto saved using repo " +saved);
			return true;
		}
	}
	
}

