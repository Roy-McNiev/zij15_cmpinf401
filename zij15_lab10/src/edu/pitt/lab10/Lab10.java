package edu.pitt.lab10;

public class Lab10 {
	public static int sumOfDigits(int x) {
		if (x < 0) x = Math.abs(x);
		if (x < 10) return x;
		return x % 10 + sumOfDigits(x / 10);
	}

	public static void printArrayElements(int[] a, int index) {
		if (a.length == 0) return;
		System.out.println(a[index]);
		if (index < a.length - 1) printArrayElements(a, ++index);
	}
	
	public static void printCombos(int[] a, String out, int startIndex, int k) {
		if (a.length == 0 || startIndex + k > a.length) return;
		if (k == 0) System.out.println("{" + out.substring(2) + "}");
		else {
			// depth
			printCombos(a, out + ", " + a[startIndex], startIndex + 1, k - 1);
			// broad
			printCombos(a, out, startIndex + 1, k);		
		}
		
	}
}
