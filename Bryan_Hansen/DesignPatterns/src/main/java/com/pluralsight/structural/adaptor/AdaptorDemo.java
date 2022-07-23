package com.pluralsight.structural.adaptor;

import java.util.List;

public class AdaptorDemo {

	public static void main(String[] args) {
		EmployeeClient employeeClient= new EmployeeClient();
		
		List<Employee> employeeList = employeeClient.getEmployeeList();
		
		for (Employee employee : employeeList) {			
			System.out.println(employee);
		}
	}

}
