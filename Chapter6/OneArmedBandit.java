/*
 * File: OneArmedBandit.java
 * --------------------
 */

import acm.program.*;
import acm.util.*;

public class OneArmedBandit extends ConsoleProgram {
	
	// Amount of money that the player currently has in play.
	private int moneyInPlay = STARTING_MONEY;
	
	public void run() {
		
		offerInstructions();
		println("You start out by adding $" + moneyInPlay +" into play.");
		
		while (true) {
			
			// Checks to see if player would like to continue.
			if (!isPlayingAgain()) {
				println("You take home $" + moneyInPlay + ".");
				break;
			}
			
			// Checks to see if player still has money in bank.
			if (isOutOfMoney()) {
				println("You ran out of money and go home broke.");
				break;
			}
			
			// Plays the next round.
			nextSlotPlay();
		}
		
		println("Game Over.");
	}
	
	
	
	
	
	// Amount of money the player starts with
	private static final int STARTING_MONEY = 50;
			
	// Creates an ivar for the random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}