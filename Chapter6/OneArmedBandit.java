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
			
/*			// Checks to see if player still has money in bank.
			if (isOutOfMoney()) {
				println("You ran out of money and go home broke.");
				break;
			}
			
			// Plays the next round.
			nextSlotPlay();
*/		}
		
		println("Game Over.");
	}

/**
 * Checks to see if player wants to play again.
 */
	private boolean isPlayingAgain() {
		String ask = "Would you like to play?";
		print("You have $" + moneyInPlay + " in play. ");
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



	
	// Amount of money the player starts with
	private static final int STARTING_MONEY = 50;
			
	// Creates an ivar for the random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}