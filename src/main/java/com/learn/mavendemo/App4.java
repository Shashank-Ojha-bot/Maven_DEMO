package com.learn.mavendemo;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.mavendemo.model.Customer;

public class App4 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionbeans1.xml");

		Customer customer1 = context.getBean("cust1", Customer.class);
		System.out.println(customer1.getId() + " " + customer1.getName());
		Map<String, Integer> productMap = customer1.getProducts();
		for (Entry<String, Integer> entry : productMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
