import javax.swing.JOptionPane;


//Exerc�cio 6 - Arredondamento e Potencia��o

public class Ex6 {

	public static void main(String[] args) {
		
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero: "));
		int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));
		
		double resultado = potencia(n, expoente);
		
		JOptionPane.showMessageDialog(null, "O valor da exponencia��o � de: " + resultado);
		
	}
	
	public static double potencia(double n, int expoente){
		
		double arredondado = Math.floor(n);
		
		return Math.pow(arredondado, expoente);
		
	}
	

}
