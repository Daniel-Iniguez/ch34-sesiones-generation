package org.generation;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		Scanner myScan = new Scanner( System.in );
		/**
		 * Sintaxis:
		 * 
		 *  switch( expresión ){ 
		 *    case valor1 : expresión; 
		 *                  break; 
		 *    case valor2 : expresión;
		 *                  break; 
		 *    default: expresión; 
		 *             break; 
		 *   }
		 * 
		 * La expresión a evaluar debe ser un tipo entero, string o enum. La condicional
		 * Switch usa el método equals para comparar los Strings.
		 */
		
		/**
		 * Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto.
		 * ej:entrada-> "Escribe tu mes de nacimiento: " 12 
		 * salida-> Naciste en diciembre.
		 * 
		 */
		
		
		System.out.print("Escribe tu mes de nacimineto: ");
		if( myScan.hasNextInt()  ) { // Verifica si existe un valor numérico entero
			int nMes = myScan.nextInt();
			String mensaje = "Naciste en ";
			String mes="";
			switch (nMes) {
			case 1:
				mes = "Enero";
				break;
			case 2:
				mes = "Febrero";		
				break;
			case 3:
				mes = "Marzo";			
				break;
			case 4:
				mes = "Abril";			
				break;
			case 5:
				mes = "Mayo";			
				break;
			case 6:
				mes = "Junio";		
				break;
			case 7:
				mes = "Julio";			
				break;
			case 8:
				mes = "Agosto";			
				break;
			case 9:
				mes = "Septiembre";			
				break;
			case 10:
				mes = "Octubre";			
				break;
			case 11:
				mes = "Noviembre";			
				break;
			case 12:
				mes = "Diciembre";		
				break;
			default:
				System.out.println("No existe");
				break;
			}
			System.out.println(mensaje+mes);
			myScan.close();
			
			
			String estacion="";
			switch (nMes) {
			case 1,2,12: estacion = "Invierno"; break;
			case 3,4,5: estacion = "Primavera"; break;
			case 6,7,8: estacion = "Verano"; break;
			case 9,10,11: estacion = "Otoño"; break;
			default:
				break;
			}
			System.out.print("La estacion del año es: "+estacion);
			
			
		} else {
			System.out.println("No introdujiste un número entero");
		}
		

	}

}
