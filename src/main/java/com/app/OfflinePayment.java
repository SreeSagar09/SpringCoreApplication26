package com.app;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5) //Using Order annotation at class level
public class OfflinePayment implements Payment {
	
	@Override
	public void paymentMode() {
		System.out.println("Payment is: Offline");
	}

}
