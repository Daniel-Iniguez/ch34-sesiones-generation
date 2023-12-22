package org.generation;

public class OperacionesMathTest {

	public static void main(String[] args) {
		OperacionesMath operaciones = new OperacionesMath();
		
		operaciones.sumaSinRetorno(4, 5);
		
		int resultado = operaciones.sumaConRetorno(5, 7);
		System.out.println("resultado: "+resultado);
		
		double valorPi = OperacionesMath.valorPI();
		System.out.println(valorPi);
		
		

	}

}
