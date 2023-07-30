package com.pluralsight.structural.adaptor;

public class EmployeeAdaptorFromLdap implements Employee {
	
	EmployeeLdap instance;

	public EmployeeAdaptorFromLdap(EmployeeLdap instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return instance.getEid();
	}

	@Override
	public String getName() {
		return instance.getEname();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}

	@Override
	public String toString() {
		return "[Id =" + instance.getEid() + "]";
	}
	
	

}
