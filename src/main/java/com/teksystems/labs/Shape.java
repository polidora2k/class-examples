package com.teksystems.labs;

public abstract class Shape {
	protected String color;
	protected double base;
	protected double width;
	protected double height;


	public void setColor(String color) {
		this.color = color;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	/** Returns a self-descriptive string */
	@Override
	public String toString() {
		return "Shape[color=" + color + "]";
	}

	/** All shapes must provide a method called getArea() */
	public abstract double getArea();

	public void displayshapName() {
		System.out.println("I am a Shape.");
	}

}
