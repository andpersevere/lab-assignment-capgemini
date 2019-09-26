/**
 * 
 */
package com.cg.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;

/**
 * @author admin1
 *
 */
public class EmployeeDao implements IEmployeeDao {
	
	Map<Integer,Employee> employeeMap = new HashMap<Integer, Employee>();

	public boolean addEmployee(Employee employee) {
		employeeMap.put(employee.getEmployeeId(), employee);
		return true;
	}

	public String findInsuranceScheme(double employeeSalary,
			String employeeDesignation) {
		if(employeeSalary>5000 && employeeSalary<20000 && employeeDesignation.equalsIgnoreCase("System Associate"))
			return "Scheme C";
		else if(employeeSalary>=200000 && employeeSalary<400000 && employeeDesignation.equalsIgnoreCase("Programmer"))
			return "Scheme B";
		else if(employeeSalary>=400000 && employeeDesignation.equalsIgnoreCase("Manager"))
			return "Scheme A";
		else if(employeeSalary<5000 && employeeDesignation.equalsIgnoreCase("Clerk"))
			return "No Scheme";
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cg.eis.pl.IEmployeeDao#showEmployee(java.math.BigInteger)
	 */
	public Employee showEmployee(int employeeId) {
		return employeeMap.get(employeeId);
	}

}
