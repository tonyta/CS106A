/*
 * File: Pyramid.java
 * Name: Tony Ta
 * ------------------
 * The Pyramid class builds a pyramid using the constants for the
 * brick dimensions and the number of bricks in the base.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		int middleOfWindow = getWidth() / 2;
		int bricksInRow = BRICKS_IN_BASE;
		int brickYCoordinate = getHeight() - BRICK_HEIGHT;
		//lays down each row and advances to the next
		while (bricksInRow > 0) {
			int halfRowLength = (BRICK_WIDTH * bricksInRow) / 2;
			int brickXCoordinate = middleOfWindow - halfRowLength;
			int bricksLeftInRow = bricksInRow;
			//lays down each brick and advances to the next
			while (bricksLeftInRow > 0) { //lays all bricks in current row
				add(new GRect(brickXCoordinate, brickYCoordinate, BRICK_WIDTH, BRICK_HEIGHT));
				brickXCoordinate += BRICK_WIDTH; //advances to next brick
				bricksLeftInRow--; //reduces bricks to build by 1 in this row
			}
			brickYCoordinate -= BRICK_HEIGHT; //advances to next row
			bricksInRow--; //reduces number of bricks by 1 for the next row
		}
	}

	
}