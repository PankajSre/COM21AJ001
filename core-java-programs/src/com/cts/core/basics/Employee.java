package com.cts.core.basics;

class Employee {
	// Instance Variables
	int id;
	String name;

	Employee() {
	}

	Employee(int id, String name) { // id and name are local variables to the constructor
		this.id = id; // this keyword always indicates the instance variable
		this.name = name;
	}

	public void display() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
	}
}

class PermanentEmployee extends Employee {
	double salary;

	PermanentEmployee() {
	}

	PermanentEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	public void display() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}

}

class ContractualEmpoloyee extends Employee {
	double hourlyRate;
	int contractPeriod;

	ContractualEmpoloyee() {
	}

	ContractualEmpoloyee(int id, String name, double hourlyRate, int contractPeriod) {
		super(id, name);
		this.hourlyRate = hourlyRate;
		this.contractPeriod = contractPeriod;
	}

	public void display() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Hourly Rate : " + hourlyRate);
		System.out.println("Contract Period : " + contractPeriod);
	}

}