/*
 * File: YesOrNo.java
 * --------------------
 * This program prompts the user to answer "yes" or "no" to
 * a question and then answers accordingly.
 */

import acm.program.*;

public class YesOrNo extends ConsoleProgram {

	public void run() {
		if (askYesNoQuestion(PROMPT)) {
			println(ANSWER_YES);
		} else {
			println(ANSWER_NO);
		}
	}
	
	private boolean askYesNoQuestion(String prompt) {
		String answer;
		while (true) {
			answer = readLine(prompt + " ");
			if (answer.equals("yes") || answer.equals("no")) break;
			println("Please answer yes or no.");
		}
		return answer.equals("yes");
	}
	
	// Prompts and answers.
	private static final String PROMPT = 
		"Would you like my to sing a song?";
	private static final String ANSWER_YES = 
		"La-la-la... Doo-doo-doo...";
	private static final String ANSWER_NO = 
		"Okay, nevermind. I didn't want to sing anyway.";
}