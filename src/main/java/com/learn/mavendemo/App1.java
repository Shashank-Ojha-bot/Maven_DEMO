package com.learn.mavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.mavendemo.model.Student;

public class App1 {
	public static void main(String[] args) {
//	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	Employee e1=context.getBean("employee1",Employee.class);
//	System.out.println(e1);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
//		Student s1 = context.getBean("student", Student.class);
//		System.out.println(s1);
		
		System.out.println("-------------------");
		Student stud1 = context.getBean("student1", Student.class);
		System.out.println(stud1);

	}
}
