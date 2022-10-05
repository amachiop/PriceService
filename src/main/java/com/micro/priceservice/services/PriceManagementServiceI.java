package com.micro.priceservice.services;

import java.util.List;

import com.micro.priceservice.persistence.Price;

public interface PriceManagementServiceI {
	
	public List<Price> searchAll();

}
