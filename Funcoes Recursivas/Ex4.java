import javax.swing.JOptionPane;

import Helpers.Calculos;


public class Ex4 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a base: "));
		int p = Integer.parseInt(JOptionPane.showInputDialog("Digite a expoente: "));
		
		int res = calculo(n, p);
		
		System.out.println("Base: " + n);
		System.out.println("Expoente: " + p);
		System.out.println("Resultado: " + res);

	}
	
	public static int calculo(int n, int p){
		
		Calculos calc = new Calculos();
		
		return calc.potencia(n, p);
		
	}
	
}