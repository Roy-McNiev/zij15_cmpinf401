package edu.pitt.assignment1;

import javax.swing.JOptionPane;

public class AreaAndPerimeter {
	public static void main(String[] args) {
		String stringRadius = JOptionPane.showInputDialog("Please enter the radius of the circle:");
		
		double radius = Double.parseDouble(stringRadius);
		
		double area = Math.round(Math.PI * Math.pow(radius, radius) * 100) / 100.0, perimeter = Math.round(Math.PI * 2 * radius * 100) / 100.0;
		
		JOptionPane.showMessageDialog(null, "The circle with a radius of " + radius + "has an area of " + area + " and a perimeter of " + perimeter);
	}

}
