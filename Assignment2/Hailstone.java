/*
 * File: Hailstone.java
 * Name: Tony Ta
 * --------------------
 * The Hailstone class the "Hailstone sequence" for any non-negative integer.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int processCount = 0;
		int hailstone = readInt("Enter a number: ");
		int hailstoneResult = hailstone;
		while (hailstone <= 0) {	// prevents infinite loops and other weirdness.
			hailstone = readInt("Cannot use zero or negatives. Try again: ");
		}
		while (hailstone != 1) {
			if (hailstone % 2 == 0) {
				hailstoneResult = hailstone/2;
				println(hailstone + " is even so I take half: " + hailstoneResult);
			} else {
				hailstoneResult = 3*hailstone+1;
				println(hailstone + " is odd, so I make 3n+1: " + hailstoneResult);
			}
			hailstone = hailstoneResult;
			processCount++;
			if (hailstone < 1) break; // needed a break for numbers like '113383'.
		}
		if (hailstone == 1) {
			println("The process took " + processCount + " steps to reach 1.");
		} else { // message for when the numbers get too big and program fails.
			println("Whoa. Things got kinda crazy after " + processCount + " steps.");
		}
	}
}