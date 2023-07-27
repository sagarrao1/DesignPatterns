package com.pluralsight.structural.adaptor;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {	
	
	public List<Employee> getEmployeeList() {	
		List<Employee> employees =  new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "sagar", "sagar123@gmail.com");	
		employees.add(employeeFromDB);	
	
		//Will not work! This is where the adapter comes into play!		
//		Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "han@solo.com");
		
		EmployeeLdap employeeFromLdap = new EmployeeLdap("222", "Solo", "han@solo.com");
		employees.add(new EmployeeAdaptorFromLdap(employeeFromLdap));
		
		
		EmployeeCSV employeeCSV = new EmployeeCSV("444,sanju, sanaju@123.com");
		employees.add(new EmployeeAdaptorFromCsv(employeeCSV));
		
		return employees;
	}
}
