package com.devsuperior.dsdelivery.dto;

import java.io.Serializable;

import com.devsuperior.dsdelivery.entities.Product;

public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double price;
	private String description;
	private String imageUri;
	
	public ProductDTO() {
	}
	
	public ProductDTO(Product obj) {
		id = obj.getId();
		name = obj.getName();
		price = obj.getPrice();
		description = obj.getDescription();
		imageUri = obj.getImageUrl();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
}