package com.loner.pattern.bridge;

public class ClothingFactory {

	private Clothing clothing;
	
	public ClothingFactory(Clothing clothing) {
		this.clothing = clothing;
	}
	
	public void setClothing(Clothing clothing) {
		this.clothing = clothing;
	}
	
	public Clothing getClothing() {
		return clothing;
	}
}
