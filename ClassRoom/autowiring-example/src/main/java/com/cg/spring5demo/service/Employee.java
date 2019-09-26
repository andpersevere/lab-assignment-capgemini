package com.cg.spring5demo.service;

public class Employee {
	
	private String empName;
	private Project project;
	private Integer empId;
	
	

	public Employee(String empName, Project project, Integer empId) {
		super();
		this.empName = empName;
		this.project = project;
		this.empId = empId;
	}

	public void callFirst() {
		System.out.println("The method has been created: ");
	}
	public void getData() {
		System.out.println("Hii welcome......to Spring Core.... " + empName);
		System.out.println("Your project ID is: " +project.getProjectId());
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

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public void callLast() {
		System.out.println("The method has been Destroyed!!");
	}
}
