package org.generation;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CondicionalIf {

	public static void main(String[] args) {
		/**
		 * Sintaxis de la condicional if Si la condicional es verdadera, se ejecuta la
		 * instrucción de if
		 * 
		 * if ( condicional ) sentencia;
		 * 
		 * if ( condicional ) { sentencias; }
		 * 
		 * if ( condicional ) sentencia; else sentencia_Si_condicional_es_falsa;
		 * ------------------------------------------------------ 
		 * if ( condicional )
		 * sentencia; else if ( nueva_condicional) sentencia; . . . else if ( *
		 * n_condición ) sentencia; else sentencia;
		 * 
		 */

		// Verifiquen la edad de una persona.
		// Si es mayor de eda imprimir puede votar


		System.out.print("Ingrese la edad: ");
		// int age = scanner.nextInt();
		int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));

		if (age >= 18) {
			System.out.println("Puede votar");
		} else {
			System.out.println("No puede votar");
		}
		
		
		/*
		 * De una variable tipo int, evaluar si está en el rango de 1 a 10, si es así
		 * desplegar en consola "La selección está en el rango" En caso contrario
		 * "La selección está fuera de rango"
		 */
		/*
		int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
		//int number = scanner.nextInt();

		if (number >= 1 && number <= 10) {
			System.out.println("El numbero ingresado esta en el rango");
		} else {
			System.out.println("El numero ingreado esta fuera de rango");
		}
		*/
		
		/*
		 * Operador ternario.
		 * 
		 * Sintaxis: expresión ? respuesta_si_es_true : si_es_false
		 * 
		 */
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
		
		String mensaje = (number2 >= 1 && number2 <= 10) ? "El numbero ingresado esta en el rango" : "El numero ingreado esta fuera de rango";
		
		JOptionPane.showMessageDialog(null, mensaje);
		
		// --------------------------------------------------------------
		// -------------- Clase Scaner --------------------------------
				int age2;
				age2 = 20;
				
				Scanner myScan; 
				myScan = new Scanner( System.in );
				
//				System.out.print("Escribe tu nombre: ");		
//				String myName = myScan.nextLine(); // lee toda la línea hasta /n"		
//				System.out.println("Tu nombre es: " + myName);
//				
//				System.out.print("Escribe una frase: ");		
//				String frase = myScan.next(); // lee hasta el delimitador indicado		
//				System.out.println("La primera palabra de la frase es: " + frase);
//				myScan.nextLine(); // consumimos el resto de caracteres (\n) del buffer
//				System.out.print("Escribe tu canción favorita: ");		
//				String cancion = myScan.nextLine(); 		
//				System.out.println("Tu canció es: " + cancion);
				
				System.out.print("Dime tu número entero favorito :");
				if( myScan.hasNextInt()  ) { // Verifica si existe un valor numérico entero
					int number = myScan.nextInt();
					System.out.println("Tu número favorito es: " + number);
					
				} else {
					System.out.println("No introdujiste un número entero");
				}
				myScan.nextLine();	// limpiar el buffer		
						
				myScan.close();// liberar recursos
			
		
	}

}
