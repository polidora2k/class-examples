package com.teksystems.assigments;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CoffeeShopInterface {

	private static final Scanner IN = new Scanner(System.in);
	private static final NumberFormat NF = NumberFormat.getCurrencyInstance(Locale.US);
	private static MenuItem[] menu = new MenuItem[] { new MenuItem("orange juice", "drink", 2.13),
			new MenuItem("lemonade", "drink", 0.85), new MenuItem("cranberry juice", "drink", 3.36),
			new MenuItem("pineapple juice", "drink", 1.89), new MenuItem("lemon iced tea", "drink", 1.28),
			new MenuItem("apple iced tea", "drink", 1.28), new MenuItem("vanilla chai latte", "drink", 2.48),
			new MenuItem("hot chocolate", "drink", 0.99), new MenuItem("iced coffee", "drink", 1.12),
			new MenuItem("tuna sandwich", "food", 0.95), new MenuItem("ham and cheese sandwich", "food", 1.35),
			new MenuItem("bacon and egg", "food", 1.15), new MenuItem("steak", "food", 3.28),
			new MenuItem("bacon and egg", "food", 1.00), new MenuItem("steak", "food", 3.50),
			new MenuItem("hamburger", "food", 1.05), new MenuItem("cinnamon roll", "food", 1.05) };
	private static CoffeeShop shop = new CoffeeShop("Deep Into Coffee", menu, new String[] {});

	public static void main(String[] args) {
		System.out.println("Welcome to " + shop.name);
		boolean exit = false;
		int ans = 1;
		while (!exit) {
			System.out.println("----------------------------------");
			System.out.println("Please select and option from the menu below:");
			System.out.println("1) order item\n2) list order\n3) fulfillOrder\n4) List menu\n5) print total"
					+ "\n6) list drinks\n7) list food\n8) exit");
			try {
				ans = IN.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input: The Input must be a number");
				IN.nextLine();
				continue;
			} catch (Exception e) {
				IN.nextLine();
				continue;
			}
			
			IN.nextLine();

			if (ans < 1 || ans > 8) {
				System.out.println("ERROR: Invalid Input.");
				continue;
			}
			
			System.out.println("----------------------------------");
			
			switch (ans) {
			case 1:
				order();
				break;
			case 2:
				listOrder();
				break;
			case 3:
				checkout();
				break;
			case 4:
				listMenu();
				break;
			case 5:
				System.out.println("Total: " + NF.format(shop.dueAmount()));
				break;
			case 6:
				listDrinks();
				break;
			case 7:
				listFood();
				break;
			case 8:
				removeOrder();
				break;
			default :
				exit = true;
				break;
			}

			System.out.println("----------------------------------");
		}

	}

	public static void order() {
		System.out.print("What would you like to order? ");
		String item = IN.nextLine();
		System.out.println(shop.addOrder(item));
	}

	public static void listOrder() {
		System.out.println("Current Order:");
		for (String order : shop.listOrders()) {
			System.out.println("- " + order);
		}
		System.out.println("Total: " + NF.format(shop.dueAmount()));
	}

	public static void checkout() {
		while (shop.listOrders().length != 0) {
			System.out.println(shop.fulfillOrder());
		}

		System.out.println("Your order is complete!");
	}

	public static void listDrinks() {
		System.out.println("Drinks:");
		for (String drink : shop.drinksOnly()) {
			System.out.println(drink);
		}
	}

	public static void listFood() {
		System.out.println("Food:");
		for (String food : shop.foodOnly()) {
			System.out.println(food);
		}
	}

	public static void listMenu() {
		shop.listMenu().forEach(item -> {System.out.println(item);});

	}
	
	public static void removeOrder() {
		System.out.print("What order would you like to remove?");
		String order = IN.nextLine();
		shop.removeOrder(order);
	}

}
