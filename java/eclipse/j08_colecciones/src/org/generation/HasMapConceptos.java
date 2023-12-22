package org.generation;

import java.util.HashMap;

public class HasMapConceptos {

	public static void main(String[] args) {
		/**
		 * Una colección Map, es una relación clave(key):valor(value)
		 * que forma una tabla de datos.
		 */
		
		// Definimos una colección HashMap
		// < key, value   >
		HashMap<Integer, String > students = new HashMap<>();
		
		//Agregamos valores con put()
		students.put( 1234, "Migue O");
		students.put( 1235, "Olivia R");
		students.put( 1236, "Fernando J");
		students.put( 1250, "Mirta T");
		
		System.out.println(students);
		
		//remplazar un elemento 
		students.put(1250, "Liliana");
		System.out.println(students);
		
		//Mostrar un elemento con get(key)
		System.out.println("Persona con n.1235: " + students.get(1235));
		
		//removiendo un elemento remove(key)
		System.out.println("Elemento eliminado " + students.remove(1234));
		System.out.println(students);
		
		//Iterar la coleccion con sus keys
		for (int matricula : students.keySet()) {
			System.out.println(matricula + " - " + students.get(matricula));
		}
		
		//Iterar la colección con sus valores
		for (String student : students.values()) {
			System.out.println("Estudiante: " + student);
		}
		
		students.forEach((key,value) -> System.out.println(key + " - " + value));

	}

}
