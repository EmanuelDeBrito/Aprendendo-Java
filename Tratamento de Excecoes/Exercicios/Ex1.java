import javax.swing.JOptionPane;


public class Ex1 {
	
	// Exercicio 1
	
	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		
		divisao(numero1, numero2);
	}
	
	public static void divisao(int n1, int n2){
		int resultado;
		
		try{
			resultado = n1 / n2;
			System.out.println("Resultado da divisão: " + resultado);
		}catch(ArithmeticException e){
			System.out.println("Divisão por zero não permitida" + e);
		}
		
	}

}
