package com.haochen.orikamappingtest;

public class Dog extends Animal{
	public String tailColor;
	public String dogSecret;
	public Dog(String name, String secret, String tailColor, String dogSecret) {
		super(name, secret);
		this.tailColor = tailColor;
		this.dogSecret = dogSecret;
	}
	@Override
	public String toString() {
		return "Dog [tailColor=" + tailColor + ", dogSecret=" + dogSecret + "]";
	}
}
