package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String input = JOptionPane.showInputDialog("What has to be broken before you can use it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (input.equals("an egg")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "correct");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		// 6. Add some more riddles
		input = JOptionPane.showInputDialog("I’m tall when I’m young, and I’m short when I’m old. What am I?");
		if (input.equals("a candle")) {
			score += 1;
			JOptionPane.showMessageDialog(null,"correct");
		} else {

			JOptionPane.showMessageDialog(null, "wrong");
		}
		input=JOptionPane.showInputDialog("What is full of holes but still holds water?");
		if (input.equals("a sponge")) {
			score +=1;
			JOptionPane.showMessageDialog(null,"correct");		
			}
		else {
			JOptionPane.showMessageDialog(null,"wrong");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "You got "+ score+" out of 3");
	}
}
