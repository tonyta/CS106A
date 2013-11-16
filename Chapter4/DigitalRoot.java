/*
 * File: DigitalRoot.java
 * -----------------------------
 * This program finds the digital root of a given integer.
 * Each digit of the integer is added together to give a result.
 * The process is repeated until the result is a one digit integer.
 * That integer is the digital root.
 */

import acm.program.*;

public class DigitalRoot extends ConsoleProgram {
	
	public void run() {
		println("This program finds the digital root of an integer.");
		int n = readInt("Enter a positive integer: ");
		int digitRoot = n;
		while (digitRoot / 10 > 0) {
			digitRoot = getDigitSum(digitRoot);
		}
		println("The digital root of " + n + " is " + digitRoot + ".");
	}
	
/* Returns the sum of the digits of a given integer */
	private int getDigitSum(int n) {
		int digitSum = 0;
		while (n != 0) {
			digitSum += n % 10;
			n /= 10;
		}
		return digitSum;
	}


}