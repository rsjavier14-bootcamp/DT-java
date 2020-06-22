package com.integradevs.bootcamp.calculator;

/**
 * Calculator class
 * 
 * This class has methods for adding and subtracting two numbers.
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
		int sum = a + b;

		if (((a ^ sum) & (b ^ sum)) < 0)
			throw new ArithmeticException(
					"Integer overflow. The sum exceeds the maximum number that an object of type int can represent");

		return sum;
	}

	/**
	 * The subtraction method receives two integers and subtracts between them.
	 * 
	 * @param a First number to subtract
	 * @param b Second number to subtract
	 * @return the subtraction of both numbers of type int
	 */
	public static int subtract(int a, int b) {
		int subtraction = a - b;

		if (((a ^ b) & (a ^ subtraction)) < 0) {
			throw new ArithmeticException("Integer Overflow");
		}
		return subtraction;
	}
}
