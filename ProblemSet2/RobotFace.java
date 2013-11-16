/*
 * File: RobotFace.java
 * Name: Tony Ta
 * ------------------
 * The RobotFace class draws a robot face with attributes described in
 * Problem Set 2 - Problem 2.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {
	
	public void run() {
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		createFace(x, y, Color.gray);
		createEyes(x, y-HEAD_HEIGHT/4, Color.yellow);
		createMouth(x, y+HEAD_HEIGHT/4, Color.white);
	}

	private void createFace(int x, int y, Color color) {
		// First two lines create black frame for the face.
		createFilledRect(x, y, HEAD_WIDTH+2, HEAD_HEIGHT+2, Color.black);
		createFilledRect(x, y, HEAD_WIDTH+4, HEAD_HEIGHT+4, Color.black);
		createFilledRect(x, y, HEAD_WIDTH, HEAD_HEIGHT, color);
	}
		
	private void createMouth(int x, int y, Color color) {
		createFilledRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT, color);
	}

	private void createEyes(int x, int y, Color color) {
		createFilledCircle(x-HEAD_WIDTH/4, y, EYE_RADIUS, color);
		createFilledCircle(x+HEAD_WIDTH/4, y, EYE_RADIUS, color);
	}

	private void createFilledRect(int x, int y, int w, int h, Color color) {
		GRect rect = new GRect(x-w/2, y-h/2, w, h);
		rect.setFilled(true);
		rect.setColor(color);
		add(rect);
	}

	private void createFilledCircle(int x, int y, int r, Color color) {
		GOval circle = new GOval(x-r, y-r, 2*r, 2*r);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle);
	}
	
/* Dimensions of face attributes */
	private static final int HEAD_WIDTH = 200;
	private static final int HEAD_HEIGHT = 200;
	private static final int EYE_RADIUS = 20;
	private static final int MOUTH_WIDTH = 140;
	private static final int MOUTH_HEIGHT = 40;

}