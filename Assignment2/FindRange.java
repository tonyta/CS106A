/*
 * File: FindRange.java
 * Name: Tony Ta
 * --------------------
 * The FindRange class collects integers from the user until the
 * sentinel "0" is entered. Then it outputs the smallest and the
 * largest integers entered.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {

/**
 * Declares sentinel as a constant.
 */
	private static final int SENTINEL = 0;
	
	public void run() {
		println("This program finds the largest and smallest integers.");
		int newNum = readInt("? ");		
		int largeNum = newNum;
		int smallNum = newNum;
		while (newNum != SENTINEL) {
			if (newNum > largeNum) {
				largeNum = newNum;
			}
			if (newNum < smallNum) {
				smallNum = newNum;
			}
			newNum = readInt("? ");
		}
		if ((largeNum == SENTINEL)&&(smallNum == SENTINEL)) {
			println("No valid numbers entered.");
		} else {
			println("smallest: " + smallNum);
			println("largest: " + largeNum);
		}
	}
}