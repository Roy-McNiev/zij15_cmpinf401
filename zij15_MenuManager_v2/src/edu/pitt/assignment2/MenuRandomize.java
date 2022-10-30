package edu.pitt.assignment2;

import java.util.ArrayList;

public class MenuRandomize {
	// Defining variables
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	// Constructor
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDessert(dessertFile);
	}
	
	// Method
	/**
	 * Method randomMenu
	 * @return a random Menu generated from the ArrayLists storing all possible entrees, sides, salads, and desserts 
	 */
	public Menu randomMenu() {
		int randomInt = (int) (Math.random() * 5);
		Entree entree = entrees.get(randomInt);
		
		randomInt = (int) (Math.random() * 5);
		Side side = sides.get(randomInt);
		
		randomInt = (int) (Math.random() * 5);
		Salad salad = salads.get(randomInt);
		
		randomInt = (int) (Math.random() * 5);
		Dessert dessert = desserts.get(randomInt);
		
		return new Menu("Nova's Choice", entree, side, salad, dessert);
	}
}
