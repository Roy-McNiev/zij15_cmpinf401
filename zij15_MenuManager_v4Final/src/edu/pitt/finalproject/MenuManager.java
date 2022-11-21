package edu.pitt.finalproject;

import java.util.ArrayList;

/**
 * Class MenuManager
 * @author Peter Ju
 * @since 11/12/2022
 */
public class MenuManager {
	
	// Defining Variables
	private ArrayList<Entree> entrees = new ArrayList<>();
	private ArrayList<Side> sides = new ArrayList<>();
	private ArrayList<Salad> salads = new ArrayList<>();
	private ArrayList<Dessert> desserts = new ArrayList<>();
	
	// Constructor
	/**
	 * Constructor MenuManager
	 * @param dishesFile the path of the file containing all {@code MenuItem} or dishes
	 */
	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> items = FileManager.readItem(dishesFile);
		separate(items);
	}
	
	// Methods
	/**
	 * Method separate
	 * @param items the overall {@code ArrayList} containing 4 types of {@code MenuItem} items
	 */
	private void separate(ArrayList<MenuItem> items) {
		for (MenuItem eachItem : items) {
			if (eachItem instanceof Entree) entrees.add((Entree) eachItem);
			else if (eachItem instanceof Side) sides.add((Side) eachItem);
			else if (eachItem instanceof Salad) salads.add((Salad) eachItem);
			else desserts.add((Dessert) eachItem);
		}
	}
	
	/**
	 * Method randomMenu
	 * @param name the name of the {@code Menu}
	 * @return a random Menu generated from the ArrayLists storing all possible entrees, sides, salads, and desserts 
	 */
	public Menu randomMenu(String name) {
		int randomInt = (int) (Math.random() * entrees.size());
		Entree entree = entrees.get(randomInt);
		
		randomInt = (int) (Math.random() * sides.size());
		Side side = sides.get(randomInt);
		
		randomInt = (int) (Math.random() * salads.size());
		Salad salad = salads.get(randomInt);
		
		randomInt = (int) (Math.random() * desserts.size());
		Dessert dessert = desserts.get(randomInt);
		
		return new Menu(name, entree, side, salad, dessert);
	}
	
	/**
	 * Method minCaloriesMenu
	 * @param name the name of the {@code Menu}
	 * @return the {@code Menu} generated with the minimum total calories
	 */
	public Menu minCaloriesMenu(String name) {
		Entree entree = entrees.get(0);
		Side side = sides.get(0);
		Salad salad = salads.get(0);
		Dessert dessert = desserts.get(0);
		
		for (Entree eachEntree : entrees) { if (eachEntree.getCal() < entree.getCal()) entree = eachEntree; }
		for (Side eachSide : sides) { if (eachSide.getCal() < side.getCal()) side = eachSide; }
		for (Salad eachSalad : salads) { if (eachSalad.getCal() < salad.getCal()) salad = eachSalad; }
		for (Dessert eachDessert : desserts) { if (eachDessert.getCal() < dessert.getCal()) dessert = eachDessert; }
		
		return new Menu(name, entree, side, salad, dessert);
	}
	
	/**
	 * Method maxCaloriesMenu
	 * @param name the name of the {@code Menu}
	 * @return the {@code Menu} generated with the maximum total calories
	 */
	public Menu maxCaloriesMenu(String name) {
		Entree entree = entrees.get(0);
		Side side = sides.get(0);
		Salad salad = salads.get(0);
		Dessert dessert = desserts.get(0);
		
		for (Entree eachEntree : entrees) { if (eachEntree.getCal() > entree.getCal()) entree = eachEntree; }
		for (Side eachSide : sides) { if (eachSide.getCal() > side.getCal()) side = eachSide; }
		for (Salad eachSalad : salads) { if (eachSalad.getCal() > salad.getCal()) salad = eachSalad; }
		for (Dessert eachDessert : desserts) { if (eachDessert.getCal() > dessert.getCal()) dessert = eachDessert; }
		
		return new Menu(name, entree, side, salad, dessert);
	}

	// Getters
	public ArrayList<Entree> getEntrees() { return entrees; }

	public ArrayList<Side> getSides() { return sides; }

	public ArrayList<Salad> getSalads() { return salads; }

	public ArrayList<Dessert> getDesserts() { return desserts; }

	// Setters
	public void setEntrees(ArrayList<Entree> entrees) { this.entrees = entrees; }
	
	public void setSides(ArrayList<Side> sides) { this.sides = sides; }
	
	public void setSalads(ArrayList<Salad> salads) { this.salads = salads; }
	
	public void setDesserts(ArrayList<Dessert> desserts) { this.desserts = desserts; }	
}
