package com.cg.eis.bean;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private String employeeDesignation;
	private String insuranceScheme;
	
	public Employee(int employeeId, String employeeName,
			double salary, String employeeDesignation,
			String insuranceScheme) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.employeeDesignation = employeeDesignation;
		this.insuranceScheme = insuranceScheme;
	}
	public Employee() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary
				+ ", employeeDesignation=" + employeeDesignation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
	
	
}
