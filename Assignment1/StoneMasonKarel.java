/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass repairs the columns of the Quad
 * as described in Assignment 1 problem 2.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			repairCurrentColumn();
			moveToNextColumn();
		}
		repairCurrentColumn();
	}
	
/**
 * Repair the current column.
 * Precondition:	Karel is facing East at bottom of column.
 * Postcondition:	Karel is facing East at bottom of column
 * 					and the column is repaired.
 */
	private void repairCurrentColumn() {
		turnLeft();
		ascendToTopOfColumn();
		turnAround();
		repairGoingDownColumn();
		turnLeft();
	}
	
/**
 * Ascend to the top of the column.
 */
	private void ascendToTopOfColumn() {
		while (frontIsClear()) {
			move();
		}
	}
	
/**
 * Repair column on the way down.	
 */
	private void repairGoingDownColumn() {
		while (frontIsClear()) {
			repairCorner();
			move();
		}
		repairCorner();
	}

/**
 * Checks for beeper and puts one if none present.	
 */
	private void repairCorner() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}
	
/**
 * Moves Karel to the next column.
 */
	private void moveToNextColumn() {
		for (int i = 0; i < 4; i++) {
			move();
		}
	}

}
