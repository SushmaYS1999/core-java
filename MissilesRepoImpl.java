package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.MissilesDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class MissilesRepoImpl implements MissilesRepo{

	@Override
	public boolean save(MissilesDTO msDTO) {
		System.out.println("running  save..");
		System.out.println("msDTO " + msDTO);
		return false;
	}

}
