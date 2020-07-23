package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int userScore=0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String easyMath= JOptionPane.showInputDialog("what is 3 + 3");
				// 3.  Use an if statement to check if their answer is correct
		if (easyMath.equals("6")) {
			userScore++;
		}
				// 4.  if the user's answer was correct, add one to their score 
		String president= JOptionPane.showInputDialog("Who was the first president?");
		if (president.equals("George Washington")) {
			userScore++;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		JOptionPane.showMessageDialog(null,"You're score out of 2 is "+ userScore);
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
