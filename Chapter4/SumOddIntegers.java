/*
 * File: SumOddIntegers.java
 * -----------------------------
 * This program reads a positive integer N and then calculates and
 * displays the sum of the first N odd integers.
 */

import acm.program.*;

public class SumOddIntegers extends ConsoleProgram {
	
	public void run() {
		println("This program will calculate the sum of the first N integers.");
		int n = readInt("Enter value for N: ");
		while (n <= 0) {
			n = readInt("N must be a positive integer. Enter new value for N: ");
		}
		int total = 1;

	/* 
	 * Alternatively, without using for-loop, the sum of first
	 * N odd integers = N*N.
	 */
		
		for (int i = 1; i < n; i++) {
		total += 2*i + 1;
		}
		
		println("The sum of the first " + n + " odd integers is " + total + ".");
	}

}