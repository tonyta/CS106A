/*
 * File: IntToPower.java
 * --------------------
 * This program takes in an integer and an exponent and then
 * calculates and displays the result of the integer raised
 * to every power from zero to the exponent.
 */

import acm.program.*;

public class IntToPower extends ConsoleProgram {
	
	public void run() {
		println("This program displays the result of integer N raised");
		println("to the power of every integer from zero to K.");
		int n = readInt("n: ");
		int k = readInt("k: ");
		for (int i = 0; i <= k; i++) {
			println(n + "^" + i + " = " + raiseIntToPower(n, i));
		}
	}
	
	// Calculates the result of n to the power of k.
	private long raiseIntToPower(int n, int k) {
		long result = 1;
		for (int i = 0; i < k; i++) {
			result *= n;
		}
		return result;
	}
}