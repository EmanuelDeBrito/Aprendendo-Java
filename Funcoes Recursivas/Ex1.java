import javax.swing.JOptionPane;

import Helpers.Calculos;


public class Ex1 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero para o c�lculo do fatorial: "));
		
		int res = fatorial(n);
		
		System.out.println("O resultado do fatorial � de: " + res);

	}
	
	public static int fatorial(int n){
		
		Calculos cal = new Calculos();
		
		return cal.fatorial(n);
		
	}

}