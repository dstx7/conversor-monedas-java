package com.conversorMonedas;

import javax.swing.JOptionPane;

public class Conversor {
	
	private static final double DOLAR_TO_PESO = 3800.0;
    private static final double EURO_TO_PESO = 4500.0;
    private static final double LIBRA_TO_PESO = 5200.0;
    private static final double YEN_TO_PESO = 35.0;
    private static final double WON_TO_PESO = 3.0;

    
    public String mostrarOpciones() {
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
    return (String) JOptionPane.showInputDialog(
			null,
			"Seleccione el tipo de conversión:",
			"Conversor de Moneda",
			JOptionPane.PLAIN_MESSAGE,
			null,
			monedas,
			monedas[0]
	);
    
    }
    public double convertir(double cantidad, String seleccion) {
        if (seleccion.equals("Peso Colombiano a Dolar")) {
            return cantidad / DOLAR_TO_PESO;
        } else if (seleccion.equals("Peso Colombiano a Euro")) {
            return cantidad / EURO_TO_PESO;
        } else if (seleccion.equals("Peso Colombiano a Libra Esterlina")) {
            return cantidad / LIBRA_TO_PESO;
        } else if (seleccion.equals("Peso Colombiano a Yen Japonés")) {
            return cantidad / YEN_TO_PESO;
        } else if (seleccion.equals("Peso Colombiano a Won sul-coreano")) {
            return cantidad / WON_TO_PESO;
        } else if (seleccion.equals("Dolar a Peso Colombiano")) {
            return cantidad * DOLAR_TO_PESO;
        } else if (seleccion.equals("Euro a Peso Colombiano")) {
            return cantidad * EURO_TO_PESO;
        } else if (seleccion.equals("Libra Esterlina a Peso Colombiano")) {
            return cantidad * LIBRA_TO_PESO;
        } else if (seleccion.equals("Yen Japonés a Peso Colombiano")) {
            return cantidad * YEN_TO_PESO;
        } else if (seleccion.equals("Won sul-coreano a Peso Colombiano")) {
            return cantidad * WON_TO_PESO;
        } else {
            return 0.0; // Manejo de selección inválida
        }
}
}
