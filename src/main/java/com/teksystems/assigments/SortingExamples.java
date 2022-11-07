package com.teksystems.assigments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class SortingExamples {

	private static MenuItem[] menu = new MenuItem[] { new MenuItem("orange juice", "drink", 2.13),
			new MenuItem("lemonade", "drink", 0.85), new MenuItem("cranberry juice", "drink", 3.36),
			new MenuItem("lemonade", "drink", 0.65), new MenuItem("cranberry juice", "drink", 3.36),
			new MenuItem("pineapple juice", "drink", 1.89), new MenuItem("lemon iced tea", "drink", 1.28),
			new MenuItem("apple iced tea", "drink", 1.28), new MenuItem("vanilla chai latte", "drink", 2.48),
			new MenuItem("hot chocolate", "drink", 0.99), new MenuItem("iced coffee", "drink", 1.12),
			new MenuItem("tuna sandwich", "food", 0.95), new MenuItem("ham and cheese sandwich", "food", 1.35),
			new MenuItem("bacon and egg", "food", 1.15), new MenuItem("steak", "food", 3.28),
			new MenuItem("hamburger", "food", 1.05), new MenuItem("cinnamon roll", "food", 1.05),
			new MenuItem(null, "food", 1.05) };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Descending");
		descend().forEach(item -> System.out.println(item));
		spacer();
		System.out.println("Ascending Null Last");
		ascendNullLast().forEach(item -> System.out.println(item));
		spacer();
		System.out.println("Ascending Null First");
		ascendNullFirst().forEach(item -> System.out.println(item));
		spacer();
		System.out.println("Drinks");
		drinks().forEach(item -> System.out.println(item));
		
	}
	
	public static void spacer() {
		System.out.println("==============================");
	}

	public static List<MenuItem> descend() {
		List<MenuItem> list = Arrays.asList(menu);
		Collections.sort(list, new Comparator<MenuItem>() {
			@Override
			public int compare(MenuItem m1, MenuItem m2) {
				if (m1.item == null) {
					return (m2.item == null) ? 0 : -1;
				} else if (m2.item == null) {
					return 1;
				} else {
					return -(m1.item.compareTo(m2.item));
				}
			}
		});
		
		return list;
	}
	
	public static List<MenuItem> ascendNullLast(){
		List<MenuItem> list = Arrays.asList(menu);
		Collections.sort(list, new Comparator<MenuItem>() {
			@Override
			public int compare(MenuItem m1, MenuItem m2) {
				if (m1.item == null) {
					return (m2.item == null) ? 0 : 1;
				} else if (m2.item == null) {
					return -1;
				} else {
					return m1.item.compareTo(m2.item);
				}
			}
		});
		
		return list;
	}
	
	public static List<MenuItem> ascendNullFirst(){
		List<MenuItem> list = Arrays.asList(menu);
		Collections.sort(list, new Comparator<MenuItem>() {
			@Override
			public int compare(MenuItem m1, MenuItem m2) {
				if (m1.item == null) {
					return (m2.item == null) ? 0 : -1;
				} else if (m2.item == null) {
					return 1;
				} else {
					return m1.item.compareTo(m2.item);
				}
			}
		});
		
		return list;
	}

	public static List<MenuItem> drinks(){
		List<MenuItem> list = new ArrayList<>();
		list.addAll(Arrays.asList(menu));
		list.removeIf(item -> item.type.equalsIgnoreCase("drink"));
		return list;
	
	}
}
