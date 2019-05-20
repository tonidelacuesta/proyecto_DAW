package com.pecata.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class ProductoVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idproducto;
	
	private String nombre;
	
	private String tamanyo;
	
	private double precio;
	
	
	

}