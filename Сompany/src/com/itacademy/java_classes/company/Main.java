package com.itacademy.java_classes.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("DIY", "Construction company", 1, "Joanna", "Accounting",1500);
		Employee employee2 = new Employee("DIY", "Construction company", 2, "Suzanne", "Accounting", 1750);
		Employee employee3 = new Employee("DIY", "Construction company", 3, "Peter", "Construction", 1500);
		Employee employee4 = new Employee("DIY", "Construction company", 4, "Mike", "Construction", 2000);
		Employee employee5 = new Employee("DIY", "Construction company", 5, "Fred", "Management", 2500);
		Employee employee6 = new Employee("DIY", "Construction company", 6, "Izabella", "Marketing", 2250);
		
		Set <Employee> employees = new TreeSet<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee6);
		employees.add(employee5);
		employees.add(employee4);
		employees.add(employee3);
		
		for (Employee employee: employees) {
			System.out.println(employee);
		}
		System.out.println();
		
		Set <Employee> employees1 = new TreeSet<>(new EmployeeByDepartmentComparator());
		employees1.add(employee1);
		employees1.add(employee2);
		employees1.add(employee6);
		employees1.add(employee5);
		employees1.add(employee4);
		employees1.add(employee3);
		
		for (Employee employee: employees1) {
			System.out.println(employee);
		}
		System.out.println();
		
		Set <Employee> employees3 = new TreeSet<>(new EmployeeByNameComparator());
		employees3.add(employee1);
		employees3.add(employee2);
		employees3.add(employee6);
		employees3.add(employee5);
		employees3.add(employee4);
		employees3.add(employee3);
		
		for (Employee employee: employees3) {
			System.out.println(employee);
		}
		System.out.println();
		
		Set <Employee> employees2 = new TreeSet<>(new EmployeeByIdComparator());
		employees2.add(employee1);
		employees2.add(employee2);
		employees2.add(employee6);
		employees2.add(employee5);
		employees2.add(employee4);
		employees2.add(employee3);
		
		for (Employee employee: employees2) {
			System.out.println(employee);
		}
		System.out.println();
	}

}
