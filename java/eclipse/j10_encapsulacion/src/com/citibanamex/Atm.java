package com.citibanamex;

public class Atm {
	
	private int serialNumber;
	private double balance;
	
	static int counter = 0;
	
	public Atm(){
		this.serialNumber = ++counter;
		this.balance = 10_000;
	}
	
	/**
	 * Constructor sobre cargado que acepta un monto para iniciar el balance
	 */
	public Atm(double balance){
		this();
		this.balance = balance;
	}
	
	/**
	 * Constructor sobrecargado que acepta un balnce en formato String
	 */
	public Atm(String number) {
		  this(Double.parseDouble(number));
	}
	
	public int getSerialNumber(){
		return this.serialNumber;
	}
	
	public void setSerialNumber(int serialNnumber){
		this.serialNumber = serialNnumber;
	}

	public double getBalance() {
		return this.balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setBalance(String balance) {
		setBalance(Double.parseDouble(balance));
	}
	
	public void deposit(double amount) {
		if(amount > 0 ) {
			setBalance(getBalance()+amount);
		}else {
			//System.out.println("No se permite depósitos igual o menor a cero");
			throw new IllegalArgumentException("No se permite depositos igual o menor a cero");
		}
	}

	public void deposit(String amount) {
		deposit(Double.parseDouble(amount));
	}
	
	//Verificar que el amount no sea negativo o mayor al balance
	// Enviar mensaje en la consola de acuerdo a la situación
	public void withDraw(double amount) {
		if( amount <= 0 ) {
			//System.out.println("Cantidad menor o igual a cero");
			throw new IllegalArgumentException("Cantidad menor o igual a cero");
		} else if( amount > getBalance() ) {
			//System.out.println("Fondos insuficientes");
			throw new IllegalArgumentException("Fondos insuficientes");
		} else {
			setBalance( getBalance() - amount  );
		}
	}
}
