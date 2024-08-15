package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDetails {
	@Autowired
	private List<Product> productList;
	
	@Autowired 
	private List<Payment> paymentList;
	
	public void showProducts() {
		productList.forEach(p->{System.out.println(p);});
	}
	
	public void showPayments() {
		paymentList.forEach(p->{p.paymentMode();});
	}
	
}
