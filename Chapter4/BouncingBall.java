/*
 * File: BouncingBall.java
 * -----------------------------
 * This program animates a ball that bounces within the bounds
 * of the window.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class BouncingBall extends GraphicsProgram {
	
	public void run() {
		GOval ball = new GOval(0, 0, BALL_SIZE, BALL_SIZE);
		ball.setFilled(true);
		add(ball);
		double dx = BALL_SHIFT;
		double dy = BALL_SHIFT;
		
		while (true) {
			
			// Finds the bottom and left bounds of window.
			double boundX = getWidth() - BALL_SIZE;
			double boundY = getHeight() - BALL_SIZE;
			
			// Moves ball.
			ball.move(dx, dy);
			
			// Reverses ball when it hits the left edge.
			if (ball.getX() < 0){
				ball.setLocation(0, ball.getY());
				dx = -dx;
			}
			
			// Reverses ball when it hits the top edge.
			if (ball.getY() < 0) {
				ball.setLocation(ball.getX(), 0);
				dy = -dy;
			}
			
			// Reverses ball when it hits the right edge.
			// Forces ball to remain in window when resized.
			if (ball.getX() > boundX) {
				ball.setLocation(boundX, ball.getY());
				dx = -dx;
			}
			
			// Reverses ball when it hits the bottom edge.
			// Forces ball to remain in window when resized.
			if (ball.getY() > boundY) {
				ball.setLocation(ball.getX(), boundY);
				dy = -dy;
			}
			
			pause(PAUSE_TIME);
		}
	}


/* Private constants */
	private static final int BALL_SHIFT = 5;
	private static final int PAUSE_TIME = 10;
	private static final double BALL_SIZE = 50;

}