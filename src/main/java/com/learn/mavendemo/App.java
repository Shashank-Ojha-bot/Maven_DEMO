package com.learn.mavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// Singleton class
//        Department d1=context.getBean("department1",Department.class);
//        System.out.println(d1.getDepartmentId()+" "+d1.getDepartmentName());
//        
//        Department d2=context.getBean("department1",Department.class);
//        System.out.println(d2.getDepartmentId()+" "+d2.getDepartmentName());
//        
//        d2.setDepartmentId(20);
//        d2.setDepartmentName("Finance");
//        System.out.println("------After changing d2---------");
//        System.out.println("value of d1");
//        System.out.println(d1.getDepartmentId()+" "+d1.getDepartmentName());
//        System.out.println("value of d2");
//        System.out.println(d2.getDepartmentId()+" "+d2.getDepartmentName());
//        
//        System.out.println("-------------------");

		// prototype
		Department dept1 = context.getBean("department2", Department.class);
		System.out.println(dept1.getDepartmentId() + " " + dept1.getDepartmentName());

		Department dept2 = context.getBean("department2", Department.class);
		System.out.println(dept2.getDepartmentId() + " " + dept2.getDepartmentName());
		dept2.setDepartmentId(40);
		dept2.setDepartmentName("Operations");

		System.out.println("------After changing d2---------");
		System.out.println("value of dept1");
		System.out.println(dept1.getDepartmentId() + " " + dept1.getDepartmentName());
		System.out.println("value of dept2");
		System.out.println(dept2.getDepartmentId() + " " + dept2.getDepartmentName());

	}
}
