/*
 * File: TicTacToeBoard.java
 * ------------------
 * This program creates a tic-tac-toe board.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class TicTacToeBoard extends GraphicsProgram {

	public void run() {
		createBoard(getWidth()/2, getHeight()/2);
	}
	
	private void createBoard(int x, int y) {
		createLine(x-BOARD_SIZE/2, y-BOARD_SIZE/6, x+BOARD_SIZE/2, y-BOARD_SIZE/6);
		createLine(x-BOARD_SIZE/2, y+BOARD_SIZE/6, x+BOARD_SIZE/2, y+BOARD_SIZE/6);	
		createLine(x-BOARD_SIZE/6, y-BOARD_SIZE/2, x-BOARD_SIZE/6, y+BOARD_SIZE/2);	
		createLine(x+BOARD_SIZE/6, y-BOARD_SIZE/2, x+BOARD_SIZE/6, y+BOARD_SIZE/2);	
	}
	
	private void createLine(int x1, int y1, int x2, int y2) {
		add(new GLine(x1, y1, x2, y2));
	}
	
	private static final int BOARD_SIZE = 300;
	
}