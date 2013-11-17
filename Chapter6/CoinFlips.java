/*
 * File: CoinFlips.java
 * --------------------
 * This program repeatedly flips a coin until heads comes up
 * three times in a row. Then it tells the user how many coin
 * flips were necessary to get heads three time.
 */

import acm.program.*;
import acm.util.*;

public class CoinFlips extends ConsoleProgram {
	
	// Declare ivars.
	private int numHeads, numFlips;
	
	// Number of consecutive heads before outputting result.
	private static final int CONSEC_HEADS = 3;
	
	// Flips coins until the max number of consecutive heads is reached.
	public void run() {
		while (true) {
			numHeads = 0;
			numFlips = 0;
			while (numHeads < CONSEC_HEADS) {
				flipCoin();
				numFlips++;
			}
			println("It took " + numFlips + " to get " + 
					numHeads + " heads in a row.");
			readLine("Press Enter to try again.");
		}
	}
	
	// Flips the coin and prints result: Heads or Tails.
	private void flipCoin() {
		if (isHeads()) {
			println("Heads");
			numHeads++;
		} else {
			println("Tails");
			numHeads = 0;
		}
	}
	
	// Gives coin flip a 50/50 chance of showing heads.
	private boolean isHeads() {
		return rgen.nextBoolean();
	}

	// Creates an ivar for the random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}