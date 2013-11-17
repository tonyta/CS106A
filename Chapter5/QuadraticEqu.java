/*
 * File: QuadraticEqu.java
 * -----------------------------
 * This program calculates the solutions to the quadratic equation.
 */

import acm.program.*;

public class QuadraticEqu extends ConsoleProgram {
	
	public void run() {
		
		println("Enter coefficients for the quadratic equation:");
		double a = readDouble("a: ");
		double b = readDouble("b: ");
		double c = readDouble("c: ");
		double discriminant = ((b * b) - (4 * a * c));
		
		if (discriminant < 0) {
			println("There are no real solutions for x");
		} else {
			double root1 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
			double root2 = ((-b) - Math.sqrt(discriminant)) / (2 * a);
			if (root1 == root2) {
				println("The only solution is " + root1);
			} else {
				println("The first solution is " + root1);
				println("The second solution is " + root2);
			}
		}
	}

}
