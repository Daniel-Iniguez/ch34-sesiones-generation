package org.generation;

public class DataType {

	public static void main(String[] args) {
		// Este es un mensaje de linea
		
		/*
         * Este es un comentario de bloque
         * 
         * Reglas para el nombre de las variables:
         *  - Se distingue entre minúsculas y mayúsculas
         *  - La longitud del nombre es ilimitada
         *  - Puedes utilizar cualquier caracter Unicode
         *  - La variable puede comenzar:
         *    > una letra ej. miVariable
         *    > signo de dolar $miVariable
         *    > caracter de subrayado _miVariable
         *  
         */
		
		int $myVar; //Es valido no se recomienda.
		int _numEngranes; //Es valido, no se recomienda.
		//int #numPersonas; //No es valido.
		int myVarEnEspañol; //Es valido, se recomienda poner en ingles.
		//int 5comentarios; //No es valido.
		int sinC0m3nt4r10s; //Es valido, no se recomienda.
		
		/*
         * En Java tendremos  los siguientes tipo de variables:
         *  Variables de instancia (Non static fields): atributos de los objetos.
         *  Variables de clase (Static Fields): atributos de la clase.
         *  Variables locales (local variables): variable dentro de las funciones(métodos)
         *  Parámetros (parameters): Entrada de las funciones
         * 
         */
		
		/**
	     *  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
	     *  Tipos de datos en Java
	     *  - Objetos
	     *  - Datos primitivos
	     *      8 datos primitivos
	     *   > byte
	     *   > shorte
	     *   > int
	     *   > long
	     *   > float
	     *   > double
	     *   > boolean
	     *   > char
	     *      
	     */
		
		
		// El tipo byte es de 8 bits, almacena datos numéricos enteros
        byte myVarByte; // declarando la variable
        myVarByte = 12; // asignarle un valor a la variable
        /*
         *  2^8 = 256
         *  Para Obtener el valor máximo y mínimo del tipo byte
         *  usando su wrapper (clase envolvete) Byte.
         */
        
        System.out.println("byte: Min value: " + Byte.MIN_VALUE ); // -128
        System.out.println("byte: Max value: " + Byte.MAX_VALUE ); // 127 -> 0... 127 = 128 valores
       
        /*
         *  Tipo de dato short
         *  Dato de 16 bits, alamacena valores enteros
         *  2^16 = 65536
         *  Valores positivos:  0... 32767
         *  Valores Negativos: -1... -32668
         *  Obtener el MAX_value y MIN_VALUE usando el warapper Short
         */
        System.out.println("\nshort: Min value: " + Short.MIN_VALUE );
        System.out.println("short: Max value: " + Short.MAX_VALUE ); 
        
		/**
		 * Tipo de dato int
		 * dato de 32 bits, almacena valores enteros -2,147,483,648 a 2,147,483,6467
		 * el wrapper de int es Integer
		 */
        
        System.out.println("\nint: Min value: " + Integer.MIN_VALUE ); 
        System.out.println("int: Max value: " + Integer.MAX_VALUE );
		 
        /*
         * Tipo de dato long
         * Dato de 64 bits. almacena datoa enteros
         * el wrapper de long es Long
         */
        
        System.out.println("\nlong: Min value: " + Long.MIN_VALUE ); 
        System.out.println("long: Max value: " + Long.MAX_VALUE ); 
        
        /*
         * Las literales numericas enteras en java son de tipo int
         * ej. 12, -456, 0
         */
        
        long edadPlaneta = 2147483648L;
        
        // =====================================================================
        /*
         * Dato de tipo float
         * Dato de 32 bits, almacena valores númericos de punto flotante
         * wrapper de float es Float
         */
        System.out.println("\nfloat: Min value: " + Float.MIN_VALUE ); //1.4E-45
        System.out.println("float: Max value: " + Float.MAX_VALUE ); //3.4028235E38
        
        /*
         * Dato de tipo double
         * Dato de 62 bits, almacena valores númericos de punto flotante
         * wrapper es Double
         */
        System.out.println("\ndouble: Min value: " + Double.MIN_VALUE ); //4.9E-324
        System.out.println("double: Max value: " + Double.MAX_VALUE ); //1.7976931348623157E308

	}
}
