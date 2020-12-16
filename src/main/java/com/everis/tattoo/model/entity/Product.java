package com.everis.tattoo.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_T")
public class Product implements Serializable{

	/* Serial */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	
	private String category;
	
	private String description;

	private double price;
	
	private String img;

	public Product() { }
	
	public Product(String name, String category, String description, double price, String img) {
		super();
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
		this.img = img;
	}
	
	/* PK */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	/* Nombre del producto */
	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	/* Categoria del producto */
	@Column(name = "CATEGORY", nullable = false)
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	
	/* Descripcion del producto */
	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	/* Precio del producto */
	@Column(name = "PRICE", nullable = false)
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	/* Imagen del producto */
	@Column(name = "IMG")
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
