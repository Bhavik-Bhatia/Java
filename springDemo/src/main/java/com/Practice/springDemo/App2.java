package com.Practice.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {

	public static void main(String[] args) {
		//Annotation based Configuration with a Configuration Class
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
		
		Student studentObj = (Student)context.getBean("student");
		
		studentObj.setSid(101);
		studentObj.setSname("Bhavik");
		studentObj.setGrade((Grade)context.getBean("grade"));
		
		System.out.println(studentObj);
		
	}

}
