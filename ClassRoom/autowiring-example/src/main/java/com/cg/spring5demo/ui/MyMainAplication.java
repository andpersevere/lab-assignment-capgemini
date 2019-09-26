package com.cg.spring5demo.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring5demo.service.Employee;
import com.cg.spring5demo.service.Project;

public class MyMainAplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//  ApplicationContext context = new ClassPathXmlApplicationContext("anotherSpring.xml");
		Employee data = (Employee) context.getBean("emp");
		data.getData();
		//  Project projData = (Project) context.getBean("project", Project.class)
		//	Project projData = (Project) context.getBean("project");
		//	System.out.println(projData.getProjectId());
		
	}

}
