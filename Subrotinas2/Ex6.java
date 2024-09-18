import javax.swing.JOptionPane;


//Exercício 6 - Arredondamento e Potenciação

public class Ex6 {

	public static void main(String[] args) {
		
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite o número: "));
		int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));
		
		double resultado = potencia(n, expoente);
		
		JOptionPane.showMessageDialog(null, "O valor da exponenciação é de: " + resultado);
		
	}
	
	public static double potencia(double n, int expoente){
		
		double arredondado = Math.floor(n);
		
		return Math.pow(arredondado, expoente);
		
	}
	

}
