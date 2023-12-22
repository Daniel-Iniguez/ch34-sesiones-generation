package com.zoo;

import com.pet.Pet;

public class Cat extends Feline implements Pet {
	private String petName;
	
	public Cat(String petName, double age) {
		super("Gato", "Felis catus", age, .50);
			this.petName = petName;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	@Override
	public String sleep() {
		return "El michi " + this.petName + " duerme 10h. ";
	}
	
	@Override
	public String eat(String food) {
		return "El michi " + getPetName() + " come deliciosas " + food + " cuando se le da la gana";
	}

	@Override
	public String trick() {
		return "El michi " + this.getPetName() + "Siempre cae con las 4 patas" ;
	}
	
	
}
