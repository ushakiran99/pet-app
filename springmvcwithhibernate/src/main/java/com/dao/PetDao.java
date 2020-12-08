package com.dao;

import java.util.List;

import com.model.Pet;

public interface PetDao {

	public abstract List<Pet> getAllPets();
}
