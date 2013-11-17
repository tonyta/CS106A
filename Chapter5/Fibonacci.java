/*
 * File: Fibonacci.java
 * --------------------
 * This program calculates the Nth Fibonacci number using an
 * expensive recursive algorithm.
 */

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	public void run() {
		println("This program will return the Nth fibonacci number.");
		int n = readInt("Enter positive integer for N: ");
		println("The Nth fibonacci number is " + fib(n) + ".");
	}
	
	// Returns Fibonacci number using recursion.
	private int fib(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return fib(x - 1) + fib(x - 2);
		}
	}
	
}