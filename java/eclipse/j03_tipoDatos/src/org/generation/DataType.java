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
	     *   > short
	     *   > int
	     *   > long
	     *   > float
	     *   > double
	     *   > boolean
	     *   > char
	     *      
	     */
		
		int z,x=1,y=1;
		z = x++ + y;
		
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

        /*
		 *  Las literales de punto flotante son por default double
		 *  ej. 123.567, 0.012, -0.989
		 */
		float myVarFloat = 1500.6523F;
		
		/*
		 * Dato Boolean
		 * Almacea valores true o false
		 */
		boolean myVarBoolea = true;
		
		/*
		 * Dato char
		 * Almacena un solo caracter.
		 * Se debe definir la literal con apóstrofe ej. 'a', 'C', ' '
		 * Solo alamacea caracteres de la tabla unicode(16 bits).
		 * puede alacenar del 0 al 65535
		 */
		
		char primeraLetraDeNombre = 'S';
		// Se puede alacenar por su valor unicode
		char letraL = '\u004C'; //L
		// También se puede definir por su valor numérico
		char letraM = 77; //M
		System.out.println("Letra L : " + letraL );
		System.out.println("Letra M : " + letraM );
		
		/*
		 * Formas de representar un número
		 */
		System.out.println("Representación decimal: " + 34 );
		System.out.println("Representación hexadecimal: " + 0x22 );
		System.out.println("Representación binaria: " + 0b0010_0010 );
		System.out.println("Representación octal: " + 042 );
		
		/*
		 *  Conversión de tipo de datos
		 */
		byte coquita350ml = 60;
		
		// upcasting
		short coquita2000ml = coquita350ml;
		
		short pozoleGrande1l = 259;
		// downcastig
		byte pozoleBurbuja = (byte)pozoleGrande1l;
		System.out.println(pozoleBurbuja); // 3
		
		
		//===========================================
		
		/*
		 * Tipo de dato String
		 * es un objeto que se define con comillas dobles.
		 * 
		 * sid eseas imprimir commilas dobles, se usa el caracter de escape \
		 * \b backspace
		 * \t tab
		 * \n line feed
		 * \r carriage return  
		 * \" double quote
		 * \' single quote
		 * \\ backslash
		 */
		
		String message = "No te metas en mi vida"
				+ "\n\tLa vida es como una caja de \"chocolate\"";
		System.out.println(message);
		
		//Convertir String a numeros
		String edadMascotaStr = "8";
		
		System.out.println("Edad mascota + 1: " + (edadMascotaStr +1));
		byte edadMascota = Byte.parseByte(edadMascotaStr);
		
		//Convertir numeros a String
		String numSuerte = String.valueOf(123);
		System.out.println("Primer caracter de mi numSuerte: " + numSuerte.charAt(0));
		System.out.println("Numero de digitos: " + numSuerte.length());
		
		// ======================================================================
		
		//Operadores numericos
		int opA = (int)5.2;
		int opB = 6;
		int suma = opA + opB; // 11
		System.out.println("suma: "+suma);
		int resta = opA - opB; //-1
		System.out.println("resta: "+resta);
        
		int multiplica = (int) (opA * 1.1); //5
		double multiplicaDouble = opA * 1.1; //5.5
		
		int division = opA/opB; //0
		System.out.println(division);
		
		
		//double divisionDouble = opA/opB; //0.833 -> trunca a int -> 0
		double divisionDouble = opA/opB;
		System.out.println(divisionDouble);
        
		int residuo = opA % 2; //11
		System.out.println(residuo);
		
		// Operadores de pre incremento, post decremento
				int valorInicial = 10;
				
				System.out.println("Preincremeto: " + ++valorInicial ); // 11
				System.out.println("Postincremeto: " + valorInicial++ ); // 11
				System.out.println("Valor final: " + valorInicial); // 12
				
				valorInicial = 50;
				System.out.println("Predecremeto: " + --valorInicial ); // 49
				System.out.println("Postdecremeto: " + valorInicial-- ); // 49
				System.out.println("Valor final: " + valorInicial); // 48
				
				// Operadores Comparativos
				// El resultado es un booleano
				// <, <=, >, >=, == , !=
				// System.out.println( 5 == "5" ); // No se puede comparar, hay que hacer una conversión
				int numEmpleados = 1000;
				System.out.println("Empleados > 1000 " + ( numEmpleados > 1000 ) ); // false
				System.out.println("Empleados >= 1000 " + ( numEmpleados >= 1000 ) ); // true
				System.out.println("Empleados <= 1000 " + ( numEmpleados <= 1000 ) ); // true  
				System.out.println("Empleados == 1000 " + ( numEmpleados == 1000 ) ); // true
				System.out.println("Empleados != 1000 " + ( numEmpleados != 1000 ) ); // false
				
				// Operadores lógicos
				   // && (AND) retorna true si ambos operadores son true
				   // || (OR) retorna true si cualquiera de los operandos es true
				   // !  (NOT) invierte el resultado booleano
				   boolean a = true;
				   boolean b = false;
				   boolean c = true;
				   System.out.println( (a && b) || (a && c) );   // true
				   System.out.println( a || b || c && a );       // true
				   System.out.println( !(a || b) && (!a || c) ); // false	   	  
				   System.out.println( a || b && c || a && b  ); // true
				   
				   // 45/0 -> Genera una excepción
		
        

	}
}
