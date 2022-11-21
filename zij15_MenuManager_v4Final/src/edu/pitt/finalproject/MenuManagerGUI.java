package edu.pitt.finalproject;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

/**
 * Class MenuManagerGUI
 * @author Peter Ju
 * @since 11/20/2022
 */
public class MenuManagerGUI {
	private MenuManager menuManager;
	private ArrayList<Menu> menus = new ArrayList<>();
	
	private JFrame frame;
	private JFrame subFrame;
	private JPanel menuPanel;
	private JPanel buildMenuPanel;
	private JPanel generateMenuPanel;
	private JPanel createdMenuPanel;
	private JPanel menuListPanel;
	private JPanel menuButtonsPanel;
	private JLabel buildYourOwnMenu;
	private JLabel entree;
	private JLabel subEntree;
	private JLabel side;
	private JLabel subSide;
	private JLabel salad;
	private JLabel subSalad;
	private JLabel dessert;
	private JLabel subDessert;
	private JLabel generateAMenu;
	private JLabel createdMenus;
	private JLabel totalCal;
	private JLabel totalPrice;
	private JComboBox entreeCB;
	private JComboBox sideCB;
	private JComboBox saladCB;
	private JComboBox dessertCB;
	private JButton createMenu;
	private JButton generateRandomMenu;
	private JButton generateMinCalMenu;
	private JButton generateMaxCalMenu;
	private JButton details;
	private JButton deleteAll;
	private JButton saveToFile;
	private JList list;
	private JTextArea entreeTA;
	private JTextArea sideTA;
	private JTextArea saladTA;
	private JTextArea dessertTA;
	private JTextArea calTA;
	private JTextArea priceTA;
	private JScrollPane holder;
	
	// Constructor
	/**
	 * Constructor MenuManagerGUI
	 */
	public MenuManagerGUI() {
		menuManager = new MenuManager("data/dishes.txt");
		
		frame = new JFrame("Menu Manager");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(600, 400));
		frame.setResizable(false);
		frame.setLayout(new GridLayout(1,2));
		
		menuPanel = new JPanel(new GridLayout(2,1));
		
		// Build You Own Menu Section
		buildMenuPanel = new JPanel(new FlowLayout());
		
		buildYourOwnMenu = new JLabel("Build Your Own Menu");
		buildYourOwnMenu.setPreferredSize(new Dimension(250,25));
		buildMenuPanel.add(buildYourOwnMenu);
		
		entree = new JLabel("Entree");
		entree.setPreferredSize(new Dimension(55,25));
		buildMenuPanel.add(entree);
		
		entreeCB = new JComboBox<>(menuManager.getEntrees().toArray());
		entreeCB.setPreferredSize(new Dimension(200,25));
		buildMenuPanel.add(entreeCB);
		
		side = new JLabel("Side");
		side.setPreferredSize(new Dimension(55,25));
		buildMenuPanel.add(side);
		
		sideCB = new JComboBox<>(menuManager.getSides().toArray());
		sideCB.setPreferredSize(new Dimension(200,25));
		buildMenuPanel.add(sideCB);
		
		salad = new JLabel("Salad");
		salad.setPreferredSize(new Dimension(55,25));
		buildMenuPanel.add(salad);
		
		saladCB = new JComboBox<>(menuManager.getSalads().toArray());
		saladCB.setPreferredSize(new Dimension(200,25));
		buildMenuPanel.add(saladCB);
		
		dessert = new JLabel("Dessert");
		dessert.setPreferredSize(new Dimension(55,25));
		buildMenuPanel.add(dessert);
		
		dessertCB = new JComboBox<>(menuManager.getDesserts().toArray());
		dessertCB.setPreferredSize(new Dimension(200,25));
		buildMenuPanel.add(dessertCB);
		
