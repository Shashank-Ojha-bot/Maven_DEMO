package com.learn.mavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App2 {
	public static void main(String[] args) {
	

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
	
		
		System.out.println("-------------------");
		Employee e1 = context.getBean("employee1", Employee.class);
		System.out.println(e1);
		
		
		System.out.println("-------------------");
		Employee e2 = context.getBean("employee2", Employee.class);
		System.out.println(e2);

	}
}
