package com.xworkz.service;

import com.xworkz.dto.FirstAidDTO;

public interface FirstAidService {
	
	boolean validateAndSave(FirstAidDTO aidDTO);
	
}