		createMenu = new JButton("Create Menu with these dishes");
		createMenu.setPreferredSize(new Dimension(255, 25));
		createMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String name = JOptionPane.showInputDialog("Please enter the name of your menu: ");
				if (name != null) {
					menus.add(new Menu(name, 
							(Entree) entreeCB.getSelectedItem(), 
							(Side) sideCB.getSelectedItem(), 
							(Salad) saladCB.getSelectedItem(), 
							(Dessert) dessertCB.getSelectedItem()));
					updateJList();
				}
			}
		});
		buildMenuPanel.add(createMenu);
		
		// Generate Menu Section
		generateMenuPanel = new JPanel(new FlowLayout());
		
		generateAMenu = new JLabel("Or generate a Menu");
		generateAMenu.setPreferredSize(new Dimension(250,25));
		generateMenuPanel.add(generateAMenu);

		generateRandomMenu = new JButton("Generate a Random Menu");
		generateRandomMenu.setPreferredSize(new Dimension(255, 25));
		generateRandomMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String name = JOptionPane.showInputDialog("Please enter the name of your menu: ");
				if (name != null) {
					menus.add(menuManager.randomMenu(name));
					updateJList();
				}
			}		
		});
		generateMenuPanel.add(generateRandomMenu);
		
		generateMinCalMenu = new JButton("Generate a Minimum Calories Menu");
		generateMinCalMenu.setPreferredSize(new Dimension(255, 25));
		generateMinCalMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Please enter the name of your menu: ");
				if (name != null) {
					menus.add(menuManager.minCaloriesMenu(name));
					updateJList();
				}
			}
		});
		generateMenuPanel.add(generateMinCalMenu);
		
		generateMaxCalMenu = new JButton("Generate a Maximum Calories Menu");
		generateMaxCalMenu.setPreferredSize(new Dimension(255, 25));
		generateMaxCalMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Please enter the name of your menu: ");
				if (name != null) {
					menus.add(menuManager.maxCaloriesMenu(name));
					updateJList();
				}
			}
		});
		generateMenuPanel.add(generateMaxCalMenu);
		
		menuPanel.add(buildMenuPanel);
		menuPanel.add(generateMenuPanel);
		
		// Created Menus Section
		createdMenuPanel = new JPanel(new GridLayout(2, 1, 0, 60));
		
		menuListPanel = new JPanel(new FlowLayout());
		
		createdMenus = new JLabel("Created Menus");
		createdMenus.setPreferredSize(new Dimension(250, 25));
		menuListPanel.add(createdMenus);

		list = new JList<>(menus.toArray());
		list.setPreferredSize(new Dimension(250, 400));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		holder = new JScrollPane(list);
		menuListPanel.add(holder);
		
		menuButtonsPanel = new JPanel(new FlowLayout());
		
		details = new JButton("Details");
		details.setPreferredSize(new Dimension(255, 25));
		details.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) { 
				Object menu = list.getSelectedValue();
				if (menu != null) renderDetailPage((Menu) menu); 
			}
		});
		menuButtonsPanel.add(details);
		
		deleteAll = new JButton("Delete All");
		deleteAll.setPreferredSize(new Dimension(255, 25));
		deleteAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menus.clear();
				updateJList();
			}
		});
		menuButtonsPanel.add(deleteAll);
		
		saveToFile = new JButton("Save to File");
		saveToFile.setPreferredSize(new Dimension(255, 25));
		saveToFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileManager.writeMenu("data/menus.txt", menus);
			}
		});
		menuButtonsPanel.add(saveToFile);
		
		createdMenuPanel.add(menuListPanel);
		createdMenuPanel.add(menuButtonsPanel);
		
		frame.add(menuPanel);
		frame.add(createdMenuPanel);
		frame.pack();
	}
	
	// Methods
	/**
	 * Method updateJList
	 */
	private void updateJList() {
		list.setListData(menus.toArray());
		menuListPanel.repaint();
	}
	
	/**
	 * Method renderDetailPage
	 * @param menu the {@code Menu} selected for more detailed information 
	 */
	private void renderDetailPage(Menu menu) {
		FlowLayout fl = new FlowLayout();
		fl.setVgap(15);
		subFrame = new JFrame("Menu: " + menu.getName());
		subFrame.setPreferredSize(new Dimension(600, 450));
		subFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		subFrame.setResizable(false);
		subFrame.setLayout(fl);
		
		subEntree = new JLabel("Entree");
		subEntree.setPreferredSize(new Dimension(100, 75));
		subFrame.add(subEntree);
		
		entreeTA = new JTextArea(menu.getEntree().getName() + "\n" + 
				menu.getEntree().getDesc() + " Calories: " + menu.getEntree().getCal() + ". Price: $" + menu.getEntree().getPrice());
		entreeTA.setPreferredSize(new Dimension(450, 75));
		entreeTA.setLineWrap(true);
		entreeTA.setWrapStyleWord(true);
		entreeTA.setEditable(false);
		subFrame.add(entreeTA);
		
		subSide = new JLabel("Side");
		subSide.setPreferredSize(new Dimension(100, 75));
		subFrame.add(subSide);
		
		sideTA = new JTextArea(menu.getSide().getName() + "\n" + 
		menu.getSide().getDesc() + " Calories: " + menu.getSide().getCal() + ". Price: $" + menu.getSide().getPrice());
		sideTA.setPreferredSize(new Dimension(450, 75));
		sideTA.setLineWrap(true);
		sideTA.setWrapStyleWord(true);
		sideTA.setEditable(false);
		subFrame.add(sideTA);
		
		subSalad = new JLabel("Salad");
		subSalad.setPreferredSize(new Dimension(100, 75));
		subFrame.add(subSalad);
		
		saladTA = new JTextArea(menu.getSalad().getName() + "\n" + 
		menu.getSalad().getDesc() + " Calories: " + menu.getSalad().getCal() + ". Price: $" + menu.getSalad().getPrice());
		saladTA.setPreferredSize(new Dimension(450, 75));
		saladTA.setLineWrap(true);
		saladTA.setWrapStyleWord(true);
		saladTA.setEditable(false);
		subFrame.add(saladTA);
		
		subDessert = new JLabel("Dessert");
		subDessert.setPreferredSize(new Dimension(100, 75));
		subFrame.add(subDessert);
		
		dessertTA = new JTextArea(menu.getDessert().getName() + "\n" + 
		menu.getDessert().getDesc() + " Calories: " + menu.getDessert().getCal() + ". Price: $" + menu.getDessert().getPrice());
		dessertTA.setPreferredSize(new Dimension(450, 75));
		dessertTA.setLineWrap(true);
		dessertTA.setWrapStyleWord(true);
		dessertTA.setEditable(false);
		subFrame.add(dessertTA);
		
		totalCal = new JLabel("Total Calories: ");
		totalCal.setPreferredSize(new Dimension(100, 25));
		subFrame.add(totalCal);
		
		calTA = new JTextArea(String.valueOf(menu.totalCalories()));
		calTA.setPreferredSize(new Dimension(100, 25));
		subFrame.add(calTA);
		
		totalPrice = new JLabel("Total Price: $");
		totalPrice.setPreferredSize(new Dimension(100, 25));
		subFrame.add(totalPrice);
		
		priceTA = new JTextArea(String.valueOf(menu.getEntree().getPrice() + 
				menu.getSide().getPrice() + menu.getSalad().getPrice() + menu.getDessert().getPrice()));
		priceTA.setPreferredSize(new Dimension(100, 25));
		subFrame.add(priceTA);
		
		subFrame.pack();
		subFrame.setVisible(true);
	}
	
	/**
	 * Method main
	 * @param args arguments that were passed when running the main method, which in this case is null
	 */
	public static void main(String[] args) {		
		MenuManagerGUI gui = new MenuManagerGUI();
		gui.frame.setVisible(true);
	}
}
