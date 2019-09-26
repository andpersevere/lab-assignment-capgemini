package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDao;
import com.cg.eis.dao.IEmployeeDao;

public class EmployeeService implements IEmployeeService {

	IEmployeeDao employeeDao = new EmployeeDao();
	
	public boolean addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}

	public String findInsuranceScheme(double employeeSalary,
			String employeeDesignation) {
		return employeeDao.findInsuranceScheme(employeeSalary, employeeDesignation);
	}

	public Employee showEmployee(int employeeId) {
		return employeeDao.showEmployee(employeeId);
	}

}
