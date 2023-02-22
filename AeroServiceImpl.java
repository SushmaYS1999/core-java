package com.xworkz.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.AreoDTO;
import com.xworkz.entity.AeroEntity;
import com.xworkz.repo.AeroRepo;



@Service
public class AeroServiceImpl implements AeroService{

	@Autowired
	private AeroRepo aeroRepo;
	
	public AeroServiceImpl() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	@Override
	public Set<ConstraintViolation<AreoDTO>> validateAndSave(AreoDTO dto)
	{
		System.out.println("running inside validateAndSave " +dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<AreoDTO>> violations=validator.validate(dto);
		if(violations!=null && !violations.isEmpty())
		{
			System.out.println("violation in dto" +dto);
			return violations;
		}
		else
		{
			System.err.println("violation is not there in dto, can save");
			AeroEntity entity=new AeroEntity();
			entity.setCompanyName(dto.getCompanyName());
			entity.setPasangerName(dto.getPasangerName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setCountry(dto.getCountry());
			boolean saved=this.aeroRepo.save(entity);
			System.out.println("entity data is saved" +saved);
			return Collections.emptySet();
		}
	}
	
	@Override
	public AreoDTO findById(int id)
	{
		if(id > 0)
		{
			AeroEntity entity=this.aeroRepo.findById(id);
			if(entity != null)
			{
				System.out.println("entity is found in id" +id);
				AreoDTO dto = new AreoDTO();
				dto.setCompanyName(entity.getCompanyName());
				dto.setPasangerName(entity.getPasangerName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setCountry(entity.getCountry());
				return dto;
			}
		}
		return AeroService.super.findById(id);
		
	}
}
