/*
 * File: ProgramHierarchy.java
 * Name: Tony Ta
 * ---------------------------
 * The ProgramHierarchy class creates a partial diagram of the
 * acm.program class hierarchy.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	

/**
 * Height and Width of class boxes are constants.	
 */
	private static final int WIDTH = 200;
	private static final int HEIGHT = 60;
	
	public void run() {
		int centerX = getWidth()/2;
		int centerY = getHeight()/2-HEIGHT/2;
		add(sign("Program",centerX, centerY-HEIGHT/2));
		add(sign("GraphicsProgram",centerX-WIDTH*6/5, centerY+HEIGHT*3/2));
		add(sign("ConsoleProgram",centerX, centerY+HEIGHT*3/2));
		add(sign("DialogProgram",centerX+WIDTH*6/5, centerY+HEIGHT*3/2));
	}

/**
 * Creates sign by drawing the line and box, and then applying a label on top.
 */
	private GLabel sign(String s, int x, int y) {
		add(line(x, y)); //adds a line first
		add(box(x, y));  //then puts the box on top of it.
		GLabel msg = new GLabel(s);
		msg.setFont("Helvetica-20");
		msg.setLocation(x-(msg.getWidth()/2), y+(msg.getAscent()/2));
		return msg;		 //then finally applies the label to the box.
	}

// Creates a line originating from the top of each sign.
	private GLine line(int x, int y) {
		GLine line = new GLine(x, y-(HEIGHT/2), getWidth()/2, getHeight()/2-HEIGHT/2);
		return line;
	}

// Creates a white-filled box for each sign.
	private GRect box(int x, int y) {
		GRect box = new GRect(x-(WIDTH/2), y-(HEIGHT/2), WIDTH, HEIGHT);
		box.setFilled(true);
		box.setFillColor(Color.white);
		return box;
	}

}