/*
 * File: HalfLifeSimulation.java
 * --------------------
 * Simulates the annual decay of a sample containing a certain
 * number of atoms and having a half-life of one year and displays
 * it until there are no more atoms left.
 */

import acm.program.*;
import acm.util.*;

public class HalfLifeSimulation extends ConsoleProgram {
	
	// The initial number of atoms to start with.
	private static final int INITIAL_ATOMS = 50000;
	
	// Chance of decay over a year. Half-life = 1 year.
	private static final double PROBABILITY_DECAY = .5;
	
	// Initializes ivars for year and number of atoms remaining.
	private int currentYear = 0;
	private int currentAtoms = INITIAL_ATOMS;
	
	public void run() {
		println("There are " + INITIAL_ATOMS + " atoms initially.");
		while (true) {
			simYear();
			println("There are " + currentAtoms + " atoms at" +
					" the end of year " + currentYear + ".");
			if (currentAtoms == 0) break;
		}
	}
	
	// Simulates a year of 50% chance of decay.
	private void simYear() {
		int atomCount = currentAtoms;
		for (int i = 0; i < atomCount; i++) {
			if (isDecayed()) currentAtoms--;
		}
		currentYear++;
	}
	
	// Calculates whether an atom will decay or not.
	private boolean isDecayed() {
		return rgen.nextBoolean(PROBABILITY_DECAY);
	}
			
	// Creates an ivar for the random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}