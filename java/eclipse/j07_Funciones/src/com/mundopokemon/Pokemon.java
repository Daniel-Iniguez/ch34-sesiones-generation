package com.mundopokemon;

public class Pokemon {
	// atributos de instancia (de objeto)
	String nombre;
	String tipo;
	int puntosPoder;
	
	// aributos estaticos (de clase)
	static String nombreGenerico = "Pokemon";
	static String fabricante = "Ch34";
	
	// metodos de instancia
	void dormir() {
		System.out.println(nombre + " Duermiendo....");
	}
	/**
     * Sobrecarga de Métodos (Method Overloading)
     * 
     * Es la capacidad de definir múltiples métodos con el
     * mismo nombre en una clase. Esto permite usar el mismo
     * nombre para operaciones similares pero con diferentes
     * tipos de datos o parámetros.
     * 
     * Reglas:
     *  - El nombre del método debe ser el mismo
     *  - La lista de parámetros o número deben ser diferentes
     *  - El retorno puede ser diferente
     * 
     */
	void comer() {
		System.out.println(nombre +" Comiendo....");
	}
	/**
	 * Alimento para que coma el pokemon
	 * @param alimento
	 */
	void comer(String alimento) {
    	System.out.println(nombre + " come " + alimento);
    }
	
	/**
     * Alimento y gramaje que comerá el pokemon
     * @param alimento para el pokemon
     * @param gramaje del alimento
     * @return
     */
    String comer(String alimento, int gramaje) {
    	return nombre + " come " + gramaje +" gr. de " + alimento;
    }
    
    String pelear(Pokemon pokemon) {
    	//Confrontar a los pokemones y enviar el mensaje del pokemon ganador
    	//El ganador es el que tenga mayor puntos de poder
    	return null;
    }
    
    
	//metodos de clase
	static String nombreGenerico() {
		return nombreGenerico;
	}
	static void gritaPokemon() {
		System.out.println("Gritandooooo"+nombreGenerico);
	}
	
	static String nombreFabricante() {
		return "El nombre del fbricante es: " + fabricante;
	}
}
