package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "when is your birthday?");
		if (input.equals("10/23")) {
			JOptionPane.showMessageDialog(null, "happy birthday");
		}
		else {
			JOptionPane.showMessageDialog(null,"happy unbirthday");
		}
	}
}
