package edu.pitt.lab7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {
	public static double max(double[] data) {
		if (data.length == 0) return 0;
		
		double max = data[0];
		
		for (double eachDouble : data) if (eachDouble > max) max = eachDouble;
		
		return max;
	}

	public static double min(double[] data) {
		if (data.length == 0) return 0;
		
		double min = data[0];
		
		for (double eachDouble : data) if (eachDouble < min) min = eachDouble;
		
		return min;
	}
	
	public static double sum(double[] data) {
		if (data.length == 0) return 0;
		
		double sum = 0;
		
		for (double eachDouble : data) sum += eachDouble;
		
		return sum;
	}
	
	public static double ave(double[] data) {
		if (data.length == 0) return 0;
		
		return sum(data) / data.length; 
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Asks the user how many items will be entered
		System.out.println("Enter how many items will be entered: ");
		int item = in.nextInt();
		
		// Creates an array of double of the correct size
		double[] data = new double[item];
		
		// Fills the array with randomly generated values ranged from -100.0 to 100.0 (exclusive)
		for (int i = 0; i < item; i++) { data[i] = (Math.random() * 200) - 100; }
		
		System.out.println("The array generated is " + Arrays.toString(data));
		
		// Calculates and prints out max, min, sum and average using the methods above
		System.out.println("Max: " + max(data));
		System.out.println("Min: " + min(data));
		System.out.println("Sum: " + sum(data));
		System.out.println("Ave: " + ave(data));
		
		in.close();
	}
}
