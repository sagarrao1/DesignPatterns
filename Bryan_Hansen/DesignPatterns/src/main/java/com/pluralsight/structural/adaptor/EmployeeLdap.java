package com.pluralsight.structural.adaptor;

//this is legacy code we can't change it to use Employee interface
public class EmployeeLdap {
	private String eid;
	private String ename;
	private String mail;
	
	public EmployeeLdap(String eid, String ename, String mail) {
		this.eid = eid;
		this.ename = ename;
		this.mail = mail;
	}
	
	public String getEid() {return eid;	}
	public String getEname() {	return ename;	}
	public String getMail() {	return mail; }
	
	public void setEid(String eid) {	this.eid = eid;	}
	public void setEname(String ename) {	this.ename = ename;	}
	public void setMail(String mail) {	this.mail = mail;	}
	
}
