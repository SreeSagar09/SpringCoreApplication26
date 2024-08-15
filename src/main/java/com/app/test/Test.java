package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.OrderDetails;
import com.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("Number of Beans: "+applicationContext.getBeanDefinitionCount());
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println("---------- Beans Names ---------");
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
		
		OrderDetails orderDetails = applicationContext.getBean(OrderDetails.class);
		
		System.out.println("------ List of Products -------");
		orderDetails.showProducts();
		
		System.out.println("------- List of Payments -------");
		orderDetails.showPayments();
		
	}
}
