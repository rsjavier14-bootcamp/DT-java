package com.integradevs.bootcamp.calculator;

/**
 * Calculator class
 * 
 * This class has a method to add two numbers
 * 
 * @author javier14-bootcamp
 *
 */
public final class Calculator {

	/** Cannot instantiate. */
	private Calculator() {
		throw new InstantiationError("This class cannot be instantiated.");
	}

	/**
	 * The addition method receives two integers and performs a sum between them.
	 * 
	 * @param a First number to add
	 * @param b Second number to add
	 * @return the sum of both numbers of type int
	 */
	public static int add(int a, int b) {
		return a + b;
	}
}
