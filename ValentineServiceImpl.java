package com.xworkz.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.ValentineDTO;
import com.xworkz.entity.ValentineEntity;
import com.xworkz.repo.ValentineRepo;

@Service
public class ValentineServiceImpl implements ValentineService {

	@Autowired
	private ValentineRepo valentineRepo;
	
	public ValentineServiceImpl() {
		System.out.println("created" +this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		System.out.println("running inside validateAndSave " +dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator =factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> violations=validator.validate(dto);
		if(violations!=null && !violations.isEmpty())
		{
			System.err.println("violation in dto" +dto);
			return violations;
		}
		else {
			
			System.err.println("violation is not there in dto, can save");
			ValentineEntity entity=new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentineName(dto.getValentineName());
			entity.setPlaces(dto.getPlaces());
			entity.setGifts(dto.getGifts());
			boolean saved=this.valentineRepo.save(entity);
			System.out.println("entity data is saved" +saved);
			return Collections.emptySet();
		}
	}
	
	
}
