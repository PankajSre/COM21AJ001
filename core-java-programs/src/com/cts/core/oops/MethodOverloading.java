package com.cts.core.oops;

public class MethodOverloading {

	public static void main(String[] args) {

		Area areaObject = new Area();
		areaObject.area(5, 5.0);

	}
}

class Area {

	final double PI = 3.14;

	// Area of a Circle
	public void area(double radius) {

		System.out.println("The Area of Circle is : " + PI * radius * radius);
	}

	// Area of Square
	public void area(int length) {
		System.out.println("The Area of Square is : " + length * length);
	}

	// Area of a Triangle
	public void area(int height, double base) {
		System.out.println("The Area of Triangle is : " + height * base / 2);
	}

	// Area of Rectangle
	public void area(double height, int width) {
		System.out.println("The Area of Rectangle is : " + height * width);
	}

}
