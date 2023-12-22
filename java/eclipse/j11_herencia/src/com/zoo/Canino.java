package com.zoo;

public class Canino extends Mammal {
	
	private boolean domestico;

	public Canino(String commonName, String scientificName, double age, boolean domestico) {
		super(commonName, scientificName, age, true);
		this.domestico = domestico;
	}

	public boolean isDomestico() {
		return domestico;
	}

	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}
	
	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
