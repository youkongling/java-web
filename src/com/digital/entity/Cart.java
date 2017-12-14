package com.digital.entity;

public class Cart {
      private ProductInfo pi;
      private int quantity;
      
      public Cart() {
		// TODO Auto-generated constructor stub
	} 
      public Cart(ProductInfo pi, int quantity) {
  		super();
  		this.pi = pi;
  		this.quantity = quantity;
  	}
      
	public ProductInfo getPi() {
		return pi;
	}
	public void setPi(ProductInfo pi) {
		this.pi = pi;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
      
}
