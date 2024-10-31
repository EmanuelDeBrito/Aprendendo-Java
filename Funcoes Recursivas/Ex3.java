import javax.swing.JOptionPane;

import Helpers.Calculos;


public class Ex3 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para a sequência: "));
		
		int res = fib(n);
		
		System.out.println("Quantidade de termos: " + n);
		System.out.println("Resultado: " + res);

	}
	
	public static int fib(int n){
		
		Calculos calc = new Calculos();
		
		return calc.fibonacci(0, 1, 0, n);
		
	}
	
}