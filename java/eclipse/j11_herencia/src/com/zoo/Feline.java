package com.zoo;

public class Feline extends Mammal {
	
	private double clawLength;
	
	public Feline(String commonName, String scientificName, double age, double clawLenght) {
		super(commonName, scientificName, age, true);
		this.clawLength = clawLenght;
	}

	public double getClawLength() {
		return clawLength;
	}

	public void setClawLength(double clawLength) {
		this.clawLength = clawLength;
	}
	
	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
