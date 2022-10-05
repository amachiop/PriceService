package com.micro.priceservice.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Prices")
public class Price implements Serializable {

	 /** Serial version*/
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CodProd")
	private String codProd;
	@Column(name = "Precio")
	private double precio;
	
	public String getCodProd() {
		return codProd;
	}
	public void setCodProd(String codProd) {
		this.codProd = codProd;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
