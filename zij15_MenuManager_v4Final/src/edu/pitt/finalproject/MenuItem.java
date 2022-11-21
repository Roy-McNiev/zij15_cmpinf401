package edu.pitt.finalproject;

/**
 * Class MenuItem
 * @author Peter Ju
 * @since 11/12/2022
 */
public class MenuItem {
	
	// Defining Variables
	private String name;
	private String description;
	private int calories;
	private double price;
	
	// Constructor
	/**
	 * Constructor MenuItem
	 * @param name the name of the {@code MenuItem}
	 * @param description the description of the {@code MenuItem}
	 * @param calories the calories of the {@code MenuItem}
	 * @param price the price of the {@code MenuItem}
	 */
	public MenuItem(String name, String description, int calories, double price) {
		this.name = name;
		this.description = description;
		this.calories = calories;
		this.price = price;
	}
	
	// Getters
	public String getName() {return this.name;}
	
	public String getDesc() {return this.description;}

	public int getCal() { return this.calories; }
	
	public double getPrice() { return this.price; }

	// Setters
	public void setName(String name) { this.name = name; }
	
	public void setDesc(String desc) { this.description = desc; }
	
	public void setCal(int cal) { this.calories = cal; }
	
	public void setPrice(double price) { this.price = price; }
	
	// Method
	/**
	 * Method toString
	 * @return the name attribute of the item
	 */
	@Override
	public String toString() { return name; }
}
