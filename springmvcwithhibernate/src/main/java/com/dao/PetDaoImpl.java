package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.model.Pet;

public class PetDaoImpl implements PetDao {

	private SessionFactory sessionFactory;

	@Override
	public List<Pet> getAllPets() {
		Session session = sessionFactory.openSession();
		String hql = "from pettable";
		Query query = session.createQuery(hql);

		return query.getResultList();
	}

}
