package codigoOtros_5;

/*
El programa pide un numero al usuario, si el usuario digita un numero donde sea igual a 3, 7, 8 o 9 
sale un mensaje donde dice que el numero es afortunado si no es asi sale un mensaje donde dice que el numero no es afortunado
 */
import java.util.Scanner;

public class CodigoOtros5 {
	public static void main(String[] args) { // Faltaba el metodo Main
		Scanner s = new Scanner(System.in); // faltaba importar Scanner y faltaba el System.in
		System.out.print("Introduzca un número: "); // Mal uso de comillas
		int ni = s.nextInt(); // Era tipo String y debe ser tipo Int asi como tambien la parte de nextInt
		// int c = ni; //Esta linea no es necesaria

		//Estas 2 lineas no se ocupan
		//int afo = 0;
		//int noAfo = 0;

		// Abia un ciclo while lo cual no es necesario, aparte era infinito.
		int digito = (ni % 4); // esta linea no es necesaria
		System.out.println(digito);
		if ((ni == 3) || (ni == 7) || ni == 8 || ni == 9) { //Cambie la variable digito por el ni que es la inicial
			System.out.println("El " + ni + " es un número afortunado."); // Faltaba la t de pirintln, cambie la variable c que quite por ni
			//afo++; //No es necesaria esta linea
		} else {
			System.out.println("El " + ni + " no es un número afortunado."); //cambie la variable c que quite por ni
			// noAfo++;  //No es necesaria esta linea

			// ni /= 10; //No es necesaria esta linea
		}
		// quito este if y lo pongo directo en el de arriba
			
		

	}

}
