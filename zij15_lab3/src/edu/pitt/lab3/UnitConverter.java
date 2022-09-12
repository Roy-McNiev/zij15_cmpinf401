package edu.pitt.lab3;

import javax.swing.JOptionPane;

public class UnitConverter {
	public static void main(String[] args) {
		// defining constants for conversion.
		final double CM_TO_INCH = 0.393701, INCH_TO_CM = 2.54, YARD_TO_METER = 0.9144, 
				METER_TO_TARD = 1.0936133, OUNCE_TO_GRAM = 28.3495231, GRAM_TO_OUNCE = 0.0352739619,
				POUND_TO_KG = 0.45359237, KG_TO_POUND = 2.20462262;
		
		// receiving input.
		String line = JOptionPane.showInputDialog("Please enter a distance or a weight amount: ");
		
		int spaceIndex = line.indexOf(' ');
		
		// separately store the value and the unit.
		double value = Double.parseDouble(line.substring(0,spaceIndex));
		String unit = line.substring(spaceIndex + 1);
		
		String result = "";
		
		// switch case branch used to determine the result
		switch (unit) {
		case "cm" : result = value * CM_TO_INCH + " in."; break;
		case "in" : result = value * INCH_TO_CM + " cm."; break;
		case "yd" : result = value * YARD_TO_METER + " m."; break;
		case "m" : result = value * METER_TO_TARD + " yd."; break;
		case "oz" : result = value * OUNCE_TO_GRAM + " gm."; break;
		case "gm" : result = value * GRAM_TO_OUNCE + " oz."; break;
		case "lb" : result = value * POUND_TO_KG + " kg."; break;
		case "kg" : result = value * KG_TO_POUND + " lb."; break;
		}
		
		// display the output.
		JOptionPane.showMessageDialog(null, "The result is " + result);
	}
}
