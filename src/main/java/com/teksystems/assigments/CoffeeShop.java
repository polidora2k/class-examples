package com.teksystems.assigments;

import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;

public class CoffeeShop {
	private static final DecimalFormat DF = new DecimalFormat("0.00");

	public String name;
	public List<MenuItem> menu;
	public Queue<String> orders = new ArrayDeque<>();

	public CoffeeShop() {
		this.name = "";
		this.menu = new ArrayList<>();
	}

	public CoffeeShop(String name, MenuItem[] menu, String[] orders) {
		this.name = name;
		this.menu = new ArrayList<>();
		Collections.addAll(this.menu, menu);
	}

	public String addOrder(String itemName) {
		if (findInMenu(itemName) != null) {
			orders.add(itemName);
			return "Order added!";
		}

		return "This item is currently unavailable!";
	}

	public String fulfillOrder() {
		if (orders.isEmpty()) {
			return "All orders have been fulfilled!";
		} else {
			return ("The " + orders.poll() + " is ready!");

		}
	}

	public String[] listOrders() {
		String[] results = new String[orders.size()];
		results = orders.toArray(results);
		return results;
	}

	public double dueAmount() {
		double total = 0;

		if (orders.isEmpty()) {
			return 0;
		} else {
			for (String order : orders) {
				if (findInMenu(order) != null) {
					total += findInMenu(order).price;
				}
			}

			return Double.parseDouble(DF.format(total));
		}
	}

	public String cheapestItem() {
		MenuItem min = menu.get(0);

		for (MenuItem item : menu) {
			if (item.price < min.price) {
				min = item;
			}
		}

		return min.item;
	}

	public String[] drinksOnly() {
		return filterByType("drink");
	}

	public String[] foodOnly() {
		return filterByType("food");
	}

	private String[] filterByType(String type) {
		ArrayList<String> items = new ArrayList<>();

		for (MenuItem item : menu) {
			if (item.type.equalsIgnoreCase(type)) {
				items.add(item.item);
			}
		}

		String[] r = new String[items.size()];
		r = items.toArray(r);

		return r;
	}

	public MenuItem findInMenu(String name) {
		for (MenuItem item : this.menu) {
			if (item.item.equalsIgnoreCase(name)) {
				return item;
			}
		}

		return null;
	}

	public void removeOrder(String order) {
		if (orders.remove(order)) {
			System.out.println(order + " was removed.");
		} else {
			System.out.println(order + " was not found.");
		}
	}

	public String removeOrderPrim(String order) {
		String[] orders = new String[20];
		for (int i = 0; i < orders.length; i++) {
			if (orders[i].equalsIgnoreCase(order)) {
				String temp = orders[0];
				orders[0] = orders[i];
				orders[i] = temp;

				orders = Arrays.copyOfRange(orders, 1, orders.length - 1);
				return order + " was removed.";
			}
		}

		return order + " was not found.";
	}

	public List<MenuItem> listMenu() {
		Collections.sort(menu, new Comparator<MenuItem>() {
			@Override
			public int compare(MenuItem m1, MenuItem m2) {
				if (m1.item.compareTo(m2.item) == 0)	{
					return m1.price < +m2.price ? -1 : 1;
				} else {
					return m1.item.compareTo(m2.item);
				}
			}
		});

//		Collections.sort(menu, new Comparator<MenuItem>() {
//			@Override
//			public int compare(MenuItem m1, MenuItem m2) {
//				if (m1.item.compareTo(m2.item) == 0) {
//					return m1.price < +m2.price ? -1 : 1;
//				} else {
//					return 0;
//				}
//			}
//		});

		return menu;

	}

}
