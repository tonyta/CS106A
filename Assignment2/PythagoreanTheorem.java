/*
 * File: PythagoreanTheorem.java
 * Name: Tony Ta
 * -----------------------------
 * The PythagoreanTheorem calculates the lengths of the hypotenuse
 * when given the other two sides of a triangle.
 */

import acm.program.*;

//Easy-mode... Engaged!
public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter values to compute Pythagorean theorem.");
		int a = readInt("a: ");
		int b = readInt("b: ");
		double c = Math.sqrt((a*a)+(b*b));
		println("c = " + c );
	}
}
