package com.micro.priceservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.micro.priceservice.persistence.Price;
import com.micro.priceservice.persistence.PriceDaoI;

@Service
public class PriceManagementServiceImpl implements PriceManagementServiceI {
	
	@Autowired
	private PriceDaoI priceDao;

	@Override
	public List<Price> searchAll() {
		
		return priceDao.searchAll();
	}

}
