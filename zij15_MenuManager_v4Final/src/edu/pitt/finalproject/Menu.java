package edu.pitt.finalproject;

/**
 * Class Menu
 * @author Peter Ju
 * @since 11/12/2022
 */
public class Menu {
	// Defining variables
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;
	
	// Constructors
	/**
	 * Constructor Menu
	 * @param name the name of the {@code Menu}
	 */
	public Menu(String name) { this.name = name; }
	
	/**
	 * Constructor Menu
	 * @param name the name of the {@code Menu}
	 * @param entree the {@code Entree} of the {@code Menu}
	 * @param side the {@code Side} of the {@code Menu}
	 */
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
	}
	
	/**
	 * Constructor Menu
	 * @param name the name of the {@code Menu}
	 * @param entree the {@code Entree} of the {@code Menu}
	 * @param side the {@code Side} of the {@code Menu}
	 * @param salad the {@code Salad} of the {@code Menu}
	 * @param dessert the {@code Dessert} of the {@code Menu}
	 */
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
	 * @return the description of the menu
	 */
	public String description() {
		return "Entree: " + (this.entree == null ? "N/A" : this.entree.getName() + ". " + this.entree.getDesc()) + "\n"
				+ "Side: " + (this.side == null ? "N/A" : this.side.getName() + ". " + this.side.getDesc()) + "\n"
				+ "Salad: " + (this.salad == null ? "N/A" : this.salad.getName() + ". " + this.salad.getDesc()) + "\n"
				+ "Dessert: " + (this.dessert == null ? "N/A" : this.dessert.getName() + ". " + this.dessert.getDesc());
	}
	
	/**
	 * Method toString
	 * @return the name attribute of the menu
	 */
	@Override
	public String toString() { return name; }
	
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
