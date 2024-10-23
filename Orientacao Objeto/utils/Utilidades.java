package utils;

public class Utilidades {

	public static double fahrenheitToCelsius(double fahrenheit){
		return (fahrenheit - 32) * 5 / 9;
	}
	
	public static double celsiusToFahrenheit(double celsius){	
		return (celsius * 9 / 5) + 32;
	}
	
	// Metodo para exibir a mensagem
	public static void showMessage(String mensagem){
		System.out.println(mensagem);
	}
	
}
