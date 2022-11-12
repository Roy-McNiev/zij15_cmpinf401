package edu.pitt.assignment3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class FileManager
 * @author Peter Ju
 * created: 11/12/2022
 */
public class FileManager {
	
	/**
	 * Method readItem
	 * @param fileName the path of the file containing the {@code MenuItem} items.
	 * @return an ArrayList containing the {@code MenuItem} items read from the specific path given
	 */
	public static ArrayList<MenuItem> readItem(String fileName) {
		ArrayList<MenuItem> res = new ArrayList<>();

		String line = null;
		String[] data;
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while ((line = bufferedReader.readLine()) != null) {
				data = line.split("@@");
				if ("entree".equals(data[1])) 
					res.add(new Entree(data[0], data[2], Integer.parseInt(data[3]), 
							Double.parseDouble(data[4])));
				else if ("side".equals(data[1]))
					res.add(new Side(data[0], data[2], Integer.parseInt(data[3]), 
							Double.parseDouble(data[4])));
				else if ("salad".equals(data[1]))
					res.add(new Salad(data[0], data[2], Integer.parseInt(data[3]), 
							Double.parseDouble(data[4])));
				else res.add(new Dessert(data[0], data[2], Integer.parseInt(data[3]), 
							Double.parseDouble(data[4])));
			}
			
			bufferedReader.close();
			fileReader.close();
		} catch (IOException e) { e.printStackTrace(); }
		
		return res;
	}
	
	/**
	 * Method writeMenu
	 * @param fileName the path of the file
	 * @param menus a list of menus
	 */
	public static void writeMenu(String fileName, ArrayList<Menu> menus) {
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			for (Menu eachMenu : menus) {
				while (eachMenu != null) {
					bufferedWriter.write(eachMenu.getName() + ": \n" + 
							"Entree: " + (eachMenu.getEntree() == null ? "N/A" : eachMenu.getEntree().getName() + ". " + 
									eachMenu.getEntree().getDesc() + ". Calories" + eachMenu.getEntree().getCal() + ". $" + 
									eachMenu.getEntree().getPrice() + ". \n")
							+ "Side: " + (eachMenu.getSide() == null ? "N/A" : eachMenu.getSide().getName() + ". " + 
									eachMenu.getSide().getDesc() + ". Calories" + eachMenu.getSide().getCal() + ". $" + 
									eachMenu.getSide().getPrice() + ". \n")
							+ "Salad: " + (eachMenu.getSalad() == null ? "N/A" : eachMenu.getSalad().getName() + ". " + 
									eachMenu.getSalad().getDesc() + ". Calories" + eachMenu.getSalad().getCal() + ". $" + 
									eachMenu.getSalad().getPrice() + ". \n")
							+ "Dessert: " + (eachMenu.getDessert() == null ? "N/A" : eachMenu.getDessert().getName() + ". " + 
									eachMenu.getDessert().getDesc() + ". Calories" + eachMenu.getDessert().getCal() + ". $" + 
									eachMenu.getDessert().getPrice() + ". \n"));
				}
			}
			
			bufferedWriter.close();
			fileWriter.close();
			
		} catch (IOException e) { e.printStackTrace(); }
		
	}
}
