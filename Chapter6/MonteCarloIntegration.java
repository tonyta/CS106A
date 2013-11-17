/*
 * File: MonteCarloIntegration.java
 * --------------------
 * This program approximates the value of the constant Pi by
 * simulating a Monte Carlo integration of a circle and a
 * square of the same width.
 */

import acm.program.*;
import acm.util.*;

public class MonteCarloIntegration extends ConsoleProgram {
	
	// Number of simulations to run.
	private static final int NUM_SIMS = 100000;
	
	// Initializes ivars.
	private int numDartThrows = 0;
	private int numInCircle = 0;
	private double approxPi;
	
	public void run() {
		while (numDartThrows < NUM_SIMS) {
			simDartThrow();
			numDartThrows++;
		}
		approxPi = (numInCircle / (double) NUM_SIMS) * 4;
		println("Total dart throw simulations: " + NUM_SIMS);
		println("Total darts in circle: " + numInCircle);
		println("Approximation of Pi: " + approxPi);
	}

	// Simulates each dart throw and tallies number of darts in circle.
	private void simDartThrow() {
		double x = rgen.nextDouble(-1, 1);
		double y = rgen.nextDouble(-1, 1);
		if (isInCircle(x, y)) {
			numInCircle++;
		}
	}
	
	// Calculates whether a dart is in a circle using Cartesian coordinates.
	private boolean isInCircle(double x, double y) {
		return (((x * x) + (y * y)) < 1.0);
	}
			
	// Creates an ivar for the random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}