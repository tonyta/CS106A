/*
 * File: ThisOldMan.java
 * -----------------------------
 * This program displays the lyrics to the nursery rhyme, "This Old Man".
 */

import acm.program.*;

public class ThisOldMan extends ConsoleProgram {
	
	public void run() {
		println("Lyric to This Old Man:");
		for (int i = 1; i <= MAX_COUNT; i++) {
			println("");
			addVerse(i);
		}
	}
	
	private void addVerse(int count) {
		println("This old man, he played " + count +".");
		println("He played knick-knack on my " + getRhyme(count));
		println("With a knick-knack, paddy-whack,");
		println("Give your dog a bone.");
		println("This old man came rolling home.");
	}

/* Returns the next rhyme depending on the count. */
	private String getRhyme(int n) {
		String rhyme = "";
		switch (n) {
			case  1: rhyme = "thumb"; break;
			case  2: rhyme = "shoe"; break;
			case  3: rhyme = "knee"; break;
			case  4: rhyme = "door"; break;
			case  5: rhyme = "hive"; break;
			case  6: rhyme = "sticks"; break;
			case  7: rhyme = "heaven"; break;
			case  8: rhyme = "pate"; break;
			case  9: rhyme = "spine"; break;
			case 10: rhyme = "shin"; break;
			default: rhyme = "???"; break;
		}
		return rhyme;
	}

	private static final int MAX_COUNT = 10;
}
