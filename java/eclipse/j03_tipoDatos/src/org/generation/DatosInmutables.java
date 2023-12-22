package org.generation;

public class DatosInmutables {

	public static void main(String[] args) {
		// dato inmutable: no se puede modificar
		// dato primitivos son inmutables
		
		Integer cuentaBancaria = 6890;
		cuentaBancaria = 2345;
		
		String nombre = "Kim";
		nombre = "Alex";
		String participante = new String("Kim");
		
		if(participante.equals("Kim")) {
			System.out.println("Duplico la canción 1/2");
		}else {
			System.out.println("La persona no se llama Kim");
		}
		
		

	}

}
