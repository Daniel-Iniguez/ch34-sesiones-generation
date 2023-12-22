package com.mundopokemon;

public class ArenaPokemon {

	public static void main(String[] args) {
		Pokemon.gritaPokemon();
		
		Pokemon pikachu = new Pokemon();
		pikachu.nombre = "Pikachu";
		pikachu.tipo= "Electrico";
		pikachu.puntosPoder= 90;
		
		Pokemon charmander = new Pokemon();
		charmander.nombre = "Charmander";
		charmander.tipo= "Fuego";
		charmander.puntosPoder= 120;
		
		Pokemon squirtle = new Pokemon();
		squirtle.nombre = "Squirtle";
		squirtle.tipo= "Agua";
		squirtle.puntosPoder= 50;
		
		//Hacemos comer a pikachu
		System.out.println(pikachu.comer("bayas",100));
		
		//Hacemos dormir a charmander
		charmander.dormir();
		
		// Mostrar el fabricante de los Pokemones
		System.out.println( Pokemon.nombreFabricante() );
		System.out.println( Pokemon.nombreFabricante() );

	}

}
