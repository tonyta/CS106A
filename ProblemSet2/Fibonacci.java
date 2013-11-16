/*
 * File: Fibonacci.java
 * Name: Tony Ta
 * --------------------
 * The Fibonacci class prints the Fibonacci sequence for results less than
 * the constant MAX_VALUE_TERM.
 */

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	public void run() {
		println("This program lists the Fibonacci sequence.");
		int term = 0;
		int term1Ago = 1; //initialized at 1 to force Fib(1) = 1
		while (term < MAX_VALUE_TERM) {
			println(term);
			int term2Ago = term1Ago;
			term1Ago = term;
			term = term1Ago + term2Ago;
		}
	}
	
/* Sequence will print for results that are less than this max. */
	private static final int MAX_VALUE_TERM = 10000;
	
}