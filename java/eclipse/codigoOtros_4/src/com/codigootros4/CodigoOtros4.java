package com.codigootros4;

import java.util.Scanner; //Faltaba importar Scanner

public class CodigoOtros4 {
	// Faltaba el metodo main para correr el programa
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Faltaba agregarle System.in

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // El mnesaje volvia a mostrar que era turno del jugador 1 y se cambio por el 2
//	    Scanner s2 = new Scanner(); //	Esta linea esta mal y sobrando
		String j2 = s.nextLine();

		if (j1.equals(j2)) { // Habia un parentesis de más y para comparar string se ocupa equals
			System.out.println("Empate");
		} else {
			int g = 2;
			switch (j1) {
				case "piedra":
					if (j2.equals("tijeras")) {
						g = 1;
					}
					break; //Faltaba el break; para salir de la condicion
				case "papel":
					if (j2.equals("piedra")) {
						g = 1;
					} // Faltaba la llave de cierre
					
					break; //Faltaba el break; para salir de la condicion
				case "tijera":
					if (j2.equals("papel")) {
						g = 1;
					}
					
					break;
				default:
					System.out.println("Palabra no valida");
					break; //Se agrego el codigo por si no se cumple una condicion valida para el jugador 1
			}
			System.out.println("Gana el jugador " + g); //Se imprime en cada condicion para obtener al ganador correctamente
		}
		
	}

}
