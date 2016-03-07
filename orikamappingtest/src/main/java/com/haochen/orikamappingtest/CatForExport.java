package com.haochen.orikamappingtest;

public class CatForExport extends AnimalForExport{
	public String tailColor;

	public CatForExport(String name, String tailColor) {
		super(name);
		this.tailColor = tailColor;
	}

	@Override
	public String toString() {
		return "CatForExport [tailColor=" + tailColor + "]";
	}

}
