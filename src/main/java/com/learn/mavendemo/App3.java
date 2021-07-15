package com.learn.mavendemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.mavendemo.model.Cart;
import com.learn.mavendemo.model.MenuItem;
import com.learn.mavendemo.model.Question;

public class App3 {
	public static void main(String[] args) {
	

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionbeans.xml");
	
		
//		System.out.println("-------------------");
//		Employee e1 = context.getBean("employee1", Employee.class);
//		System.out.println(e1);
		
//		
//		System.out.println("-------------------");
//		Question q1 = context.getBean("question1", Question.class);
////		System.out.println(q1);
//		
//		System.out.println(q1.getQuestionId()+" "+q1.getQuestionText());
//		List<String> l1=q1.getAnswer();
//		
//		for(String string:l1)
//		{
//			System.out.println(string);
//		}
//		
//		System.out.println("------------------------");
//		
//		Question q2 = context.getBean("question2", Question.class);
////		System.out.println(q1);
//		
//		System.out.println(q2.getQuestionId()+" "+q2.getQuestionText());
//		List<String> l2=q2.getAnswer();
//		
//		for(String string:l2)
//		{
//			System.out.println(string);
//		}
//		
		Cart c1=context.getBean("cart1",Cart.class);
		System.out.println(c1.getId()+" "+c1.getName());
		List<MenuItem> menuitems=c1.getMenuItemList();
		for(MenuItem menuitem:menuitems)
		{
			System.out.println(menuitem);
		}
		

	}
}
