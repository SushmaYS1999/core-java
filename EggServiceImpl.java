package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.EggDTO;
import com.xworkz.repo.EggRepo;

@Service
public class EggServiceImpl implements EggService {

	@Autowired
	private EggRepo eggRepo;
	
	public EggServiceImpl() {
		System.out.println("created" +this.getClass().getSimpleName());
		
	}

	@Override
	public boolean validateAndSave(EggDTO dto) {
		System.out.println("running..");
		boolean saved=this.eggRepo.save(dto);
		System.out.println("save in repo" +saved);
		return false;
	}
	
	
	

}
