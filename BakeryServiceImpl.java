package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.BakeryDTO;
import com.xworkz.repo.BakeryRepo;

@Service
public class BakeryServiceImpl implements BakeryService {

	@Autowired
	private BakeryRepo bakeryRepo;
	
	public BakeryServiceImpl() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	@Override
	public boolean ValidateAndSave(BakeryDTO dto) {
		System.out.println("running Validate And Save "  +dto);
		boolean save=this.bakeryRepo.save(dto);
		System.out.println("save in repo "+ save);
		return false;
	}

}
