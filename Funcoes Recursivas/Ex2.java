import javax.swing.JOptionPane;

import Helpers.Calculos;


public class Ex2 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para a soma: "));
		
		int res = soma(n);
		
		System.out.println("A soma de " + n + " primeiros números naturais é de: " + res);

	}
	
	public static int soma(int n){
		
		Calculos calc = new Calculos();
		
		return calc.somaNumeros(n);
		
	}
	
}
