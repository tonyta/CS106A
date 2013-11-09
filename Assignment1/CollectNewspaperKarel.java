/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * The CollectNewspaperKarel subclass moves Karel to outside
 * the house, picks up the Newspaper (beeper) and returns him
 * to the original starting corner and orientation.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	public void run () {
		moveToNewspaper();
		pickBeeper();
		returnToOrigin();
	}
	
/**
 * Moves Karel to Newspaper.
 */
	private void moveToNewspaper() {
		turnRight();
		move();
		turnLeft();
		move();
		move();
		move();
	}
	
/**
 * Moves Karel back to the start.
 */
	private void returnToOrigin() {
		turnAround();
		move();
		move();
		move();
		turnRight();
		move();
		turnRight();
	}

}
