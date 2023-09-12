package com.itacademy.java_classes.company;

import java.util.Objects;

public class Company {
	
	private String nameOfCompany;
	private String typeOfCompany;
	
	public Company (String nameOfCompany, String typeOfCompany) {
		this.nameOfCompany = nameOfCompany;
		this.typeOfCompany = typeOfCompany;
	}

	public String getNameOfCompany() {
		return nameOfCompany;
	}

	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}

	public String getTypeOfCompany() {
		return typeOfCompany;
	}

	public void setTypeOfCompany(String typeOfCompany) {
		this.typeOfCompany = typeOfCompany;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameOfCompany, typeOfCompany);
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
		return Objects.equals(nameOfCompany, other.nameOfCompany) && Objects.equals(typeOfCompany, other.typeOfCompany);
	}

	@Override
	public String toString() {
		return "Company [nameOfCompany=" + nameOfCompany + ", typeOfCompany=" + typeOfCompany + "]";
	}
	
	

}
