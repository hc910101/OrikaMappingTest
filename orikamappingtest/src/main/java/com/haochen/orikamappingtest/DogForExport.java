package com.haochen.orikamappingtest;

public class DogForExport extends AnimalForExport{
	public String tailColor;

	public DogForExport(String name, String tailColor) {
		super(name);
		this.tailColor = tailColor;
	}

	@Override
	public String toString() {
		return "DogForExport [tailColor=" + tailColor + "]";
	}


}
