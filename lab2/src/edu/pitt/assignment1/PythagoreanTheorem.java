package edu.pitt.assignment1;

import javax.swing.JOptionPane;

public class PythagoreanTheorem {
	public static void main(String[] args) {
		String stringA = JOptionPane.showInputDialog("Please enter the value of one side:");
		String stringB = JOptionPane.showInputDialog("Please enter the value of another side:");
		
		double a = Double.parseDouble(stringA), b = Double.parseDouble(stringB);
		
		double hypotenuse = Math.round(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) * 100) / 100.0;
		
		JOptionPane.showMessageDialog(null, "The value of the hypotenuse is " + hypotenuse);
	}

}
