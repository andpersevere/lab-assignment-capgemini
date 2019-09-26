package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.IEmployeeService;

public class MyMain {

	public static void main(String[] args) {

		IEmployeeService employeeService = new EmployeeService();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1:Add employee");
			System.out.println("2:Show ensurance scheme");
			System.out.println("3:Show employee details");
			System.out.println("4:Exit");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter employee id");
					int employeeId = sc.nextInt();
					System.out.println("Enter employee name");
					String employeeName = sc.next();
					System.out.println("Enter employee salary");
					double salary = sc.nextDouble();
					System.out.println("Enter employee designation");
					String employeeDesignation = sc.next();
					String insuranceScheme = employeeService.findInsuranceScheme(salary, employeeDesignation);
					Employee employee = new Employee(employeeId, employeeName, salary, employeeDesignation, insuranceScheme);
					employeeService.addEmployee(employee);
					break;
					
				case 2:
					System.out.println("Enter employee Id");
					employeeId=sc.nextInt();
					employee = employeeService.showEmployee(employeeId);
					if(employee!=null)
						System.out.println(employee.getInsuranceScheme());
					break;
					
				case 3:
					System.out.println("Enter employee Id");
					employeeId=sc.nextInt();
					employee = employeeService.showEmployee(employeeId);
					if(employee!=null)
						System.out.println(employee);
					break;
		
				default:
					System.out.println("Err! Wrong Choice.");
					break;
				}
		}while(choice!=4);
		sc.close();

	}

}
