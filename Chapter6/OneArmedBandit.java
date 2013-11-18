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
	
	// The winnings of a current round of slots.
	private int winnings = 0;
	
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
				println();
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
		moneyInPlay += winnings;
	}
	
/**
 * Gets and displays the results to a round of slots.
 */
	private void simulateSlots() {
		
		// get new slot result
		int workingSlotResults = 0;
		for (int i = 0; i < NUM_WHEELS; i++) {
			workingSlotResults *= 10;
			int currentWheelResult = getWheelResult();
			workingSlotResults += currentWheelResult;
		}
		slotResults = workingSlotResults;
		println();
		displaySlotResults(slotResults, PAUSE_TIME);
		checkWin();
		println();
	}

/**
 * Gets a random result for each wheel.
 * @return The integer representing a symbol on the wheel.
 */
	private int getWheelResult() {
		return rgen.nextInt(1, NUM_SYMBOLS);
	}	
	
/**
 * Display result of slots, simulating wheel spinning.
 * @param result The slot result to display.
 * @param pause THe amount of pause during the display.
 */
	private void displaySlotResults(int result, int pause) {
		int revResult = reverseDigits(result);
		print("| ");
		while(revResult > 0) {
			pause(pause);
			print(displayWheelResult(revResult % 10));
			revResult /= 10;
			pause(pause);
		}
	}
/**
 * Displays the result of a single wheel.
 */
	private String displayWheelResult(int n) {
		switch (n) {
		case  1: return "CHERRY  | ";
		case  2: return "LEMON   | ";
		case  3: return "ORANGE  | ";
		case  4: return "PLUM    | ";
		case  5: return "BELL    | ";
		case  6: return "BAR     | ";
		default: return "------- | ";
		}
	}

/**
 * Checks to see if current slot results result in a winner or loser.
 */
	private void checkWin() {
		if(isWin(slotResults)) {
			println("-- you win $" + winnings);
		} else {
			println("-- you lose");
		}
	}

/**
 * Contains all the win scenarios.
 * Checks if win condition is satisfied and selects the win amount.
 * @return The value TRUE or FALSE depending on whether win or not.
 */
	private boolean isWin(int n) {
		
		// Initializes winnings.
		winnings = 0;
		
		// Set winnings for defined win scenarios.
		switch (n) {
			case 666:
				winnings = 250; break;
			case 555:
			case 556:
				winnings = 20;  break;
			case 444:
			case 446:
				winnings = 14;  break;
			case 333:
			case 336:
				winnings = 10;  break;
			default:			break;
		}
		
		// Set winnings for wild-card win scenarios.
		if (n == 111) {
			winnings = 7;
		} else if ((n >= 110) && (n < 120)) {
			winnings = 5;
		} else if ((n >= 100) && (n < 200)) {
			winnings = 2;
		}
		
		// Returns whether or not there was a win.
		return (winnings > 0);
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
		println();
		return;
	}

/**
 * Gives the player instructions.
 * 
 * Unfinished!
 */
	private void giveInstructions() {
		int numCombinations = 1;
		for (int i = 0; i < NUM_WHEELS; i++) {
			numCombinations *= 10;
		}
		println(numCombinations);
/*
		for (int j = numCombinations; j > 0; j--) {
			if (isWin(j)) {
				int n = reverseDigits(j);
				while (true) {
					int k = n % 10;
					displayWheelResult(k);
					n /= 10;
				}
			}
		}
		println();
*/
	}

/**
 * Reverses the digits in a given integer.
 * @param n The integer to reverse.
 * @return The integer with its digits reversed.
 */
	public int reverseDigits(int n) {
		int reverse = 0;
		while (true) {
			reverse += n % 10;
			n /= 10;
			if (n == 0) break;
			reverse *= 10;
		}
		return reverse;
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
	private static final int STARTING_MONEY = 10;
	
	// Number of spinning wheels.
	private static final int NUM_WHEELS = 3;
	
	// Number of symbols per wheel.
	private static final int NUM_SYMBOLS = 6;
	
	// Cost per round of play.
	private static final int COST_PLAY = 1;
	
	// Milliseconds each slot spins.
	private static final int PAUSE_TIME = 200;
			
	// Creates an ivar for the random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}