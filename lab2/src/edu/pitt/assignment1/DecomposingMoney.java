package edu.pitt.assignment1;

import javax.swing.JOptionPane;

public class DecomposingMoney {
	public static void main(String[] args) {
		final int GRAND = 1000, BENJAMIN = 100, SAWBUCK = 10;
		String stringMoney = JOptionPane.showInputDialog("Please enter the amount of money: ");
		
		int money = Integer.parseInt(stringMoney);
		
		int grands = money / GRAND;
		int benjamins = (money %= GRAND) / BENJAMIN;
		int sawbucks = (money %= BENJAMIN) / SAWBUCK;
		int bucks = money % SAWBUCK;
		
		JOptionPane.showMessageDialog(null, "That is " + grands + "grands, " + benjamins + " Benjamins, " + sawbucks + " sawbucks, and " + bucks + " bucks.");
	}

}
