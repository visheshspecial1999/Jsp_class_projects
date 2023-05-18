package com.jsp.jsp_servlet_crud_opration.dto;

import java.util.Date;

public class Product {

	private int productId;
	private String productName;
	private double productPrice;
	private Date expireDate;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date date) {
		this.expireDate = date;
	}
	
}
