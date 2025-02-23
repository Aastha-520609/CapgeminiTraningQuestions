package com.spring.app;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> productList;

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
    
	public double calculateTotalPrice() {
        double total = 0.0;
        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;
    }
     
}
