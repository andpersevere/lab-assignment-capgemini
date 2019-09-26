package com.cg.spring5demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private String empName;
	@Autowired
	private ArrayList<Project> projectList;
	@Autowired
	private Set<Department> departmentSet;

	

	public void getData() {
		System.out.println("Hii welcome......to Spring Core.... " + empName);
		
		System.out.println("Your project Id is: " + projectList.get(0).getProjectId());
		System.out.println("Your project Id is: " + projectList.get(1).getProjectId());
		System.out.println("Your project Id is: " + projectList.get(2).getProjectId());
		
		
		Iterator<Department> itr = departmentSet.iterator();
		// traversing over HashSet
		System.out.println("\nTraversing over Set using Iterator");
		while(itr.hasNext()){
		  System.out.println("Your department Id is: "+ itr.next().getDepartmentId());
		}

	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public ArrayList<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(ArrayList<Project> projectList) {
		this.projectList = projectList;
	}

	public Set<Department> getDepartmentSet() {
		return departmentSet;
	}

	public void setDepartmentSet(Set<Department> departmentSet) {
		this.departmentSet = departmentSet;
	}

	
	
}
