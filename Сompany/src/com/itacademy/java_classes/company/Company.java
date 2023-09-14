package com.itacademy.java_classes.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {
	
	private List <Employee> employees;
	
	public Company() {
		employees = new ArrayList<>();
	}
	
	public Company (List <Employee> employees) {
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employees);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(employees, other.employees);
	}

	@Override
	public String toString() {
		return "Company [employees=" + employees + "]";
	}
	
	
	

}
