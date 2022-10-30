package edu.pitt.assignment1;

/**
 * Class Menu
 * @author Peter Ju
 * created: 10/05/2022
 */
public class Menu {
	// Defining variables
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;
	
	// Constructors
	public Menu(String name) { this.name = name; }
	
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
	}
	
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	
	// Methods
	/**
	 * Method totalCalories
	 * @return the total calories of the menu
	 */
	public int totalCalories() { 
		int result = 0;
		if (this.entree != null) result += this.entree.getCal();
		if (this.salad != null) result += this.salad.getCal();
		if (this.side != null) result += this.side.getCal();
		if (this.dessert != null) result += this.dessert.getCal();
		
		return result;
	}
	/**
	 * Method description
	 * @return the description of the Menu
	 */
	public String description() {
		return "Entree: " + (this.entree == null ? "N/A" : this.entree.getName() + ". " + this.entree.getDesc()) + "\n"
				+ "Side: " + (this.side == null ? "N/A" : this.side.getName() + ". " + this.side.getDesc()) + "\n"
				+ "Salad: " + (this.salad == null ? "N/A" : this.salad.getName() + ". " + this.salad.getDesc()) + "\n"
				+ "Dessert: " + (this.dessert == null ? "N/A" : this.dessert.getName() + ". " + this.dessert.getDesc());
	}
	
	// Getters
	public String getName() { return this.name; }
	
	public Entree getEntree() { return this.entree; }
	
	public Salad getSalad() { return this.salad; }
	
	public Side getSide() { return this.side; }
	
	public Dessert getDessert() {return this.dessert; }
	
	// Setters
	public void setName(String name) { this.name = name; }
	
	public void setEntree(Entree entree) { this.entree = entree; }
	
	public void setSalad(Salad salad) { this.salad = salad; }
	
	public void setSide(Side side) { this.side = side; }
	
	public void setDessert(Dessert dessert) { this.dessert = dessert; }
}
