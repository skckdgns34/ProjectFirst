package com.yedam.list;
 // 클래스 정의
public class Employee {
	private int employeeId;
	private String lastName;
	private int salary;
	private String hireDate;
	
	//생성자
	public Employee(int employeeId, String lastName, int salary, String hireDate) {
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", lastName=" + lastName + ", salary=" + salary + ", hireDate="
				+ hireDate + "]";
	}
	
	
}
