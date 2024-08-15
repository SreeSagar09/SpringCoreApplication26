package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.app.Product;

@Configuration
@ComponentScan(basePackages = {"com.app"})
public class AppConfig {
	@Bean
	@Order(3) //Using Order annotation at method level
	public Product iphone() {
		Product product = new Product("Iphone-15Pro", 12, 75000.00, "Applie");
		return product;
	}

	@Bean
	@Order(2) //Using Order annotation at method level
	public Product mi() {
		Product product = new Product("Mi-Y2", 12, 25000.00, "Xiomi");
		return product;
	}

	@Bean
	@Order(1) //Using Order annotation at method level
	public Product samsung() {
		Product product = new Product("Samsung-Galaxy", 6, 55000.00, "Samsung");
		return product;
	}

	@Bean
	@Order(-1) //Using Order annotation at method level
	public Product oneplus() {
		Product product = new Product("OnePlus-N21", 9, 65000.00, "OnePlus");
		return product;
	}
}
