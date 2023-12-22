package prueba;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Metodos {

	public static void retirarDinero(double saldo, ArrayList<String> movimientos) {
		boolean retirarDinero = true;
		LocalDateTime fechaHoraActual = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String fechaHoraFormateada = fechaHoraActual.format(formatter);
		while (retirarDinero) {
			double retirar = Double.parseDouble(JOptionPane.showInputDialog("" + "Retirar Dinero.\n"
					+ "Cantidad disponible: $" + saldo + "\nIngrese una cantidad menor a $6,000 y multiplo de 50."));
			if (retirar > 6000) {
				JOptionPane.showMessageDialog(null, "Favor ingresar cantidad menor a $6,000");
			} else if (retirar % 50 != 0) {
				JOptionPane.showMessageDialog(null, "Favor en cantidades multiplos de 50");
			} else if (saldo <= 0) {
				JOptionPane.showMessageDialog(null, "Sin saldo, favor de depositar dinero a su cuenta.");
				retirarDinero = false;
			} else if (retirar > saldo) {
				JOptionPane.showMessageDialog(null, "Sin saldo suficiente para esta operación.");
			} else {
				saldo -= retirar;
				char donar = JOptionPane
						.showInputDialog("Retiro Realizado!\n" + "Desea donar $200 para la graduación de ch34? s/n")
						.charAt(0);
				if (donar == 's') {
					saldo -= 200;
					JOptionPane.showMessageDialog(null, "Gracias, Saldo Restante: $" + saldo);
					movimientos.add(fechaHoraFormateada + " Retiro de: $" + retirar);
					retirarDinero = false;
				} else {
					JOptionPane.showMessageDialog(null, "Gracias, Saldo Restante: $" + saldo);
					movimientos.add(fechaHoraFormateada + " Retiro de: $" + retirar);
					retirarDinero = false;
				}
			}
		}
	}

	public static void depositarDinero(double saldo, ArrayList<String> movimientos) {
		LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String fechaHoraFormateada = fechaHoraActual.format(formatter);
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
	}
}
