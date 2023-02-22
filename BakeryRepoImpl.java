package com.xworkz.repo;

import org.springframework.stereotype.Repository;

import com.xworkz.dto.BakeryDTO;

@Repository
public class BakeryRepoImpl implements BakeryRepo{

	public BakeryRepoImpl() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(BakeryDTO dto) {
		System.out.println("running save " );
		return false;
	}

}
