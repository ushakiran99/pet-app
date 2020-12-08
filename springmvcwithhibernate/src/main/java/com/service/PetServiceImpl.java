package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.PetDao;
import com.model.Pet;

public class PetServiceImpl implements PetService {

	@Autowired
	private PetDao petDao;

	@Override
	public List<Pet> getAllPets() {

		return petDao.getAllPets();
	}

}
