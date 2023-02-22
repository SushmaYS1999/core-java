package com.xworkz.repo;

import com.xworkz.entity.AeroEntity;

public interface AeroRepo {

	boolean save(AeroEntity entity);
	
	default AeroEntity findById(int id)
	{
		System.out.println("running fingById in repo");
		return null;
	}
}
