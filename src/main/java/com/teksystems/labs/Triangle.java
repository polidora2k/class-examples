package com.teksystems.labs;

public class Triangle extends Shape {
	public Triangle() {
	}

	public Triangle(String color) {
		super.color = color;
	}

	@Override
	public void setBase(double base) {
		super.base = base;
	}

	@Override
	public double getArea() {
		return 0.5 * super.base * super.height;
	}

	// Overriding method of base class with different implementation
	@Override
	public void displayshapName() {
		System.out.println("I am a TriAngle");
	}

	/** Returns a self-descriptive string */
	@Override
	public String toString() {
		return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
	}

}
