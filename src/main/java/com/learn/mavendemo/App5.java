package com.learn.mavendemo;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.mavendemo.model.Customer;
import com.learn.mavendemo.model.Student;

public class App5 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		Department dept=context.getBean("dept1",Department.class);
		System.out.println(dept);
		
		System.out.println("----------------------");
		Student stud=context.getBean("stud1",Student.class);
		System.out.println(stud);
		
		
		context.close();
		}

	}

