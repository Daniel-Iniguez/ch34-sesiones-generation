package org.generation;

import com.citibanamex.Atm;

public class Bank {

	public static void main(String[] args) {
		Atm cajero01 = new Atm();
		Atm cajero02 = new Atm(2_000);
		Atm cajero03 = new Atm("3000");
		
		System.out.println("Cajero01: " + cajero01.getSerialNumber());
		System.out.println("Cajero02: " + cajero02.getSerialNumber());
		System.out.println("Cajero03: " + cajero03.getSerialNumber());
		deposit(cajero01, 400);
		deposit(cajero01, 800);
		deposit(cajero01, -600);
		deposit(cajero02, 50_000);
		
		System.out.println("Cajero01: " + cajero01.getBalance());
		System.out.println("Cajero02: " + cajero02.getBalance());
		System.out.println("Cajero03: " + cajero03.getBalance());
	}
	static void deposit(Atm atm, double amout) {
		try {
			atm.deposit(amout);
		} catch (Exception e) {
			System.out.println("Cajero: "+atm.getSerialNumber()+" Operacion rechazada "+e.getMessage());
		}
	}
}
