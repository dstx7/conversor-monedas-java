package com.conversorMonedas;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	public static void main(String[] args) {
		
		Conversor convers = new Conversor();
		
		
		String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
		double cantidad = Double.parseDouble(input);
		
		String selection = convers.mostrarOpciones();
		double resultado = convers.convertir(cantidad, selection);
		
		JOptionPane.showMessageDialog(
		        null,
		        "El resultado de la conversión es: " + resultado,
		        "Resultado",
		        JOptionPane.INFORMATION_MESSAGE
		    );

	}
}
