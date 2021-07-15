package com.learn.mavendemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.mavendemo.model.Student;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Department department()
	{
		Department dept=new Department(11,"Academy");
		return dept;
	}
	
	@Bean
	public Student student()
	{
		Student stud=new Student(778899,"Beem",96);
		return stud;
	}
	
	@Bean
	public Student student1()
	{
		Student stud=new Student(112233,"Tom",96);
		return stud;
	}
	
	@Bean(name="student2")
	public Student createStudent()
	{
		Student stud=new Student(113,"Jerry",99);
		return stud;
	}
	
	@Bean(name="student3")
	public Student getStudent()
	{
		Student stud=new Student(113,"Jerry",99);
		return stud;
	}
	
	@Bean(name="emp1")
	public Employee createEmployee()
	{
		Employee stud=new Employee(113,"Shashank",99000,department());
		return stud;
	}

}
