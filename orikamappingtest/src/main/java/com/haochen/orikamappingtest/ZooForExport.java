package com.haochen.orikamappingtest;

import java.util.List;

public class ZooForExport {
	public List<AnimalForExport> animals;

	@Override
	public String toString() {
		return "ZooForExport [animals=" + animals + "]";
	}

	public ZooForExport(List<AnimalForExport> animals) {
		super();
		this.animals = animals;
	}
}
