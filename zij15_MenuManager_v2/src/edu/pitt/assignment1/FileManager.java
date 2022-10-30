package edu.pitt.assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class FileManager
 * @author ziyiju
 * created: 10/26/2022
 */
public class FileManager {
	
	/**
	 * Method readEntrees
	 * @param fileName the path of the file containing the entrees
	 * @return an ArrayList containing the entrees read from the specific path given
	 */
	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> res = new ArrayList<>(5);
		
		File file = new File(fileName);
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String[] data = sc.nextLine().split("@@");
				res.add(new Entree(data[0], data[1], Integer.parseInt(data[2])));
			}
		} catch (FileNotFoundException e) { e.printStackTrace(); }
		
		return res;
	}

	/**
	 * Method readSides
	 * @param fileName the path of the file containing the sides
	 * @return an ArrayList containing the sides read from the specific path given
	 */
	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> res = new ArrayList<>(5);
		
		File file = new File(fileName);
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String[] data = sc.nextLine().split("@@");
				res.add(new Side(data[0], data[1], Integer.parseInt(data[2])));
			}
		} catch (FileNotFoundException e) { e.printStackTrace(); }
		
		return res;
	}
	
	/**
	 * Method readSalads
	 * @param fileName the path of the file containing the salads
	 * @return an ArrayList containing the salads read from the specific path given
	 */
	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> res = new ArrayList<>(5);
		
		File file = new File(fileName);
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String[] data = sc.nextLine().split("@@");
				res.add(new Salad(data[0], data[1], Integer.parseInt(data[2])));
			}
		} catch (FileNotFoundException e) { e.printStackTrace(); }
		
		return res;
	}
	
	/**
	 * Method readDessert
	 * @param fileName the path of the file containing the desserts
	 * @return an ArrayList containing the salads read from the specific path given
	 */
	public static ArrayList<Dessert> readDessert(String fileName) {
		ArrayList<Dessert> res = new ArrayList<>(5);
		
		File file = new File(fileName);
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String[] data = sc.nextLine().split("@@");
				res.add(new Dessert(data[0], data[1], Integer.parseInt(data[2])));
			}
		} catch (FileNotFoundException e) { e.printStackTrace(); }
		
		return res;
	}
}
