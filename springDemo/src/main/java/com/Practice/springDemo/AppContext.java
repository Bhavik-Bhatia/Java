package com.Practice.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//1)Component Scan allows you to fully utilize annotations 
//@ComponentScan(basePackages="com.Practice.springDemo")

//2)Configuration and Bean allows you to make Beans for particular dependencies
@Configuration
public class AppContext {

	@Bean(name="student")
	public Student getStudent(){		
		return new Student();
	}

	@Bean(name="grade")
	public Grade getGrade(){		
		return new Grade();
	}
	
	
}
