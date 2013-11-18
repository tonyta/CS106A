/*
 * File: MathQuiz.java
 * --------------------
 */

import acm.program.*;
import acm.util.*;

public class MathQuiz extends ConsoleProgram {
	
	// Declares variables for the terms of math problem.
	private int x, y;
	private int answer;
	private int response;
	private int numRight = 0;
	
	public void run() {
		println("Welcome to Math Quiz");
		for (int i = 0; i < TOTAL_QUESTIONS; i++) {
			askMathQuestion();
			studentAnswers();
		}
		println("You got " + numRight + " of " + 
				TOTAL_QUESTIONS + " questions correct!");
	}
	
	private void askMathQuestion() {
		if (rgen.nextBoolean()) {
			askAddition();
		} else {
			askSubtract();
		}
	}
		
	private void askAddition() {
		x = rgen.nextInt(0, BIGGEST_NUM);
		y = rgen.nextInt(0, (BIGGEST_NUM - x));
		answer = x + y;
		print("What is " + x + " + " + y + "? ");
	}
	
	private void askSubtract() {
		x = rgen.nextInt(0, BIGGEST_NUM);
		y = rgen.nextInt(0, BIGGEST_NUM);
		if (x > y) {
			answer = x - y;
			print("What is " + x + " - " + y + "? ");
		} else {
			answer = y - x;
			print("What is " + y + " - " + x + "? ");
		}
	}
		
	private void studentAnswers() {
		int tryNum = 1; // Initializes as first try.
		while (true) {
			response = readInt();
			if (answer == response) {
				numRight++;
				println(congratPlayer());
				break;
			} else if (tryNum < MAX_NUM_TRIES) {
				print("That's incorrect - try a different answer: ");
				tryNum++;
			} else {
				println("No, the answer is " + answer + ".");
				break;
			}
		}
	}
	
	private String congratPlayer() {
		switch (rgen.nextInt(1, 6)) {
		case  1: return "Wow, you did it!";
		case  2: return "Good job!";
		case  3: return "You got it!";
		case  4: return "You are doing great!";
		case  5: return "That's correct!";
		case  6: return "Right!";
		default: return "";
		}
	}

	private static final int BIGGEST_NUM = 20;
	private static final int TOTAL_QUESTIONS = 5;
	private static final int MAX_NUM_TRIES = 3;
	
	// Creates a variable for the random number generator.
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}