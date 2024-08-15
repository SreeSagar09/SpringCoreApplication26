package com.app;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4) //Using Order annotation at class level
public class OnlinePayment implements Payment {
	
	@Override
	public void paymentMode() {
		System.out.println("Payment is: Online");
	}
	
}
