package edu.pitt.assignment2;

/**
 * Class Dessert
 * @author Peter Ju
 * created: 10/05/2022
 */
public class Dessert {
	// Defining variables
	private String name;
	private String desc;
	private int cal;
	
	// Constructor
	public Dessert(String name, String desc, int cal) {
		this.name = name;
		this.desc = desc;
		this.cal = cal;
	}
	
	// Getters
	public String getName() {return this.name;}
	
	public String getDesc() {return this.desc;}

	public int getCal() { return this.cal; }

	// Setters
	public void setName(String name) { this.name = name; }
	
	public void setDesc(String desc) { this.desc = desc; }
	
	public void setCal(int cal) { this.cal = cal; }
	
}
