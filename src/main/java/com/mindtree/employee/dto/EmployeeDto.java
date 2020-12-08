package com.mindtree.employee.dto;

public class EmployeeDto {

	private int employeeId;
	private String emploeeName;
	private int salary;
	private String department;
	private String emailId;
	public EmployeeDto() {
		super();
	}
	public EmployeeDto(int employeeId, String emploeeName, int salary, String department, String emailId) {
		super();
		this.employeeId = employeeId;
		this.emploeeName = emploeeName;
		this.salary = salary;
		this.department = department;
		this.emailId = emailId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmploeeName() {
		return emploeeName;
	}
	public void setEmploeeName(String emploeeName) {
		this.emploeeName = emploeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
