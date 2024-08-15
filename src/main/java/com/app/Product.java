package com.app;

public class Product {
	private String productName;
	private Integer quantity;
	private Double price;
	private String vendor;
	
	public Product(String productName, Integer quantity, Double price, String vendor) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.vendor = vendor;
	}

	public String getProductName() {
		return productName;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public String getVendor() {
		return vendor;
	}
	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", quantity=" + quantity + ", price=" + price + ", vendor="
				+ vendor + "]";
	}
	
}
