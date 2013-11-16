/*
 * File: Fibonacci.java
 * Name: Tony Ta
 * --------------------
 * The Fibonacci class prints the Fibonacci sequence until the constant
 * MAX_VALUE_TERM is reached.
 */

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	public void run() {
		println("This program lists the Fibonacci sequence.");
		int term = 0;
		int term1Ago = 1;
		int term2Ago = 0;
		while (term < MAX_VALUE_TERM) {
			println(term);
			term2Ago = term1Ago;
			term1Ago = term;
			term = term1Ago + term2Ago;
		}
		
	}
	
	private static final int MAX_VALUE_TERM = 10000;
	
}