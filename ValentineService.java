package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.dto.ValentineDTO;

public interface ValentineService {

	Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto);
}
