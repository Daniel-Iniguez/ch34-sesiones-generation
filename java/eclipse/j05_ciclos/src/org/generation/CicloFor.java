package org.generation;

import java.util.Iterator;

public class CicloFor {

	public static void main(String[] args) {
		/**
		 * Sintaxis:
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final) 
		 *    instrucción;
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final){ 
		 *    instrucciones; 
		 *  }
		 * 
		 */
		
//		for(int i=0; i<=5; i++) {
//			System.out.println("Hola " + i); //Imprime 6 veces
//		}
		
//		for (byte j = 0; j <= 5; j--) {
//			System.out.println("Hola Lili: " + j); //Imprime 6 veces	
//		}
		
//		int iteraciones = 1;
//		for (  ;   ;  ) {
//			if( iteraciones > 5 ) { 
//				break;
//			}	
//			System.out.println("Iteración: " + iteraciones ++);		
//		}
		//Iteraciones = 5
		
//		outerLoop:
//			for (int i = 0; i < 5; i++) {
//				for (int j = 0; j < 5; j++) {
//					System.out.println(i +" "+ j);
//					if ( i== 2 && j == 2) break outerLoop;
//				}			
//			}
		
		
		for (int i = 1; i <= 50; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}else if (i % 5 == 0) {
				System.out.println("Buzz");
			}else if (i % 3 == 0) {
				System.out.println("Fizz");
			}else {
				System.out.println(i);
			}
			
		}
		
		//Forma de Serch
		String frase;
		for(int i = 0; i<=20; i++) {
			frase = "";
			if( i % 3 == 0 ) frase = "Fizz";			
			if( i % 5 == 0 ) frase += "Buzz";
			
			if( frase.equals("") ) System.out.println(i);
			else System.out.println(frase);
		}
		
		

	}

}
