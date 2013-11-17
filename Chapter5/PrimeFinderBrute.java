/*
 * File: PrimeFinderBrute.java
 * --------------------
 * This program finds and displays prime numbers from 1 to N
 * using a brute-force algorithm.
 */

import acm.program.*;

public class PrimeFinderBrute extends ConsoleProgram {
	
	// Checks each number from 1 to N to see if it is prime.
	// Prints out the number if it is prime.
	public void run() {
		println("This program displays all prime numbers up to N.");
		int N = readInt("N: ");
		for (int i = 1; i <= N; i++) {
			if (isPrime(i))	println(i);
		}
	}
	
	// Determines if given number is prime.
	private boolean isPrime(int n) {
		boolean divisorFound = false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				divisorFound = true;
			}
		}
		return !divisorFound;
	}
	
}