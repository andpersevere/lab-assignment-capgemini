package com.cg.eis.dao;

import com.cg.eis.bean.Employee;

public interface IEmployeeDao {
	
	public boolean addEmployee(Employee employee);
	
	public String findInsuranceScheme(double employeeSalary, String employeeDesignation);
	
	public Employee showEmployee(int employeeId);

}
