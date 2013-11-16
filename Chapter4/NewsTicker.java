/*
 * File: NewsTicker.java
 * -----------------------------
 * This program animates a news ticker that displays a
 * headline the height of the window that moves from
 * right to left and restarts it after it clears the window.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class NewsTicker extends GraphicsProgram {
	
	public void run() {
		GLabel msg = new GLabel(HEADLINE, 0, 0);
		add(msg);
		double dx = -TICKER_SHIFT;
		
		while (true) {
			
			// Moves text and restarts after it clears the window.
			msg.move(dx, 0);
			if (msg.getX() < -msg.getWidth()) {
				msg.setLocation(getWidth(), msg.getAscent());
			}
			
			// Sets y-position and adjusts size of text.
			msg.setFont("helvetica-" + getHeight());
			double textY = (msg.getAscent() + getHeight()) / 2;
			msg.setLocation(msg.getX(), textY);
			
			pause(PAUSE_TIME);
		}
	}

/* Private constants */
	private static final int TICKER_SHIFT = 5;
	private static final int PAUSE_TIME = 20;
	private static final String HEADLINE = 
		"EARTHQUAKE AND FIRE: SAN FRANCISCO IN RUINS";

}