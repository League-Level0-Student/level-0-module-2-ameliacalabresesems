//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

	// 1. Make a main method that includes all the steps below….
	public class Magic8Ball {
		public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random rmrm = new Random ();
int rndm= rmrm.nextInt(2);
	// 3. Print out this variable
System.out.println(rmrm);
	// 4. Get the user to enter a question for the 8 ball
String input= JOptionPane.showInputDialog(null, "Ask the magic 8 ball a yes or no question");
	// 5. If the random number is 0
if (rndm==0) {
	// -- tell the user "Yes"
	JOptionPane.showMessageDialog(null, "Yes");
}
	// 6. If the random number is 1
else if (rndm==1) {

	// -- tell the user "No"
	JOptionPane.showMessageDialog(null, "No");
}
}
}