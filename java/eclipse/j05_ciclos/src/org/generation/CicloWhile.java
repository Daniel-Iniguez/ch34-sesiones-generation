package org.generation;

import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/**
		 * Ciclo While
		 * Mientras la condición sea verdadera, se realiza un nuevo ciclo.
		 * 
		 * Sintaxis:
		 *     
		 *     while( condicion ) instruccion;
		 *     
		 *     while( condicion ) {
		 *        instrucciones;
		 *     }
		 * 
		 * Ciclo Do While()
		 * 
		 * Sintaxis:
		 *     do{
		 *      instrucciones;
		 *     }while(condicion);
		 *   
		 * 
		 */
		
		// preguntar al usuario usado la consola
		// si desea cotinuar iterando
		// si la persona escriba "s" cotinuamos con nueva iteración
		// caso contrario, finalizamos.
		
		boolean ciclo = false;
		int i = 0;
		
		
		while (ciclo == true) {		
			i++;
			System.out.println("Numero de iteracion: "+i);
			System.out.print("Deseas continuar iterando? (s)/(n)  ");
			char respuesta = scan.next().charAt(0);
		
			if(respuesta == 's' || respuesta == 'S') {
				System.out.println("Continuando...");
			}else {
				System.out.println("Iteraciones Finalizadas, Vuelve Pronto");
				ciclo = false;
			}	
		}
		
		do {
			i++;
			System.out.println("Numero de iteracion: "+i);
			System.out.print("Deseas continuar iterando? (s) para continuar / clq para finalizar:  ");
			char respuesta = scan.next().charAt(0);
		
			if(respuesta == 's' || respuesta == 'S') {
				System.out.println("Continuando...");
				ciclo = true;
			}else {
				System.out.println("Iteraciones Finalizadas, Vuelve Pronto");
				ciclo = false;
			}
		} while (ciclo == true);
		

	}

}
