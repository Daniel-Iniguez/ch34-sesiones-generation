package com.zoo;

import com.pet.Pet;

public class Dog extends Canino implements Pet{
	
	private String raza;
	private String petName;
	
	
	public Dog(double age, String raza, String petName) {
		super("Perro", "Perriño", age, true);
		this.raza = raza;
		this.petName = petName;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public String raza() {
		return "El perrito es un " + getRaza();
	}
	
	@Override
	public String sleep() {
		return "El perrito " + this.petName + " duerme 8h. ";
	}
	
	@Override
	public String eat(String food) {
		return "El perrito " + getPetName() + " come deliciosas " + food + " cuando se le da la gana";
	}

	@Override
	public String trick() {
		return "El perrit@ " + this.getPetName() + " Siempre juega con la pelota" ;
	}

	
	

}
