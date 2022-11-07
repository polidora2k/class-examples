package com.teksystems.labs;

public class Circle extends Shape {
	protected double radius;
	private final double PI = Math.PI;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, double height) {
		this.radius = radius;
		super.height = height;
	}

	@Override
	public double getArea() {
		return PI * Math.pow(this.radius, 2); // initializing value in parent class variable
	}

	@Override
	public void displayshapName() {
		System.out.println("Drawing a Circle of radius " + this.radius);
	}

	/** Returns a self-descriptive string */
	@Override
	public String toString() {
		return "Circle[ radius = " + radius + super.toString() + "]";
	}

}
