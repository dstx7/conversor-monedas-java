package com.conversorMonedas;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	public static void main(String[] args) {

		Conversor convers = new Conversor();
		boolean continuar = true;
		

		while (continuar) {

			String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
			if (input == null) {
				continuar = false;
			}
			;

			try {
				double cantidad = Double.parseDouble(input);
				String selection = convers.mostrarOpciones();
				double resultado = convers.convertir(cantidad, selection);
				JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado, "Resultado",
						JOptionPane.INFORMATION_MESSAGE);
				int repetir = convers.repetir();
				if(repetir == 0) {
					JOptionPane.showMessageDialog(null, "Gracias por usar nuestro conversor, feliz dia!");
					continuar = false;
				}
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "por favor ingrese un valor numerico valido");
				continuar = true;
			} catch (NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Gracias por usar nuestro conversor, feliz dia!");
				continuar = false;
			}

		}
	}
}
