package com.cts.core.basics;

class Hello {
	static int a = 20;
	int b = 30;
	int c = 10;

}

class StaticDemo {
	public static void main(String... args) {

		Hello h1 = new Hello();
		Hello h2 = new Hello();
		Hello h3 = new Hello();

		System.out.println(h1.a); //20
		System.out.println(h2.b); //30
		System.out.println(h3.b); //30

		h3.b = 100;
		System.out.println(h1.b); //30
		System.out.println(h2.a); //20
		System.out.println(h2.b); //30

		Hello.a=200;
		System.out.println(h1.b); //30
		System.out.println(h2.a); //200
		System.out.println(h2.b); //30
		System.out.println(h3.b); //100
		System.out.println(h3.a); //200
		System.out.println(h1.a); //200
	}
}
