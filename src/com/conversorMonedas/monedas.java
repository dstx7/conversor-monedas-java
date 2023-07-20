package com.conversorMonedas;

import javax.swing.JOptionPane;

public class monedas {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
		double cantidad = Double.parseDouble(input);
		double resultado = 0.0;

		Object[] monedas = { "Peso Colombiano a Dolar",
				"Peso Colombiano a Euro",
				"Peso Colombiano a Libra Esterlina",
				"Peso Colombiano a Yen Japonés",
				"Peso Colombiano a Won sul-coreano",
				"Dolar a Peso Colombiano",
				"Euro a Peso Colombiano",
				"Libra Esterlina a Peso Colombiano",
				"Yen Japonés a Peso Colombiano",
				"Won sul-coreano a Peso Colombiano", };

		String selection = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión:",
				"Conversor de Moneda", JOptionPane.PLAIN_MESSAGE, null, monedas, monedas[0]);

		switch (selection) {
		case "Peso Colombiano a Dolar": // Dólar a Euro
			resultado = convertirPesoADolar(cantidad);
			break;

		}
		
		JOptionPane.showMessageDialog(
		        null,
		        "El resultado de la conversión es: " + resultado,
		        "Resultado",
		        JOptionPane.INFORMATION_MESSAGE
		    );

	}

	private static double convertirPesoADolar(double cantidad) {
		// TODO Auto-generated method stub
		return cantidad * 4000;
	}
}
