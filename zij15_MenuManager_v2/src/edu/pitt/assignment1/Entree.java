package edu.pitt.assignment1;

/**
 * Class Entree
 * @author Peter Ju
 * created: 10/05/2022
 */
public class Entree {
	// Defining variables
	private String name;
	private String desc;
	private int cal;
	
	// Constructor
	public Entree(String name, String desc, int cal) {
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
