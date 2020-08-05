package com.lakkam.javaconcepts;

class Company {
	public void printNumberOfEmployees(int numberOfEmployees) {
		System.out.println("Number Of Employees : " + numberOfEmployees);
	}

	public String getDommain() {
		return "Services";
	}

	public void printNumberOfEmployees(int numberOfEmployees, String gender) {
		System.out.println("Number Of Employees Genderwise : " + gender + " : " + numberOfEmployees);
	}
}

public class OverLoading {

	public static void main(String[] args) {
		Company companyObject = new Company();
		companyObject.printNumberOfEmployees(2000);
		companyObject.printNumberOfEmployees(1000, "Men");
		companyObject.printNumberOfEmployees(1000, "Women");

	}

}
