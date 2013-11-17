/*
 * File: PerfectNumberFinder.java
 * --------------------
 * This program finds and displays perfect numbers from 1 to N.
 * A perfect number is an integer which is equal to the sum
 * of all its divisors.
 */

import acm.program.*;

public class PerfectNumberFinder extends ConsoleProgram {
	
	// Checks each number from 1 to N to see if it is perfect.
	// Prints out the number if it is perfect.
	public void run() {
		println("This program displays all perfect numbers up to N.");
		int N = readInt("N: ");
		for (int i = 1; i <= N; i++) {
			if (isPerfect(i))	println(i);
		}
	}
	
	// Determines if given integer is a perfect number.
	private boolean isPerfect(int n) {
		int sumDivisors = 0;
		for (int i = 1; i <= (n / 2); i++) {
			if (n % i == 0) {
				sumDivisors += i;
			}
		}
		return (sumDivisors == n);
	}
	
}