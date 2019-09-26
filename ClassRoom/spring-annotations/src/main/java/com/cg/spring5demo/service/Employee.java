package com.cg.spring5demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	@Value("Capgemini")
	private String empName;
	@Autowired
	private Project project;
	

	

	public void getData() {
		System.out.println("Hii welcome......to Spring Core.... " + empName);
		System.out.println("Your project Id is: " + project.getProjectId());
		
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
	
}
