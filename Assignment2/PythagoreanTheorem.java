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
		println("Enter values of a and b to compute the Pythagorean theorem.");
		int a = readInt("Value of side 'a': ");
		int b = readInt("Value of side 'b': ");
		double c = Math.sqrt((a*a)+(b*b));
		println("Hypotenuse 'c' is: " + c );
	}
}
