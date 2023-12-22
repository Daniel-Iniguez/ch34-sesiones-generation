package prueba;
/*
 Condiciones inciales: $10,000.00 de saldo.

 Opciones del cajero:
     1) Retirar dinero
     2) Hacer depósitos
     3) Consultar saldo
     4) Quejas
     5) Ver últimos movimientos
     9) Salir del cajero
     
    Dónde:

1) Retirar dinero:
Mostrar la cantidad disponible a retirar.
No se puede retirar más de $6,000.00
Solo se puede retirar múltiplos de $50.00
Una vez retirado el monto preguntar: ¿Desea donar $200 para la graduacón de ch30?

2) Hacer depósitos
Mostrar un nuevo menú para depositar a:
Cuenta de cheques
Sumar la cantidad depositada al saldo disponible
Solo depósitos múltiplos de $50
Depósito a Tarjeta de Crédito
Restar al saldo disponible
Se puede incluir decimales (2 decimales, por ejemplo: $100.23)

3) Consultar saldo
Mostrar el saldo disponible

4) Quejas
Mostrar el mensaje: "No disponible por el momento, intente más tarde"

5) Ver últimos movimientos (Los 5 últimos)
Mostrar los movimientos: depósitos y retiros
Formato para mostrar
     YYYY/MM/DD hh:mm Retiro de $500
     YYYY/MM/DD hh:mm Depósito a TC de $300.12
     YYYY/MM/DD hh:mm Retiro de $300
     YYYY/MM/DD hh:mm Retiro de $100
     YYYY/MM/DD hh:mm Depósito a TC de $30.11
     
9) Salir del cajero
Despide y sale del cajero.

Notas: 
Si se pulsa una opción inválida (ej. 6, 7, 8), mostrar un mensaje similar a: "Opción inválida, por favor, vuelva a intentar".
Si por 3 veces consecutivas se pulsa una opción inválida, se despide y se sale del sistema.
En caso de que se pulse una opción inválida y luego se pulse una opción válida, esto no debe contar como parte de las veces consecutivas que se equivoca el usuario. 

*/

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PracticaCajero {

	public static void main(String[] args) {
		//BigDecimal saldo = new BigDecimal();
		double saldo = 10_000.00;
		boolean menu = true;
		int counter = 0;
		ArrayList<String> movimientos = new ArrayList<>();
		
		do {
			LocalDateTime fechaHoraActual = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	        String fechaHoraFormateada = fechaHoraActual.format(formatter);
			int opc = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "1. Retirar Dinero\n"
					+ "2. Hacer Depositos\n"
					+ "3. Consultar Saldo\n"
					+ "4. Quejas\n"
					+ "5. Ver Ultimos Movimientos\n"
					+ "9. Salir del Cajero"));
			
			switch (opc) {
			case 1:
				counter=0;
				boolean retirarDinero = true;
				
				while (retirarDinero) {
					double retirar =  Double.parseDouble(JOptionPane.showInputDialog(""
							+ "Retirar Dinero.\n"
							+ "Cantidad disponible: $" + saldo
							+ "\nIngrese una cantidad menor a $6,000 y multiplo de 50."));
					if (retirar > 6000) {
						JOptionPane.showMessageDialog(null, "Favor ingresar cantidad menor a $6,000");
					}else if (retirar%50 != 0) {
						JOptionPane.showMessageDialog(null, "Favor en cantidades multiplos de 50");
					}else if (saldo <= 0) {
						JOptionPane.showMessageDialog(null, "Sin saldo, favor de depositar dinero a su cuenta.");
						retirarDinero=false;
					}else if (retirar > saldo) {
						JOptionPane.showMessageDialog(null, "Sin saldo suficiente para esta operación.");
					}else {
						saldo -= retirar;
						char donar =  JOptionPane.showInputDialog("Retiro Realizado!\n"
								+ "Desea donar $200 para la graduación de ch34? s/n").charAt(0);
						if (donar == 's' ) {
							saldo -= 200;
							JOptionPane.showMessageDialog(null, "Gracias, Saldo Restante: $" +saldo);
							movimientos.add(fechaHoraFormateada + " Retiro de: $"+retirar);
							retirarDinero=false;
						} else {
							JOptionPane.showMessageDialog(null, "Gracias, Saldo Restante: $" +saldo);
							movimientos.add(fechaHoraFormateada + " Retiro de: $"+retirar);
							retirarDinero=false;
						}
					}
				}
				break;
				
			case 2:
				counter=0;
				int opc2 =  Integer.parseInt(JOptionPane.showInputDialog(""
						+ "Hacer un deposito a:\n"
						+ "1. Cuenta a cheques\n"
						+ "2. Tarjeta de Credito\n"
						+ "3. Volver"));
				
				switch (opc2) {
				case 1:
					boolean depositarDinero = true;
					
					while (depositarDinero) {
						double depositar =  Double.parseDouble(JOptionPane.showInputDialog(""
								+ "Depositar Dinero.\n"
								+ "Cantidad actual: $" + saldo
								+ "\nIngrese una cantidad multiplo de 50."));
						
						if (depositar%50 != 0) {
							JOptionPane.showMessageDialog(null, "Favor una cantidad multiplo de 50");
						}else {
							saldo += depositar;
							JOptionPane.showMessageDialog(null, "Deposito Realizado, Saldo Actual: $"+saldo);
							movimientos.add(fechaHoraFormateada + " Deposito de: $"+depositar);
							depositarDinero=false;
						}
					}
					break;
				case 2:
					double abonar =  Double.parseDouble(JOptionPane.showInputDialog(""
							+ "Tarjeta de Credito.\n"
							+ "Cantidad actual: $" + saldo
							+ "\nIngrese cantidad a abonar a la tarjeta:"));
					movimientos.add(fechaHoraFormateada + " Abono a TDC de: $"+abonar);
					saldo -= abonar;
					JOptionPane.showMessageDialog(null, "Abono a TDC Realizado, Saldo Actual: $"+saldo);
					
					break;
				case 3:
					depositarDinero=false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion Invalida, por favor vuelva a intentar");
					break;
				}
				break;
				
			case 3:
				counter=0;
				JOptionPane.showMessageDialog(null, "Consultar Saldo\n"
						+ "Saldo Disponible: " + saldo);
				break;
			case 4:
				counter=0;
				JOptionPane.showMessageDialog(null, "Quejas.\n"
						+ "No disponible por el momento, intente más tarde");
				break;
			case 5:
				counter=0;
				if(movimientos.size() > 5) {
					movimientos.remove(0);
				}
				System.out.println("======Ultimos 5 movimientos========");
				for (String mov : movimientos) {
					System.out.println(mov);
				}
				JOptionPane.showMessageDialog(null, "Ultimos Movimientos.\n"
						+ "Se muestran en la consola.");
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Adios, vuelva pronto");
				menu = false;
				break;

			default:
				++counter;
				System.out.println("Intentos fallidos: " + counter);
				if(counter >= 3) {
					JOptionPane.showMessageDialog(null, "Limite de intentos alcanzados, Intentelo mas tarde");
					menu = false;
					break;
				}
				
				JOptionPane.showMessageDialog(null, "Opcion Invalida, por favor vuelva a intentar");
				break;
			}

		} while (menu);
	}
}
