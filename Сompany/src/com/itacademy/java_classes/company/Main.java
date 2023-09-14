package com.itacademy.java_classes.company;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Company company = new Company();
		List <Employee> employees = company.getEmployees();
		
		employees.add(new Employee(1, "Joanna", "Accounting",1500));
		employees.add(new Employee(2, "Suzanne", "Accounting", 1750));
		employees.add(new Employee(5, "Fred", "Management", 2500));
		employees.add(new Employee(4, "Mike", "Construction", 2000));
		employees.add(new Employee(6, "Izabella", "Marketing", 2250));
		employees.add(new Employee(3, "Peter", "Construction", 1500));
		
		for (Employee employee: employees) {
			System.out.println(employee);
		}
		System.out.println();
		
		
		Collections.sort(employees);
		for (Employee employee: employees) {
			System.out.println(employee);
		}
		System.out.println();
		
		
		Collections.sort(employees, new EmployeeByDepartmentComparator());
		for (Employee employee: employees) {
			System.out.println(employee);
		}
		System.out.println();
		
		
		Collections.sort(employees, new EmployeeByIdComparator());
		for (Employee employee: employees) {
			System.out.println(employee);
		}
		System.out.println();
		
		
		Collections.sort(employees, new EmployeeByNameComparator());
		for (Employee employee: employees) {
			System.out.println(employee);
		}
		System.out.println();
	}

}
