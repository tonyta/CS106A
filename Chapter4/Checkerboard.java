/*
 * File: Checkerboard.java
 * -----------------------------
 * This program draws a checkerboard. The dimensions of the
 * checkerboard are specified by the constants N_ROWS and
 * N_COLUMNS, and the size of the squares are chosen so
 * that the checkerboard fills the available vertical space.
 * 
 * The program is extended to center the board horizontally
 * and add checkers on the first CHECK_ROWS for each player.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Checkerboard extends GraphicsProgram {
	
	public void run() {
		int sqSize = getHeight() / N_ROWS;
		int xStart = (getWidth() - sqSize*N_COLUMNS) / 2;
		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLUMNS; j++) {	
				int x = xStart + (j * sqSize);
				int y = i * sqSize;
				boolean isFilled = ((i+j) % 2 != 0);
				addSquare(x, y, sqSize, isFilled);
				int ckSize = sqSize/2 - 5;
				if ((i < CHECK_ROWS) && isFilled) {
					addChecker(x + sqSize/2, y + sqSize/2, ckSize, Color.red);
				} else if ((N_ROWS - i <= CHECK_ROWS) && isFilled) {
					addChecker(x + sqSize/2, y + sqSize/2, ckSize, Color.black);
				}
			}
		}
	}
	
/* Adds a square */
	private void addSquare(int x, int y, int size, boolean isFilled) {
		GRect sq = new GRect(x, y, size, size);
		sq.setFilled(isFilled);
		sq.setFillColor(Color.gray);
		add(sq);
	}

/* Adds a filled circle */
	private void addChecker(int x, int y, int r, Color color) {
		GOval circle = new GOval(x-r, y-r, 2*r, 2*r);
		circle.setFilled(true);
		circle.setFillColor(color);
		add(circle);
	}

/* Checkerboard constants for rows and columns */
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
	private static final int CHECK_ROWS = 3;
	
}