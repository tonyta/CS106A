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
	public void run() {
		println("This program finds the largest and smallest numbers.");
		int newNum = readInt("? ");		
		int largeNum = newNum;
		int smallNum = newNum;
		while (newNum != 0) {
			if (newNum > largeNum) largeNum = newNum;
			if (newNum < smallNum) smallNum = newNum;
			newNum = readInt("? ");
		}
		if ((largeNum == 0)&&(smallNum == 0)) println("No valid numbers entered.");
		else {
			println("smallest: " + smallNum);
			println("largest: " + largeNum);
		}
	}
}