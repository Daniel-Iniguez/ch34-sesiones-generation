package org.generation;

import java.util.HashSet;

public class HashSetConceptos {

	public static void main(String[] args) {
		/**
		 * Una colección de tipo SET es una colección NO ORDENADA.
		 * No se permite elementos duplicados
		 * Cualquier elemento duplicado no se insertará en la colección.
		 * 
		 * Sintaxis:
		 *  HashSet<Object> varName;
		 */

		// Definimos una colección HashSet
		HashSet<String> paises = new HashSet<>();
		
		//Agregar valores con add()
		paises.add("Genovia");
		paises.add("Wakanda");
		paises.add("Colombia");
		paises.add("México");
		paises.add("japon");
		paises.add("Cuba");
		
		System.out.println(paises);
		
		//agregar valores duplicados
		paises.add("Wakanda");
		paises.add("Genovia");
		
		System.out.println(paises);
		
		//Desplegar el tamaño de la colecciuon usando size()
		System.out.println("N. de paise " + paises.size());
		
		//Verificar si existe el pais "Wakanda", "Guatemala"
		System.out.println("Existe Wakanda? " + paises.contains("Wakanda"));
		System.out.println("Está Guatemala? " + paises.contains("Guatemala") );
		
		//Remover un elemento con remove()
		//Se indica el elemento a remover con el objeto
		System.out.println("Eliminados: " + paises.remove("Mexico"));
		System.out.println(paises);
		
		//Itermaos la coleccion con for each
		System.out.println("============== Con foreach");
		for (String pais : paises) {
			System.out.println(pais);
		}
		
		//Iterando con fucnion lambda
		System.out.println("============== Con funcion lambda");
		paises.forEach(pais -> System.out.println("Pais: " + pais));
	}

}
