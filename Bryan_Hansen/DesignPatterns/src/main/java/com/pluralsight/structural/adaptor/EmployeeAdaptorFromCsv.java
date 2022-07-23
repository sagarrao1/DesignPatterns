package com.pluralsight.structural.adaptor;

public class EmployeeAdaptorFromCsv implements Employee {
	
	EmployeeCSV instance;	

	public EmployeeAdaptorFromCsv(EmployeeCSV instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return String.valueOf(instance.getId());
	}

	@Override
	public String getName() {
		return instance.getName();
	}

	@Override
	public String getEmail() {
		return instance.getEmailAddress();
	}

	@Override
	public String toString() {
		return "EmployeeAdaptorFromCsv [instance=" + instance.getId() + "]";
	}

	
}
