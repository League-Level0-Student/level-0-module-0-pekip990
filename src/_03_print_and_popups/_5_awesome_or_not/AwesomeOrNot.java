package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
	public static void main(String[] args) {
	// 1. Make a main method that includes everything below

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		
		int randomNumber=ran.nextInt(4);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	
		// 3. Print your variable to the console
	
		// 4. Get the user to enter something that they think is awesome
		String awesomeOrNot= JOptionPane.showInputDialog("Enter Something You Think is AWESOME!");
		// 5. If your variable is  0
	if (randomNumber==0) {
		JOptionPane.showMessageDialog(null,"That IS awesome!");
	}
			// -- tell the user whatever they entered is awesome!
	if (randomNumber==1) {
		JOptionPane.showMessageDialog(null,"That's ok");
	}
		// 6. If your variable is  1
	
			// -- tell the user whatever they entered is ok.
	if (randomNumber==2) {
		JOptionPane.showMessageDialog(null,"That is Boring");
	}
		// 7. If your variable is  2
	if (randomNumber==3) {
		JOptionPane.showMessageDialog(null,"That is very cool, but not AWESOME");
	}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	
			// -- invent your own message to give to the user (be nice).

}
}
