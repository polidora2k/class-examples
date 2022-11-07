package com.teksystems.labs;

public class Boy extends Person{
	static double ageFactor = 1.1;

	@Override
	public String talk() {
		return (super.talk() + " ... but I love Java class.");
	}
	
	@Override
	public String walk() {
		return ("I am now walking");
	}

}
