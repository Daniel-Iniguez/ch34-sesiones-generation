package org.generation;

public class OperacionesMath {
	//atributos de instancia (non-static fields)
	//atributos de clase (static fields)
	
	//metodos constructores
	
	//metodos de instancia (corresponden a los objetos)
	void sumaSinRetorno(int a, int b) {
		System.out.println("Resultados: " + (a+b));
	}
	
	int sumaConRetorno(int a, int b) {
		return a+b;
	}
	
	//metodos estaticos / de clase (corresponden a la clase
	static double valorPI(){
//		return 3.141592;
		return Math.PI;
	}
}
