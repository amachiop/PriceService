package com.micro.priceservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.priceservice.persistence.Price;
import com.micro.priceservice.services.PriceManagementServiceI;

@RestController
public class PriceController {
	
	@Autowired
	private PriceManagementServiceI priceService;

	@GetMapping("/prices")
	public List<Price> getPrices(){
		/*
		 * Me da este error: org.hibernate.hql.internal.ast.QuerySyntaxException: Prices is not mapped
		 * he buscado en google y probado todo lo que viene, pero nada ha dado solucion, por lo cual, tampoco he podido
		 * probar el h2 y verificar si esta bien
		 */
		List<Price> pricesList = priceService.searchAll();
		for(Price price : pricesList) {
			System.out.println(price.getCodProd()+ " " + price.getPrecio());
		}
		return pricesList;
	}
	
}
