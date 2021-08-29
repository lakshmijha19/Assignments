package com.lakshmi.springmvc5.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private int eid;
	private String ename;
	private String dept;
	private String designation;
	private int salary;
	
	Employee() {}
	
	public Employee(int eid, String ename, String dept, String designation, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.designation = designation;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	
	
	
	
}
