package org.generation;

import java.util.ArrayList;

public class ArrayListConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección List es una colección ORDENADA, en la que
		 * se permiten elementos duplicados.
		 * 
		 * Se basa en un array redimensionable que crece su tamaño,
		 * según crece la colección de elementos.
		 * 
		 * Esta colección es la que mejor rendimiento tiene.
		 * 
		 * Sintaxis:
		 *  ArrayList<object> varName;
		 */
		int edad = 25;
		Integer age = 25;
		
		//Definimos una coleccion de datos numericos.
		//ArrayList<int> calificaciones
		ArrayList<Integer> calificaciones;
		
		//Definir una variable de tipo arrayList de Strings
		ArrayList<String> nombreLibros = new ArrayList<>();
		
		// Agregar datos al ArrayList con el metodo add()
		// El primer elememento es el indice 0
		nombreLibros.add("Piedra Filosofal");
		nombreLibros.add("Mujercitas");
		nombreLibros.add("El Ramayana");
		nombreLibros.add("La Tregua");
		nombreLibros.add("La Mecanica del Corazon"); 
		
		System.out.println(nombreLibros);
		
		//Agregamos valores duplicados
		nombreLibros.add("La Mecanica del Corazon"); 
		nombreLibros.add("Piedra Filosofal");
		
		System.out.println(nombreLibros);
		
		//Mostrar un elemento en particular
		//Indicamos el n.indice usando el metodo get()

		System.out.println("Misael recomienda: " + nombreLibros.get(2));
		
		//Obtener el tamaño de la coleccion con el metodo Size
		System.out.println("N. de libros: " + nombreLibros.size() );
		
		//Eliminar un elemento con el metodo remove()
		System.out.println("Elemeno eliminado: " + nombreLibros.remove(3));
		System.out.println(nombreLibros);
		
		//Saber si un elemento existe en la coleccion
		System.out.println("Esta \"Mujercitas\" ? " + nombreLibros.contains("Mujercitas"));
		System.out.println("Esta \"Vaqueritos\" ? " + nombreLibros.contains("Vaqueritos"));
		
		//Iterar la coleccion con for loop
		System.out.println("============== Con for loop");
		for (int i = 0; i < nombreLibros.size(); i++) {
			System.out.println(nombreLibros.get(i));
		}
		
		//Iterando con foreach
		System.out.println("============== Con foreach");
		for (String libros : nombreLibros) {
			System.out.println(libros);
		}
		
		//iterando con fucnion lambda
		System.out.println("============== Con funcion lambda");
		nombreLibros.forEach(libro -> System.out.println("Libro: " + libro));
		
		//Remplazar ocn un set()
		nombreLibros.set(1, "El abrigo dee Pupa");
		System.out.println(nombreLibros);
		
		//El pse de dato de los objetos es por referencia
		//Es necesario usar clone() para que las colecciones sean independientes
		
		ArrayList<String> books = (ArrayList<String>) nombreLibros.clone(); //Estoy pasando la referencia
		
		

	}

}
