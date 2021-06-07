package com.cts.core.exception;

public class ThrowExceptionDemo {

	public static void validateAge(int age) throws AgeException {
		if (age < 20) {
			throw new AgeException();
		} else {
			System.out.println("You are Eligible to Vote");
		}

	}
	public static void main(String[] args) {

		try {
			validateAge(18);
		} catch (AgeException e) {
//			System.out.println("Age is less than 20");
			System.out.println(e.getExceptionMessage());
		}
		System.out.println("End of the program");
	}

}

class AgeException extends Exception {

	public AgeException() {
		super();
	}

	public AgeException(String message) {
		System.out.println(message);
	}

	public String getExceptionMessage() {
		return "Age can not be less than 20";
	}
}
