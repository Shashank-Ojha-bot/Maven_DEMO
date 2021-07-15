package com.learn.mavendemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.mavendemo.model.Student;

public class JavaApp1 {
	
	public static void main(String args[])
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Department d1=context.getBean("department",Department.class);
		System.out.println(d1);
		
		System.out.println("---------------");
		Student s1=context.getBean("student",Student.class);
		System.out.println(s1);
		
		System.out.println("---------------");
		Student s2=context.getBean("student1",Student.class);
		System.out.println(s2);
		
		
		System.out.println("---------------");
		Student s3=context.getBean("student2",Student.class);
		System.out.println(s3);
		
		
		Student s4=context.getBean("student3",Student.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,marks");
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		int marks=sc.nextInt();
		
		
		System.out.println("---------------");
		Employee e4=context.getBean("emp1",Employee.class);
		System.out.println(e4);
	}

}
