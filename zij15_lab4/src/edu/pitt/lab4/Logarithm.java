package edu.pitt.lab4;

import javax.management.StringValueExp;
import javax.swing.JOptionPane;

public class Logarithm {
	public static void main(String[] args) {
		int value = -1, base = 0, count = 0;
		String stringValue = "", stringBase = "";
		
		
		while (value <= 0) {
			stringValue = JOptionPane.showInputDialog("Please enter the value you want to calculate the log"
					+ " (must be greater than 0): ");
			value = Integer.parseInt(stringValue);
		} 
		
		while (base <= 1) {
			stringBase = JOptionPane.showInputDialog("Please enter the base (must be greater than"
					+ "1): ");
			base = Integer.parseInt(stringBase);
		}
		
		while (value >= base) {
			value /= base;
			count++;
		}
		
		JOptionPane.showMessageDialog(null, "The result of taking logarithm of " + stringValue + " with "
				+ "base " + stringBase + " is " + count);
	}

}
