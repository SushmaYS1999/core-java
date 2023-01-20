package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO aidDTO) {
		System.out.println("running save int repo");
		System.out.println("aidDTO " + aidDTO);
		return false;
	}

}
