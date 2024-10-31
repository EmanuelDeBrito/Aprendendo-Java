import java.util.Arrays;

import javax.swing.JOptionPane;

import Helpers.Calculos;


public class Ex6 {

	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Digite o número desejado: ");
		String[] numeros = numero.split(" ");
		
		int res = Calculos.somaDigitos(numeros, numeros.length - 1, 0);
		
		System.out.println(res);

	}

}
