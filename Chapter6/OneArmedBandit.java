/*
 * File: OneArmedBandit.java
 * --------------------
 */

import acm.program.*;
import acm.util.*;

public class OneArmedBandit extends ConsoleProgram {
	
	// Amount of money that the player currently has in play.
	private int moneyInPlay = STARTING_MONEY;
	
	// Current slot results. Each wheel result is stored as a digit.
	private int slotResults;
	
	public void run() {
		
		offerInstructions();
		println("You start out by adding $" + moneyInPlay +" into play.");
		
		while (true) {
			
			// Checks to see if player still has money.
			if (moneyInPlay <= 0) {
				println("You ran out of money and go home broke.");
				break;
			}
			
			// Checks to see if player would like to continue.
			if (!isPlayingAgain()) {
				println("You take your $" + moneyInPlay + " and go home.");
				break;
			}
			
			// Plays the next round.
			playNextRound();
		}
		
		println("Game Over.");
	}

/**
 * Plays the next round.
 */
	private void playNextRound() {
		moneyInPlay -= COST_PLAY;
		simulateSlots();
		checkWin();
	}
	
/**
 * Gets and displays the results to a round of slots.
 */
	private void simulateSlots() {
		int workingSlotResults = 0;
		for (int i = 0; i < NUM_WHEELS; i++) {
			workingSlotResults *= 10;
			workingSlotResults += getWheelResult();
		}
		slotResults = workingSlotResults;
		displaySlotResults();
	}

/**
 * Gets a random result for each wheel.
 * @return The integer representing a symbol on the wheel.
 */
	private int getWheelResult() {
		return rgen.nextInt(1, NUM_SYMBOLS);
	}	
	
/**
 * Displays the results of a round of slots.
 * 
 * Unfinished!
 */
	private void displaySlotResults() {
		print(slotResults);
	}

/**
 * Checks to see if current slot results result in a winner or loser.
 *
 * Unfinished! Currently set up for testing.
 */
	private void checkWin() {
		if(slotResults > 333) {
			println(" -- you win!");
		} else {
			println(" -- you lose!");
		}
	}

	
/**
 * Checks to see if player wants to play again.
 */
	private boolean isPlayingAgain() {
		String ask = "Would you like to play?";
		print("You have $" + moneyInPlay + ". ");
		return askYesNoQuestion(ask);
	}

/**
 * Offers the player instructions.
 */
	private void offerInstructions() {
		boolean isInstruct = askYesNoQuestion("Would you like instructions?");
		if (isInstruct) {
			giveInstructions();
		}
		return;
	}

/**
 * Gives the player instructions.
 * 
 * Unfinished!
 */
	private void giveInstructions() {
		println("Here are your instructions.");
	}
		
/** 
 * Asks user a yes or no questions.
 * @param prompt The question to be asked as a String.
 * @return The value TRUE or FALSE for answers 'yes' or 'no', respectively.
 */
	private boolean askYesNoQuestion(String prompt) {
		String answer;
		while (true) {
			answer = readLine(prompt + " ");
			if (answer.equals("yes") || answer.equals("no")) break;
			print("Please answer yes or no. ");
		}
		return answer.equals("yes");
	}



	
	// Amount of money the player starts with.
	private static final int STARTING_MONEY = 5;
	
	// Number of spinning wheels.
	private static final int NUM_WHEELS = 3;
	
	// Number of symbols per wheel.
	private static final int NUM_SYMBOLS = 6;
	
	// Cost per round of play.
	private static final int COST_PLAY = 1;
			
	// Creates an ivar for the random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}