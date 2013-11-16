/*
 * File: ReverseDigits.java
 * -----------------------------
 * This program reverses the digits of an integer.
 */

import acm.program.*;

public class ReverseDigits extends ConsoleProgram {
	
	public void run() {
		println("This program reverses the digits of an integer.");
		int n = readInt("Enter a positive integer to reverse: ");
		int reverse = 0;
		while (true) {
			reverse += n % 10;
			n /= 10;
			if (n == 0) break;
			reverse *= 10;
		}
		println("The reversed number is " + reverse + ".");
	}


}