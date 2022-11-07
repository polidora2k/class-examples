package com.teksystems.assigments;

public class MenuItem {
	
	public String item;
	public String type;
	public double price;
	
	public MenuItem() {
		this.item = "";
		this.type = "food";
		this.price = 0;
	}
	
	public MenuItem(String item, String type, double price) {
		this.item = item;
		this.type = type;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return item + " " + price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
