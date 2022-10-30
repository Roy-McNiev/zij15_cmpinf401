package edu.pitt.assignment2;

/**
 * Class MenuTest
 * @author ziyiju
 * created: 10/05/2022
 */
public class MenuTest {
	public static void main(String[] args) {
		// Defining variables
		Entree entree1 = new Entree("Sirloin Steak", 
				"A delicious piece of 1/2 a pound of our carefully selected meat grilled and seasoned. Choose how much you want it cooked.",
				100);
		
		Entree entree2 = new Entree("Nova Entree",
				"Nova's choice of entree with the best quality.",
				5000);
		
		Side side1 = new Side("Rice and Avocado", 
				"Premium quality indian rice mixed with avocado.",
				1000);
		
		Side side2 = new Side("Nova's side",
				"Best side in the world. Better than any other in Michellin starred restaurants.",
				1000);
		
		Salad salad1 = new Salad("Caesar",
				"Caesar Salad. Vegetables...",
				200);
		
		Salad salad2 = new Salad("Nova's Salad",
				"The choice of Nova for salad. Best salad served to the emperor.",
				300);
		
		Dessert dessert1 = new Dessert("Nova's Dessert",
				"Nova's favorite food. He can have 500 of them at a time.",
				50000);
		
		Menu menu1 = new Menu("Premium", entree1, side1);
		
		Menu menu2 = new Menu("Nova's Choice", entree2, side2, salad2, dessert1);
		
		// Testing functionalities
		System.out.println(menu1.getName());
		System.out.println(menu1.description());
		System.out.println(menu1.totalCalories());
		
		System.out.println("===========");
		
		System.out.println(menu2.getName());
		System.out.println(menu2.description());
		System.out.println(menu2.totalCalories());
		
		System.out.println("===========");
		
		System.out.println(entree1.getCal());
		System.out.println(salad1.getDesc());
		System.out.println(dessert1.getName() + dessert1.getDesc());

	}
}
