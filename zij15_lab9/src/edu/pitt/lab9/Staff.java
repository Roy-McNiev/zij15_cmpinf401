package edu.pitt.lab9;

public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String address, double pay) {
		this.setName(name);
		this.setAddress(address);
		this.pay = pay;
	}
	
	public String getSchool() { return this.school; }
	
	public void setSchool(String school) { this.school = school; }
	
	public double getPay() { return this.pay; }
	
	public void setPay(double pay) { this.pay = pay; }
	
	public String toString() {
		return "Name: " + this.getName() + "\n"
				+ "Address: " + this.getAddress() + "\n"
				+ "School: " + this.school + "\n"
				+ "Pay: " + this.pay;
	}
}
