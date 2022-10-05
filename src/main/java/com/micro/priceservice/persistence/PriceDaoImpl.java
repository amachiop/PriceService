package com.micro.priceservice.persistence;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PriceDaoImpl implements PriceDaoI {
	
	@Autowired
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Price> searchAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		final List<Price> pricesList = currentSession.createQuery("FROM Prices").list();
		
		currentSession.close();

		return pricesList;
	}

}
