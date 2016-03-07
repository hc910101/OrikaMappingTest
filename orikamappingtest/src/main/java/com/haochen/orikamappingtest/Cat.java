package com.haochen.orikamappingtest;

public class Cat extends Animal{
	public String tailColor;
	public String catSecret;
	public Cat(String name, String secret, String tailColor, String catSecret) {
		super(name, secret);
		this.tailColor = tailColor;
		this.catSecret = catSecret;
		
	}
	@Override
	public String toString() {
		return "Cat [tailColor=" + tailColor + ", catSecret=" + catSecret + "]";
	}
	
}
