/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * The MidpointFindingKarel class leaves a beeper in the middle corner
 * of the world. It does this by filling the row with beepers and then
 * picking them up from alternating rows until the row is empty and Karel
 * ends up in the middle. Karel then puts a beeper on the middle corner.
 * Note: If there are an even number of corners on the row, Karel will
 * end up and place a beeper on the West corner of the two middle corners.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {
	public void run() {
		fillRowWithBeepers();
		pickBeepersFromAlternatingEnds();
		putBeeper();
	}

/**
 * Fills the first row with beepers.
 */
	private void fillRowWithBeepers() {
		putBeeper();
		while (frontIsClear()) {
			move();
			putBeeper();
		}
	}
	
/**
 * Alternates picking up beepers from each end until there are no more
 * beepers left and leaves Karel in the middle of the row.
 */
	private void pickBeepersFromAlternatingEnds() {
		pickFirstEndBeepers();
		if (frontIsClear()) { //if statement in case only 1 corner in world
			pickTheRestBeepers();
		}
	}

/**
 * Picks up the first beepers at the two ends of a filled row.
 */
	private void pickFirstEndBeepers() {
		pickBeeper();
		turnAround();
		while (frontIsClear()) {
			move();
		}
		if (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		if (frontIsClear()) {
			move();
		}
	}

/**
 * Picks of the rest of the beepers alternating between ends
 */
	private void pickTheRestBeepers() {
		while (beepersPresent()) {
			pickBeeperFromEnd();
			move();
		}
		turnAround();
		move();
	}
	
/**
 * Moves to the last beeper in a row, picks it up facing the row.	
 */
	private void pickBeeperFromEnd() {
		while (beepersPresent()) {
			move();
		}
		turnAround();
		move();
		pickBeeper();
	}

}
