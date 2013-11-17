/*
 * File: PrimeFinderImproved.java
 * --------------------
 * This program finds and displays prime numbers from 1 to N
 * using an improved algorithm.
 */

import acm.program.*;

public class PrimeFinderImproved extends ConsoleProgram {
	
	// Checks other odd number from 1 to N to see if it is prime.
	// Prints out the number if it is prime.
	public void run() {
		println("This program displays all prime numbers up to N.");
		int N = readInt("N: ");
		println("1");
		println("2");
		for (int i = 3; i <= N; i += 2) {
			if (isPrime(i))	println(i);
		}
	}
	
	// Determines if given number is prime.
	private boolean isPrime(int n) {
		if (n == 2) {
			return true;
		} else if (n % 2 == 0) {
			return false;
		} else {
			int maxDivisor = (int)Math.sqrt(n);
			for (int i = 3; i < maxDivisor; i += 2) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}