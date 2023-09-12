package com.itacademy.java_classes.company;

import java.util.Objects;

public class Employee extends Company implements Comparable<Employee>{
	
	private int employeeId;
	private String name;
	private String department;
	private double salary;
	
	public Employee(String nameOfCompany, String typeOfCompany, int employeeId, String name, String department, double salary) {
		super(nameOfCompany, typeOfCompany);
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return (int)(salary - o.salary);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(department, employeeId, name, salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && employeeId == other.employeeId
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", department=" + department + ", salary="
				+ salary + ", NameOfCompany()=" + getNameOfCompany() + ", TypeOfCompany()=" + getTypeOfCompany()
				+ "]";
	}
	
	
	
	

}
