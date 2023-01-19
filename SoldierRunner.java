package com.xworkz.Boot;

import com.xworkz.dto.SoldierDTO;
import com.xworkz.repository.SoldierRepo;
import com.xworkz.repository.SoldierRepoImplement;
import com.xworkz.service.SoldierServiceImpl;

public class SoldierRunner {
	public static void main(String[] args) {
		SoldierDTO dto = new SoldierDTO("bharath", 1, "Topper", "Xworkz","Shimogga");
		
		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldierRepo repo = new SoldierRepoImplement();
		service.setSoldierRepo(repo);
		service.validateAndSave(dto);
	}
}
