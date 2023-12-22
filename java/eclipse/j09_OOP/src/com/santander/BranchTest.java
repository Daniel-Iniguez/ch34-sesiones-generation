package com.santander;

public class BranchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Branch sucPolanco = new Branch("Polanco 999");
		
		sucPolanco.addAtm(new Atm(true));
		sucPolanco.addAtm(new Atm(true));
		sucPolanco.addAtm(new Atm(true));
		sucPolanco.addAtm(new Atm(15_000));
		
		System.out.println(sucPolanco.atms );
		System.out.println(sucPolanco.details());
		
		//Crear nueva sucursal con 3 cajeros
		Branch sucStaFe = new Branch("Santa Fe 9723");
		sucStaFe.addAtm(new Atm(true));
		sucStaFe.addAtm(new Atm(25_000));
		sucStaFe.addAtm(new Atm(false));
		System.out.println(sucStaFe.atms );
		System.out.println(sucStaFe.details());


	}

}
