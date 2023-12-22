package com.zoo;

public class Leopard extends Feline {

	public Leopard(double age) {
		super("Leopardo", "Panthera Pardus", age, 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sleep() {
		return "Soy un Leopardo y duermo siempre alerta";
	}

		
}
