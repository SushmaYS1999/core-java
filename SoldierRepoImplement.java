package com.xworkz.repository;

import com.xworkz.dto.SoldierDTO;

public class SoldierRepoImplement implements SoldierRepo{
	
	public SoldierRepoImplement()
	{
		System.out.println("created SoldierRepoImplement using no-arg const...");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		
		System.out.println("running save");
		System.out.println("Dto" +dto);
		return false;
		
	}
}
