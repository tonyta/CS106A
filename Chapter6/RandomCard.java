/*
 * File: RandomCard.java
 * --------------------
 * This program returns a random card and a random suit
 * from a deck of 52 playing cards.
 */

import acm.program.*;
import acm.util.*;

public class RandomCard extends ConsoleProgram {
	
	// Returns a random card whenever the user presses Enter.
	public void run() {
		println("Pick a card. Any card. (Press Enter to get random card.)");
		readLine();
		while(true) {
			readLine(getCard() + " of " + getSuit());
		}
	}
	
	// This method returns random card from 13 cards from Ace to King.
	private String getCard() {
		int card = rgen.nextInt(1, 13);
		switch (card) {
			case  1: return "Ace";
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			default: return ("" + card);
		}
	}

	// This method returns a random card suit.
	private String getSuit() {
		int suit = rgen.nextInt(1, 4);
		switch (suit) {
			case  1: return "Spades";
			case  2: return "Diamonds";
			case  3: return "Clubs";
			case  4: return "Hearts";
			default: return "";
		}
	}
	
	// Creates an ivar for the random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}