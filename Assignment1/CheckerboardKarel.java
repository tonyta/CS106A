/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * The CheckerboardKarel class draws a checkerboard of beepers in any
 * sized world as described in Assignment 1 Problem 3.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run () {
		fillFirstRow();
		while(leftIsClear()) {
			fillEvenRow();
			if (rightIsClear()) {
				fillOddRow();
			} else {
				turnAround(); //Prevents Karel from looping
			}
		}
	}

/**
 * Fills the first row with alternating beepers.
 */
	private void fillFirstRow() {
		putBeeper();
		putEveryOtherBeeper();		
	}

/**
 * Fills a proceeding even row with alternating beepers.
 */
	private void fillEvenRow() {
		if(beepersPresent()) {
			turnLeft();
			move();
			turnLeft();
		} else {
			turnLeft();
			move();
			turnLeft();
			putBeeper();
		}
		putEveryOtherBeeper();
	}

/**
 * Fills a proceeding odd row with alternating beepers.
 */
	private void fillOddRow() {
		if(beepersPresent()) {
			turnRight();
			move();
			turnRight();
		} else {
			turnRight();
			move();
			turnRight();
			putBeeper();
		}
		putEveryOtherBeeper();
	}

/**
 * Puts a beeper on every other corner not including the one
 * that Karel is currently standing on.
 */
	private void putEveryOtherBeeper() {
		while (frontIsClear()) {
			if (beepersPresent()) {
				move();
				if (frontIsClear()) {
					move();
					putBeeper();
				}
			} else {
				move();
				putBeeper();
			}
		}	
	}

}
