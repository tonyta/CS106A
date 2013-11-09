/*
 * File: Target.java
 * Name: Tony Ta
 * -----------------
 * The Target Class creates a three ring, red-and-white target in
 * the middle of the window.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	

/** Number of pixels in an inch */
	private static final int INCH = 72;
		
	public void run() {
		add(circle(1.00*INCH, Color.red));
		add(circle(0.65*INCH, Color.white));
		add(circle(0.30*INCH, Color.red));
	}

/**
 * This method returns a fill, colored circle of a specific radius.
 */
	private GOval circle(double r, Color color) {
		int centerX = getWidth() / 2;
		int centerY = getHeight() / 2;
		GOval circle = new GOval(centerX-r, centerY-r, 2*r, 2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
		
}
