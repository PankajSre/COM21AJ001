package com.cts.core.oops;

public class MethodOverriding {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.display();
		
		Bike bike = new Bike();
		bike.display();
		
		Vehicle v = new Bike(); // Dynamic/Runtime
		v.display();
	}

}

class Vehicle {

	public void display() {
		System.out.println("4 Stroke Engine");
	}
}

class Bike extends Vehicle {

	@Override
	public void display() {
		System.out.println("2 Stroke Engine");
	}
}