package com.samples.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="products")
public class products {
	
	@Id
	@Column(name="productID")
	private String productID;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="quantity")
	private String quantity;
	
	// constructor
	
	public products(String productID, String productName, String quantity) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.quantity = quantity;
	}
	
	// Getters and Setters
	
	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
