package com.app;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1) //Using Order annotation at class level
public class DemandDraftPayment implements Payment {
	
	@Override
	public void paymentMode() {
		System.out.println("Payment is: DemandDraft");
	}
	
}
