/*
 * File: InchesToCentimeters.java
 * -----------------------------
 * This program converts feet and inches to centimeters.
 */

import acm.program.*;

public class InchesToCentimeters extends ConsoleProgram {
	
	public void run() {
		println("This program converts feet and inches to centimeters.");
		double feet = readInt("Enter number of feet: ");
		double inches = readInt("Enter number of inches: ");
		double totalInches = feet * INCHES_PER_FEET + inches;
		double cm = totalInches * CENTIMETERS_PER_INCH;
		println(feet + "ft " + inches + "in = " + cm + "cm.");
	}
	
	private static final double CENTIMETERS_PER_INCH = 2.54;
	private static final double INCHES_PER_FEET = 12;
	
}
